/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BackEnd.EventSystem.SubEvent;
import BackEnd.EventSystem.TimeSchedule;
import BackEnd.UserSystem.Location;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sid
 */
public class SubEventPanel extends javax.swing.JPanel {

    /**
     * Creates new form SubEventPanel
     */
    public SubEventPanel() {
        initComponents();
        setSize(450,400);
        DefaultComboBoxModel dayModel = new DefaultComboBoxModel();
        for(int i = 0; i < 32; i++)
        {
            if(i == 0)
            { dayModel.addElement("Day"); }
            else
            { dayModel.addElement(i); }
        }
        DefaultComboBoxModel yearModel = new DefaultComboBoxModel();
        yearModel.addElement("Year");
        for(int i = 2013; i < 2050; i++)
        {
            yearModel.addElement(i);
        }
        DefaultComboBoxModel minModel = new DefaultComboBoxModel();
        minModel.addElement("Minute");
        for(int i = 1; i < 61; i++)
        {
            minModel.addElement(i);
        }
        daySelect.setModel((ComboBoxModel)dayModel);
        yearSelect.setModel((ComboBoxModel)yearModel);
        minuteSelect.setModel(minModel);
        
    }
    
    public SubEvent createEvent()
    {
        SubEvent e = new SubEvent(nameField.getText());
        int year = yearSelect.getSelectedIndex() + 2012;
        int month = monthSelect.getSelectedIndex();
        int day = daySelect.getSelectedIndex();
        int hour = hourSelect.getSelectedIndex();
        if(pmCheck.isSelected())
        {
            hour += 12;
        }
        int min = minuteSelect.getSelectedIndex();
        TimeSchedule t = new TimeSchedule();
        t.setStartDateTime(year, month, day, hour, min);
        e.setTimeSchedule(t);
        e.setLocation(new Location(locationField.getText()));
        //TimeSchedule t = new TimeSchedule((int)yearSelect.getSelectedItem(),monthSelect.getSelectedIndex(), daySelect.getSelectedIndex(), );
        return e;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        startLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        monthSelect = new javax.swing.JComboBox();
        daySelect = new javax.swing.JComboBox();
        yearSelect = new javax.swing.JComboBox();
        locationField = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pmCheck = new javax.swing.JCheckBox();
        nameField = new javax.swing.JTextField();
        hourSelect = new javax.swing.JComboBox();
        minuteSelect = new javax.swing.JComboBox();

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerLabel.setText("SubEvent Name");

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setText("Description of this event.\nDoesn't do anything yet.");
        descriptionScrollPane.setViewportView(descriptionTextArea);

        startLabel.setText("Start Time:");

        durationLabel.setText("Duration:");

        locationLabel.setText("Location:");

        monthSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        daySelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day" }));

        yearSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year" }));

        jTextField3.setText("00:00");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Month/Day/Year");

        pmCheck.setText("PM");
        pmCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmCheckActionPerformed(evt);
            }
        });

        hourSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hour", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        minuteSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Minute" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(durationLabel)
                                    .addComponent(locationLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(locationField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(hourSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minuteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addComponent(pmCheck))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(monthSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(daySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yearSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headerLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startLabel)
                    .addComponent(pmCheck)
                    .addComponent(hourSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(durationLabel)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationLabel)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pmCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmCheckActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox daySelect;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JComboBox hourSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField locationField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JComboBox minuteSelect;
    private javax.swing.JComboBox monthSelect;
    private javax.swing.JTextField nameField;
    private javax.swing.JCheckBox pmCheck;
    private javax.swing.JLabel startLabel;
    private javax.swing.JComboBox yearSelect;
    // End of variables declaration//GEN-END:variables
}
