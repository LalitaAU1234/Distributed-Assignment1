/*
 * 
 */
package MessangingApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author teeziyang
 * 
 */

public class ClientListPanel extends JPanel
{
    private JLabel clientListLabel = new JLabel("Active Clients");
    private JList<String> clientList;
    private String[] clients = {"default1", "default2", "default3"};
    
    public ClientListPanel()
    {
        clientList = new JList<>(clients);
        
        clientListLabel.setOpaque(true);
        clientListLabel.setBackground(Color.LIGHT_GRAY);
        
        setBackground(Color.yellow);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(10, 10, 10, 10);
        setBorder(BorderFactory.createTitledBorder("Active Clients"));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0.1;

        gbc.fill = GridBagConstraints.BOTH;
        add(clientList, gbc);
    }
}
