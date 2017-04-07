package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {
	
	Vertex root=null;
	HashMap<Integer, Vertex> vertices;
	HashMap<Integer, Edge> edges;
	
	Graph(int v){
		
		this.vertices = new HashMap<Integer, Vertex>();
		this.edges = new HashMap<Integer, Edge>();
		
		for(int i=0;i<v;i++){
			Vertex vt = new Vertex(i,null);
			vt.edges = new ArrayList();
			vertices.put(i ,vt);
			if(null == root)
				root = vt;
		}
		
	}
	
	void addEdge(int left, int right, int w){
		
		
		Edge e = new Edge(vertices.get(left), vertices.get(right), w);
		
		if(!edges.containsKey(e.hashCode())){
			edges.put(e.hashCode(), e);
			vertices.get(left).edges.add(e); // add edge to list of edges of "from vertex"
			//vertices.get(right).edges.add(e);
		}
		
	}
	
	void display(){
		
		Iterator<Map.Entry<Integer,Vertex>> itr = this.vertices.entrySet().iterator();
		
		while(itr.hasNext()){
			Vertex vt = itr.next().getValue(); 
			ArrayList<Edge> curredges = vt.edges;
			System.out.println("For Vertex - "+vt.label);
			for(Edge e: curredges){
				System.out.println(e.toString());
			}
		}
	}
	
	void BFS(){
		
		Queue<Vertex> q = new LinkedList<>();
		Vertex curr;
		q.add(vertices.get(2)); //from a vertex
		//q.add(root);          //from the root
		while(!q.isEmpty()){
			
			curr = q.peek();
			System.out.println(curr.label);
			curr.flagSeen = true;
			for(Edge e : curr.edges){
				if(!e.right.flagSeen){
					q.add(e.right);
					e.right.flagSeen = true;
				}
			}
			q.poll();
		}
	}
	
	void DFS(){
		
		Stack<Vertex> s = new Stack();
		
		Vertex curr;
		s.push(root);
		
		while(!s.isEmpty()){
			boolean allEdgesSeen = true;
			curr = s.peek();
			if(!curr.flagSeen){
				System.out.println(curr.label + " ");
				curr.flagSeen=true;
			}
			
			for(Edge e : curr.edges){
				if(!e.right.flagSeen){
					s.push(e.right);
					allEdgesSeen = false;
					break;
				}
			}
			if(allEdgesSeen)
				s.pop();
		}
	}
	
    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1,1);
        g.addEdge(0, 2,1);
        g.addEdge(1, 2,1);
        g.addEdge(2, 0,1);
        g.addEdge(2, 3,1);
        g.addEdge(3, 3,1);
 
        g.display();
        System.out.println("Following is Depth First Traversal");
       // g.DFS();
        System.out.println("Following is Breadth First Traversal");
        g.BFS();
    }

}



class Vertex{
	
	int label;
	boolean flagSeen; 
	ArrayList<Edge> edges;
	
	Vertex(int label, ArrayList<Edge> edges){
		this.label=label;
		this.edges=edges;
		this.flagSeen = false;
	}
}

class Edge{
	
	int weight;
	Vertex left;
	Vertex right;
	
	Edge(Vertex left, Vertex right,int w){
		this.weight = w;
		this.left = left;
		this.right = right;
	}
	
	public String toString(){
		return ""+this.left.label+"--"+this.weight+"--"+this.right.label;
	}
	
}
