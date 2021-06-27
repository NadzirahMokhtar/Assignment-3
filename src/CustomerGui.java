import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CustomerGui extends javax.swing.JFrame {

    private JFrame parentFrame;

    private TicketListing ticketListing = new TicketListing();


    private CarListing carListing = new CarListing();

    /**
     * Creates new form CustomerGui
     */
    public CustomerGui() {
    	getContentPane().setBackground(new Color(210, 180, 140));
        initComponents();
    }

    public CustomerGui(JFrame frame) {
        this();
        parentFrame = frame;
    }

    private void initComponents() {

        btnGroupDistination = new javax.swing.ButtonGroup();
        btnGroupCar = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        tfCustomer = new javax.swing.JTextField();
        tfCustomer.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnCustomer = new javax.swing.JButton();
        btnCustomer.setForeground(new Color(0, 0, 0));
        btnCustomer.setBackground(new Color(169, 169, 169));
        btnCustomer.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        tfWhen = new javax.swing.JTextField();
        tfWhen.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnD1 = new javax.swing.JRadioButton();
        btnD1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnD1.setBackground(new Color(250, 235, 215));
        btnD2 = new javax.swing.JRadioButton();
        btnD2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnD2.setBackground(new Color(250, 235, 215));
        btnD3 = new javax.swing.JRadioButton();
        btnD3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnD3.setBackground(new Color(250, 235, 215));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        btnC1 = new javax.swing.JRadioButton();
        btnC1.setBackground(new Color(250, 235, 215));
        btnC1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnC2 = new javax.swing.JRadioButton();
        btnC2.setBackground(new Color(250, 235, 215));
        btnC2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        btnC3 = new javax.swing.JRadioButton();
        btnC3.setBackground(new Color(250, 235, 215));
        btnC3.setFont(new Font("Times New Roman", Font.PLAIN, 13));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jLabel1.setText("Hello Customer! Please input your name!");

        btnCustomer.setText("Confirm");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        jLabel2.setText("When to go");

        btnGroupDistination.add(btnD1);
        btnD1.setSelected(true);
        btnD1.setText("Place = 'Maisson Eatery Buffet', Hrs = '3HRS', Price = 95, Tickets = 20");
        btnD1.setActionCommand("0");

        btnGroupDistination.add(btnD2);
        btnD2.setText("Place = 'Edison Beachfront Cafe', Hrs = '3HRS', Price =145, Tickets = 15");
        btnD2.setActionCommand("1");

        btnGroupDistination.add(btnD3);
        btnD3.setText("Place = 'Etienne Hotel and Residences', Hrs = '3D2N', Price = 295, Tickets = 10");
        btnD3.setActionCommand("2");

        jLabel3.setText("List of Destination");

        jLabel4.setText("List of Car");

        btnGroupCar.add(btnC1);
        btnC1.setSelected(true);
        btnC1.setText("CarType = '4-Seater Car', Price = 50");
        btnC1.setActionCommand("0");

        btnGroupCar.add(btnC2);
        btnC2.setText("CarType = '6 Seater Van', Price = 100");
        btnC2.setActionCommand("1");

        btnGroupCar.add(btnC3);
        btnC3.setText("CarType = 'Motorbike', Price = 30");
        btnC3.setActionCommand("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(43)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel1)
        							.addComponent(jLabel2)
        							.addComponent(tfWhen, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
        						.addComponent(tfCustomer, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE))
        					.addGap(144))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel4)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(btnC3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(btnC1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 207, Short.MAX_VALUE)
        							.addComponent(btnC2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))
        					.addGap(321)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jLabel3, Alignment.LEADING)
        						.addComponent(btnD2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnD1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnD3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE))
        					.addGap(78))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btnCustomer, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
        					.addGap(89))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel1)
        				.addComponent(jLabel3))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tfCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(23)
        					.addComponent(btnD1)))
        			.addGap(6)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(btnD2))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(tfWhen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnD3))
        			.addGap(130)
        			.addComponent(jLabel4)
        			.addGap(29)
        			.addComponent(btnC1)
        			.addGap(18)
        			.addComponent(btnC2)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnC3)
        				.addComponent(btnCustomer))
        			.addContainerGap(88, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>


    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        String name = tfCustomer.getText();
        String date = tfWhen.getText();

        if (name.length() == 0 || date.length() == 0) {
            return;
        }

        String destination = btnGroupDistination.getSelection().getActionCommand();
        String carStr = btnGroupCar.getSelection().getActionCommand();

        Ticket ticket = (Ticket) ticketListing.getObject(Integer.parseInt(destination));
        Car car = (Car) carListing.getObject(Integer.parseInt(carStr));
        setVisible(false);
        new CustomerReceiptGui(parentFrame, name, date, ticket, car).setVisible(true);
    }


    // Variables declaration - do not modify
    private javax.swing.JRadioButton btnC1;
    private javax.swing.JRadioButton btnC2;
    private javax.swing.JRadioButton btnC3;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JRadioButton btnD1;
    private javax.swing.JRadioButton btnD2;
    private javax.swing.JRadioButton btnD3;
    private javax.swing.ButtonGroup btnGroupCar;
    private javax.swing.ButtonGroup btnGroupDistination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfCustomer;
    private javax.swing.JTextField tfWhen;
    // End of variables declaration
}
