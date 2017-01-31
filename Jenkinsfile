#!groovy
stage('deploy_to_dev_environment'){
    node('master'){
        dir('/Users/qpairdeveloper/Documents/vagrant/ci_cd_pipeline/codeonco-docker-nginx-register-spring'){
            sh 'pwd'
            git credentialsId: '64785bd4-d94b-4b8c-bc99-46e2375ae5ca', url: 'https://github.com/harish-vvs/codeonco-docker-nginx-register-spring'
        }
    }
    node('master'){
        dir('/Users/qpairdeveloper/Documents/vagrant/ci_cd_pipeline'){
            sh 'vagrant scp codeonco-docker-nginx-register-spring/ staging:/vagrant'
        }
    }
}

node('vagrant_staging') {
    stage('build_on_dev_environment') {
        sh 'rsync -zavh --remove-source-files /vagrant/codeonco-docker-nginx-register-spring /vagrant/workspace/test_pipeline_1/'
        sh 'mvn -f /vagrant/workspace/test_pipeline_1/codeonco-docker-nginx-register-spring/ clean package'
        sh 'cd /vagrant/workspace/test_pipeline_1/codeonco-docker-nginx-register-spring; sudo docker-compose up -d'
    }
}

node('vagrant_staging') {
    stage('stop_start_application') {
        sh 'cd /vagrant/workspace/test_pipeline_1/codeonco-docker-nginx-register-spring; sudo docker-compose stop restapp'
        sh 'cd /vagrant/workspace/test_pipeline_1/codeonco-docker-nginx-register-spring; sudo docker-compose start restapp'

        
    }
}
