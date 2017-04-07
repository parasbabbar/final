# final
For AWS CLI

1) Install aws cli
2) Configured IAM.
3) Created groups and users.
4) Provided policy to them- SystemAdministrator and AmazonEC2FullAccess
5) Launced EC2 instance.
6) Set up S3.
7) Created web and db security group.
8) Install and setup RDSCLI.
9) Provided policies- AmazonDynamoDBFullAccess, AmazonRDSFullAccess to students.
10) Launch MYSQL RDS Instance
11) Created Dynamo DB table.
12) Created createContinuousDeliveryIAMPolicies.sh to create IAM policies.
13) Created removeContinuousDeliveryIAMPolicies.sh to delete above policies.
14) Created createContinuousDeliveryTravisUser.sh to create a Travis User.
15) Created deleteContinuousDeliveryTravisUser.sh to delete travis user.
16) Created createContinuousDeliveryIAMRoles.sh to create IAM roles.
17) Created deleteContinuousDeliveryIAMRoles.sh to delete IAM roles.
18) To delete a Travis user, delete roles first, then policies then Travis user.
19) Launch EC2 instance with CodeDeployEC2ServiceRole role using launchEC2Instance.sh.
20) Created ubuntu-Script.sh to install all the packages required including codeDeploy agent.
21) Created createContinuousDeliveryCodeDeployApp.sh to create deployment application and group.
22) Created deleteContinuousDeliveryCodeDeployApp.sh to delete deployment application.
23)Domain Name of our Web Application: https://www.neu-csye6225-spring2017-team-3.com
