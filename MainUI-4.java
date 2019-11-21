
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    public JFrame view;

    public JButton btnManageCustomer = new JButton("Manage Customers");
    public JButton btnManageProduct = new JButton("Manage Products");
    public JButton btnAddPurchase = new JButton("Add New Purchase");
    public JButton btnUpdateProduct = new JButton("Update Product Information");
    public JButton btnUpdateCustomer = new JButton("Update Customer Information");
    public JButton btnUpdatePurchase = new JButton("Update Purchase Information");

    public MainUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnManageProduct);
        panelButtons.add(btnManageCustomer);
        panelButtons.add(btnAddPurchase);
        panelButtons.add(btnUpdateProduct);
        panelButtons.add(btnUpdateCustomer);
        panelButtons.add(btnUpdatePurchase);

        view.getContentPane().add(panelButtons);


        btnAddPurchase.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        AddPurchaseUI ap = new AddPurchaseUI();
                        ap.run();
                    }
                });

        btnManageProduct.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        ManageProductUI ui = new ManageProductUI();
                        ui.run();
                    }
                });

        btnManageCustomer.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        ManageCustomerUI uc = new ManageCustomerUI();
                        uc.run();
                    }
                });

        btnUpdateProduct.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        UpdateProductUI um = new UpdateProductUI();
                        um.run();
                    }
                });
        btnUpdateCustomer.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        UpdateCustomerUI ur = new UpdateCustomerUI();
                        ur.run();
                    }
                });
        btnUpdatePurchase.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        UpdatePurchaseUI uz = new UpdatePurchaseUI();
                        uz.run();
                    }
                });
    }
}
