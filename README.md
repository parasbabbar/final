# final
### Team members:
 1. Tushar Goel(goel.t@husky.neu.edu)
 2. Paras Babbar (babbar.p@husky.neu.edu)
 3. Huajian Liu (liu.huaji@husky.neu.edu)
 4. Mayuresh Dabholkar(dabholkar.m@husky.neu.edu)    

### Overview  
 Dressup.com is an ecommerce web application which provides both B2B as well as B2C business models. The website is aimed at providing latest fashion outfits with information on latest fashion to customers. The website can be used by three types of users: First the customer who buys products from the website using shopping cart functionality, Second the admin who manages the users and provides admin support as well as manages the whole website, Third the dealers who can add their items to be sold on the website.  
 
### Prerequisite 
 1. JDK1.7 or higher
 2. Maven
 3. Spring Jars
 4. JUnit Jars
 6. Hibernate Jars
 7. Mockito Jars
 8. Git Jars
 9. MySQL engine
10. Dynamodb engine  

### Unit test  
Test cases are written in JUnit to check if the internal view resolver points to the expected view or not. Selenium is used for performing automatic testing. Mockito is used to mock a user and check for all links and Http Status codes for the links.   

### Unit test Cases  

View resolvers for each page
Authentication of user
User registeration
### Travis-ci link  
https://travis-ci.com/tushargl016/neu-csye6225-4/builds/39173280

### Domain Name
neu-csye6225-spring-2017-team-3.com
### IAM Console
https://neu-csye6225-team-3.signin.aws.amazon.com/console
## Bash Script  
instance.sh file stored in the repository  

### Databases  

 1.MySQL   

### Use Cases  Completed  

### Amazon Services used  

 1. S3       
 2. MySQL  
 3. EC2  
 4. Route53  
 5. SES  
 
 ### Front End  
 1. Login
 2. Register
 3. Menu
 4. Item Display
 5. Cart Pages
 6. Checkout
 7. Forgot Password
 8. Careers
### Back end  
1. Login
2. Register
3. Menu
4. Item Display
5. Cart Pages
6. Checkout
7. Admin login
8. List of users
9. List of orders
10. Adding new items
11. Fogot Password
12. Careers
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
23) Domain Name of our Web Application: https://www.neu-csye6225-spring2017-team-3.com
24) Created DKIM and SPF record for SES
25) Got production access for SES


#########Penetration Testing

Penetration testing on https://neu-csye6225-spring2017-team-7.me(Report appended on Assignment 9 repo)

################Cloudwatch Agent

Installed CloudWatch agent on your EC2 instance and ship your application logs to CloudWatch

###############Timezone

Configures UTC Timezone to my Ubuntu instance 
