pipeline {
    agent {
    
        stages {
            stage("Run groovy scripts") {
                steps {
                    script {
                            echo "Hello, friend!"
                    }
                }
            }
            
            
            stage("Run jobs dsl") {
                steps {
                    jobDsl targets: 'files/**/*.groovy'
                    jobDsl targets: 'jobs/*.groovy'
                }
            }
        }
    }
}
