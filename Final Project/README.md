
# Final Project - Bus Agency

Bus Agency adalah sistem informasi dengan CRUD untuk melakuakn pemrosesan pembelian tiket, pencarian trip bus, dan interaksi antara user dengan bus, user dengan agency travel serti user dengan loket tiket dari travel tersebut

## API Reference
List dari endpoint dari seluruh controller yang ada dalam sistem bud agency.

#### USER
##### Register User
Melakukan Registrasi user

```http
  POST /api/v1/user/signup
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `code`    | `string` | Code dalam table Agency |
| `details` | `string` | Details dalam table Agency |
| `email`   | `string` | email dalam table User |
| `FirstName`   | `string` |  |
| `LastName`   | `string` |  |
| `mobileNumber`   | `string` |  |
| `Name`   | `string` |  |
| `password`   | `string` |  |
| `Role`   | `string` |  |
| `UserName`   | `string` |  |

##### Update User

Mengubah data user

```http
  PUT /api/v1/user/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |
| `firstName` | `string` |  
| `lastName`  | `string` |

##### Update Password

Mengubah data password pada user

```http
  PUT /api/v1/user/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |
| `password` | `string` |

### AUTH
Untuk user atau admin melakukan admin dan sistem menentukan apakah credentials yang dimasukkan oleh user atau admin sudah benar atau belum

```http
  POST /api/auth
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `username`      | `string` |
| `password` | `string` |

### Agency
#### Get All Agency
Menampilkan seluruh list agency yang ada di database


```http
  GET /api/v1/agency
```
  #### Get Agency by ID
Menampilkan agency berdasarkan ID yang diinputkan

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |

#### Add Agency
Menambahkan agency, namun hanya bisa digunakan oleh user dengan ROLE_ADMIN

```http
  POST /api/v1/agency
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `code`      | `string` |
| `details`      | `string` |
| `name`      | `string` |
| `owner`      | `integer` |

#### Update Agency
Melakukan perubahan data pada data Agency, namun hanya user dengan ROLE_ADMIN yang bisa melakukannya

```http
  PUT /api/v1/agency/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `code`      | `string` |
| `details`      | `string` |
| `name`      | `string` |
| `owner`      | `integer` |

#### Delete Agency
Menghapus data pada data agency, namun hanya user dengan ROLE_ADMIN yang bisa melakukannya

```http
  DELETE /api/v1/agency/{id}
```
### BUS
#### Get All BUS
Menampilkan seluruh data BUS yang ada di database
```http
  GET /api/v1/agency
```
#### Get Bus by Agency ID
```http
  GET /api/v1/agency
```
Menampilkan data bus berdasarkan ID yang diinputkan

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |

#### Add Bus by Agency ID
Menambahkan bus sesuai dengan id agency yang diinputkan
```http
  POST /api/v1/bus/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `capacity`      | `integer` | |
| `code`      | `string` | |
| `make`      | `string` | |

#### Update Bus
Melakukan perubahan data bus di dalam database
```http
  PUT /api/v1/bus/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `capacity`      | `integer` | |
| `code`      | `string` | |
| `make`      | `string` | |

#### Delete Bus
```http
  DELETE /api/v1/bus/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |



### Stop

#### Get All Stops
Menampilkan seluruh data Stop yang ada di dalam database
```http
  GET /api/v1/stop
```

#### Get Stop by ID
Menampilkan stop dari id yang diinputkan
```http
  GET /api/v1/stop/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |

#### Add Stop
Menambahkan stop, namun hanya user dengan ROLE_ADMIN yang bisa menjalankan
```http
  POST /api/v1/stop
```
| Parameter | Type     |
| :-------- | :------- |
| `code`      | `string` | 
| `detail`      | `string` | 
| `id`      | `integer` | 
| `name`      | `string` | 

#### Delete Stop
Menghapus data Stop di dalam database
```http
  DELETE /api/v1/stop/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |

### Ticket
Pemesanan Tiket yang terintegrasi dengan table tripschedule dan juga table user

#### Get All Ticket
Melihat seluruh data ticket yang ada di database

```http
  GET /api/v1/ticket/
```

#### Get Ticket by ID
```http
  GET /api/v1/ticket/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |

#### Beli Tiket
```http
  POST /api/v1/ticket/
```
| Parameter | Type     |
| :-------- | :------- |
| `seatNumber`      | `integer` | 
| `cancellable`      | `boolean` | 
| `journeyDate`      | `string` | 
| `passangerID`      | `integer` |
| `tripscheduleID`      | `integer` | 

#### Update Tiket
```http
  PUT /api/v1/ticket/{id}
```
| Parameter | Type     |
| :-------- | :------- |
| `seatNumber`      | `integer` | 
| `cancellable`      | `boolean` | 
| `journeyDate`      | `string` | 
| `passangerID`      | `integer` |
| `tripscheduleID`      | `integer` | 

#### Delete Ticket
```http
  DELETE /api/v1/ticket/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |

### Trip 

#### Get All Trip
Menampilkan seluruh data Trip di dalam database
```http
  GET /api/v1/trip/
```

#### Get Trip by Agency ID
Menampilkan data Trip sesuai ID yang diinputkan
```http
  GET /api/v1/trip/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |

#### Add Trip
Menambahkan data Trip
```http
  POST /api/v1/trip/
```
| Parameter | Type     |
| :-------- | :------- |
| `agencyId`      | `integer` | 
| `busId`      | `integer` | 
| `desStopId`      | `integer` | 
| `fare`      | `integer` |
| `journeyTime`      | `integer` | 
| `sourceStopId`      | `integer` | 

#### Update Trip
Mengubah data Trip di dalam database
```http
  PUT /api/v1/trip/
```
| Parameter | Type     |
| :-------- | :------- |
| `agencyId`      | `integer` | 
| `busId`      | `integer` | 
| `desStopId`      | `integer` | 
| `fare`      | `integer` |
| `journeyTime`      | `integer` | 
| `sourceStopId`      | `integer` | 

#### Delete Trip
Menghapus data Trip di dalam database
```http
  DELETE /api/v1/trip/
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |

### Trip Schedule

#### Get All Trip Schedule
Menampilkan seluruh data Trip Schedule
```http
  GET /api/v1/tripschedule/
```

#### Get Trip Schedule by Id
Menampilkan data Trip Schedule
```http
  GET /api/v1/tripschedule/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |

#### Add Trip Schedule
Menambahkan data Trip Schedule
```http
  GET /api/v1/tripschedule/
```
| Parameter | Type     |
| :-------- | :------- |
| `available_seats`| `integer` | 
| `tripDate`      | `String` | 
| `trip_detail`      | `integer` | 

#### Update Trip Schedule
```http
  PUT /api/v1/tripschedule/{id}
```
| Parameter | Type     |
| :-------- | :------- |
| `available_seats`| `integer` | 
| `tripDate`      | `String` | 
| `trip_detail`      | `integer` | 

#### Delete Trip Schedule
```http
  DELETE /api/v1/tripschedule/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of item to fetch |


