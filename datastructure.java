1.Linkedkist:
import java.util.Scanner;
public class Linkedlist{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;

        }
    }
    Linkedlist(){
        head = null;
    }//constructor
    public void insertend(int val){
        Node newnode = new Node(val);

        if (head ==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = newnode;
        }
    }
    public void display(){
        Node temp = head;

        while(temp.next != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        int n = sc.nextInt();

        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        list.display();
    }
}
2.Singlylinkedlist:
import java.util.*;
class sll{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    sll(){
        head=null;
    }
    void insertbegin(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }else{
            newnode.next=head;
            head=newnode;
        }
    }
    void insertend(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void insertpos(int pos,int val){
        Node newnode=new Node(val);
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
            head=newnode;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
     void deletepos(int h) {
        Node temp=head;
        Node prev=null;
        for(int i=1;i<h;i++) {
            temp=temp.next;
            prev=temp;
        }
        prev.next=temp.next;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sll list = new sll();
        while (true) {
            int i = sc.nextInt();
            if (i == -1)
                break;
            else
                list.insertbegin(i);
        }
        list.deletepos(2);
        list.deletepos(3);
        list.insertend(8);
        list.display();
    }
}
2.ii)Doublylinkedlist:
import java.util.*;
class dlll{
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int val){
            data = val;
            next = null;
            prev = null;
        }
    }
    dlll(){
        head = null;
        tail =null;
    }

    public void insertbegin(int k) {
        Node newnode=new Node(k);

        if(head==null) {
            tail = newnode;
        }else {
            newnode.next = head;
            head.prev = newnode;
        }
        head = newnode;
    }
    public void insertend(int k){
        Node newnode=new Node(k);
        if(head==null){
            head= newnode;
        }else{
            newnode.prev = tail;
            tail.next = newnode;
        }
        tail = newnode;
    }
    public void insertposition(int pos,int d) {
        Node newnode=new Node(d);
        Node temp=head;
        for(int i=1;i<pos;i++) {
            temp=temp.next;
        }
        newnode.next = temp.next;
        temp.next.prev = newnode;

        temp.next = newnode;
        newnode.prev = temp;
    }
    public void deletebeg(){
        head=head.next;
    }
    public void deleteend(){
        tail=tail.prev;
        tail.next=null;
    }
    public void deletepos(int k){
        Node temp=head;
        Node prev=null;
        for(int i=1;i<k;i++){
            prev = temp;
            temp=temp.next;
        }
        prev.next = temp.next;
    }
    public void display(){
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");}
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        dlll list=new dlll();
        list.insertbegin(10);
        list.insertbegin(20);
        list.insertbegin(30);
        list.insertbegin(40);
        list.insertbegin(50);
        list.display();
        list.insertend(70);
        list.display();
        list.insertposition(3,80);
        list.display();
        list.deletebeg();
        list.display();
        list.deleteend();
        list.display();
        list.deletepos(3);
        list.display();
 }
}

3.Queue:
import java.util.Scanner;

public class Priorityqueue{
    Node head;

    class Node{
        int data;
        int pri;
        Node next;

        Node(int val, int k){
            data = val;
            pri = k;
            next = null;
        }
    }
    Priorityqueue(){
        head = null;
    }
    public void enqueue(int val, int pri){
        Node newnode = new Node(val,pri);

        if (head==null){
            head = newnode;
        }
        else{
            if (head.pri > pri){
                newnode.next = head;
                head = newnode;
            }
            else{
                Node temp = head;
                while(temp.next != null && temp.next.pri < pri){
                    temp =  temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
    }
    public void dequeue(){
        head = head.next;
    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null \n");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Priorityqueue q1 = new Priorityqueue();
        q1.enqueue(10,2);
        q1.enqueue(20,0);
        q1.enqueue(30,1);
        q1.enqueue(40,3);
        System.out.println("ENQUEUE :");
        q1.display();
        q1.dequeue();
        q1.dequeue();
        System.out.println("DEQUEUE :");
        q1.display();
}
}
4.Stack:
import java.util.*;
class stack{
    Node head;
    Node top;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    stack(){
        head=null;
        top=null;
    }
    void push(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }else{
            top.next=newnode;
        }
        top=newnode;
    }
    void pop(){
        Node temp=top;
        while(temp!=top){
            temp=temp.next;
        }
        temp.next=null;
        top=temp;
    }
    void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println(top.data+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        stack list=new stack();
        while(true){
            int i = sc.nextInt();
            if(i==-1)
                break;
            else
                list.push(i);
        }
        list.pop();
        list.display();
    }
}
5.i)Tree:
import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node (int val){
        data = val;
        left = right= null;
    }
}
class Tree{
    Node create(int data){
        return new Node(data);
    }
    Node insert(Node root,int val){
        if(root == null){
            return create(val);
        }
        if(val < root.data){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public void preorder(Node root){
        if(root != null){
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void Inorder(Node root){
        if(root != null){
            Inorder(root.left);
            System.out.print(root.data+ " ");
            Inorder(root.right);
        }
    }
    public void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+ " ");
        }
    }
    class Queue {
        Node[] array;
        int front, rear, size, capacity;
        public Queue(int val) {
            capacity = val;
            array = new Node[val];
            front = size = 0;
            rear = val - 1;
        }
        boolean isFull() {
            return size == capacity;
        }
        boolean isEmpty() {
            return size == 0;
        }
        void enqueue(Node node) {
            if (isFull()) {
                return;
            }
            rear = (rear + 1) % capacity;
            array[rear] = node;
            size++;
        }
        Node dequeue() {
            if (isEmpty()) {
                return null;
            }
            Node node = array[front];
            front = (front + 1) % capacity;
            size--;
            return node;
        }
    }
    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue queue = new Queue(100);
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.dequeue();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.enqueue(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.enqueue(tempNode.right);
            }
        }
    }
    public int height(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static void main(String[]args){
        Scanner KH = new Scanner(System.in);
        Tree t1 = new Tree();
        int k = KH.nextInt();
        Node root = t1.create(k);
        while (true){
            int val = KH.nextInt();
            if(val == -1){
                break;
            }
            t1.insert(root,val);
        }
        System.out.println("Preorder");
        t1.preorder(root);
        System.out.println();
        System.out.println("Inorder");
        t1.Inorder(root);
        System.out.println();
        System.out.println("Postorder");
        t1.postorder(root);
        System.out.println();
        System.out.println("Level Order");
        t1.levelOrder(root);
        System.out.println();
        System.out.println("Height of the tree : "+ t1.height(root));
        int h=KH.nextInt();
        boolean found = t1.search(root, h);
        if (found)
        {
            System.out.println("Key " + h + " found in the tree.");
        }
        else
        {
            System.out.println("Key " + h + " not found in the tree.");
 }
}
}
6.infixtoprefix:
import java.util.Stack;
import java.util.*;
class Infixtoprefix {

    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static boolean check(char op1, char op2) {
        return precedence(op1) >= precedence(op2);
    }

