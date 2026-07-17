import java.util.ArrayList;
import java.util.LinkedList;

public class BoundaryTraversal {
    ArrayList<Integer> left = new ArrayList<>();
    ArrayList<Integer> right = new ArrayList<>();
    LinkedList<Integer> leaves = new LinkedList<>();

    boolean isLeaf(Node root){
        
        return root.left==null && root.right==null;
    }

    void leftBoundary(Node root){
        if(root==null)
            return;
        
        if(!isLeaf(root)){
            left.add(root.data);
        }
        if(root.left!=null){
            leftBoundary(root.left);
        }else if(root.right!=null){
            leftBoundary(root.right);
        }

    }

    void leafBoundary(Node root){
        if(root==null)
            return;
        
        if(isLeaf(root)){
            leaves.add(root.data);
        }
        leafBoundary(root.left);
        leafBoundary(root.right);
    }

    void rightBoundary(Node root){
        if(root==null)
            return;

        if(!isLeaf(root)){
            right.addFirst(root.data);
        }
        if(root.right!=null){
            rightBoundary(root.right);
        }else if(root.left!=null){
            rightBoundary(root.left);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        BoundaryTraversal bt = new BoundaryTraversal();
        bt.leftBoundary(root);
        bt.leafBoundary(root);
        bt.rightBoundary(root.right);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.addAll(bt.left);
        ans.addAll(bt.leaves);
        ans.addAll(bt.right);
        System.out.println(ans);
    }
}
