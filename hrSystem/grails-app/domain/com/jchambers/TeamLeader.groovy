package com.jchambers

class TeamLeader{

String fullName
String department
String employeeID
String sectionName
int officePhone
String leaderEmail
String password

    static constraints ={
fullName blank: false, minSize: 7, maxSize: 25
department blank: false
employeeID blank: false, unique: true
sectionName blank: false
officePhone minSize: 5 , maxSize: 12
leaderEmail blank: false, email: true, unique: true
password blank:false, minSize: 7, maxSize: 22
    }
}
