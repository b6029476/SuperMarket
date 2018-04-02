package com.jchambers

class TeamLeader{

String fullName
Team team
Manager manager
String department
String employeeID
String sectionName
int officePhone
String leaderEmail
String password
static hasMany=[employees:Employee]

    static constraints ={
fullName blank: false, minSize: 7, maxSize: 25, nullable: false
department blank: false, nullable: false
employeeID blank: false, unique: true, nullable: false
sectionName blank: false, nullable: false
officePhone minSize: 5 , maxSize: 12, nullable: false
leaderEmail blank: false, email: true, unique: true, nullable: false
password blank:false, minSize: 7, maxSize: 22, nullable: false
team blank: true, nullable: true
manager blank: true, nullable: true
    }
}
