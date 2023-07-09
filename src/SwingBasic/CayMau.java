package SwingBasic;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class CayMau extends JFrame {
	public static void main(String[] args) {
		JFrame jr=  new JFrame();
		JTree tree;
		DefaultMutableTreeNode root =  new DefaultMutableTreeNode("NN");
		DefaultMutableTreeNode java = new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode csharp = new DefaultMutableTreeNode("C#");
		tree = new JTree(root);
		root.add(csharp);
		root.add(java);
		jr.add(tree);
		
		jr.setSize(200,200);
		jr.setVisible(true);
	}
}
