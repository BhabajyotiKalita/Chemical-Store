/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chemical_store;

import java.sql.*;
import javax.swing.*;

public class MyConnection {
    Connection Con=null;
                   public MyConnection()
                   {
                       try
                       {
                           Class.forName("com.mysql.jdbc.Driver");
                           String connectionUrl="jdbc:mysql://localhost:3306/chemicalstore?" +
                                                  "user=root" ;

                           Con=DriverManager.getConnection(connectionUrl);


                       }
                      catch(Exception e)
                      {
                          JOptionPane.showMessageDialog(new JPanel(),e," Error 100",2);

                      }
                   }
                  public Connection getConnection()
                  {
                      return Con;
                  }

}

