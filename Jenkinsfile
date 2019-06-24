pipeline {
    agent any     
        stages {
            stage("Run script") {
                steps {
                        echo "Hello, friend!"
                }
            }
            
            
            stage("Run jobs dsl") {
                steps {
                    jobDsl targets: 'files/*.groovy'
                    jobDsl targets: 'jobs/*.groovy'
                }
            }
        }
}
