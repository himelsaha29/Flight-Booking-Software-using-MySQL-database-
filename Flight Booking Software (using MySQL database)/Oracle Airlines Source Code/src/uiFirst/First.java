/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uiFirst;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import uiFifth.ImportData;
import uiSecond.Second;
import uiSixth.Sixth;

/**
 *
 * @author HimelSaha
 */
public class First extends javax.swing.JFrame {

    /**
     * Creates new form First
     */
    public First() {
        initComponents();
        displayCityComboFrom();
        displayCityComboTo();
        displayDaysCombo();
        displayMonthsCombo();
        displayYearsCombo();
        displayDataIntoComboBox();
        lblWarningCities.setVisible(false);
        lblWarningDate.setVisible(false);
        lblSelectCities.setVisible(false);
        lblTravelClassWarning.setVisible(false);
        lblValidDate.setVisible(false);
        this.getContentPane().setBackground(Color.PINK);
        btnSearch.setBackground(Color.cyan);
        btnTravelHistoryStart.setBackground(Color.yellow);

    }
    // BACK BUTTON  
    private String back;

    public First(String item) {
        initComponents();
        displayCityComboFrom();
        displayCityComboTo();
        displayDaysCombo();
        displayMonthsCombo();
        displayYearsCombo();
        displayDataIntoComboBox();
        lblWarningCities.setVisible(false);
        lblWarningDate.setVisible(false);
        lblSelectCities.setVisible(false);
        lblTravelClassWarning.setVisible(false);
        lblValidDate.setVisible(false);
        this.getContentPane().setBackground(Color.PINK);
        btnSearch.setBackground(Color.cyan);
        btnTravelHistoryStart.setBackground(Color.yellow);
        // ---------------------------------------------------------------

        cmbFrom.setSelectedItem(ImportData.getDepartingCity());
        cmbTo.setSelectedItem(ImportData.getArrivalCity());
        cmbDay.setSelectedItem(Second.getJrnDay());
        cmbMonth.setSelectedItem(Second.getJrnMonth());
        cmbYear.setSelectedItem(Second.getJrnYear());
        cmbTravelClass.setSelectedItem(ImportData.getTravelClass());
        this.back = item;

    }

    CityDao citydao = new CityDaoImpl();
    CityDao days = new CityDaoImpl();
    CityDao months = new CityDaoImpl();
    CityDao years = new CityDaoImpl();
    CityDao travelClasses = new CityDaoImpl();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaHeading = new javax.swing.JTextArea();
        lblSelectFlight = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        cmbFrom = new javax.swing.JComboBox();
        cmbTo = new javax.swing.JComboBox();
        cmbDay = new javax.swing.JComboBox();
        cmbMonth = new javax.swing.JComboBox();
        cmbYear = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        lblWarningCities = new javax.swing.JLabel();
        lblWarningDate = new javax.swing.JLabel();
        lblSelectCities = new javax.swing.JLabel();
        lblTravelClass = new javax.swing.JLabel();
        cmbTravelClass = new javax.swing.JComboBox();
        lblTravelClassWarning = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPromo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        btnTravelHistoryStart = new javax.swing.JButton();
        lblValidDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setForeground(new java.awt.Color(153, 255, 153));

        jScrollPane1.setFont(new java.awt.Font("Courier New", 3, 36)); // NOI18N

        txtAreaHeading.setEditable(false);
        txtAreaHeading.setBackground(new java.awt.Color(153, 153, 255));
        txtAreaHeading.setColumns(1);
        txtAreaHeading.setFont(new java.awt.Font("Orator Std", 2, 40)); // NOI18N
        txtAreaHeading.setRows(1);
        txtAreaHeading.setText("Fly Oracle..to over 90 destinations");
        jScrollPane1.setViewportView(txtAreaHeading);

        lblSelectFlight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSelectFlight.setText("Select your flight below");

        lblFrom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFrom.setText("From");

        lblTo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTo.setText("To");

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDate.setText("Date");

        cmbFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbFromMouseClicked(evt);
            }
        });
        cmbFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFromActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setText("Search Flight");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblWarningCities.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblWarningCities.setForeground(new java.awt.Color(255, 51, 51));
        lblWarningCities.setText("2 cities cannot be same");

        lblWarningDate.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblWarningDate.setForeground(new java.awt.Color(255, 51, 51));
        lblWarningDate.setText("Please select  a  date");

        lblSelectCities.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblSelectCities.setForeground(new java.awt.Color(255, 51, 51));
        lblSelectCities.setText("Please select cities");

        lblTravelClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTravelClass.setText("Class");

        lblTravelClassWarning.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblTravelClassWarning.setForeground(new java.awt.Color(255, 51, 51));
        lblTravelClassWarning.setText("Please select class");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Promo code");

        txtPromo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Language");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English - en", "Française - fr", "Español - es" }));

        btnTravelHistoryStart.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnTravelHistoryStart.setText("Travel History");
        btnTravelHistoryStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTravelHistoryStartActionPerformed(evt);
            }
        });

        lblValidDate.setForeground(new java.awt.Color(255, 0, 0));
        lblValidDate.setText("Enter valid date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWarningCities)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWarningDate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTravelClassWarning)
                                            .addComponent(lblSelectCities)))))
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblSelectFlight)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTo)
                            .addComponent(txtPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnTravelHistoryStart)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDate))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblValidDate))))
                            .addComponent(jLabel1)))
                    .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTravelClass)
                    .addComponent(cmbTravelClass, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblSelectFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFrom)
                    .addComponent(lblTo)
                    .addComponent(lblDate)
                    .addComponent(lblValidDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTravelClass)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTravelClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(lblWarningCities)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWarningDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelectCities)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTravelClassWarning)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTravelHistoryStart)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFromActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbFromActionPerformed

    private void cmbFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbFromMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbFromMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        // warning signs
        if (cmbFrom.getSelectedItem().toString() == "Select a city" || cmbTo.getSelectedItem().toString() == "Select a city") {
            lblSelectCities.setVisible(true);
        } else {
            if (cmbFrom.getSelectedItem().toString() == cmbTo.getSelectedItem().toString()) {
                lblWarningCities.setVisible(true);
            }
        }

        if (!(cmbFrom.getSelectedItem().toString() == cmbTo.getSelectedItem().toString())) {
            lblWarningCities.setVisible(false); //opp
        }
        if (cmbDay.getSelectedItem().toString() == "Select day" || cmbMonth.getSelectedItem().toString() == "Select month" || 
                cmbYear.getSelectedItem().toString() == "Select year") {
            lblWarningDate.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

        if (!(cmbDay.getSelectedItem().toString() == "Select day" || cmbMonth.getSelectedItem().toString() == "Select month" || 
                cmbYear.getSelectedItem().toString() == "Select year")) {
            lblWarningDate.setVisible(false); //opp
        }
        if ((cmbFrom.getSelectedItem().toString() == "Select a city") || (cmbTo.getSelectedItem().toString() == "Select a city")) {
            lblSelectCities.setVisible(true);
        }
        if (!((cmbFrom.getSelectedItem().toString() == "Select a city") || (cmbTo.getSelectedItem().toString() == "Select a city"))) {
            lblSelectCities.setVisible(false); // opp
        }
        if (cmbTravelClass.getSelectedItem().toString() == "Select class") {
            lblTravelClassWarning.setVisible(true);
        }
        if (!(cmbTravelClass.getSelectedItem().toString() == "Select class")) {
            lblTravelClassWarning.setVisible(false); //opp
        }

        String date = (cmbDay.getSelectedItem().toString()) + "/" + (cmbMonth.getSelectedItem().toString()) + "/" + 
                (cmbYear.getSelectedItem().toString());
        
        try {
            if (cmbDay.getSelectedItem().toString() == "Select day" || cmbMonth.getSelectedItem().toString() == "Select month" || 
                    cmbYear.getSelectedItem().toString() == "Select year") {
                
            } else {
                DateTimeFormatter format = DateTimeFormatter.ISO_DATE;
            LocalDate ld = LocalDate.parse((cmbYear.getSelectedItem().toString() + "-" + cmbMonth.getSelectedItem().toString() + 
                    "-" + cmbDay.getSelectedItem().toString()), format);
            lblValidDate.setVisible(false);
            }
            
            
        } catch (Exception e) {
            lblValidDate.setVisible(true);
        }

        // taking values to next JFrame
        if ((!(cmbFrom.getSelectedItem().toString() == cmbTo.getSelectedItem().toString())) && 
                (!(cmbDay.getSelectedItem().toString() == "Select day" || cmbMonth.getSelectedItem().toString() == "Select month" || 
                cmbYear.getSelectedItem().toString() == "Select year")) && (!((cmbFrom.getSelectedItem().toString() == "Select a city") || 
                (cmbTo.getSelectedItem().toString() == "Select a city"))) && 
                (!(cmbTravelClass.getSelectedItem().toString() == "Select class")) && (!lblValidDate.isVisible())) {
            
            String departingCity = cmbFrom.getSelectedItem().toString();
            String arrivalCity = cmbTo.getSelectedItem().toString();
            String jrnDay = cmbDay.getSelectedItem().toString();
            String jrnMonth = cmbMonth.getSelectedItem().toString();
            String jrnYear = cmbYear.getSelectedItem().toString();
            String travelClass = cmbTravelClass.getSelectedItem().toString();

            
            this.setVisible(false);
            new CityDaoImpl(date, departingCity, arrivalCity);
            new Second(departingCity, arrivalCity, jrnDay, jrnMonth, jrnYear, travelClass).setVisible(true);
            new ImportData(departingCity, arrivalCity, date, travelClass);
            ImportData.printFirst();
        }
    }
    private void btnTravelHistoryStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravelHistoryStartActionPerformed
        // TODO add your handling code here:
        new Sixth().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTravelHistoryStartActionPerformed

    public void displayCityComboFrom() {
        List<String> city = citydao.city();
        cmbFrom.removeAllItems();
        cmbFrom.addItem("Select a city");
        for (String cities : city) {
            cmbFrom.addItem(cities);
        }
    }

    public void displayCityComboTo() {
        List<String> city = citydao.city();
        cmbTo.removeAllItems();
        cmbTo.addItem("Select a city");
        for (String cities : city) {
            if (cmbFrom.getSelectedItem().toString() == "Dhaka") {
                continue;
            } else if (cmbFrom.getSelectedItem().toString() == "Singapore City") {
                continue;
            } else if (cmbFrom.getSelectedItem().toString() == "Bangkok") {
                continue;
            } else if (cmbFrom.getSelectedItem().toString() == "Istanbul") {
                continue;
            }
            cmbTo.addItem(cities);
        }
    }

    public void displayDaysCombo() {
        List<String> dayss = days.day();
        cmbDay.removeAllItems();
        cmbDay.addItem("Select day");
        for (String day : dayss) {
            cmbDay.addItem(day);
        }
    }

    public void displayMonthsCombo() {
        List<String> monthss = months.month();
        cmbMonth.removeAllItems();
        cmbMonth.addItem("Select month");
        for (String month : monthss) {
            cmbMonth.addItem(month);
        }
    }

    public void displayYearsCombo() {
        List<String> yearss = years.year();
        cmbYear.removeAllItems();
        cmbYear.addItem("Select year");
        for (String year : yearss) {
            cmbYear.addItem(year);
        }
    }

    public void displayDataIntoComboBox() {
        List<String> list = travelClasses.travelClass();
        cmbTravelClass.removeAllItems();
        cmbTravelClass.addItem("Select class");
        cmbTravelClass.addItem("Economy Class");
        cmbTravelClass.addItem("Business Class");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTravelHistoryStart;
    private javax.swing.JComboBox cmbDay;
    private javax.swing.JComboBox cmbFrom;
    private javax.swing.JComboBox cmbMonth;
    private javax.swing.JComboBox cmbTo;
    private javax.swing.JComboBox cmbTravelClass;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblSelectCities;
    private javax.swing.JLabel lblSelectFlight;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblTravelClass;
    private javax.swing.JLabel lblTravelClassWarning;
    private javax.swing.JLabel lblValidDate;
    private javax.swing.JLabel lblWarningCities;
    private javax.swing.JLabel lblWarningDate;
    private javax.swing.JTextArea txtAreaHeading;
    private javax.swing.JTextField txtPromo;
    // End of variables declaration//GEN-END:variables
}
