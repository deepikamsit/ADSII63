



public class directgraph {

	boolean[] marked;
	public directgraph(Digraph g)
	{
		marked=new boolean[g.V()];
		for(int i=0;i<g.V();i++)
		{
			if(!marked[i])
			{
				dfs(g,i);
			}
		}
		
		
		
	}
	void dfs(Digraph g,int v)
	{
		marked[v]=true;
		for(int w:g.adj(v)) {
			if(!marked[w])
				dfs(g,w);
			else
				
			{
				System.out.println("Cycle exists.");
				System.exit(0);
			}
	}
	marked[v]=false;
	
}
boolean Visited(int v)
{
	return marked[v];
	
}
void display()
{
	System.out.println("Cycle doesn't exists.");
}
}