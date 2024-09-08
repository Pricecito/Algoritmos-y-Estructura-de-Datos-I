/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.semana5;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class ListaNombres extends javax.swing.JFrame {
    
    String[] nombre;
    int indice;

    /**
     * Creates new form ListaNombres
     */
    public ListaNombres() {
        initComponents();
        this.setLocationRelativeTo(null);
        nombre = new String[4];
        indice=0;
    }
    
    public void registrarNombre()
    {
        if(indice<nombre.length)
        {
            nombre[indice]=txtNom.getText();
            indice++;
        }
        else
            JOptionPane.showMessageDialog(null,"VECTOR LLENO","ALERTA",JOptionPane.INFORMATION_MESSAGE);
    }
    
   /* public void mostrarNombres()
    { 
        for(int i=0;i<indice;i++)
        {
            txtRes.append(String.valueOf("POS ["+i+"]--> "+nombre[i])+"\n");
        }
    }*/
    
    public void mostrarNombres()
    { 
        for(int i=indice-1;i>=0;i--)
        {
            txtRes.append(String.valueOf("POS ["+i+"]--> "+nombre[i])+"\n");
        }
    }
    
    public int buscarNombre(String nbus)
    {
        int pos=-1;
        for(int i=0;i<indice;i++)
        {
            if(nombre[i].compareTo(nbus)==0)
                pos=i;   
        }
        return pos;
    }
    
    public void mostrarNombresConsonantes()
    {
        for(int i=0;i<indice;i++)
        {
            int can=obtenerCantidadConsonantes(nombre[i].toLowerCase());
            txtRes.append(nombre[i]+" "+can+" consonantes\n");
        }
    }
    
    public int obtenerCantidadConsonantes(String nm)
    {
        int cant=0;
        for(int i=0;i<nm.length();i++)
        {
            if(nm.charAt(i)!='a' && nm.charAt(i)!='e' && nm.charAt(i)!='i' && nm.charAt(i)!='o' && nm.charAt(i)!='u')
                cant++;
        }
        return cant;
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtNom = new javax.swing.JTextField();
        RegistrarNom = new javax.swing.JButton();
        MostrarNom = new javax.swing.JButton();
        BuscarNom = new javax.swing.JButton();
        NomConsonantes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistrarNom.setText("Registrar Nombre");
        RegistrarNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarNomActionPerformed(evt);
            }
        });

        MostrarNom.setText("Mostrar Nombres");
        MostrarNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarNomActionPerformed(evt);
            }
        });

        BuscarNom.setText("Buscar Nombre");
        BuscarNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNomActionPerformed(evt);
            }
        });

        NomConsonantes.setText("Nombres con Cant. Conson.");
        NomConsonantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomConsonantesActionPerformed(evt);
            }
        });

        txtRes.setColumns(20);
        txtRes.setRows(5);
        jScrollPane1.setViewportView(txtRes);

        jLabel1.setText("NOMBRE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegistrarNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNom))
                    .addComponent(MostrarNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NomConsonantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(RegistrarNom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MostrarNom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuscarNom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomConsonantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarNomActionPerformed
        // TODO add your handling code here:
        registrarNombre();
        txtNom.setText(null);
        txtNom.requestFocus();
    }//GEN-LAST:event_RegistrarNomActionPerformed

    private void MostrarNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarNomActionPerformed
        // TODO add your handling code here:
        txtRes.setText(null);
        mostrarNombres();
    }//GEN-LAST:event_MostrarNomActionPerformed

    private void BuscarNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNomActionPerformed
        // TODO add your handling code here:
        String nbus=JOptionPane.showInputDialog(this,"Ingrese nombre a buscar");
        int pos=buscarNombre(nbus);
        if (pos!=-1)
            JOptionPane.showMessageDialog(null,"VALOR ENCONTRADO EN LA POSICIÓN: "+pos,"ALERTA",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUN VALOR","IMPORTANTE",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_BuscarNomActionPerformed

    private void NomConsonantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomConsonantesActionPerformed
        // TODO add your handling code here:
        txtRes.setText(null);
        mostrarNombresConsonantes();
    }//GEN-LAST:event_NomConsonantesActionPerformed

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
            java.util.logging.Logger.getLogger(ListaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaNombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaNombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarNom;
    private javax.swing.JButton MostrarNom;
    private javax.swing.JButton NomConsonantes;
    private javax.swing.JButton RegistrarNom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextArea txtRes;
    // End of variables declaration//GEN-END:variables
}