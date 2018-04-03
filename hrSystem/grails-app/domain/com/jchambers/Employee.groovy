package com.jchambers

class Employee {
String fullName
Manager manager
Shift shift
Date dateOfBirth
String residence
double hourlyRate
String employeeID
Date dateEmployed
String taxCode
String contract

static hasMany=[teams:Team, tasks:Task]
static belongsTo=[Team, Task]

String toString(){
return fullName
}

    static constraints = {
fullName blank: false, minSize: 7, maxSize: 25, nullable: false
residence blank: false, minSize: 3, maxSize: 20, nullable: false
employeeID blank: false, unique: true, nullable: false
taxCode blank: false, minSize: 4, nullable: false
contract minSize: 9, maxSize: 9, nullable: false
manager blank: true, nullable: true
shift blank: true, nullable: true
    }
}
