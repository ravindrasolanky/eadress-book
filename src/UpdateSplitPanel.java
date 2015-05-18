import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class UpdateSplitPanel extends JFrame 
{
	JSplitPane jSplitPane;
	public UpdateSplitPanel(String title) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException 
	{
	super(title);
	setSize(getToolkit().getScreenSize());
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	//setLayout(new FlowLayout());
	setLocationRelativeTo(this);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	jSplitPane=new JSplitPane();
	jSplitPane.setLeftComponent( new UpdatePanel());
	jSplitPane.setRightComponent(new DeleteTableTab());
	add(jSplitPane);
	
	
	
	}
	/*public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException 
	{
      new UpdateSplitPanel("Demo of jsplitpane").setVisible(true);
	}*/
}