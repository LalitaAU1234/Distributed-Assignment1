/*
 * 
 */
package MessangingApplication;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

/**
 *
 * @author teeziyang
 * 
 */

public class ChatPanel extends JPanel
{
    public ChatPanel()
    {
        setBackground(Color.GREEN);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        add(new PrivateMessagePanel(), gbc);
        
        gbc.gridx = 1;
        add(new BroadcastPanel(), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0.3;
        gbc.gridwidth = 2;
        add(new MessageConstructorPanel(), gbc);
    }
}
