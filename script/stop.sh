
PID=`ps -eaf | grep A365AuthIntegration-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}'`
if [ "" != "$PID" ];
then
    echo "Killing onboard-service with $PID"
    kill -9 $PID
else
    echo "No such process"
fi
