#!/bin/bash
security=$(aws ec2 create-security-group --group-name db --description "My security" --vpc-id vpc-b413dfd0 2>/dev/null)
if [ $? != 0 ]
then
        sec_db=$(aws ec2 describe-security-groups | jq -r '.SecurityGroups[0].GroupId')
        $(aws ec2 delete-security-group --group-id $sec_db)
        security=$(aws ec2 create-security-group --group-name db --description "My security" --vpc-id vpc-b413dfd0 | jq -r '.GroupId')
        security_group1=$(aws ec2 describe-security-groups | jq -r '.SecurityGroups[2].GroupId')
        `aws ec2 authorize-security-group-ingress --group-id $security --protocol tcp --port 3306 --source-group $security_group1`
else

        security_group2=$(aws ec2 describe-security-groups | jq -r '.SecurityGroups[2].GroupId')
        sec_db=$(aws ec2 describe-security-groups | jq -r '.SecurityGroups[0].GroupId')
        `aws ec2 authorize-security-group-ingress --group-id $sec_db --protocol tcp --port 3306 --source-group $security_group2`
fi
