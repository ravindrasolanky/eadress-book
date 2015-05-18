import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UnsupportedLookAndFeelException;
public class DeleteTableTab extends JPanel 
{
  JTabbedPane pane;
 public DeleteTableTab() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException 
   {
      // JScrollPane pane1=new JScrollPane(pane,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
     pane=new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
     pane.addTab("ALL CONTACT", new DeleteSearchTable());
      pane.addTab("FRIENDS", new GroupContactTableTab("friend"));
       pane.addTab("FAMILY", new GroupContactTableTab("family"));
        pane.addTab("BUSINESS", new GroupContactTableTab("business"));
        pane.addTab("CO-WORKER", new GroupContactTableTab("co-worker"));
         pane.addTab("COLLEGUE", new GroupContactTableTab("collegue"));
          pane.addTab("SCHOOL", new GroupContactTableTab("school"));
           pane.addTab("OTHER", new GroupContactTableTab("other"));
        
        
     JScrollPane pane2=new JScrollPane(this);
   
   // pane.addTab(thish"TAB4", new DemoOfJTable());
     add(pane);
  }
	
	
}
