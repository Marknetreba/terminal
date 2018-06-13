#!/bin/bash
# 
# InfoTerminal    APP for Terminal Server developed for SADKO company.
#
# chkconfig: 2345 90 60
# description: Infoterminal developed for SADKO
# config: /etc/sysconfig/infoterminal
#
# Copyright 2018 AlfaTell, Inc. Saratov
#
# Maksim Dogonov <maxim.dogonov@alfatell.ru>  May 24, 2018
SERVICE_NAME=InfoTerminal
PATH_TO_JAR=/opt/infoterminal/infoterminal-0.0.1-SNAPSHOT.war
PID_PATH_NAME=/var/run/infoterminal.pid
LOG_PATH_FILE=/var/log/infoterminal/stdout.log
case $1 in
    start)
        echo "Starting $SERVICE_NAME ..."
        if [ ! -f $PID_PATH_NAME ]; then
            nohup java -jar $PATH_TO_JAR >> $LOG_PATH_FILE 2>&1 &
            echo $! > $PID_PATH_NAME
            echo "$SERVICE_NAME started ..."
        else
            echo "$SERVICE_NAME is already running ..."
        fi
    ;;
    stop)
        if [ -f $PID_PATH_NAME ]; then
            PID=$(cat $PID_PATH_NAME);
            echo "$SERVICE_NAME stoping ..."
            kill $PID;
            echo "$SERVICE_NAME stopped ..."
            rm $PID_PATH_NAME
        else
            echo "$SERVICE_NAME is not running ..."
        fi
    ;;
    restart)
        if [ -f $PID_PATH_NAME ]; then
            PID=$(cat $PID_PATH_NAME);
            echo "$SERVICE_NAME stopping ...";
            kill $PID;
            echo "$SERVICE_NAME stopped ...";
            rm $PID_PATH_NAME
            echo "$SERVICE_NAME starting ..."
            nohup java -jar $PATH_TO_JAR /tmp 2>> /dev/null >> /dev/null &
            echo $! > $PID_PATH_NAME
            echo "$SERVICE_NAME started ..."
        else
            echo "$SERVICE_NAME is not running ..."
        fi
    ;;
esac 