# Microservices
Step 1: Compile And Build all five projects 

  a) Registry Service
  b) Order Service
  c) Payment Service
  d) Cloud Service
  e) Hystrix Dashboard
  
Step 2: Run using jar file in given below order. Fist run always Registry service.
  a) Registry Service
  b) Order Service
  c) Payment Service
  d) Cloud Service
  e) Hystrix Dashboard
  
Step 3:
  open browser and type http://localhost:8761/ will Open Eureka Dashboard with registered all services
  
Step 4: In new tab, type http://localhost:8989/actuator/hystrix.stream for checking streaming.

Step 5: In new tab, type http://localhost:9195/hystrix for open Hystrix dashbord for monitoring all micro services ORDER-SERVICE and PAYMENT SERVICE

Step 6: Open Postman .
  a) Postman - http://localhost:8989/order (POST)
        choose body and file type JOSN.
        
        {
          "id": 1,
          "name": "Laptop",
          "qty": 5,
          "price": 300000
        },
        "payment":{
        }
        
 Step 7: Check performance/server is down or work properly on Hystrix dashboard (in Browser)
 
 Thank you
 
