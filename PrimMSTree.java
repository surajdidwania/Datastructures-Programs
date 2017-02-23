import java.util.*;
import java.io.*;

public class PrimMSTree 
{
    private final static String CONFIG = "graphConfig.txt";
    private final static String STARTVERT = "1";
    private Graph graph;  

  
    public PrimMSTree() 
    {
        graph = createGraph(); 
        graph.getVertex(STARTVERT).id = 0;
    }


    private Graph createGraph() 
    {
        Graph newGraph = new Graph();

        try {
            Scanner inScan = 
                new Scanner(new BufferedReader(new FileReader(CONFIG)));
            
            while(inScan.hasNext()) {
                newGraph.addEdge(
                    inScan.next(),
                    inScan.next(),
                    (double)inScan.nextInt()
                );
            }
        } catch (IOException e) {
            System.out.println(
                "ERROR: Unexpected end of config or no config found"
            );
            return null;
        }
        System.out.println("Created graph: " + newGraph);
        return newGraph;
    }

 
    private void primsAlgorithm() 
    {
        Graph newGraph = new Graph();
        PriorityQueue<Graph.Vertex> Q = new PriorityQueue<Graph.Vertex>();
        Q.add(graph.getVertex(STARTVERT));
        Hashtable<String, Graph.Vertex> db = new Hashtable<String, Graph.Vertex>();
        db.put(graph.getVertex(STARTVERT).name, graph.getVertex(STARTVERT));
        
        while(Q.size() > 0) {
            Graph.Vertex currentVertex = Q.poll();
            if(currentVertex.deleted) 
                continue;

            if(currentVertex.pointer != null) {
                newGraph.addEdge(
                    currentVertex.pointer, currentVertex.name, currentVertex.id
                );
            } else {
                newGraph.getVertex(currentVertex.name); 
            }

            for(Graph.Edge adjacentEdge : currentVertex.neighbors) {
                Graph.Vertex adjacentVertex = 
                    new Graph.Vertex(
                        adjacentEdge.source.equals(currentVertex)
                        ? adjacentEdge.dest 
                        : adjacentEdge.source
                    );
                
                adjacentVertex.id = adjacentEdge.cost;
                adjacentVertex.pointer = currentVertex.name;

                if(!db.contains(adjacentVertex) ) {
                    Q.add(adjacentVertex);
                    db.put(adjacentVertex.name, adjacentVertex);
                } else if (db.get(adjacentVertex.name).id > adjacentVertex.id) {
                    db.get(adjacentVertex.name).deleted = true;
                    db.remove(adjacentVertex.name);
                    db.put(adjacentVertex.name, adjacentVertex);
                    Q.add(adjacentVertex);
                }
            }
        }
        System.out.println("Result: " + newGraph);
    }

  
    public static void main(String[] args) 
    {
        PrimMSTree puzzle = new PrimMSTree();
        puzzle.primsAlgorithm();
    } 
}