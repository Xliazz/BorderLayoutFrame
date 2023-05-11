import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListerner 
{
    private JButton[] buttons;
    private static final String[] names = {"Hide North", "Hide South",
        "Hide East", "Hide West", "Hide Center" };
    private BorderLayout layout;
    
    public BorderLayoutFrame()
    {        
        super("BorderLayout Demo");
        
        layout = new BorderLayout (5, 5);
        setLayout(layout);
        buttons = new JButon[ names.leght];
       
       for (int count = 0; count < names.length; count++)
       {
           buttons[ count ] = new JButton( names[ count ]);
           buttons[ count ].AddActionListener(this); 
       }
       
       add( buttons[0], BorderLayout.NORTH);
       add( buttons[0], BorderLayout.SOUTH);
       add( buttons[0], BorderLayout.EAST);
       add( buttons[0], BorderLayout.WEST);
       add( buttons[0], BorderLayout.CENTER);
       }
       
        public void actioPeformed(ActionEvent event)
       {         
            for (JButton button : buttons )
            {
                if (event.getSource() == button)
                    button.setVisible(false);
                else
                    button.setVisible( True );
            }    
              layout.layoutContainer( getContentPane() );
       }
}

import javax.swing.JFrame;

public class BorderLayoutDemo
{
    public static void main(String[] args)
    {
        BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300, 200);
        borderLayoutFrame.setVisible(true);
    }        
}         