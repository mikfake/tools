Question
Theon is an energy engineer. His job is to transport oil from the base refinery to the main storage unitsthrough a network of pipes. The network is in the form of a tree, where the base refinery is the root andthe main storage units are the leaves, The pipes are connected to the storage units via internalconnecting, stations. The pipes can have different transfer rates fliter of oil per unit of timej. He wishes todetermine the maximum amount of oll that can be transported via the network at any
Write an algorithm to help Theon find the maximum amount of oil that can be transported via thenetwork at any given time.
input
The first line of the input consists of an integer . num, representing the number of stations in the network
(N).
The second line consists of an integer - baseR, representing the index of the base refinery in the network
(S).
The third line consists of two space-separated integers - numCon and charCon, representing the numberof connections in the network (numCon (M) is always equal to N-1) and given characteristics of eachconnection (charCon (P) is always equal to 3), respectively.The next M lines consist of p space-separated integers - start endand rate, representing the startingnode of the pipe; the ending node of the pipe; and the transfer rate of the pipe, respectively.
OutputPrint an integer representing, the maximum amount of olil that can be transported vla the network at anygiven time.
Constraints
3 s num s 105
1's baseRs 105
1 srates103
numConenum-1
charCon =3
