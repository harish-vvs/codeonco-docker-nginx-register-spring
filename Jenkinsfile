#!groovy
node('vagrant_staging') {
    stage('test_application') {
        sh 'cd /vagrant/workspace/test_pipeline_1/codeonco-docker-nginx-register-spring; mvn clean test'
    }
}
