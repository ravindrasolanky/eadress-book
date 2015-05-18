import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class DeleteSplitPane extends JFrame 
{
	JSplitPane jSplitPane;
	public DeleteSplitPane(String title) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException 
	{
	super(title);
	setSize(getToolkit().getScreenSize());
          setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	//setLayout(new FlowLayout());
	setLocationRelativeTo(this);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	jSplitPane=new JSplitPane();
	jSplitPane.setLeftComponent( new DeletePanel());
	jSplitPane.setRightComponent(new DeleteTableTab());
	add(jSplitPane);
	
	
	
	}
/*	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException 
	{
      new DeleteSplitPane("Demo of jsplitpane").setVisible(true);
	}*/
}