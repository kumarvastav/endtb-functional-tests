#!/usr/bin/env bash


ssh $ENVIRONMENT_USERNAME@$BAHMNI_GAUGE_APP_HOSTNAME "wget https://raw.githubusercontent.com/bahmni-msf/amman-config/master/dbdump/mysql_dump.sql && mysql -u $MYSQL_DB_USERNAME -p$MYSQL_DB_PASSWORD openmrs < mysql_dump.sql && rm mysql_dump.sql"
