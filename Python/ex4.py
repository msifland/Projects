# Math varibles

cars = 100
space_in_a_car = 4.0
drivers = 30
passengers = 90
cars_not_driven = cars - drivers
cars_driven = drivers
carpool_capacity = cars_driven * space_in_a_car
average_passengers_per_car = passengers / cars_driven

print "There are", cars, "cars available"
print "There are only", drivers, "drivers available"
print "There will be", cars_not_driven, "empty cars today."
print "We can transport", carpool_capacity, "people today."
print "We have", passengers, "to transport today."
print "We need to put about", average_passengers_per_car, "in each car."
print

# Some instructions on doing math with python
print "More math: "
print "You can simply type \"python\" in terminal hit \"enter\" and start doing math. Or start typing variables and what not."
print

# Different ways to define variable and use them
print "a=5"
print "b = 6"
print "c= 7"
a=5
b = 6
c= 7
print "a+b-c=", a+b-c
print "a + b - c = ", a + b - c
print

print "Here I am using 'from subprocess import call' to call bash commands"
print

print "from subprocess import call"
from subprocess import call
print

print "call(['ls','-l'])"
call(['ls','-l'])
print

print "call(['repo','sync'])"
call(["repo","sync"])
print

print "call(['git','init'])"
call(['git','init'])
print

print "Here I am using the deprecated 'import os, os.system' command to call shell functions"
print

print "import os"
import os
print

print "os.system('ls-la')"
os.system('ls -la')
print

print "os.system('repo sync')"
os.system('repo sync')
print

print "os.system('git init')"
os.system('git init')
print

str = "This is a string"
print "This is a", str, "and again"
print "This is a %s and again" % str
print

num = 3.00
print "This is the number", num, "three spelled out"
print "This is the number %d three spelled out" % num
# Open a file and show it in terminal
file = open('ex4.py', 'r')
print file.read()
file.close()

