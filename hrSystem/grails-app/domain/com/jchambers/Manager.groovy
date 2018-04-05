package com.jchambers

class Manager{   
String fullName
String username
String password
String managerEmail
String office
String department
static hasMany=[teamleaders:TeamLeader, employees:Employee]
String toString(){
return fullName
}
    static constraints ={
fullName blank: false, minSize: 7, maxSize: 25, nullable: false
username blank: false, unique: true, nullable: false
password blank: false, minSize: 7, maxSize: 22, nullable: false
managerEmail email: true, blank: false, unique: true, nullable: false
office blank: false, minSize: 3, maxSize: 7, nullable: false
department blank: false, nullable: false
    }
}
