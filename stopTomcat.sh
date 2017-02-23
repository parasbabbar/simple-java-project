#!/bin/bash

sudo service tomcat7 stop
cd /var/lib/tomcat7/webapps
rm -rf test*