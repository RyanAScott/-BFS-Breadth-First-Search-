import java.util.*;

public class BFS {
    public static void main(String[] args){
        Graph graph = new Graph(5);

         graph.addNode(new Node('A'));
         graph.addNode(new Node('B'));
         graph.addNode(new Node('C'));
         graph.addNode(new Node('D'));
         graph.addNode(new Node('E'));

        /* Making This Graph!!!
         * A ------> B
         * ^       / |
         * |     /   |     D
         * |   /     |   >
         * | <       @ / 
         * E ------> C
         *   <------   
         * 
         * Interesting Note:
         * To make the graph "Undirected", the Edges must be added twice
         * Ex: once from 2 to 4, and once from 4 to 2
         * Otherwise, like with 4 to 0, 0 is not adjacent to 4
         * That would make A not adjacent to E, dispite them being connected on the graph
         * 
         * This provides a means to have directed graphs with less work
         */

         graph.addEdge(0, 1);
         graph.addEdge(1, 2);
         graph.addEdge(2, 3);
         graph.addEdge(2, 4);
         graph.addEdge(4, 0);
         graph.addEdge(4, 2);

         graph.print();

         // BFS Function
         System.out.println("Running a BFS starting at node A:");
         graph.breadthFirstSearch(0);

    }// main
}// BFS Class