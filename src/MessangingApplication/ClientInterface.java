/*
 * 
 */
package MessangingApplication;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author teeziyang
 * 
 */

public class ClientInterface extends JPanel
{
    
    public ClientInterface()
    {
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        setBackground(Color.CYAN);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        add(new ClientListPanel(), gbc);
        
        gbc.gridx = 1;
        gbc.weightx = 2;
        add(new ChatPanel(), gbc);
    }
    
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Messanging Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ClientInterface());   
        frame.pack();
        frame.setVisible(true);
        
        //dfksdg
    }
    
}
