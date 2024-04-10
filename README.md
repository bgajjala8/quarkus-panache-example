# Presistance using Quarkus Panache 

## This repo looks at using Quarkus Panache functionality through a small rest API 

### Steps to run
* Start quarkus - mvn quarkus:dev
* Run script under /scripts/database-init.sh to start up a local postgres instance 
* Endpoints
	* GET /name/{name} - Search by name
	* GET /id/{id} -Search by id
	* GET /add - Get all 
	* POST /{name} - Create Employee

