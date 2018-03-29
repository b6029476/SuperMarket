package com.jchambers

class BootStrap {
def init = { servletContext ->
def employee1=new Employee (fullName:'James Sharbucho',
dateOfBirth:new Date('09/11/1996'),
residence:'Sheffield',
hourlyRate: 7.50,
employeeID:'TR8R',
dateEmployed:new Date('09/11/2018'),
taxCode:'TX935',
contract:'Full-Time').save()
}
    def destroy = {
    }

}
