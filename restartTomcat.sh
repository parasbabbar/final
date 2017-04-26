#!/bin/bash
sudo service tomcat7 stop
cd /var/lib/tomcat7/webapps
sudo rm -rf project-1.0.0-BUILD-SNAPSHOT.war
sudo service tomcat7 start
