import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
public class AdminGui extends javax.swing.JFrame {

    private JFrame parentFrame;

    /**
     * Creates new form AdminGui
     */
    public AdminGui() {
    	getContentPane().setBackground(new Color(210, 180, 140));
        initComponents();
    }

    public AdminGui(JFrame frame) {
        this();
        parentFrame = frame;
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBackground(new Color(240, 240, 240));
        jLabel1.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\admin.png"));
        jLabel1.setFont(new Font("Sylfaen", Font.PLAIN, 21));
        btnEmployee = new javax.swing.JButton();
        btnEmployee.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\manage employee.png"));
        btnEmployee.setBackground(new Color(169, 169, 169));
        btnEmployee.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        btnFinance = new javax.swing.JButton();
        btnFinance.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\manage finances.png"));
        btnFinance.setBackground(new Color(169, 169, 169));
        btnFinance.setFont(new Font("Sylfaen", Font.PLAIN, 18));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" Hello Admin. What would you like to do?");

        btnEmployee.setText(" Manage Employee");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnFinance.setText(" Manage Finances");
        btnFinance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGap(51)
        			.addComponent(btnEmployee)
        			.addPreferredGap(ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
        			.addComponent(btnFinance)
        			.addGap(67))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(125, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
        			.addGap(123))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGap(66)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnEmployee)
        				.addComponent(btnFinance))
        			.addGap(84))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>

    private void btnFinanceActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new FinanceGui(parentFrame).setVisible(true);
    }

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new EmployeeListingGui(parentFrame).setVisible(true);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnFinance;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}


