
package chemical_store;

import java.util.Vector;
import java.sql.*;
import javax.swing.*;

public class BillList extends javax.swing.JFrame {
    private Vector<Vector<String>> data;
    private Vector<String> header;

    public BillList() {
        data = getItemData();


        header = new Vector<String>();
        header.add("Bill No");
        header.add("Order No");
        header.add("Customerid");
        header.add("BDate");
        header.add("BTime");
        header.add("qnty");
        header.add("rate");
        header.add("Amount");
        header.add("Vat");
        header.add("Net");

        initComponents();
    }
public Vector getItemData()
    {

        Vector<Vector<String>> ItemVector = new Vector<Vector<String>>();

        MyConnection MC=new MyConnection();
        Connection Con=MC.getConnection();

        try
        {
        PreparedStatement pre = Con.prepareStatement("select * from bill order by B_no");
        ResultSet rs = pre.executeQuery();

        while(rs.next())
        {
            Vector<String> Item = new Vector<String>();
            Item.add(rs.getString(1));
            Item.add(rs.getString(2));
            Item.add(rs.getString(3));
            Item.add(rs.getString(4));
            Item.add(rs.getString(5));
            Item.add(rs.getString(6));
            Item.add(rs.getString(7));
            Item.add(rs.getString(8));
            Item.add(rs.getString(9));
            Item.add(rs.getString(10));



            ItemVector.add(Item);
        }
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(new JPanel(),e,"Error 115",2);
        }
        return ItemVector;

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnClose1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(chemical_store.Chemical_StoreApp.class).getContext().getResourceMap(BillList.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        btnClose1.setText(resourceMap.getString("btnClose1.text")); // NOI18N
        btnClose1.setName("btnClose1"); // NOI18N
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(44, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
            .addGap(0, 566, Short.MAX_VALUE)
            .addGap(0, 566, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnClose1)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        setVisible(false);
}//GEN-LAST:event_btnClose1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}