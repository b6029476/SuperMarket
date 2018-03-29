package com.jchambers

class Shift {

String timeOfDay
String dayOfWeek
int numberOfHours
String startingTime
    static constraints = {

timeOfDay blank: false, maxSize: 10, minSize: 7
dayOfWeek maxSize: 10, blank: false, minSize: 6
numberOfHours maxSize: 2
startingTime maxSize: 7

    }
}
