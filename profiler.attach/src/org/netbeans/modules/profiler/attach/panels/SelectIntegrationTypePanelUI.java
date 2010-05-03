/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2009 Sun Microsystems, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */

package org.netbeans.modules.profiler.attach.panels;
import java.awt.Font;
import java.text.MessageFormat;
import javax.swing.UIManager;
import org.openide.util.NbBundle;

/**
 *
 * @author  Jaroslav Bachorik
 */
public class SelectIntegrationTypePanelUI extends javax.swing.JPanel {
  private SelectIntegrationTypePanel.Model model = null;
  private final String INTEGRATION_TYPE_HELP=NbBundle.getMessage(this.getClass(), "IntegrationTypeWizardPanelUI_IntegrationHintMsg"); // NOI18N
  /**
   * Creates new form SelectIntegrationTypePanelUI
   */
  SelectIntegrationTypePanelUI(SelectIntegrationTypePanel.Model model) {
    this.model = model;
    initComponents();
    loadModel();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupIntegrationType = new javax.swing.ButtonGroup();
        selectionPanel = new javax.swing.JPanel();
        buttonAutomatic = new javax.swing.JRadioButton();
        buttonManual = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        hintPanel = new org.netbeans.modules.profiler.attach.panels.components.ResizableHintPanel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/netbeans/modules/profiler/attach/panels/Bundle"); // NOI18N
        selectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("IntegrationTypeWizardPanelUI_ChooseIntegrationTypeString"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, UIManager.getFont("TitledBorder.font").deriveFont(Font.BOLD))); // NOI18N

        groupIntegrationType.add(buttonAutomatic);
        buttonAutomatic.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(buttonAutomatic, bundle.getString("IntegrationTypeWizardPanelUI_AutomaticString")); // NOI18N
        buttonAutomatic.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        buttonAutomatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAutomaticActionPerformed(evt);
            }
        });

        groupIntegrationType.add(buttonManual);
        org.openide.awt.Mnemonics.setLocalizedText(buttonManual, bundle.getString("IntegrationTypeWizardPanelUI_ManualString")); // NOI18N
        buttonManual.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        buttonManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAutomatic)
                    .addComponent(buttonManual))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        selectionPanelLayout.setVerticalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAutomatic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonManual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonAutomatic.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(SelectIntegrationTypePanelUI.class, "SelectIntegrationTypePanelUI.buttonAutomatic.AccessibleContext.accessibleDescription")); // NOI18N
        buttonManual.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(SelectIntegrationTypePanelUI.class, "SelectIntegrationTypePanelUI.buttonManual.AccessibleContext.accessibleDescription")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        hintPanel.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(selectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(hintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
  
    private void buttonManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManualActionPerformed
      this.model.setIntegrationType(SelectIntegrationTypePanel.Model.MANUAL_INTEGRATION);
    }//GEN-LAST:event_buttonManualActionPerformed
    
    private void buttonAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAutomaticActionPerformed
      this.model.setIntegrationType(SelectIntegrationTypePanel.Model.AUTOMATIC_INTEGRATION);
    }//GEN-LAST:event_buttonAutomaticActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonAutomatic;
    private javax.swing.JRadioButton buttonManual;
    private javax.swing.ButtonGroup groupIntegrationType;
    private org.netbeans.modules.profiler.attach.panels.components.ResizableHintPanel hintPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel selectionPanel;
    // End of variables declaration//GEN-END:variables
  
  private void loadModel() {
    this.model.setIntegrationType(buttonAutomatic.isSelected()?SelectIntegrationTypePanel.Model.AUTOMATIC_INTEGRATION:SelectIntegrationTypePanel.Model.MANUAL_INTEGRATION);
  }
  
  public void refresh() {
    switch(this.model.getIntegrationType()) {
      case SelectIntegrationTypePanel.Model.AUTOMATIC_INTEGRATION:
        buttonAutomatic.setSelected(true);
        break;
      case SelectIntegrationTypePanel.Model.MANUAL_INTEGRATION:
        buttonManual.setSelected(true);
        break;
      default:
        buttonAutomatic.setSelected(true);
    }
    
    final String providerName = model.getProviderName();
    hintPanel.setHint(MessageFormat.format(INTEGRATION_TYPE_HELP, new Object[]{providerName != null ? providerName : ""})); // NOI18N
  }
}

