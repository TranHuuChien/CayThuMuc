package SwingBasic;

import java.io.File;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

class Tree extends JFrame {
	private JTree tree;
	public Tree()
	{
		
		File diskD = new File("D:\\");
		JFrame j = new JFrame();
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("D:\\");
		
		
		//createChild(diskD, root);
		tree = new JTree(root);
		add(tree);//j.add(tree); hai câu lệnh này tương đương nhau
		
		AppearLengthFile(diskD, root);
		
	}

	public String FileNode(File file) {
		String name = file.getName();
		if (name.equals("")) {
			return file.getAbsolutePath();
		} else {
			return name;
		}
	}
	public void createChild(File root, DefaultMutableTreeNode node)
	{
		File [] files = root.listFiles();
		if(files == null)
			return;
		for(File file : files)
		{
			if (file.isDirectory()) {
				DefaultMutableTreeNode newChild = new DefaultMutableTreeNode(FileNode(file));
				node.add(newChild);
				//System.out.println("Ten file : " + file.getName()+ "Size : "+file.length()/1024 +"KB");
				//System.out.println(file.getName());
				if (file.isDirectory())
					createChild(file, newChild);
			}
		}
	}
	public void AppearLengthFile(File root, DefaultMutableTreeNode node)
	{
		File [] list = root.listFiles();
		if(list == null) 
			return;
		for(File item : list)
		{
			String nameFile = item.getName();
			String type = "";
//			if(item.isFile())
//				System.out.println("Ten file : " + nameFile+ "Size : "+item.length()/1024 +"KB");
			DefaultMutableTreeNode newChild = new DefaultMutableTreeNode(nameFile);
			node.add(newChild);
			if(item.isDirectory())
			{
				AppearLengthFile(item, newChild);
			}
			
		}
	}
}
public class CayThuMuc {
	
	public static void main(String[] args) {
		Tree sTree = new Tree();
		sTree.setSize(400,800);
		
		sTree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sTree.setVisible(true);
	}
}
