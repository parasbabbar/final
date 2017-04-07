# Software Design Specification
## Team Members  
 * Tushar Goel(goel.t@husky.neu.edu)
 * Paras Babbar(babbar.p@husky.neu.edu)
 * Huajian Liu (liu.huaji@husky.neu.edu)
 * Mayuresh Dabholkar(dabholkar.m@husky.neu.edu)  

### Overview  
 Dressup.com is an ecommerce web application which provides B2C business models. The website is aimed at providing latest fashion outfits with information on latest fashion to customers. The website can be used by two types of users: First the customer who buys products from the website using shopping cart functionality, Second the admin who manages the users and provides admin support as well as manages the whole website.  
 
### User Interface  
 The application that we are developing is a web application and will work on any web browser. We have decided to make an e-commerce website to sell clothes online.The website will be created in Java using Spring framework and hibernate. Extensive use of latest CSS and Bootsrap will be used to design the website. The application will be user friendly and self descriptive.    

### Databases  
 For connecting to database we will be using hibernate and RDBMS(MySQL) is used. Different tables are present in the database with relations betwwen each other like the table of items, table of users, table of dealers, table of orders and table of forgot password. Apart from this the database will be used to provide statistical analysis of the orders processed.   

### Document uploads  
 The site provides file upload at the careers page for users to upload there resume.  

### Javascript  
 The website will use Javascript for validation of forms and to include slideshows and other design elements in the website.  

### Backend  
 For backend website will use Java, spring framework and hibernate.  

### User account
 Session management and cookies will be used to provide login /logout and shopping cart functionality. Also cookies will be used to provide the functionality of displaying the website according to user preferences.  
 
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





