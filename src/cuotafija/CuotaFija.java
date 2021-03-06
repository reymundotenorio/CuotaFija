/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuotafija;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reymundo Tenorio
 */
public class CuotaFija extends javax.swing.JFrame {

    /**
     * Creates new form CuotaFija
     */
    public CuotaFija() {
        initComponents();
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("Cuota.png")).getImage());
        } catch (NullPointerException ex) {
        }
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        txtInteres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuota Fija");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monto: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 140, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Interés: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 140, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Periodo: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 140, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        txtMonto.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 139;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 18, 0, 0);
        jPanel3.add(txtMonto, gridBagConstraints);

        txtPeriodo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeriodoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 18, 45, 0);
        jPanel3.add(txtPeriodo, gridBagConstraints);

        txtInteres.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 0, 0);
        jPanel3.add(txtInteres, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Calcular.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 134, 0, 137);
        jPanel3.add(btnCalcular, gridBagConstraints);

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 134, 0, 0);
        jPanel3.add(btnLimpiar, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(772, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Limpiar() {
        this.txtInteres.setText("");
        this.txtMonto.setText("");
        this.txtPeriodo.setText("");

        this.Modelo.setRowCount(0);
        this.Tabla.setModel(Modelo);

    }


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String Titulo[] = {"Año", "Amortización", "Interés", "Cuota", "Saldo"};

        this.Modelo.setColumnIdentifiers(Titulo);

        this.Tabla.setModel(Modelo);

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    public void Calcular() {

        String Monto, Interes, Periodo;

        Monto = txtMonto.getText().trim();
        Interes = txtInteres.getText().trim();
        Periodo = txtPeriodo.getText().trim();

        double MontoF;
        float InteresF;
        int PeriodoF;

        if ("".equals(Monto) || "".equals(Interes) || "".equals(Periodo)) {
            JOptionPane.showMessageDialog(this, "Ingrese toda los datos en los campos requeridos", "Ingresar todo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            MontoF = Double.parseDouble(Monto);
            InteresF = Float.parseFloat(Interes);
            PeriodoF = Integer.parseInt(Periodo);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese el formato correcto en los campos requeridos", "Error de formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double Cuota;

        InteresF = InteresF / 100;

        Cuota = Redondear((MontoF) * (((InteresF) * (Math.pow(1 + InteresF, PeriodoF))) / ((Math.pow(1 + InteresF, PeriodoF)) - 1)));

//        DecimalFormat DF = new DecimalFormat("#0.00");
//        String CuotaF = DF.format(Cuota);
//        CuotaF = CuotaF.replace(",", ".");
        int Anio = 0;

        Object Inicio[] = new Object[5];
        Inicio[0] = Anio;
        Inicio[1] = "-";
        Inicio[2] = "-";
        Inicio[3] = "-";
        Inicio[4] = MontoF;

        Modelo.addRow(Inicio);

        for (int i = 0; i < PeriodoF; i++) {

            Anio++;

            double SaldoP = Redondear(Double.parseDouble(Modelo.getValueAt(i, 4).toString()));

            double InteresP = Redondear(InteresF * SaldoP);
            double Amortizacion = Redondear(Cuota - InteresP);

            double SaldoF = Redondear(SaldoP - Amortizacion);

            Object Datos[] = new Object[5];
            Datos[0] = Anio;
            Datos[1] = Amortizacion;
            Datos[2] = InteresP;
            Datos[3] = Cuota;
            Datos[4] = SaldoF;

            Modelo.addRow(Datos);

        }

        double SumaAmortizacion = 0;
        double SumaInteres = 0;
        double SumaCuota = 0;

        for (int i = 0; i < PeriodoF; i++) {

            SumaAmortizacion = Redondear(SumaAmortizacion + Double.parseDouble(Modelo.getValueAt(i + 1, 1).toString()));
            SumaInteres = Redondear(SumaInteres + Double.parseDouble(Modelo.getValueAt(i + 1, 2).toString()));
            SumaCuota = Redondear(SumaCuota + Double.parseDouble(Modelo.getValueAt(i + 1, 3).toString()));
        }

        Object Datos[] = new Object[5];
        Datos[0] = "Total";
        Datos[1] = SumaAmortizacion;
        Datos[2] = SumaInteres;
        Datos[3] = SumaCuota;
        Datos[4] = "-";

        Modelo.addRow(Datos);

        Tabla.setModel(Modelo);

    }

    public double Redondear(double numero) {
        return Math.rint(numero * 100) / 100;
    }


    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Calcular();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        char a = evt.getKeyChar();

        if (!Character.isDigit(a) && !Character.isISOControl(a) && a != '.') {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }

        if ("0".equals(txtMonto.getText()) && txtMonto.getCaretPosition() == 1 && a != '.' && !Character.isISOControl(a)) {
            txtMonto.setText(txtMonto.getText() + ".");
//        return;
        }

        if (a == '.' && txtMonto.getText().contains(".")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }

        String x1 = "";
        if (Character.isDigit(a) || (Character.isISOControl(a) && !"".equals(txtMonto.getText()))) {
            x1 = txtMonto.getText();
        }
        if (Character.isDigit(a) || (a == '.')) {
            x1 = txtMonto.getText().concat(String.valueOf(a));
        }

        if (!"".equals(x1)) {

            try {

                Double x = Double.parseDouble(x1);

                if (x > Double.MAX_VALUE) {
                    Toolkit.getDefaultToolkit().beep();
                    evt.consume();
                }

            } catch (NumberFormatException ex) {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        }

        if (a == KeyEvent.VK_ENTER) {
            txtInteres.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresKeyTyped
        char a = evt.getKeyChar();

        if (!Character.isDigit(a) && !Character.isISOControl(a) && a != '.') {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }

        if ("0".equals(txtInteres.getText()) && txtInteres.getCaretPosition() == 1 && a != '.' && !Character.isISOControl(a)) {
            txtInteres.setText(txtInteres.getText() + ".");
//        return;
        }

        if (a == '.' && txtInteres.getText().contains(".")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }

        String x1 = "";
        if (Character.isDigit(a) || (Character.isISOControl(a) && !"".equals(txtInteres.getText()))) {
            x1 = txtInteres.getText();
        }
        if (Character.isDigit(a) || (a == '.')) {
            x1 = txtInteres.getText().concat(String.valueOf(a));
        }

        if (!"".equals(x1)) {

            try {

                Double x = Double.parseDouble(x1);

                if (x > Double.MAX_VALUE) {
                    Toolkit.getDefaultToolkit().beep();
                    evt.consume();
                }

            } catch (NumberFormatException ex) {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        }

        if (a == KeyEvent.VK_ENTER) {
            txtPeriodo.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteresKeyTyped

    private void txtPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeriodoKeyTyped
        char a = evt.getKeyChar();

        if (!Character.isDigit(a) && !Character.isISOControl(a)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

        if (a == KeyEvent.VK_ENTER) {
            Calcular();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodoKeyTyped

    DefaultTableModel Modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }
        //all cells false       
    };

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
            java.util.logging.Logger.getLogger(CuotaFija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuotaFija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuotaFija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuotaFija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CuotaFija().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtPeriodo;
    // End of variables declaration//GEN-END:variables
}
