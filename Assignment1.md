DAY 1 JENKINS

Assignment 1

Install Jenkins using package.
# sudo add-apt-repository ppa:webupd8team/java
            # sudo apt-get update
            # sudo apt-get install oracle-java8-installer
            # sudo apt-get install oracle-java8-set-default
            # cd /etc/environment
(edit JAVA_HOME=/usr/lib/jvm/java-8-oracle 
JRE_HOME=/usr/lib/jvm/java-8-oracle/jre)
            Install jenkins now
# wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -
# sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
# sudo apt-get update
# sudo apt-get install jenkins
 
 Run jenkins war on the top of a tomcat server.

Assignment 2
Install any five plugin and use them. 
1. git plugin
2. git parameter
3. aws ec2 plugin
4. pipeline
Install a plugin manually.













Assignment 3
Create a freestyle job to print "Hello world". 













Create a freestyle job to which take absolute path of a directory then 
1. List all files and directories inside that. 

2. Print a message "drectory not exist" if directory doesn't exist on file system 

3. Print "Inappropriate permissions" if you don't have permissions to list files. 

Create a job to clone your jenkins repo and cat a file from it. 




Create tag using git plugin. 











Assignment4:
Increase and decrease number of executors and observe the build queue. 
I created 10 executers.
           Decrease the size to 5
