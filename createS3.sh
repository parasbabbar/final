#!/bin/bash
echo "Checking S3 bucket exists..."                                                                                                                                                   
S3_CHECK=$(aws s3api head-bucket --bucket "code-deploy.neu-csye6225-spring2017-team-3.com" 2>/dev/null)
#Some sort of error happened with s3 check                                                                                                                                            
if [ $? != 0 ]                                                                                                                                                                        
then
   echo "*************Bucket Creation inititialized**********"
   bucket_create=$(aws s3api create-bucket --bucket code-deploy.neu-csye6225-spring2017-team-3.com --region us-west-1 --create-bucket-configuration LocationConstraint=us-west-1)
   echo "**********************bucket Created****************"
   echo
   echo
   `aws s3api put-bucket-acl --bucket code-deploy.neu-csye6225-spring2017-team-3.com --grant-read uri=http://acs.amazonaws.com/groups/global/AllUsers --grant-read-acp uri=http://acs.amazonaws.com/groups/global/AllUsers`
   echo "**********************grant read permission for everyone*****"
   echo
   echo
   `aws s3api put-bucket-tagging --bucket code-deploy.neu-csye6225-spring2017-team-3.com --tagging 'TagSet=[{Key=Team,Value=3}]'`
   echo "************************Tagging with key Team & Value 3******"
   echo
   echo
   `aws s3api put-bucket-versioning --bucket code-deploy.neu-csye6225-spring2017-team-3.com --versioning-configuration Status=Enabled`
   echo "********************************Versioning enabled**************"
else                                                                                                                                                                                  
  echo "Bucket exists"
fi
