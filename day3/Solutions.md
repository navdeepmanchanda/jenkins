DAY 3 JENKINS

Assignment 1

Pre requisite
Install below plugins 
Maven integration plugin 
Checkstyle Plug-in 
FindBugs Plug-in 
Static Analysis Collector Plug-in 
Cobertura Plugin

Pre requisites are being installed.
Maven Integration Plugin - Allow the selection of a Maven installation configured on the Global Jenkins configuration or on the Global Tool Configuration page if using Jenkins > 2.0. When auto-install is enabled, maven will be downloaded and made available for the pipeline job.

Checkstyle plugin - The Checkstyle plug-in scans for checkstyle-result.xml files in the build workspace and reports the number of warnings found (files from all Checkstyle releases are supported). This plug-in is part of the suite of static code analysis plug-ins.

Findbugs plugin - The FindBugs plug-in scans for findbugs.xml files in the build workspace and reports the number of warnings found. This plug-in is part of the suite of static code analysis plug-ins.

Static Analysis Collector plugin -  A static analysis tool reviews program code, searching for application coding flaws, back doors or other malicious code.

Cobertura plugin - This plugin allows you to capture code coverage report from Cobertura. Jenkins will generate the trend report of coverage.
 
path - jenkins/jenkins day3/plug-ins download.png 
link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/plug-ins%20download.png

Assignment 2
Install below softwares under Global tool configuration 
Maven | Maven 3.5.2

link -https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/mvn3.5.2.png
path -  jenkins/jenkins day3/mvn3.5.2.png 


Java | You need Oracle account for same | JDK 8u162

Assignment 4
Git | You need to manually install git first
apt-get -y install git

link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/gitinsjen.png
path - jenkins/jenkins day3/gitinsjen.png 

Assignment 5
Setup CodeStability Job
Choose Job type as MavenProject 
Provide git repository https://github.com/OpsTree/ContinuousIntegration 
Use clean compile as target
 
success - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codestability2.png
path -  jenkins/jenkins day3/codestability2.png 

target - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codestability1.png
path -  jenkins/jenkins day3/codestability1.png 


Assignment 6
Setup static code analysis Job
Choose Job type as MavenProject 
Provide git repository https://github.com/OpsTree/ContinuousIntegration 
Use clean compile findbugs:findbugs checkstyle:checkstyle as target 

success - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/staticcodeanalysis.png
path -  jenkins/jenkins day3/staticcodeanalysis.png 

target - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/staticcodeanalysis2.png
path -  jenkins/jenkins day3/staticcodeanalysis2.png


Assignment 7
Setup code coverage Job
Choose Job type as MavenProject 
Provide git repository https://github.com/OpsTree/ContinuousIntegration 
Use clean compile cobertura:cobertura as target 

success - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codecoverage.png
path -  jenkins/jenkins day3/codecoverage.png 

target - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codecoverage2.png
path -  jenkins/jenkins day3/codecoverage2.png 
