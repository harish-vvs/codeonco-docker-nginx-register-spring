#!groovy
node('vagrant_staging') {
    stage('test_application') {
        git branch: 'dev', credentialsId: '64785bd4-d94b-4b8c-bc99-46e2375ae5ca', url: 'https://github.com/harish-vvs/codeonco-docker-nginx-register-spring'
        def pwd_value = pwd()
        sh 'pwd'
        sh 'ls -al'
        sh "echo ${pwd_value}"
    }
}
