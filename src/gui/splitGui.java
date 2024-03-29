/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * splitGui.java
 *
 * Created on Sep 13, 2010, 6:14:52 PM
 */

package gui;


import code.Splitter;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author tanmay
 */
public class splitGui extends javax.swing.JFrame implements Runnable {


    String fileToSplitName;
    int parts;
    File fileToSplit;
    

    /** Creates new form splitGui */
    public splitGui() {
        initComponents();        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        fileNameLabel = new javax.swing.JLabel();
        fileName = new javax.swing.JTextField();
        noOfPartsLabel = new javax.swing.JLabel();
        noOfParts = new javax.swing.JTextField();
        noteLabel = new javax.swing.JLabel();
        splitButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        maxSizeLabel = new javax.swing.JLabel();
        maxSize = new javax.swing.JTextField();
        sizeSelect = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();

        setTitle("File Splitter");

        titleLabel.setFont(new java.awt.Font("DejaVu Sans Light", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Splitter");

        fileNameLabel.setText("File:");

        noOfPartsLabel.setText("No. Of Parts:");

        noteLabel.setText("Note: The Split Files Will Be Placed in the Same Directory");

        splitButton.setText("Split");
        splitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splitButtonActionPerformed(evt);
            }
        });

        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLabel.setText("Click Split");

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        maxSizeLabel.setText("Max File Size:");

        maxSize.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sizeSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GB", "MB", "KB" }));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Leave Either Size Or Parts To AutoCalculate");

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(maxSizeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxSize))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noOfPartsLabel)
                            .addComponent(fileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fileName, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(noOfParts))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(sizeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(noteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(splitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileNameLabel)
                    .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noOfPartsLabel)
                    .addComponent(noOfParts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxSizeLabel)
                    .addComponent(maxSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sizeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultLabel)
                .addGap(8, 8, 8)
                .addComponent(noteLabel)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_exitMenuItemActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser= new JFileChooser();
        int returnVal=chooser.showOpenDialog(splitGui.this);
        fileToSplit=chooser.getSelectedFile();
        fileToSplitName=chooser.getName(fileToSplit);
        fileName.setText(fileToSplitName);
    }//GEN-LAST:event_browseButtonActionPerformed

    private void splitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitButtonActionPerformed
        // TODO add your handling code here:
        Thread t=new Thread(this);

        t.start();      

    }//GEN-LAST:event_splitButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splitGui().setVisible(true);
            }
        });
    }
    public void run()
    {
        boolean partsBool=true;
        long maxSizeL=0;
        long sizeSelectL=1024;
        resultLabel.setText("Splitting..Please Wait..");
        try{
        if(!(noOfParts.getText() == null||noOfParts.getText().equals("")))
        {
            parts=Integer.parseInt(noOfParts.getText());
        }
        else
        {
            partsBool=false;
            if(sizeSelect.getSelectedIndex()==0)
            {
                sizeSelectL*=1024*1024;
            }
            else if(sizeSelect.getSelectedIndex()==1)
            {
                sizeSelectL*=1024;
            }
            maxSizeL=sizeSelectL*(Integer.parseInt(maxSize.getText()));
        }}
        finally{
            JOptionPane.showMessageDialog(null, maxSizeL+"   "+parts);
            Splitter split=new Splitter(fileToSplit,parts,maxSizeL,partsBool);
            split.split();
            resultLabel.setText("Done..");}

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextField fileName;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField maxSize;
    private javax.swing.JLabel maxSizeLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField noOfParts;
    private javax.swing.JLabel noOfPartsLabel;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JComboBox sizeSelect;
    private javax.swing.JButton splitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
