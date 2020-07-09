**sbt version** 1.3.13

**java** 8 or later

**build** `sbt clean cleanFiles update compile`

**run** `sbt run`

**Request examples:**

- `curl --request POST \
   --url http://localhost:9000/students-app/V1/student \
   --header 'content-type: application/json' \
   --data '{
 	"id": 1,
   "firstName": "Jhon",
   "lastName": "Smith"
 }'`
 
 - `curl --request GET \
    --url http://localhost:9000/students-app/V1/student/1`