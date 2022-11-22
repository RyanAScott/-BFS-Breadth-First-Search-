# -BFS-Breadth-First-Search-
Bro Code BFS tutorial

BFS = a search algorithm for traversing
    a tree or graph data structure.
    This is done one "level" at a time,
    rather than one "branch" at a time.

* Instead of a Stack, we use a Queue

    A ------- B -------- C
    |                    |
    |                    |
    D ------- E          F
    |         |          |
    |         |          |
    G ------- H          I

* BFS goes one "Level" at a time:
    A ------- B 
    |
    |
    D
* Queue @ Level 1: [A, B, D]

* Next Level:
              B -------- C
    

    D ------- E
    |
    |
    G
* Queue @ Level 2: [A, B, D, C, E, G]

* Next Level:
                          C
                          |
                          |
              E           F
              |
              |
              H
* Queue @ Level 3: [A, B, D, C, E, G, F, H]

* Next Level: 



                          F
                          |
                          |
                          I
* Queue @ Level 4: [A, B, D, C, E, G, F, H, I]