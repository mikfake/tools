SHL
Question
Martin is standing at X2 meters away from his home. He wonders how fast he must run at some constant speed of
V2 meters per step so as to maximize F. where F equals the number of his father's footsteps that Martin will land on
during his run. It is given that the first step that Martin will land on, from his starting position, will have been landed
on by his father.
Note that if more than one prospective velocity results in the same number of maximum common steps, output the
highest prospective velocity as V2.
Write an algorithm to help Martin calculate F and V2.
Input
The first line of the input consists of an integer fatherPos, representing the initial position of Martin's father (Xij).
The second line consists of an integer martinPos, representing the initial position of Martin (X2)
The third line consists of an integer velfather, representing the velocity of the father (Vj).
The last line consists of an integer steps, representing the number of steps taken by the father (N)
Output
Print two space-separated integers as the maximum number of common footsteps F and respective speed V2
Constraints
1 s fatherPos s 105
0 ≤ martinPos s fatherPos
1 s velFathers 104
1≤ stepss104
Example
Input:
22
20
Output:
211
Explanation:
Martin can have a maximum of 21 common footsteps with a velocity of 1 m/step.
Type here to search
