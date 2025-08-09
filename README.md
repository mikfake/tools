version of JDK being used is 1.8

Note: The main class name must be "Solution".

Martin's father goes for a jog every morning. Martin follows him several minutes later. His father starts at a position that is X1 meters away from their home and runs rectilinearly at a constant speed of V1 meters per step for N steps.

Martin is standing at X2 meters away from his home. He wonders how fast he must run at some constant speed of V2 meters per step so as to maximize F, where F equals the number of his father's footsteps that Martin will land on during his run. It is given that the first step that Martin will land on, from his starting position, will have been landed on by his father.

Note that if more than one prospective velocity results in the same number of maximum common steps, output the highest prospective velocity as V2.

Write an algorithm to help Martin calculate F and V2.

Input
The first line of the input consists of an integer fatherPos, representing the initial position of Martin's father (X₁).
The second line consists of an integer martinPos, representing the initial position of Martin (X₂).
The third line consists of an integer velFather, representing the velocity of the father (V₁).
The last line consists of an integer steps, representing the number of steps taken by the father (N).

Output
Print two space-separated integers as the maximum number of common footsteps F and respective speed V₂.

Constraints
1 ≤ fatherPos ≤ 10⁵
0 ≤ martinPos ≤ fatherPos
1 ≤ velFather ≤ 10⁴
1 ≤ steps ≤ 10⁴

Example
Input: （因截图中示例输入显示不全，按已有提取 ）
