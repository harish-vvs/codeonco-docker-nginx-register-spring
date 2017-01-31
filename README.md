# spring-rest-docker

This demo for building maven CRUD app and deploy using docker, just showcase a simple REST API on POST register details, and retrieve data with GET.

## Here are step to run this:

1. Install docker. Following [this guide](https://docs.docker.com/engine/installation/)
2. Build app as war using `mvn clean package`. NOTE: If any changes are made to the code, run `docker-compose build` after `mvn clean package` to rebuild image.
3. Run app using `docker-compose up`

## Docker compose creates 5 services:

1. Database container which use mysql image with 1 database named 'restmesure' created
2. Web application container built based on tomcat:8.5 image and deploy the war file as ROOT app
3. Nginx + consul template as load balancer serving on port 80
4. Consul server
5. Registrator

## Testing through web
Access http://docker-ip URL from your browser to see if it work

## Unit test through command line
Run `mvn clean test` through command line. NOTE: `mvn clean install` both repackage war file and run test at the same time

## REST API testing

1. Import `spring-rest-docker.postman.json` to your postman collection
2. Create new environment which has `url` key with the value: `http://docker-ip`
3. Exec each pre-defined requests to see result

## REST API calls
1. (POST) For sending a body for an order with serviceName, and userName ===> {{url}}/rest/register
	Example 
	{
		"serviceName": "Tracker",
		"userName": "Phone",
	}
	
2. (GET) For retrieving all orders ===> {{url}}/rest
3. (GET) For retrieving orders based on {{id}} ===> {{url}}/rest/{{id}}