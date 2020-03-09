# Elementary cellular automata

I implemented the [Rule 30](https://en.wikipedia.org/wiki/Rule_30) for an elementary cellular automata.

The program can generate a visualization of the plan. Example for the Rule 30 :   
![Illustration Rule 30](rule30.bmp)

## Roadmap
Things to do to go further with this project :
- Create an interface for rules 
- Add others rules

- Add it as a web service so a front-end can give a nice in-browser rendering: 
    - The web service is simply a controller that receives the parameter for the cellular automata (number of cells per row, number of rows/iterations, and the rule). It will return a JSON response containing the representation of the plan generated.