import java.util.Scanner;


public class MWST{

	public static final int inf = 5555555;  	

	static int mwst(int[][] G){
		
		
		int numVerts = G.length;
    int numEdges;   
    
    boolean[] visited = new boolean[numVerts]; 
    
    int i;		
    int j;		
    int q =0; 
    int z =0;  
    
    int min;  
    int totalWeight = 0; 
    
   
    for(i=0; i < numVerts ; i++) { 
    	visited[i]=false;       
    	for(j=0;j<numVerts;j++){    
           if(G[i][j]==0)
           G[i][j]= inf ;
         }
        }
        
        

    visited[0]=true;  
    numEdges=0;		
    
    

    while(numEdges < numVerts-1){ 
    	
       min=inf;    

       for(i=0;i<numVerts;i++)   // Loop through rows
       {
          if(visited[i]==true){ // If current row is being visited
          	
             for(j=0;j<numVerts;j++){ // Loop through columns
         	
                if(visited[j]==false){ // Loop through non visited columns
            	
                if(min >= G[i][j]) 
                
               {
               min=G[i][j]; 
               q = i;     
               z = j;			

               }
            }
          }
        }
      }
      
      
    visited[z]=true;				// Update current as visted
    totalWeight = G[q][z]+ totalWeight;  // Sum up weights of MWST
    numEdges=numEdges+1; // Increment edge counter
    
    }
		
		return totalWeight;
	}


	public static void main(String[] args){
	
		int graphNum = 0;
			Scanner s = new Scanner(System.in);
			System.out.printf("Reading input values from stdin.\n");
		
		
		while(true){
			graphNum++;
			if(!s.hasNextInt())
				break;
			System.out.printf("Reading graph %d\n",graphNum);
			int n = s.nextInt();
			int[][] G = new int[n][n];
			int valuesRead = 0;
			for (int i = 0; i < n && s.hasNextInt(); i++){
				G[i] = new int[n];
				for (int j = 0; j < n && s.hasNextInt(); j++){
					G[i][j] = s.nextInt();
					valuesRead++;
				}
			}
			if (valuesRead < n*n){
				System.out.printf("Adjacency matrix for graph %d contains too few values.\n",graphNum);
				break;
			}
			if (!isConnected(G)){
				System.out.printf("Graph %d is not connected (no spanning trees exist...)\n",graphNum);
				continue;
			}
			int totalWeight = mwst(G);
			System.out.printf("Graph %d: Totl weight is %d\n",graphNum,totalWeight);
				
		}
	}

	
	static void isConnectedDFS(int[][] G, boolean[] covered, int v){
		covered[v] = true;
		for (int i = 0; i < G.length; i++)
			if (G[v][i] > 0 && !covered[i])
				isConnectedDFS(G,covered,i);
	}
	   

	static boolean isConnected(int[][] G){
		boolean[] covered = new boolean[G.length];
		for (int i = 0; i < covered.length; i++)
			covered[i] = false;
		isConnectedDFS(G,covered,0);
		for (int i = 0; i < covered.length; i++)
			if (!covered[i])
				return false;
		return true;
	}

}