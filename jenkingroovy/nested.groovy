job('ninja-jobs') {
  nestedView('simple-jobs') {
    views {
        listView('"parameterized-hello-world", "hello person", "hello git", "hello periodical", "hello poll"') 
      {         
            columns {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
            }
        }
        }
  }
      nestedView('coplex-jobs') {
    views {
        listView('"hello upstream", "hello downstream"') {
            columns {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
            }
        }
    }  
    }
    }
