
package view;

import model.Matricula;
import model.MatriculaDAO;
import javax.swing.JOptionPane;

public class AtualizaMatricula extends javax.swing.JFrame {


    public AtualizaMatricula() {
        initComponents();
    }
    
    public void setForm(Matricula m){
        campoId.setText(m.getId()+"");
        campoAluno.setText(m.getAluno());
        int rg = Integer.parseInt(campoRg.getText());
        campoResponsavel.setText(m.getResponsavel());
        int nis = Integer.parseInt(campoNis.getText());
        int idade = Integer.parseInt(campoIdade.getText());
        campoEmail.setText(m.getEmail());
        
    }
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Matricula = new javax.swing.JPanel();
        campoId = new javax.swing.JLabel();
        campoAluno = new javax.swing.JLabel();
        campoRg = new javax.swing.JLabel();
        campoResponsavel = new javax.swing.JLabel();
        campoNis = new javax.swing.JLabel();
        campoIdade = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        campoEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matricula");

        campoId.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));

        campoAluno.setBorder(javax.swing.BorderFactory.createTitledBorder("Aluno"));

        campoRg.setBorder(javax.swing.BorderFactory.createTitledBorder("Rg"));

        campoResponsavel.setBorder(javax.swing.BorderFactory.createTitledBorder("Responsavel"));

        campoNis.setBorder(javax.swing.BorderFactory.createTitledBorder("Nis"));

        campoIdade.setToolTipText("");
        campoIdade.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade"));

        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        campoEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        campoEmail.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                campoEmailHierarchyChanged(evt);
            }
        });

        javax.swing.GroupLayout MatriculaLayout = new javax.swing.GroupLayout(Matricula);
        Matricula.setLayout(MatriculaLayout);
        MatriculaLayout.setHorizontalGroup(
            MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriculaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriculaLayout.createSequentialGroup()
                        .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(campoAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoRg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoResponsavel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoNis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        MatriculaLayout.setVerticalGroup(
            MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       Matricula m = new Matricula();
       String texto = campoId.getText();
       int id = Integer.parseInt(texto);
       m.setId(id);
       m.setAluno(campoAluno.getText());
       int rg = Integer.parseInt(texto);
       m.setRg(rg);
       m.setResponsavel(campoResponsavel.getText());
       int nis = Integer.parseInt(texto);
       m.setNis(nis);
       m.setIdade(campoIdade());
       
       
       
       
       
       
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       Matricula m = new Matricula();
       m.setId(Integer.parseInt(campoId.getText()));
       m.setAluno(campoAluno.getText());
       m.setRg(Integer.parseInt(campoRg.getText()));
       m.setResponsavel(campoResponsavel.getText());
       m.setNis(Integer.parseInt(campoNis.getText()));
       m.setIdade(Integer.parseInt(campoNis.getText()));
       m.setEmail(campoEmail.getText());
       
       String mensagem = " Tem certeza que deseja excluir ";
       mensagem += m.getId()+"("+m.getAluno()+") "+m.getRg()+"("+m.getResponsavel()+"("+m.getNis()+"("+m.getIdade()+"("+m.getEmail()+")";
       mensagem += "da lista de matriculas?";
       
       int resposta;
       resposta = JOptionPane.showConfirmDialog(null, mensagem);
       
       if(resposta = 0){
           new MatriculaDAO().excluir(m);
       }
       dispose();
               
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void campoEmailHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_campoEmailHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailHierarchyChanged

   
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
            java.util.logging.Logger.getLogger(AtualizaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizaMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Matricula;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel campoAluno;
    private javax.swing.JLabel campoEmail;
    private javax.swing.JLabel campoId;
    private javax.swing.JLabel campoIdade;
    private javax.swing.JLabel campoNis;
    private javax.swing.JLabel campoResponsavel;
    private javax.swing.JLabel campoRg;
    // End of variables declaration//GEN-END:variables

    private int campoIdade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
