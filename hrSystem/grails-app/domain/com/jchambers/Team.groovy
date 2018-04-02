package com.jchambers

class Team {

String teamName
TeamLeader teamleader
int numberOfEmployees
String sectionName
String description

    static constraints = {

teamName blank: false, minSize: 3, maxSize: 20, nullable: false
numberOfEmployees maxSize: 2, nullable: false
sectionName blank: false, nullable: false
description blank: false, maxSize:40, nullable: false
teamleader blank: false, nullable: false

    }
}
