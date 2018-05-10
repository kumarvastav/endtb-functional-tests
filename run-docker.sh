#!/bin/sh

echo "The env is $1 $2 - in run-docker.sh"
docker run -v /var/go/.m2:/root/.m2:rw -v $PWD:/gauge -e ENV=$1 -e TAGS=$2 -i bharatak/docker-gauge-chromedriver:chromedriver-2.34 -- sh run.sh
#Hack. The html-report executable is symlinked as a root user.  
#so, removing it so that the artifact is accessible from gocd server
rm -f bahmni-gauge-default/reports/html-report/html-report
