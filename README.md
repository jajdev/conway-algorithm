## conwayalgorithm
This is an implementation of the Conway Doomsday Algorithm. This algorithm can calulate the day of the week for any date between the years 1500 and 3000. 

# Background
The algorithm for mental calculation was devised by John Conway in 1973, drawing inspiration from Lewis Carroll's perpetual calendar algorithm. It takes advantage of each year having a certain day of the week upon which certain easy-to-remember dates, called the doomsdays, fall; for example, the last day of February, 4/4, 6/6, 8/8, 10/10, and 12/12 all occur on the same day of the week in any year.

Applying the Doomsday algorithm involves three steps: Determination of the anchor day for the century, calculation of the anchor day for the year from the one for the century, and selection of the closest date out of those that always fall on the doomsday, e.g., 4/4 and 6/6, and count of the number of days (modulo 7) between that date and the date in question to arrive at the day of the week.

# v1.0
Complete implementation of the algorithm with JUnit tests. (Complete)

# Reference
https://en.wikipedia.org/wiki/Doomsday_rule
https://www.youtube.com/watch?v=714LTMNJy5M

