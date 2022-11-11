# APITestingFramework

This is a Java project/framework for API testing.
In this project I have used two RAPID APIs.
1. https://rapidapi.com/api-sports/api/covid-193
2. https://rapidapi.com/symanto-symanto-default/api/sentiment-analysis9

## Tech Stack Used:
1. Java
2. IDE: Eclipse
3. Frameworks: Junit (testNg is almost similar)
4. Report Generator: surefire
5. Rest-assured
6. Maven

### Test Scenarios:
1. Get all current statistics for USA.
3. Detect the text-level sentiment.

## RESULTS:
<img width="459" alt="image" src="https://user-images.githubusercontent.com/31099562/201392214-5ad88b7f-bec5-4aeb-84aa-56aad802228c.png">
<img width="853" alt="image" src="https://user-images.githubusercontent.com/31099562/201392334-a8276bfe-b826-458f-88cd-590b655e57a6.png">

## Challanges:
Creating POJO for statistics API. This is a difference in the given schema and the actual output.
1. SCHEMA:
{
  "type": "object",
  "properties": {
    "errors": {
      "type": "array"
    },
    "get": {
      "type": "string"
    },
    "parameters": {
      "type": "array"
    },
    "response": {
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "cases": {
            "type": "object"
          },
          "country": {
            "type": "string"
          },
          "day": {
            "format": "date",
            "type": "string"
          },
          "deaths": {
            "type": "object"
          },
          "tests": {
            "type": "object"
          },
          "time": {
            "format": "date-time",
            "type": "string"
          }
        }
      }
    },
    "results": {
      "type": "integer"
    }
  }
}
2. ACTUAL:
{
  "errors": [],
  "get": "statistics",
  "parameters": [],
  "response": [
    {
      "cases": {
        "1M_pop": "58",
        "active": 73,
        "critical": 3,
        "new": "+5",
        "recovered": 78315,
        "total": 83022
      },
      "continent": "Asia",
      "country": "China",
      "day": "2020-06-02",
      "deaths": {
        "1M_pop": "3",
        "new": null,
        "total": 4634
      },
      "population": 1439323776,
      "tests": {
        "1M_pop": null,
        "total": null
      },
      "time": "2020-06-02T20:45:06+00:00"
    },
    {
      "cases": {
        "1M_pop": "0.9",
        "active": 1,
        "critical": 0,
        "new": null,
        "recovered": 1,
        "total": 2
      },
      "continent": "Africa",
      "country": "Lesotho",
      "day": "2020-06-02",
      "deaths": {
        "1M_pop": null,
        "new": null,
        "total": 0
      },
      "population": null,
      "tests": {
        "1M_pop": null,
        "total": 283
      },
      "time": "2020-06-02T20:45:06+00:00"
    }
  ],
  "results": 227
}

#### Difference: continent and population were missing in schema.

## HTML REPORT:
<img width="1297" alt="image" src="https://user-images.githubusercontent.com/31099562/201393849-96351dff-85cd-4031-947e-8c64dff536bb.png">

### HOW TO RUN ?
1. clone this project
2. Install the dependency
3. Verify project build is correct
4. In run configuration: Run as maven build : clean test package site (This will clean the target, run the test, create a .jar file and create site as report.)
<img width="965" alt="image" src="https://user-images.githubusercontent.com/31099562/201394466-dab123f8-4ff1-45b2-b8e7-db1130604d07.png">

RUN THIS PROJECT
