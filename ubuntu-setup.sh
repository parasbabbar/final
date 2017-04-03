#!/bin/bash
apt-get -y update
apt-get -y install tomcat7
apt-get -y update
apt-get -y install default-jdk
apt-get update
apt-get -y install python-pip
apt-get -y install ruby
apt-get -y install wget
apt-get -y install awscl
apt-get update
apt-get -y install ruby
cd /home/ubuntu
wget https://aws-codedeploy-us-west-1.s3.amazonaws.com/latest/install
chmod +x ./install
./install auto
sudo timedatectl set-timezone Etc/UTC
