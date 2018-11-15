
import java.io.BufferedReader;
import java.io.IOException;

public class Digraph {
   int V;
   Bag<Integer>[] adj;
   int E;
   
   public Digraph(int v)
   {
	   //System.out.println(v);
	   this.V=v;
	   adj=(Bag<Integer>[])new Bag[V];
	   for(int i=0;i<V;i++)
	   {
		   adj[i]=new Bag<Integer>();
	   }
   }
   public Digraph(BufferedReader in) throws Exception
   {
   this(Integer.parseInt(in.readLine()));
   int E=(Integer.parseInt(in.readLine()));
   for (int v = 0; v < E; v++) {
      String s=in.readLine();
     String[] z=s.split(" ");
     int k=Integer.parseInt(z[0]);
     int w=Integer.parseInt(z[1]); 
    // System.out.println(k);
    // System.out.println(w);
	  addEdge(k,w); 
	  
   }
   
   }
   private boolean duplicate(int v2,int w)
   {
	   
	   for(int w1: adj(v2))
	   {
		   //System.out.println(w1);
		   if(w1==w)
		   {
			   return true;
		   }
	   }
			return false;   
			
   }
   
   public void addEdge(int v,int w)
   {
	 if(!duplicate(v,w))
	   E++;
	   adj[v].add(w);
	  
   }
   int V()
   {
   	return V;
   }
   int E()
   {
   	return E;
   }
   Iterable<Integer> adj(int v)
   {
   	return adj[v];
   }
   
}
