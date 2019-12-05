
#!/bin/sh

# The nohup utility makes the command passed as an argument run in the background even after you log out.
# The & symbol, switches the program to run in the background.
nohup java -jar ../bin/docker-spring-data-rest.jar > /dev/null &
