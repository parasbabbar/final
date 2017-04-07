#!/bin/bash

security=$(aws ec2 create-security-group --group-name web --description "My security group" --vpc-id vpc-b413dfd0 2>/dev/null)
if [ $? != 0 ] 
then

        security_group=$(aws ec2 describe-security-groups | jq -r '.SecurityGroups[1].GroupId')
	$(aws ec2 delete-security-group --group-id $security_group)

        security_group1=$(aws ec2 create-security-group --group-name web --description "My security group" --vpc-id vpc-b413dfd0 | jq -r '.GroupId') 
        `aws ec2 authorize-security-group-ingress --group-id $security_group1 --protocol tcp --port 443 --cidr 0.0.0.0/0`
        `aws ec2 authorize-security-group-ingress --group-id $security_group1 --protocol tcp --port 80 --cidr 0.0.0.0/0`
        `aws ec2 authorize-security-group-ingress --group-id $security_group1 --ip-permissions '[{"IpProtocol": "tcp", "FromPort": 80, "ToPort": 80, "Ipv6Ranges": [{"CidrIpv6": "::/0"}]}]'`
        `aws ec2 authorize-security-group-ingress --group-id $security_group1 --ip-permissions '[{"IpProtocol": "tcp", "FromPort": 443, "ToPort": 443, "Ipv6Ranges": [{"CidrIpv6": "::/0"}]}]'`
else
        security_group2=$(aws ec2 describe-security-groups | jq -r '.SecurityGroups[1].GroupId')

	`aws ec2 authorize-security-group-ingress --group-id $security_group --protocol tcp --port 443 --cidr 0.0.0.0/0`
	`aws ec2 authorize-security-group-ingress --group-id $security_group --protocol tcp --port 80 --cidr 0.0.0.0/0`
        `aws ec2 authorize-security-group-ingress --group-id $security_group1 --ip-permissions '[{"IpProtocol": "tcp", "FromPort": 80, "ToPort": 80, "Ipv6Ranges": [{"CidrIpv6": "::/0"}]}]'`
        `aws ec2 authorize-security-group-ingress --group-id $security_group --ip-permissions '[{"IpProtocol": "tcp", "FromPort": 443, "ToPort": 443, "Ipv6Ranges": [{"CidrIpv6": "::/0"}]}]'`

fi
