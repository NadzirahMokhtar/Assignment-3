import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CustomerReceiptGui extends javax.swing.JFrame {

    private JFrame parentFrame;

    /**
     * Creates new form CustomerReceiptFrame
     */
    public CustomerReceiptGui() {
    	getContentPane().setBackground(new Color(210, 180, 140));
        initComponents();
    }

    public CustomerReceiptGui(JFrame jFrame, String name, String when, Ticket ticket, Car car) {
        initComponents();
        parentFrame = jFrame;


        CustomerManageService customerManageService = new CustomerManageService(name, ticket.getPlace(), ticket.getPrice(), when, car.getCarType(), car.getPrice());


        lbReceipt.setText("<html>" + customerManageService.printMessage().replace("\n", "<br/>") + "</html>");

    }

    private void initComponents() {

        lbReceipt = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnMenu.setBackground(new Color(169, 169, 169));
        btnMenu.setFont(new Font("Sylfaen", Font.PLAIN, 18));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbReceipt.setText("jLabel1");

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
        					.addGap(106)
        					.addComponent(lbReceipt))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(151)
        					.addComponent(btnMenu)))
        			.addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(74)
        			.addComponent(lbReceipt)
        			.addPreferredGap(ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
        			.addComponent(btnMenu)
        			.addGap(39))
        );
        getContentPane().setLayout(layout);

        pack();
    }


    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        parentFrame.setVisible(true);
    }

    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel lbReceipt;
}
