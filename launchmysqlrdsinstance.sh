#!/bin/bash

Db_engine=mysql
Instance_Size=db.t2.micro
DB_Instance_Identifier=csye6225
Master_Username=csye6225
Master_Password=csye6225
Database_Name=csye6225

sec_db=$(aws ec2 describe-security-groups | jq -r '.SecurityGroups[0].GroupId')

$(aws rds create-db-instance --db-name $Database_Name --db-instance-identifier $DB_Instance_Identifier --db-instance-class $Instance_Size --engine $Db_engine --allocated-storage 5 --master-username $Master_Username --master-user-password $Master_Password --no-multi-az --no-publicly-accessible --vpc-security-group-id $sec_db)
