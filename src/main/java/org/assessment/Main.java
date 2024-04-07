package org.assessment;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Happy Case - Valid DAG
        DirectedAcylicGraph dag = new DirectedAcylicGraph();
        dag.addEdge("Task1", "Task2");  // Task1 depends on Task2
        dag.addEdge("Task2", "Task3");  // Task2 depends on Task3

        System.out.println("Is the graph a DAG?: " + dag.isDAG());  // Expected: true

        //Unhappy Case - Graph with a Cycle
        dag.addEdge("Task3", "Task1");  // Creates a cycle: Task1 -> Task2 -> Task3 -> Task1
        System.out.println("Is the graph a DAG?: " + dag.isDAG());  // Expected: false
    }
}