package com.jchambers

class Task {
String taskName
int numberOfPeople
String sectionName
String department
String timeRequired
String description
Boolean taskCompleted
static hasMany=[teams:Team, shifts:Shift, employees:Employee]
static belongsTo=[Team, Shift]

String toString(){
return taskName
}

    static constraints = {
taskName blank: false, minSize: 3, maxSize: 20, nullable: false
numberOfPeople mazSize: 2, nullable: false
sectionName blank: false, nullable: false
department blank: false, nullable: false
timeRequired blank: false, maxSize: 7, nullable: false
description blank: false, maxSize: 40, nullable: false
    }
}
