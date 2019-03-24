/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frm_products;

import Commons.HoverAnimation;
import Commons.PanelController;

/**
 *
 * @author world
 */
public class SubMenuOfActivity extends javax.swing.JPanel {

    /**
     * Creates new form SubMenuOfActivity
     */
    PanelController panelController = new PanelController();
    HoverAnimation hover = new HoverAnimation();

    public SubMenuOfActivity() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNew = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbtextnew = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        panelNew1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbtextnew1 = new javax.swing.JLabel();
        btnAdd1 = new javax.swing.JButton();
        panelNew2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbtextnew2 = new javax.swing.JLabel();
        btnAdd2 = new javax.swing.JButton();

        panelNew.setBackground(new java.awt.Color(255, 255, 255));
        panelNew.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        panelNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNew.setPreferredSize(new java.awt.Dimension(200, 200));
        panelNew.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelNewMouseMoved(evt);
            }
        });
        panelNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNewMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelNewMouseExited(evt);
            }
        });
        panelNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelNewKeyPressed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));

        lbtextnew.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbtextnew.setForeground(new java.awt.Color(255, 255, 255));
        lbtextnew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtextnew.setText("Add to Color");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtextnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtextnew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        btnAdd.setBackground(java.awt.Color.white);
        btnAdd.setForeground(java.awt.Color.white);
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/icons8-color-dropper-100.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnAdd.setIconTextGap(10);
        btnAdd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAddMouseMoved(evt);
            }
        });
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        btnAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAddKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelNewLayout = new javax.swing.GroupLayout(panelNew);
        panelNew.setLayout(panelNewLayout);
        panelNewLayout.setHorizontalGroup(
            panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        panelNewLayout.setVerticalGroup(
            panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNewLayout.createSequentialGroup()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelNew1.setBackground(new java.awt.Color(255, 255, 255));
        panelNew1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        panelNew1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNew1.setPreferredSize(new java.awt.Dimension(200, 200));
        panelNew1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelNew1MouseMoved(evt);
            }
        });
        panelNew1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNew1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelNew1MouseExited(evt);
            }
        });
        panelNew1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelNew1KeyPressed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));

        lbtextnew1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbtextnew1.setForeground(new java.awt.Color(255, 255, 255));
        lbtextnew1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtextnew1.setText("Add to Vendors");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtextnew1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtextnew1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        btnAdd1.setBackground(java.awt.Color.white);
        btnAdd1.setForeground(java.awt.Color.white);
        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/icons8-manufacturing-100.png"))); // NOI18N
        btnAdd1.setBorder(null);
        btnAdd1.setBorderPainted(false);
        btnAdd1.setContentAreaFilled(false);
        btnAdd1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnAdd1.setIconTextGap(10);
        btnAdd1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAdd1MouseMoved(evt);
            }
        });
        btnAdd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdd1MouseExited(evt);
            }
        });
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        btnAdd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAdd1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelNew1Layout = new javax.swing.GroupLayout(panelNew1);
        panelNew1.setLayout(panelNew1Layout);
        panelNew1Layout.setHorizontalGroup(
            panelNew1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        panelNew1Layout.setVerticalGroup(
            panelNew1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNew1Layout.createSequentialGroup()
                .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelNew2.setBackground(new java.awt.Color(255, 255, 255));
        panelNew2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        panelNew2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelNew2.setPreferredSize(new java.awt.Dimension(200, 200));
        panelNew2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelNew2MouseMoved(evt);
            }
        });
        panelNew2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNew2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelNew2MouseExited(evt);
            }
        });
        panelNew2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelNew2KeyPressed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 51, 153));

        lbtextnew2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbtextnew2.setForeground(new java.awt.Color(255, 255, 255));
        lbtextnew2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtextnew2.setText("Add to Units");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtextnew2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtextnew2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        btnAdd2.setBackground(java.awt.Color.white);
        btnAdd2.setForeground(java.awt.Color.white);
        btnAdd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/icons8-unit-100.png"))); // NOI18N
        btnAdd2.setBorder(null);
        btnAdd2.setBorderPainted(false);
        btnAdd2.setContentAreaFilled(false);
        btnAdd2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnAdd2.setIconTextGap(10);
        btnAdd2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAdd2MouseMoved(evt);
            }
        });
        btnAdd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdd2MouseExited(evt);
            }
        });
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });
        btnAdd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAdd2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelNew2Layout = new javax.swing.GroupLayout(panelNew2);
        panelNew2.setLayout(panelNew2Layout);
        panelNew2Layout.setHorizontalGroup(
            panelNew2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        panelNew2Layout.setVerticalGroup(
            panelNew2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNew2Layout.createSequentialGroup()
                .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(panelNew, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(panelNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(panelNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(771, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelNew2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(panelNew, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addGap(242, 242, 242))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(panelNew1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addGap(241, 241, 241)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseMoved
        hover.setHover(panelNew, lbtextnew, 18);
    }//GEN-LAST:event_btnAddMouseMoved

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        hover.releaseHover(panelNew, lbtextnew, 14);
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       // panelController.showPanelWindow(new Strock_in_Custom());
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddKeyPressed
        if (evt.getKeyCode() == evt.VK_RIGHT) {
//            btnproducts.requestFocus();
//            hover.setHover(panelProducts, lbtextproducts, 18);
            hover.releaseHover(panelNew, lbtextnew, 14);
        }
        if (evt.getKeyCode() == 10) {
            // panelController.showPanelWindow(new AddProducts());
        }
    }//GEN-LAST:event_btnAddKeyPressed

    private void panelNewMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNewMouseMoved
        hover.setHover(panelNew, lbtextnew, 18);
    }//GEN-LAST:event_panelNewMouseMoved

    private void panelNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNewMouseClicked
      //  panelController.showPanelWindow(new Strock_in());
    }//GEN-LAST:event_panelNewMouseClicked

    private void panelNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNewMouseExited
        hover.releaseHover(panelNew, lbtextnew, 14);
    }//GEN-LAST:event_panelNewMouseExited

    private void panelNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelNewKeyPressed
        if (evt.getKeyCode() == evt.VK_RIGHT) {
//            panelProducts.requestFocus();
//            hover.setHover(panelProducts, lbtextnew, 18);
            hover.releaseHover(panelNew, lbtextnew, 14);
        }
    }//GEN-LAST:event_panelNewKeyPressed

    private void btnAdd1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd1MouseMoved

    private void btnAdd1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd1MouseExited

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnAdd1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAdd1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd1KeyPressed

    private void panelNew1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNew1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_panelNew1MouseMoved

    private void panelNew1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNew1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelNew1MouseClicked

    private void panelNew1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNew1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelNew1MouseExited

    private void panelNew1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelNew1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelNew1KeyPressed

    private void btnAdd2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd2MouseMoved

    private void btnAdd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd2MouseExited

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnAdd2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAdd2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd2KeyPressed

    private void panelNew2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNew2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_panelNew2MouseMoved

    private void panelNew2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNew2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelNew2MouseClicked

    private void panelNew2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNew2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_panelNew2MouseExited

    private void panelNew2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelNew2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelNew2KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbtextnew;
    private javax.swing.JLabel lbtextnew1;
    private javax.swing.JLabel lbtextnew2;
    private javax.swing.JPanel panelNew;
    private javax.swing.JPanel panelNew1;
    private javax.swing.JPanel panelNew2;
    // End of variables declaration//GEN-END:variables
}