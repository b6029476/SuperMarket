package com.jchambers

class Team {

String teamName
int numberOfEmployees
String sectionName
String description

    static constraints = {

teamName blank: false, minSize: 3, maxSize: 20
numberOfEmployees maxSize: 2
sectionName blank: false
description blank: false, maxSize:40

    }
}
