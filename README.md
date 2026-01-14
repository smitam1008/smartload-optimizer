# smartload-optimizer
Spring Boot microservice that optimizes truck shipment loads based on weight constraints to maximize profitability. Includes REST APIs and Docker support.

SmartLoad Optimizer

This project implements the core backend service for the “SmartLoad” feature.
The goal of the service is to help carriers find the most profitable combination
of shipments that a truck can legally and safely carry, based on weight limits.

The service is designed as a simple, production-style microservice and exposes
a REST API that accepts shipment details and returns the optimized result.

--------------------------------------------------

What this service does

- Accepts a list of shipments with weight and profit
- Accepts the truck’s maximum allowed weight
- Selects the most profitable combination of shipments
- Ensures the total weight does not exceed the limit
- Returns the selected shipments along with total profit and weight

--------------------------------------------------

Approach Used

A greedy optimization approach is used.
Shipments are sorted based on their profit-to-weight ratio, and the most
valuable shipments are selected until the truck reaches its weight limit.

This approach is efficient and works well for real-time decision making.
If required, it can be extended to a more optimal dynamic programming solution.

--------------------------------------------------

Tech Stack

- Java 17
- Spring Boot
- Maven
- Docker
- REST APIs
- Postman for testing

--------------------------------------------------

API Details

Endpoint:
POST /api/smartload/optimize

Sample Request:

{
  "maxWeight": 100,
  "shipments": [
    { "id": "S1", "weight": 50, "profit": 200 },
    { "id": "S2", "weight": 30, "profit": 180 },
    { "id": "S3", "weight": 40, "profit": 150 }
  ]
}

Sample Response:

{
  "selectedShipments": [
    { "id": "S2", "weight": 30, "profit": 180 },
    { "id": "S1", "weight": 50, "profit": 200 }
  ],
  "totalProfit": 380,
  "totalWeight": 80
}

--------------------------------------------------

How to Run Locally

Requirements:
- Java 17
- Maven

Command:
mvn spring-boot:run

The service will start on port 8080.

--------------------------------------------------

How to Run with Docker

Commands:
mvn clean package -DskipTests
docker build -t smartload-service .
docker run -p 8080:8080 smartload-service

--------------------------------------------------

Notes

- This is a stateless service
- No database is used
- Designed for simplicity and clarity
- Easy to extend with caching, persistence, or advanced algorithms

--------------------------------------------------

Author: Smita
Smita

