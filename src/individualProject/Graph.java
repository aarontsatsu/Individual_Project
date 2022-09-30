package individualProject;

import java.util.LinkedList;

public class Graph {
    private int verticesLength;
    private LinkedList<Integer> graphList[];

    //implementation of a graph as an adjacency list
    //implementation referenced from programiz.com (https://www.programiz.com/dsa/graph-adjacency-list)
    public Graph(int verticesLength){
        this.verticesLength = verticesLength;
        graphList = new LinkedList[verticesLength];

        for (int i = 0; i < verticesLength; i++) {
            graphList[i] = new LinkedList<Integer>();
        }
    }

    public void addNodes(int start, int end){
        graphList[start].add(end);
        graphList[end].add(start);
    }

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
