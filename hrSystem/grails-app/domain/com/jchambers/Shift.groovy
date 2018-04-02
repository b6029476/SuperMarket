package com.jchambers

class Shift {

String timeOfDay
String dayOfWeek
int numberOfHours
String startingTime
static hasMany=[employees:Employee]
    static constraints = {

timeOfDay blank: false, maxSize: 10, minSize: 7, nullable: false
dayOfWeek maxSize: 10, blank: false, minSize: 6, nullable: false
numberOfHours maxSize: 2, nullable: false
startingTime maxSize: 7, nullable: false

    }
}
