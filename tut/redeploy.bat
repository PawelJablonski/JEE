@echo off

echo "************ UNDEPLOYING *******************"
call asadmin undeploy tut
echo "************ BUILDING **********************"
call mvn package
echo "************ DEPLOYING *********************"
call asadmin deploy target/tut.war
