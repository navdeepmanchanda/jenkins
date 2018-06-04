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

link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day1%20images/hello%20world.png
path -  jenkins/jenkins day1 images/hello world.png 

Assignment 4
Create a freestyle job to which take absolute path of a directory then 
1. List all files and directories inside that. 
link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day1%20images/directoryls.png
path -  jenkins/jenkins day1 images/directoryls.png 

2. Print a message "drectory not exist" if directory doesn't exist on file system
link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day1%20images/directorydne.png
path -  jenkins/jenkins day1 images/directorydne.png  

3. Print "Inappropriate permissions" if you don't have permissions to list files. 
link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day1%20images/directorypd.png
path -  jenkins/jenkins day1 images/directorypd.png 

Assignment 5 
Create a job to clone your jenkins repo and cat a file from it. 
link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day1%20images/cat.png
path -   jenkins/jenkins day1 images/cat.png  

Assignment 6
Create tag using git plugin. 
link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day1%20images/tagit.png
path -  jenkins/jenkins day1 images/tagit.png 


Assignment7
Increase and decrease number of executors and observe the build queue.
I created 10 executers.
link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day1%20images/Screenshot%20from%202018-06-01%2003-26-00.png
path -  jenkins/jenkins day1 images/Screenshot from 2018-06-01 03-26-00.png 

           Decrease the size to 5
link2 - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day1%20images/Screenshot%20from%202018-06-01%2003-24-18.png
path2 -  jenkins/jenkins day1 images/Screenshot from 2018-06-01 03-24-18.png 
