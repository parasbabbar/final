#!/bin/bash
sudo service tomcat7 stop
cd /var/lib/tomcat7/webapps
sudo rm -rf test-1.0.0
sudo service tomcat7 start
