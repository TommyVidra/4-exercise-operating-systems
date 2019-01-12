# 4-exercise-operating-system in java

My solution for the 4th exercise i operating systems

The task was to simulate dynamical allocaion of an address register.

For example: register size is 5

->
# # # # # (an empty regisrer)

if we want to take up 1 space the register would look like this

0 # # # # 

if we take up 2 more spaces

0 1 1 # #

now if take up 1 more

0 1 1 2 #

now if we want to free up the sace with index no. 1

0 # # 2 #

and if we want to take up 3 more spaces 

0 2 3 3 3 
