#!/bin/bash

User=$(aws iam create-user --user-name travis >> user1)
Keys=$(aws iam create-access-key --user-name travis >> key)
arn_number="arn:aws:iam::712477913881:policy/Travis-Code-Deploy"
arn_number1="arn:aws:iam::712477913881:policy/Travis-Upload-To-S3"
$(aws iam attach-user-policy --policy-arn $arn_number --user-name travis 2>>/dev/null)
if [ $? -eq 0 ];
then
echo
echo
echo "Travis-Code-Deploy-Policy is created"
else
echo
echo
echo "The Travis-Code-Deploy Policy is not Created,Run the createContinuousDeliveryIAMPolicies.sh Script"
fi

$(aws iam attach-user-policy --policy-arn $arn_number1 --user-name travis 2>>/dev/null)
if [ $? -eq 0 ];
then
echo
echo
echo "Travis-Upload-to-S3 Policy is created"
else
echo
echo
echo "The Travis-Upload-to-S3 Policy is not created, Run createContinuousDeliveryIAMPolicies.sh Script"
fi
