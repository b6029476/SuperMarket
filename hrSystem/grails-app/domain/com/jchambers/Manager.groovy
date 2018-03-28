package com.jchambers

class Manager{
     
String fullName
String userName
String passWord
String managerEmail
String office
String department

    static constraints ={
fullName blank: false, minSize: 7, maxSize: 25
userName blank: false, unique: true
passWord blank: false, minSize: 7, maxSize: 22
managerEmail email: true, blank: false, unique: true
office blank: false, minSize: 3, maxSize: 7
department blank: false
    }
}
