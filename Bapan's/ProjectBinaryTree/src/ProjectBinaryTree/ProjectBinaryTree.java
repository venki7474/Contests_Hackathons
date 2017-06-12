/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBinaryTree;

/**
 *
 * @author 
 */
class Node{
    private Node left;
    private Node right;
    private int data, height;
    Node() {
        left = null;
        right = null;
        data = 0;
        height = 0;
    }
    Node (int data) {
        this.left = null;
        this.right = null;
        this.data = data;
        this.height = 0;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
class BSTtree {
    Node root;
    int count = 0;
    int height = 0;
    BSTtree() {
        root = null;
    }
    public void treeHeight() {
        height += treeHeight(root);
    }
    public int treeHeight(Node rt) {
        if (rt == null) {
            return 0;
        }
        int leftHeight = treeHeight(rt.getLeft());
        int rightHeight = treeHeight(rt.getRight());
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }
    public int insert(int data) {
//        count = 0;
        Node nd = new Node(data);
        root = insertNode(root, data);
        treeHeight();
        return count;
    }
    public Node insertNode(Node rt, int input) {
        if (rt == null){
            rt = new Node(input);
        } else {
            if (input <= rt.getData() ) {
                rt.setLeft(insertNode(rt.getLeft(), input));
                count ++;
            } else if (input > rt.getData()) {
                rt.setRight(insertNode(rt.getRight(), input));
                count ++;
            }
        }
        return rt;
    }
    
}
class AVLtree {
    Node root;
    int totalCount = 0, totalHeight = 0;
    AVLtree() {
        root = null;
    }
    public int getheight(Node nd) {
        if(nd == null){
            return -1;
        } else {
            return nd.getHeight();
        }
    }
    public int getMax(int left, int right) {
        if (left > right) {
            return left;
        } else {
            return right;
        }
    }
    public void insert(int input) {
        root = insertNode(root, input);
    }
    public Node insertNode(Node rt, int data){
        if (rt == null) {
            rt = new Node(data);
        } else if (data < rt.getData()) {
            totalCount += 1;
            rt.setLeft(insertNode(rt.getLeft(), data));
            if (getheight(rt.getLeft()) - getheight(rt.getRight()) == 2) {
                if (data < rt.getLeft().getData()) {
                    totalCount +=1;
                    rt = rightRotation(rt);
                } else {
                    totalCount +=1;
                    rt = leftRightRotation(rt);
                }
            }
        } else if (data > rt.getData()) {
            totalCount +=1;
            rt.setRight(insertNode(rt.getRight(), data));
            if (getheight(rt.getRight()) - getheight(rt.getLeft()) == 2) {
                if (data > rt.getRight().getData()) {
                    totalCount +=1;
                    rt = leftRotation(rt);
                } else {
                    totalCount +=1;
                    rt = rightLeftRotation(rt);
                }
            }
        }
        rt.setHeight(getMax(getheight(rt.getLeft()), getheight(rt.getRight())) + 1);
        return rt;
    }
    /*
    for right-right condition.
    rotation with right child
    left Rotation.
    */
    public Node leftRotation(Node nd){
        Node temp = nd.getRight();
        nd.setRight(temp.getLeft());
        temp.setLeft(nd);
        nd.setHeight(getMax(getheight(nd.getLeft()), getheight(nd.getRight()))+1);
        temp.setHeight(getMax(getheight(temp.getRight()), nd.getHeight())+1);
        return temp;
        
    }
    /*
    for left-left.
    rotation with left child
    right rotation
    */
    public Node rightRotation(Node nd) {
        Node temp = nd.getLeft();
        nd.setLeft(temp.getRight());
        temp.setRight(nd);
        nd.setHeight(getMax(getheight(nd.getLeft()), getheight(nd.getRight()))+1);
        temp.setHeight(getMax(getheight(temp.getRight()), nd.getHeight())+1);
        return temp;
    }
    
    public Node leftRightRotation(Node nd) {
        nd.setLeft(leftRotation(nd.getLeft()));
        return rightRotation(nd);
    }
    
    public Node rightLeftRotation(Node nd){
        nd.setRight(rightRotation(nd.getRight()));
        return leftRotation(nd);
    }
    
}
public class ProjectBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BSTtree tree = new BSTtree();
        int cnt = 0;
        cnt = tree.insert(1000);
        cnt = tree.insert(2000);
        cnt = tree.insert(3000);
        cnt = tree.insert(4000);
        cnt = tree.insert(5000);
        cnt = tree.insert(6000);
        cnt = tree.insert(7000);
        cnt = tree.insert(8000);
        System.out.println(cnt +"---"+tree.height);
        
        AVLtree treeAVL = new AVLtree();
        treeAVL.insert(1000);
        treeAVL.insert(2000);
        treeAVL.insert(3000);
        treeAVL.insert(4000);
        treeAVL.insert(5000);
        treeAVL.insert(6000);
        treeAVL.insert(7000);
        treeAVL.insert(8000);
        System.out.println(treeAVL.totalCount+"---"+ treeAVL.root.getHeight());
    }
    
}
