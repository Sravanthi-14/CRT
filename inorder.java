import java.util.*;
public class inorder(){
public static void main(String[] args){
void inorder(Node root){
if((root==null)return;
inorder(root.left);
System.out.println(root.data+"");
norder(root.right);
}
}
}