package individualProject;

import org.jgrapht.Graph;
import org.jgrapht.GraphType;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Supplier;

/**
 * @author Aaron Tsatsu Tamakloe
 * The GraphStructure class represents the features of a graph, represented as an adjacency list.
 */
public class GraphStructure {
    private int verticesLength;
    private LinkedList<Integer> graphList[];
    private Graph<Airport, Routes> graph;

    //implementation of a graph as an adjacency list
    //implementation idea referenced from programiz.com (https://www.programiz.com/dsa/graph-adjacency-list)

    /**
     * Constructor:
     * building the adjacency list/ graph object
     * @param verticesLength
     */
    public GraphStructure(int verticesLength){
        this.verticesLength = verticesLength;

        //vertices length specifies the size of the LinkedList
        graphList = new LinkedList[verticesLength];

        for (int i = 0; i < verticesLength; i++) {
            graphList[i] = new LinkedList<Integer>();
        }
    }

    public void addNodes(int start, int end){
        //adding nodes to the linked list and checking for situations
        // where a destination is also the source for another route
        graphList[start].add(end);
        graphList[end].add(start);
    }

    //print the adjacency list
    public void printGraph(){
        for (int i = 0; i < verticesLength; i++) {
            if(graphList[i].size()>0){
                System.out.println("Vertex " + i + " is linked to: ");
                for(int j = 0; j < graphList[i].size(); j++){
                    System.out.print(graphList[i].get(j) + "->");
                }
                System.out.println();
            }
        }
    }
}
