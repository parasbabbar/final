Steps for Securing Infrastructure.

Used Github Student Developer pack to purshase one year SSL certificates from Namecheap.
Configured CSR code for tomcat7 by following these steps:
a) keytool -genkey -keysize 2048 -keyalg RSA -alias tomcat -keystore yourkeystore.jks 
b)  keytool -certreq -alias tomcat -file your.csr -keystore yourkeystore.jks
These above commands using keytool will generate the yourkeystore.jks file and your.csr for getting the ssl certificates for the domain neu-csye6225-spring2017-team-3.com
Now,
I have pasted that your.csr file (containg certificate request) to the namecheap website so that the certificates linked to that csr file(containing domain name information) and all other inputs provided by me regarding city address etc will be generated by the namecheap
After submitting the request and selecting 
DCV Method: DNS
Hashing Algo: SHA2
Then we created a record with CNAME under the hosted zone "neu-csye6225-spring2017-team-3.com." with TTL of 60 seconds.
After sometin=me namecheap will provide usfollowing files and 2 certificates: neu-csye6225-spring2017-team-3.com.csr neu-csye6225-spring2017-team-3.com.p7b neu-csye6225-spring2017-team-3_com.ca-bundle
Wrote the installation script required for tomcat7js in Server.xml file of our application using following commands:
a) keytool -import -trustcacerts -alias tomcat -file neu-csye6225-spring2017-team-3.com.p7b -keystore yourkeystore.jks
If the certificate is imported successfully, and the keystore is completed, you should see the message:

“Certificate reply was installed in keystore”

To check the certificates which are added in the keystore run the command below:

keytool -list -keystore yourkeystore.jks -v
You should see details of the certificates imported into the keystore in the output
0n screenshot the chain consists of 2 certificates: root and certificate signed by root, that was created for testing purposes. Nowadays usually chain has at least three certificates: root, intermediate and certificate signed by intermediate.

To review the certificates added to the keystore as a plain text run the following command:

keytool -list -rfc -keystore yourkeystore.jks
Once the the keystore is completed, you will need to describe it in the configuration of your tomcat.

Usually tomcat’s configuration file is named server.xml.

Open it as a plain text and create there a record like below:

<Connector port="8443" protocol="HTTP/1.1"
SSLEnabled="true"
scheme="https" secure="true" clientAuth="false"
sslProtocol="TLS" keystoreFile="/your_path/yourkeystore.jks"
keystorePass="password_for_your_key_store" />

run "sh restarttomcat7.sh" to restrat the tomcat7 server on ubuntu machine 16.04
then you can see the certificate listed on the "https" i.e 8443
