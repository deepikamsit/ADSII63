import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		Digraph di=new Digraph(b);
		directgraph f=new directgraph(di);
        f.display();
	}

}