package com.jchambers

class Employee {
String fullName
Date dateOfBirth
String residence
double hourlyRate
String employeeID
Date dateEmployed
String taxCode
String contract

    static constraints = {
fullName blank: false, minSize: 7, maxSize: 25
residence blank: false, minSize: 3, maxSize: 20
employeeID blank: false, unique: true
taxCode blank: false, minSize: 4
contract minSize: 9, maxSize: 9
    }
}
