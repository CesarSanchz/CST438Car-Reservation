# CST438Car-Reservation
## URL

[https://cst438car-reservation.herokuapp.com]

## API Endpoints

## Get All Cars
`/api/getAllCars`

`Type: GET`

**Description**: Return a JSON response with All Cars in DB

### Parameters 
`none`

### Example
 `https://cst438car-reservation.herokuapp.com/api/getAllCars`
### Response

```
[
    {
        "id": 1,
        "make": "Renault",
        "model": "Fuego",
        "fuel": "Regular",
        "transmission": "Manual 5-spd",
        "year": 1984,
        "price": 199,
        "city": "seattle"
    },
    {
        "id": 2,
        "make": "Chevrolet",
        "model": "Celebrity Wagon",
        "fuel": "Regular",
        "transmission": "Automatic 4-spd",
        "year": 1987,
        "price": 99,
        "city": "new york"
    },
    {
        "id": 3,
        "make": "Toyota",
        "model": "MR2",
        "fuel": "Premium",
        "transmission": "Manual 5-spd",
        "year": 1989,
        "price": 150,
        "city": "boston"
    }
]
```
## Get Car By Id
`/api/getCarById`

`Type: GET`

**Description**: Return a JSON response with Cars per ID

### Parameters 
`id (required) int`

### Example
 `https://cst438car-reservation.herokuapp.com/api/getCarById?id=16`
### Response
```
{
    "id": 16,
    "make": "Porsche",
    "model": "Cayenne",
    "fuel": "Premium",
    "transmission": "Automatic 8-spd",
    "year": 2011,
    "price": 299,
    "city": "new york"
}
```
## Get Car By City
`/api/getCarByCity`

`Type: GET`

**Description**: Return a JSON response with Cars by City

### Parameters 
`city (required) string`

### Example
 `https://cst438car-reservation.herokuapp.com/api/getCarByCity?city=san francisco`
### Response
```
[
    {
        "id": 11,
        "make": "Volkswagen",
        "model": "Jetta Wagon",
        "fuel": "Premium",
        "transmission": "Automatic (S5)",
        "year": 2003,
        "price": 99,
        "city": "san francisco"
    },
    {
        "id": 12,
        "make": "Mercury",
        "model": "Mountaineer 2WD",
        "fuel": "Regular",
        "transmission": "Automatic 5-spd",
        "year": 2003,
        "price": 99,
        "city": "san francisco"
    },
    {
        "id": 14,
        "make": "Acura",
        "model": "MDX 4WD",
        "fuel": "Premium",
        "transmission": "Automatic (S5)",
        "year": 2009,
        "price": 129,
        "city": "san francisco"
    }
]
```  
## Reserve Car
`/api/reserve`

`Type: POST`

**Description**: Reserve a car and return a JSON response with reservation ID, car, email 

### Parameters 
```
- car_id (required) int
- email (required) string
```

### Example
 `https://cst438car-reservation.herokuapp.com/api/reserve?car_id=11&email=bob@yahoo.com`
### Response
```
{
    "rid": 30,
    "car_id": {
        "id": 11,
        "make": "Volkswagen",
        "model": "Jetta Wagon",
        "fuel": "Premium",
        "transmission": "Automatic (S5)",
        "year": 2003,
        "price": 99,
        "city": "san francisco"
    },
    "email": "bob@yahoo.com"
}
```
## Get All Reservations
`/api/getReservation`

`Type: GET`

**Description**: return a JSON response with reservation details

### Parameters 
`none`

### Example
 `https://cst438car-reservation.herokuapp.com/api/getReservation`
### Response
```
{
        "rid": 4,
        "car_id": {
            "id": 5,
            "make": "Ford",
            "model": "Ranger Pickup 2WD",
            "fuel": "Regular",
            "transmission": "Manual 5-spd",
            "year": 1990,
            "price": 99,
            "city": "boston"
        },
        "email": "bobby@me"
    },
    {
        "rid": 5,
        "car_id": {
            "id": 6,
            "make": "Eagle",
            "model": "Summit Wagon",
            "fuel": "Regular",
            "transmission": "Automatic 4-spd",
            "year": 1992,
            "price": 50,
            "city": "san diego"
        },
        "email": "alice@me"
    },
```
## Get Reservations by ID
`/api/getReservation/id`

`Type: GET`

**Description**: return a JSON response with reservation details by ID

### Parameters 
```
rid (required) int
```

### Example
 `https://cst438car-reservation.herokuapp.com/api/getReservation/id?rid=29`
### Response
```
[
    {
        "rid": 29,
        "car_id": {
            "id": 12,
            "make": "Mercury",
            "model": "Mountaineer 2WD",
            "fuel": "Regular",
            "transmission": "Automatic 5-spd",
            "year": 2003,
            "price": 99,
            "city": "san francisco"
        },
        "email": "bob@you"
    }
]
```
## DeleteReservations by RID
`/api/getReservation/id`

`Type: DELETE`

**Description**: Delete's Reservation by ID and gives back a 204 no content response

### Parameters 
```
rid (required) int
```

### Example
 `https://cst438car-reservation.herokuapp.com/api/getReservation/id?rid=29`
### Response
Will return a 204 No Content empty page
