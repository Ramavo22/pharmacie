@echo off

set env="C:\Program Files\Apache Software Foundation\Tomcat 10.1\webapps\pharmacie"

echo "Cleaning the project"

del /Q web\WEB-INF\classes\*

echo "Building the project"

XCOPY bin\*  web\WEB-INF\classes\ /Y /E

xcopy web\* %env% /E /Y

echo "Deployed"

pause