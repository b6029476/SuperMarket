package com.jchambers

class Task {
String taskName
int numberOfPeople
String sectionName
String department
String timeRequired
String description
Boolean taskCompleted

    static constraints = {
taskName blank: false, minSize: 3, maxSize: 20
numberOfPeople mazSize: 2
sectionName blank: false
department blank: false
timeRequired blank: false, maxSize: 7
description blank: false, maxSize: 40
    }
}
