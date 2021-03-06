/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_11_veksle;

import java.text.DecimalFormat;
import kapitel_04.Billetautomat;

/**
 *
 * @author j
 */
public class VekslePanel extends javax.swing.JPanel {

	Billetautomat b = new Billetautomat(10);
	/** Creates new form VekslePanel */
	public VekslePanel() {
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

    jTextField1 = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jButtonVeksl = new javax.swing.JButton();
    jTextField2 = new javax.swing.JTextField();
    jPanel1 = new javax.swing.JPanel();

    jTextField1.setToolTipText("Skriv beløb i euro");

    jLabel1.setText("jLabel1");

    jButtonVeksl.setText("Veksl");
    jButtonVeksl.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonVekslActionPerformed(evt);
      }
    });

    jTextField2.setText("jTextField2");

    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 235, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jButtonVeksl)
              .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(67, 67, 67)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel1))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonVeksl)
            .addGap(49, 49, 49)
            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(129, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonVekslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVekslActionPerformed
		// TODO add your handling code here:
		int pris = b.getBilletpris();

		String s = jTextField1.getText();
		try {
		double d = Double.parseDouble(s);


		double res = d/7.12;
		DecimalFormat df = new DecimalFormat( "#,##0.00;(#,##0.00)");

		jTextField2.setText( ""+df.format(res) );
		} catch (Exception e) {
		jTextField2.setText( "Det kunne vi ikke. prøv igen" );

		}

		

  }//GEN-LAST:event_jButtonVekslActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonVeksl;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  public javax.swing.JTextField jTextField1;
  private javax.swing.JTextField jTextField2;
  // End of variables declaration//GEN-END:variables

	public void setBeløb(int i) {
		jTextField1.setText(""+i);
	}

	public int getBeløb() {
		return 7;
	}
}
