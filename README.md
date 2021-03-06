# Elementary cellular automata

I implemented some principles of elementary cellular automation in Java.
 

The program can generate a visualization of the plan. Example for the Rule 30 :   
![Illustration Rule 30](rule30.bmp)

Here is the rule 90, generating a [Sierpinski triangle](https://en.wikipedia.org/wiki/Sierpi%C5%84ski_triangle) :
![Sierpinski Tringle Rule 90](sierpinski_triangle.bmp)

So far I've implemented 4 rules ( see the code under ```src/main/java/be/max/rules```) : 
- Rule 30
- Rule 90 
- Rule 110
- Rule 250

There are in total 256 rules possibles. 

[A list from Stanford University showing all 256 possibles rules](https://plato.stanford.edu/entries/cellular-automata/supplement.html)
## Roadmap
Things to do to go further with this project :
- Create an interface for rules 
- Add others rules

- Add it as a web service so a front-end can give a nice in-browser rendering: 
    - The web service is simply a controller that receives the parameter for the cellular automata (number of cells per row, number of rows/iterations, and the rule). It will return a JSON response containing the representation of the plan generated.

- Make the front-end to render the plan with some JavaScript (frameworks to consider : D3.js, processing, P5.js, ...)