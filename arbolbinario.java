/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
public class arbolbinario {
    
 
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
 // Clase de nodo
class Node{
	private Node left;
	private Node right;
	private int data;
	
	public Node(int data){
		this.data = data;
	}
	
	public void setLChild(Node left){
		this.left = left;
	} 
	
	public void setRChild(Node right){
		this.right = right;
	}	
	
	public void setData(int data){
		this.data = data;
	}	
	
	public int getData(){
		return this.data;
	}		
	public Node getLChild(){
		return this.left;
	}		
	public Node getRChild(){
		return this.right;
	}		
   
    
public class Tree{
	
	 raíz del nodo público; // Hay un nodo raíz
	public static int index;  
	
	public Node CreateBTree( int[] a){
		Node root = null;
		if(a[index]!='#'){
			root = new Node(a[index]);
			index++;
			root.setLChild(CreateBTree(a));
			index++;
			root.setRChild(CreateBTree(a));		
		}
		return root;
		
	}
	 // Cruce de primer orden
	public void prevOrder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.getData()+",");
		prevOrder(root.getLChild());
		prevOrder(root.getRChild());
	}
 // Cruce de orden medio
	public void inOrder(Node root){
		if(root==null){
			return;
		}	
		inOrder(root.getLChild());
		System.out.print(root.getData()+",");
		inOrder(root.getRChild());
	}	
	 // Traslado posterior a la orden
	public void postOrder(Node root){
		if(root==null){
			return;
		}	
		postOrder(root.getLChild());
		postOrder(root.getRChild());
		System.out.print(root.getData()+",");		
	}
	 // Obtener la altura
	public int getHeight(){
		Node cur = this.root;
		int height = 0;
		while(cur!=null){
			cur=cur.getLChild();
			height++;
		}
		return height;
	}
	 // Obtener el número de hojas
	public int getLeaf(Node root){
		if(root==null){
			return 0;
		}
		else if(root.getLChild()==null&&root.getLChild()==null){
			System.out.println("Leaf:"+root.getData());
			return 1;
		}
		return getLeaf(root.getLChild())+getLeaf(root.getRChild());
	}
	 // Obtener el número de nodos de capa K-ésima
	public int getNodeKNum(Node root,int k){
		if(k==1){
			if(root==null)
				return 0;
			System.out.println("K Node:"+root.getData());
			return 1;
		}
		return getNodeKNum(root.getLChild(),k-1)+getNodeKNum(root.getRChild(),k-1);
	}
	 // Encuentra un nodo
	public Node findNode(Node root,int x){
		if(root==null){
			return null;
		}
		else if(root.getData()==x){
			return root;
		}
		Node leftNode = findNode(root.getLChild(),x);
		if(null!=leftNode)
			return leftNode;
		Node rightNode = findNode(root.getRChild(),x);
		if(null!=rightNode)
			return rightNode;
		return null;
		
	}
	 // Devuelve el nodo padre de un nodo
	public Node getParent(Node root, int x){
		if(root==null)
			return null;
		Node childL = root.getLChild();
		Node childR = root.getRChild();
		if(childL!=null&&childL.getData()==x)
			return root;
		if(childR!=null&&childR.getData()==x)
			return root;
		Node parentL = getParent(root.getLChild(),x);
		if(parentL!=null)
			return parentL;
		Node parentR = getParent(root.getRChild(),x);
		if(parentR!=null)
			return parentR;
		return null;

    
    
    public void BTreeLevelOrder(){
		Node root = this.root;
		Queue <Node> queue = new LinkedList<Node>();
		LinkedList<Node> list = new LinkedList<Node>();
		queue.offer(root);
		while(!queue.isEmpty()){
			Node pre = queue.poll();
			list.add(pre);
			if(pre.getLChild()!=null)
				queue.offer(pre.getLChild());
			if(pre.getRChild()!=null)
				queue.offer(pre.getRChild());
		}
		Iterator<Node> it = list.iterator();
		while(it.hasNext()){
			Node cur = (Node)it.next();
			System.out.print(cur.getData()+", ");
		}
		

     Juzgar si un árbol es un árbol binario completo (deformación del recorrido de la jerarquía)
	public boolean isCompleteBTree(){
		Node root = this.root;
		Queue <Node> queue = new LinkedList<Node>();
		queue.offer(root);
	
		while(!queue.isEmpty()){
			Node pre = queue.poll();
			if(pre==null)
				break;
			queue.offer(pre.getLChild());
			queue.offer(pre.getRChild());
			
		}
		while(!queue.isEmpty()){
			Node cur = queue.poll();
			if(cur!=null)
				return false;
		}
		return true;
	
	}
 
	public static void main(String[] agrs){
		Tree tree = new Tree();
		int[] a = new int[]{1,2,3,'#','#',4,'#','#',5,6,'#','#','#' };
		tree.root=tree.CreateBTree(a);
		 System.out.print ("Recorrido de pedido anticipado:");
		tree.prevOrder(tree.root);
		 System.out.print ("\ nTransversal en orden:");
		tree.inOrder(tree.root);
		 System.out.print ("\ nTransversal post-orden:");
		tree.postOrder(tree.root);
		System.out.println();	
		
		System.out.println("tree Leaf Num:"+tree.getLeaf(tree.root));
		System.out.println("K=2 num:"+tree.getNodeKNum(tree.root,2));
		System.out.println("tree height:"+tree.getHeight());
		
		System.out.println("3 find:"+tree.findNode(tree.root,3).getData());
		System.out.println("1 find:"+tree.findNode(tree.root,1).getData());
		System.out.println("6 find:"+tree.findNode(tree.root,6).getData());
		System.out.println("7 find:"+tree.findNode(tree.root,7));
		
		System.out.println("6 paren :"+tree.getParent(tree.root,6).getData());
		System.out.println("3 paren :"+tree.getParent(tree.root,3).getData());
		System.out.println("5 paren :"+tree.getParent(tree.root,5).getData());
		System.out.println("1 paren :"+tree.getParent(tree.root,1));
		 System.out.print ("Secuencia transversal:");
		tree.BTreeLevelOrder();
		System.out.println();
		
		System.out.println("the tree is complete?  "+tree.isCompleteBTree());
		
	}		
	
	

}
