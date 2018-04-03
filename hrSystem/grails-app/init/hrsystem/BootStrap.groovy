package com.jchambers


class BootStrap {
def init = { servletContext ->
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

def shift1=new Shift(timeOfDay:'Morning',
dayOfWeek:'Monday',
numberOfHours: 12,
startingTime:'6:00AM').save()

def shift2=new Shift(timeOfDay:'Afternoon',
dayOfWeek:'Thursday',
numberOfHours: 4,
startingTime:'8:00PM').save()

def employee1=new Employee (fullName:'James Sharbucho',
manager: manager2,
shift: shift1,
dateOfBirth:new Date('09/11/1996'),
residence:'Sheffield',
hourlyRate: 7.50,
employeeID:'TR8R',
dateEmployed:new Date('09/11/2018'),
taxCode:'TX935',
contract:'Full-Time').save()

def employee2=new Employee (fullName:'Harry Potter',
manager: manager2,
shift: shift1,
dateOfBirth:new Date('08/12/1995'),
residence:'Hogwarts',
hourlyRate: 7.50,
employeeID:'W1ZRD',
dateEmployed:new Date('09/12/2017'),
taxCode:'TX967',
contract:'Full-Time').save()

def leader1=new TeamLeader (fullName:'Sarah Macdonald',
manager: manager1,
department:'Grocery, Electronics, Clothing',
employeeID:'TL1111',
sectionName:'Bakery, Butcher',
officePhone:'01111777',
leaderEmail:'smac@email.com',
password:'secret2017').save()

def leader2=new TeamLeader (fullName:'John Connor',
manager: manager1,
department:'Food, Outdoors',
employeeID:'ARN13',
sectionName:'Butcher, Outdoors',
officePhone:'01111777',
leaderEmail:'JCONNOR@email.com',
password:'survivor123').save()

def team2=new Team (teamName:'Loading',
teamleader: leader1,
numberOfEmployees: 12,
sectionName:'Bakery, Butcher',
description:'Loading and unloading deliveries.').save()

def team1=new Team (teamName:'Tills',
teamleader: leader2,
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

manager1.addToTeamleaders(leader1)
manager1.addToTeamleaders(leader2)

manager2.addToEmployees(employee1)
manager2.addToEmployees(employee2)

shift1.addToEmployees(employee1)
shift1.addToEmployees(employee2)

leader2.addToEmployees(employee1)
leader2.addToEmployees(employee2)

team1.addToTasks(task1)
team1.addToTasks(task2)
team2.addToTasks(task1)
team2.addToTasks(task2)

team1.addToEmployees(employee1)
team1.addToEmployees(employee2)
team2.addToEmployees(employee1)
team2.addToEmployees(employee2)

shift1.addToTasks(task1)
shift1.addToTasks(task2)
shift2.addToTasks(task1)
shift2.addToTasks(task2)

task1.addToEmployees(employee1)
task1.addToEmployees(employee2)
task2.addToEmployees(employee1)
task2.addToEmployees(employee2)

shift1.addToTeams(team1)
shift1.addToTeams(team2)
shift2.addToTeams(team1)
shift2.addToTeams(team2)

}
    def destroy = {
    }

}
