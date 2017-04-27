#!/bin/sh

imageid="ami-3e21725e"
instance_type="t2.micro"
Subnet="subnet-6908970d"
sec=$(aws ec2 describe-security-groups | jq -r '.SecurityGroups[2].GroupId')
security_group=$sec

echo "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxrunning ec2 ubuntu instance 14.04 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"

ec2_ubuntu=`aws ec2 run-instances --no-dry-run --disable-api-termination --image-id $imageid --instance-type $instance_type --key-name assignment4 --count 1 --subnet-id $Subnet --security-group-id $security_group --block-device-mappings '[ {"DeviceName":"/dev/sda1","Ebs": {"VolumeSize": 10,"VolumeType": "standard","DeleteOnTermination": false}}]'`
#this will run instance with the given image id , volume size 10 GB ,Instance Type: t2.micro,Subnet: us-west-1,Auto-assign Public IP,Protect against accidental termination: Enabled,Root Volume Size: 10,Root Volume Type: Magnetic,Configure Security group to allow SSH (port 22), HTTP (port 80) and HTTPS (port 443) traffic on TCP protocol on their respective default ports from anywhere in the world 
echo
echo
echo
echo
echo "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxinitiated the instance xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
echo
echo
echo
sleep 5  #wait for 50 secs till ip address is being initiated

echo "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxfetching the public ip address xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
echo
echo
echo
sleep 10

ipaddress=$(aws ec2 describe-instances| jq -r '.Reservations[0].Instances[0].PublicIpAddress') #fetch the ip address 

echo "The Public ip address is $ipaddress"
echo "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxcreating/updating  the aws record on team3 domainxxxxxxxxxxxxx" 
echo
echo
echo
echo "record created"
aws route53 change-resource-record-sets --hosted-zone-id Z2MIBQE01WKI5V --change-batch "{\"Comment\": \"optional comment about the changes in this change batch request\",\"Changes\": [{\"Action\": \"UPSERT\",\"ResourceRecordSet\": {\"Name\": \"ec2.neu-csye6225-spring2017-team-3.com\",\"Type\": \"A\",\"TTL\": 300,\"ResourceRecords\": [{\"Value\": \"$ipaddress\"}]}}]}"

# the above command will create/update the dns record at route53 dns 
