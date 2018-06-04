DAY 3 JENKINS

Assignment 1

Pre requisite
Install below plugins 
Maven integration plugin 
Checkstyle Plug-in 
FindBugs Plug-in 
Static Analysis Collector Plug-in 
Cobertura Plugin 
path - jenkins/jenkins day3/plug-ins download.png 
link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/plug-ins%20download.png


Install below softwares under Global tool configuration 
Maven | Maven 3.5.2

link -https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/mvn3.5.2.png
path -  jenkins/jenkins day3/mvn3.5.2.png 


Java | You need Oracle account for same | JDK 8u162

Git | You need to manually install git first
apt-get -y install git

link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/gitinsjen.png
path - jenkins/jenkins day3/gitinsjen.png 


Setup CodeStability Job
Choose Job type as MavenProject 
Provide git repository https://github.com/OpsTree/ContinuousIntegration 
Use clean compile as target 
success - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codestability2.png
path -  jenkins/jenkins day3/codestability2.png 

target - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codestability1.png
path -  jenkins/jenkins day3/codestability1.png 



Setup static code analysis Job
Choose Job type as MavenProject 
Provide git repository https://github.com/OpsTree/ContinuousIntegration 
Use clean compile findbugs:findbugs checkstyle:checkstyle as target 

success - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/staticcodeanalysis.png
path -  jenkins/jenkins day3/staticcodeanalysis.png 

target - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/staticcodeanalysis2.png
path -  jenkins/jenkins day3/staticcodeanalysis2.png


 
Setup code coverage Job
Choose Job type as MavenProject 
Provide git repository https://github.com/OpsTree/ContinuousIntegration 
Use clean compile cobertura:cobertura as target 

success - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codecoverage.png
path -  jenkins/jenkins day3/codecoverage.png 

target - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day3/codecoverage2.png
path -  jenkins/jenkins day3/codecoverage2.png 
