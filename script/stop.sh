
PID=`ps -eaf | grep docker-spring-data-rest.jar | grep -v grep | awk '{print $2}'`
if [ "" != "$PID" ];
then
    echo "Killing onboard-service with $PID"
    kill -9 $PID
else
    echo "No such process"
fi
