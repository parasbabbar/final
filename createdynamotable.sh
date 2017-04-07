#!/bin/bash
Table_Name=csye6225
Primary_Key=id
Primary_Key_Datatype=N
Read_Capacity_Units=1
Write_Capacity_Units=1

aws dynamodb create-table --table-name $Table_Name --attribute-definitions AttributeName=$Primary_Key,AttributeType=$Primary_Key_Datatype --key-schema AttributeName=$Primary_Key,KeyType=HASH --provisioned-throughput ReadCapacityUnits=$Read_Capacity_Units,WriteCapacityUnits=$Write_Capacity_Units
