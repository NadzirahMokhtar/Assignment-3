import javax.swing.*;
import java.util.Locale;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FinanceGui extends javax.swing.JFrame {

    /**
     * Creates new form FinanceGui
     */
    public FinanceGui() {
    	getContentPane().setBackground(new Color(210, 180, 140));
        initComponents();
    }

    private JFrame parentFrame;

    private FinancesManageService financesManageService;

    public FinanceGui(JFrame frame) {
        this();
        parentFrame = frame;

    }

    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        lb2.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        tbSales = new javax.swing.JTextField();
        tbSales.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lb1 = new javax.swing.JLabel();
        lb1.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        lbExpenses = new javax.swing.JLabel();
        lbExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lb3 = new javax.swing.JLabel();
        lb3.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        jLabel5 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnCalculate.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\calculate.png"));
        btnCalculate.setBackground(new Color(169, 169, 169));
        btnCalculate.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        btnMenu = new javax.swing.JButton();
        btnMenu.setFont(new Font("Sylfaen", Font.PLAIN, 18));
        btnMenu.setBackground(new Color(169, 169, 169));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb2.setText("The total sales are :");

        tbSales.setText("                  ");

        lb1.setText("The total expenses are :");

        EmployeeManageService employeeManageService = new EmployeeManageService();
        lbExpenses.setText("RM " + employeeManageService.calculateFee());

        lb3.setText("The profit for this month is :");

        jLabel5.setText("");

        btnCalculate.setText(" Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(430, Short.MAX_VALUE)
        			.addComponent(btnMenu)
        			.addGap(96))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(48)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lb3)
        					.addContainerGap())
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(lb2)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(lb1)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createSequentialGroup()
        								.addGap(159)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(jLabel5)
        									.addComponent(tbSales)
        									.addComponent(btnCalculate, Alignment.LEADING))
        								.addGap(68))
        							.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(lbExpenses, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
        								.addGap(101)))))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(27)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lb1)
        				.addComponent(lbExpenses))
        			.addGap(37)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tbSales, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addComponent(lb2))
        			.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
        			.addComponent(lb3)
        			.addGap(41)
        			.addComponent(btnCalculate)
        			.addGap(18)
        			.addComponent(btnMenu)
        			.addGap(41))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {
        String raw = tbSales.getText().toLowerCase(Locale.ROOT).replace("rm", "");
        double totalSales = Double.parseDouble(raw);
        financesManageService = new FinancesManageService(totalSales);
        jLabel5.setText("RM" + financesManageService.calculateFee());

    }

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        parentFrame.setVisible(true);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbExpenses;
    private javax.swing.JTextField tbSales;
    // End of variables declaration
}