    public static String infixToPrefix(String n) {
        StringBuilder reverse = new StringBuilder(n).reverse();
        for (int i = 0; i < reverse.length(); i++) {
            char c = reverse.charAt(i);
            if (c == '(') {
                reverse.setCharAt(i, ')');
            } else if (c == ')') {
                reverse.setCharAt(i, '(');
            }
        }
        String postfix = infixToPostfix(reverse.toString());
        return new StringBuilder(postfix).reverse().toString();
    }

    public static String infixToPostfix(String n) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n.length(); i++) {
            char a = n.charAt(i);

            if (Character.isLetterOrDigit(a)) {
                postfix.append(a);
            } else if (a == '(') {
                stack.push(a);
            } else if (a == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && check(stack.peek(), a)) {
                    postfix.append(stack.pop());
                }
                stack.push(a);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String result = infixToPrefix(n);
        System.out.println(result);
}
}
6.infixtopostfix:
import java.util.Stack;
import java.util.Scanner;
class infixtopostfix{
    public static int precedence(char operator){
        switch(operator){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static boolean check(char op1, char op2){
        return precedence(op1) >= precedence(op2);
    }

    public static String infixtopost(String n){

        StringBuilder postfix = new StringBuilder();
        Stack <Character> stack = new Stack<>();

        for(int i =0;i<n.length();i++){
            char a = n.charAt(i);

            if (Character.isLetterOrDigit(a)){
                postfix.append(a);
            }
            else if(a == '('){
                stack.push(a);
            }
            else if(a==')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && stack.peek() != '(' && check(stack.peek(),a)){
                    postfix.append(stack.pop());
                }
                stack.push(a);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String result = infixtopost(n);
        System.out.println(result);
}
}
7.graph:
import java.util.ArrayList;
import java.util.*;
class Graph{
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    Graph(int v){
        for(int i =0;i<v;i++){
            list.add(new ArrayList<Integer>());
        }
    }
    public void push(int u , int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public void dfs(int v){
        int l = list.size();
        boolean [] arr = new boolean[l];
        dfs1(v,arr);
    }
    public void dfs1(int v, boolean [] arr){
        System.out.println(v+" ");
        arr[v] = true;

        for(int i=0;i<list.get(v).size();i++){
            int k = list.get(v).get(i);
            if(!arr[k]){
                dfs1(k,arr);
            }
        }
    }


    public void display(){
        for(int i =0;i<list.size();i++){
            System.out.print("Vertices:"+ i+" ");
            for(int j = 0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        Graph g = new Graph(v+1);
        while(true){
            int a = s.nextInt();
            int b = s.nextInt();
            if(a==-1||b==-1)
                break;
            g.push(a,b);
        }
        g.dfs(3);
}
}
8.Tree:
import java.util.*;
class TreeNode {
    int data, height;
    TreeNode left, right;

    public TreeNode(int val) {
        data = val;
        left = right = null;
        height = 1;
    }
}
class avl {
    TreeNode create(int data) {
        return new TreeNode(data);
    }
    int height(TreeNode n) {
        if (n == null)
            return 0;
        return n.height;
    }
    int getBalance(TreeNode n) {
        if (n == null)
            return 0;
        return height(n.left) - height(n.right);
    }
    TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode z = x.right;
        x.right = y;
        y.left = z;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }
    TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode z = y.left;
        y.left = x;
        x.right = z;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }
    TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return create(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        } else {
            return root;
        }
        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);
        // Left Left
        if (balance > 1 && val < root.left.data)
            return rightRotate(root);

        // Right Right
        if (balance < -1 && val > root.right.data)
            return leftRotate(root);

        // Left Right
        if (balance > 1 && val > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // Right Left
        if (balance < -1 && val < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        avl tree = new avl();
        int n = s.nextInt();
        TreeNode root = tree.create(n);
        while (true) {
            int a = s.nextInt();
            if (a == -1) {
                break;
            }
            root = tree.insert(root,a);
        }
        tree.preOrder(root);
}
}




