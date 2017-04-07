#!/bin/bash
del_app=$(aws deploy delete-application --application-name csye6225-3)
echo "**********Deleting Application******************"
echo
echo
echo
echo
Cleaned=$(aws deploy delete-deployment-group --application-name csye6225-3 --deployment-group-name csye6225-3)
echo
echo
echo
echo "$Cleaned"
echo
echo
echo
echo "**********Everything Cleaned up***************"
