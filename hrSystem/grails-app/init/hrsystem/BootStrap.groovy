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

def employee2=new Employee (fullName:'Harry Potter',
dateOfBirth:new Date('08/12/1995'),
residence:'Hogwarts',
hourlyRate: 7.50,
employeeID:'W1ZRD',
dateEmployed:new Date('09/12/2017'),
taxCode:'TX967',
contract:'Full-Time').save()

def employee3=new Employee (fullName:'Boris Johnson',
dateOfBirth:new Date('17/06/1985'),
residence:'London',
hourlyRate: 7.50,
employeeID:'1D1O7',
dateEmployed:new Date('16/2/2018'),
taxCode:'TX9159',
contract:'Part-Time').save()

def team2=new Team (teamName:'Loading',
numberOfEmployees: 12,
sectionName:'Bakery, Butcher',
description:'Loading and unloading deliveries.').save()

def team3=new Team (teamName:'Stock',
numberOfEmployees: 8,
sectionName:'All',
description:'Re-Stocking all across the store.').save()

def team1=new Team (teamName:'Tills',
numberOfEmployees: 4,
sectionName:'Checkout',
description:'Handling customers at the tills.').save()

def task1=new Task (taskName:'Tills',
numberOfPeople: 4,
sectionName:'Checkout',
department:'Checkout',
timeRequired:'00:00',
description:'Handling customers at the tills.',
taskCompleted:'True').save()

def task2=new Task (taskName:'Replenishing',
numberOfPeople: 2,
sectionName:'Bakery',
department:'Butchers, Bakery',
timeRequired:'1 Hour',
description:'Replenishing Shelves.',
taskCompleted:'False').save()

def task3=new Task (taskName:'Cleaning',
numberOfPeople: 2,
sectionName:'Bakery',
department:'Bakery',
timeRequired:'1 Hour',
description:'Mopping the floor due to spillage.',
taskCompleted:'False').save()

def shift1=new Shift(timeOfDay:'Morning',
dayOfWeek:'Monday',
numberOfHours: 12,
startingTime:'6:00AM').save()

def shift2=new Shift(timeOfDay:'Afternoon',
dayOfWeek:'Thursday',
numberOfHours: 4,
startingTime:'8:00PM').save()

def shift3=new Shift(timeOfDay:'Evening',
dayOfWeek:'Saturday',
numberOfHours: 7,
startingTime:'9:00AM').save()

def leader1=new TeamLeader (fullName:'Sarah Macdonald',
department:'Grocery, Electronics, Clothing',
employeeID:'TL1111',
sectionName:'Bakery, Butcher',
officePhone:'01111777',
leaderEmail:'smac@email.com',
password:'secret2017').save()

def leader2=new TeamLeader (fullName:'John Connor',
department:'Food, Outdoors',
employeeID:'ARN13',
sectionName:'Butcher, Outdoors',
officePhone:'01111777',
leaderEmail:'JCONNOR@email.com',
password:'survivor123').save()

def leader3=new TeamLeader (fullName:'Vladimir',
department:'Electronics',
employeeID:'T123R',
sectionName:'Electronics',
officePhone:'01111777',
leaderEmail:'RusEmail@email.com',
password:'Elections').save()

def manager1=new Manager (fullName:'Steve Crossbar',
userName:'scross',
passWord:'secret2018',
managerEmail:'scross@email.com',
office:'B1-900',
department:'Grocery, Electronics, Clothing').save()

def manager2=new Manager (fullName:'John Post',
userName:'JPost',
passWord:'TooSecret123',
managerEmail:'Jpost@email.com',
office:'Z4-789',
department:'Dairy, Bakery, Butcher').save()

def manager3=new Manager (fullName:'James Crawford',
userName:'JCraw',
passWord:'SuperScrt',
managerEmail:'JCRAW@email.com',
office:'1X-123',
department:'Security, Checkout').save()
}
    def destroy = {
    }

}
