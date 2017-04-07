#!/bin/bash

Role_1=$(aws iam create-role --role-name CodeDeployEC2ServiceRole --assume-role-policy-document file://TrustPolicy.json)
Policy_1=$(aws iam attach-role-policy --policy-arn arn:aws:iam::712477913881:policy/CodeDeploy-EC2-S3 --role-name CodeDeployEC2ServiceRole)
Inst1=$(aws iam create-instance-profile --instance-profile-name CodeDeployEC2ServiceRole)
Inst_prof1=$(aws iam add-role-to-instance-profile --instance-profile-name CodeDeployEC2ServiceRole --role-name CodeDeployEC2ServiceRole)

Role_2=$(aws iam create-role --role-name CodeDeployServiceRole --assume-role-policy-document file://TrustPolicy1.json)
Policy_2=$(aws iam attach-role-policy --policy-arn arn:aws:iam::aws:policy/service-role/AWSCodeDeployRole --role-name CodeDeployServiceRole)
Inst1=$(aws iam create-instance-profile --instance-profile-name CodeDeployServiceRole)
Inst_prof2=$(aws iam add-role-to-instance-profile --instance-profile-name CodeDeployServiceRole --role-name CodeDeployServiceRole)

