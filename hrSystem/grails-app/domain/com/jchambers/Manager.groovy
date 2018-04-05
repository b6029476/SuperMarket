package com.jchambers

class Manager{   
String fullName
String userName
String passWord
String managerEmail
String office
String department
static hasMany=[teamleaders:TeamLeader, employees:Employee]
String toString(){
return fullName
}
def login(){
}
def validate(){
def user = Manager.findByUsername(params.userName)

if(user && user.passWord == params.passWord)

session.user = user

render view:'home'
}
else

flash.message = "invalid username and password"

render view:'login'

}
def logout(){

session.user = null

redirect(uri:'/')
}

    static constraints ={
fullName blank: false, minSize: 7, maxSize: 25, nullable: false
userName blank: false, unique: true, nullable: false
passWord blank: false, minSize: 7, maxSize: 22, nullable: false
managerEmail email: true, blank: false, unique: true, nullable: false
office blank: false, minSize: 3, maxSize: 7, nullable: false
department blank: false, nullable: false
    }
}
