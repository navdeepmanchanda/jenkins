DAY 5 JENKINS

Assignment 1

Create Job DSL for 
1. helloworld Job 
  
job(‘hello world’) {
   steps {
     shell(‘echo “hello world”’)
      }
   }

link -
 
path - 

2. hellotoperson Job (Take SALUTATION as choice parameter & NAME as string parameter) 

job(‘hello person’) {
   parameters {
      strinparam(‘Name’, ‘ ‘)
      choiceparam(‘Salutation’, [‘Mr.’, ‘Mrs.’])
      }
   }

link - 

path - 
        
3. Gitclone and list content of cloned directory

job(‘hello git’) {
   scm {
       git(‘https://github.com/lovedeepsh/jenkins.git‘)
       }

   steps {
       shell(‘ls -al’)
       } 
   }

link - 

path - 

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

link - 

path - 

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

link - 

path - 

6. upstream Job (This job have helloworld job as upstream) 

job(‘hello upstream’) {
   triggers {
       upstream(‘parameterised-hello-world’, ‘SUCCESS’)
       }
   steps {
       shell(‘echo “This is downstream”’)
       } 
   }

link - 

path - 

7. downstream Job ( This job have hellotoperson job as downstream. Note: Pass variable(SALUTATION & NAME) from this job to hellotoperson job.) 

			
8. nestedview Job ( This job will create a nested view named as 'ninja-jobs' with folders 'simple-jobs' & 'complex-jobs'. simple-jobs will contain helloworld, hellotoperson, Gitclone, buildperiodically and pollscm. complex-jobs will contain upstream and downstream jobs.) 


Assignment2
 
Assignment3

Assignment4

Assignment5

Assignment6

Assignment7 
