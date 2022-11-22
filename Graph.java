import java.util.*;

public class Graph {
    // Making Graph out of ArrayList
    ArrayList<Node> nodes;
    // Also using a Matrix
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();// For the Headers
        matrix = new int[size][size];
    }// Graph

    public void addNode(Node node){
        nodes.add(node);
    }// addNode

    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }// addEdge

    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }// if
        else {
            return false;
        }// else
    }// checkEdge
    
    public void print() {
        // Print Headers first
        System.out.print("  ");// Spacing added for formatting
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }// for
        System.out.println();
        
        for(int i = 0; i < matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }// for
            System.out.println();
        }// for
    }// print

    public void breadthFirstSearch(int src){
        // Using a Quest
        Queue<Integer> queue = new LinkedList<>(); // Queues are interfaces
        // So we must use a data structure, like Linked List or ArrayList

        boolean[] visited = new boolean[matrix.length];
        // Using a Boolean type array to report if a Node has been visited

        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0){
            // queue.poll(); removes element from the queue
            src = queue.poll();

            // Printing out Pulling elements
            System.out.println(nodes.get(src).data + " = visited");

            // Look for any adjacent Neighbors
            for(int i = 0; i < matrix[src].length; i++){
                if(matrix[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }// if
            }// for
        }// while

    }// breadthFirstSearch
}// Graph Class
