DAY 5 JENKINS

Assignment 1

Create Job DSL for 
1. helloworld Job 
  
job(‘hello world’) {
   steps {
     shell(‘echo “hello world”’)
      }
   }

link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/parameterised-hello-world.png
 
path -  jenkins/jenkins day5 images/parameterised-hello-world.png 

2. hellotoperson Job (Take SALUTATION as choice parameter & NAME as string parameter) 

job(‘hello person’) {
   parameters {
      strinparam(‘Name’, ‘ ‘)
      choiceparam(‘Salutation’, [‘Mr.’, ‘Mrs.’])
      }
   }

link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/hello-person.png

path -  jenkins/jenkins day5 images/hello-person.png 
        
3. Gitclone and list content of cloned directory

job(‘hello git’) {
   scm {
       git(‘https://github.com/lovedeepsh/jenkins.git‘)
       }

   steps {
       shell(‘ls -al’)
       } 
   }

link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/gitclone.png

path -  jenkins/jenkins day5 images/gitclone.png 

4. buildperiodically Job (This job will run by every 5 min) 

job(‘hello periodical’) {
   scm {
       git(‘https://github.com/lovedeepsh/jenkins.git‘)
       }
       triggers {
       cron(‘*/5 * * * * ‘)
       }
       steps {
       shell(‘ls -al’)
       } 
   }

link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/crongroovy.png

path -  jenkins/jenkins day5 images/crongroovy.png 

5. pollscm Job (This job will have a poll interval of 2 min) 

job(‘hello pol’) {
   scm {
       git(‘https://github.com/lovedeepsh/jenkins.git‘)
       }
       triggers {
       scm(‘*/2 * * * * ‘)
       }
       steps {
       shell(‘ls -al’)
       } 
   }

link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/hellopoll.png

path -  jenkins/jenkins day5 images/hellopoll.png 

6. upstream Job (This job have helloworld job as upstream) 

job(‘hello upstream’) {
   triggers {
       upstream(‘parameterised-hello-world’, ‘SUCCESS’)
       }
   steps {
       shell(‘echo “This is downstream”’)
       } 
   }

link - https://github.com/lovedeepsh/jenkins/blob/master/jenkins%20day5%20images/upstream.png

path -  jenkins/jenkins day5 images/upstream.png 

7. downstream Job ( This job have hellotoperson job as downstream. Note: Pass variable(SALUTATION & NAME) from this job to hellotoperson job.) 

			
8. nestedview Job ( This job will create a nested view named as 'ninja-jobs' with folders 'simple-jobs' & 'complex-jobs'. simple-jobs will contain helloworld, hellotoperson, Gitclone, buildperiodically and pollscm. complex-jobs will contain upstream and downstream jobs.) 


