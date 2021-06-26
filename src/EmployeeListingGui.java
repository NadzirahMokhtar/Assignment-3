import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EmployeeListingGui extends javax.swing.JFrame {

    private JFrame parentFrame;

    /**
     * Creates new form EmployeeListingGui
     */
    public EmployeeListingGui() {
    	getContentPane().setBackground(new Color(210, 180, 140));
        initComponents();
    }

    public EmployeeListingGui(JFrame frame) {
        this();
        parentFrame = frame;
        EmployeeManageService employeeManageService = new EmployeeManageService();
        jLabel1.setText("<html>" + employeeManageService.printMessage().replace("\n", "<br/>") + "</html>");

    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnMenu.setBackground(new Color(169, 169, 169));
        btnMenu.setFont(new Font("Sylfaen", Font.PLAIN, 18));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(40)
        					.addComponent(jLabel1))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(154)
        					.addComponent(btnMenu)))
        			.addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(50)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
        			.addComponent(btnMenu)
        			.addGap(28))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        parentFrame.setVisible(true);


    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}