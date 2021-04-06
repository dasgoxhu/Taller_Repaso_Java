package tallerjavar;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(380, 280));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(380, 280));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 280));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Manuel Alejandro Arias Cardona");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jButton2.setBackground(new java.awt.Color(204, 102, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, 20));

        jButton3.setBackground(new java.awt.Color(204, 102, 0));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Punto 5 (Tren)");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 170, 20));

        jButton4.setBackground(new java.awt.Color(204, 102, 0));
        jButton4.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Punto 1 (N.mayor)");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 170, 20));

        jButton5.setBackground(new java.awt.Color(204, 102, 0));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Punto 2 (Palindromo)");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 170, 20));

        jButton6.setBackground(new java.awt.Color(204, 102, 0));
        jButton6.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Punto 3 (Multiplicacion)");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, 20));

        jButton7.setBackground(new java.awt.Color(204, 102, 0));
        jButton7.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Punto 4 (Potencia)");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, 20));

        jButton8.setBackground(new java.awt.Color(204, 102, 0));
        jButton8.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Punto 5 (Estudiantes)");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 170, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/megumin.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Taller De Repaso Java");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Hecho por: Daniel Stiven Gomez Hurtado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        ClaseTren();   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.dispose();
       NumeroMayor();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose(); 
        Palindromo();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();  
        Multiplicacion();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        PotenciaSumas();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        ClaseEstudiantes();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    public static void Multiplicacion()
    {
        String num1,num2;
        int n1,n2,acumulador,contador;
        
        num1 = JOptionPane.showInputDialog("Ingresar Primer Numero: ");
        num2 = JOptionPane.showInputDialog("Ingresar Segundo Numero: ");
        
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
        
        if ( n1 >= 0 && n2 >= 0 )
    {
        acumulador = 0;

        if ( n2 != 0 )
        {
            contador = 1;
            while ( contador <= n1 )
            {
                acumulador += n2;
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null,acumulador);
        Inicio a = new Inicio();
        a.setVisible(true);
    }
    else
        JOptionPane.showMessageDialog(null,"Ambos numeros deben ser mayores o iguales que cero"); 
        Inicio a = new Inicio();
        a.setVisible(true);
    }
    
    public static void Palindromo()
    {
       String palabra;
       palabra = JOptionPane.showInputDialog("ingresar Palabra: ");
       char [] palindromo;
       int izquierdo,derecho;
       palindromo = palabra.toCharArray();
       izquierdo = 0;
       derecho = palindromo.length - 1;  /* numeracion en java empieza desde 0 */
       
       while(izquierdo < derecho)
       {
           if(palindromo[izquierdo] == palindromo[derecho])
           {
               derecho --;
               izquierdo ++;
           }
           else
           {
               JOptionPane.showMessageDialog(null,"La Palabra No Es Un Palindromo");
               break;
           }    
       }
       if(izquierdo == derecho)
       {
           JOptionPane.showMessageDialog(null,"La Palabra Si Es Un Palindromo");
       }
       Inicio a = new Inicio();
       a.setVisible(true);
    }
    public static void NumeroMayor()
    {
       int auxiliar;
       auxiliar = Integer.parseInt(JOptionPane.showInputDialog("ingresar la Cantidad de numeros: "));
       int mayor[] = new int[auxiliar];
       for(int c =0;c<auxiliar;c++)
       {
         mayor[c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Los Numeros: "));
       }
       int auxiliarMayor = 0;
       for(int c=0;c<mayor.length;c++)
       {

           if(auxiliarMayor < mayor[c])
           {
               auxiliarMayor = mayor[c];
           }

            auxiliar = auxiliarMayor;
       }
       JOptionPane.showMessageDialog(null,"Mayor es: " + auxiliar);
       Inicio a = new Inicio();
       a.setVisible(true);
    } 
    
    public static void PotenciaSumas(){
        int b,p,s=0,r=1;
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: "));
        p = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));
        for(int i=0;i<p;i++){
            r = multiplicacionPS(r,b);
        }
        JOptionPane.showMessageDialog(null,"El resultado es: " + r);
        Inicio a = new Inicio();
        a.setVisible(true);
    }
    public static int multiplicacionPS(int r, int b){
        int s=0;
        for(int i=0;i<r;i++){
            s = s + b;  
        }
        return s;
    }
    public static void ClaseEstudiantes()
    {
        Estudiante m = new Estudiante("16164132","Juan","Stiven","15-25",true,2000);
        Estudiante n = new Estudiante("1651566","Pablo","Gomez","15-25",true,1000);
        Estudiante b = new Estudiante("7656222","Sara","Zapata","15-25",false,1000);
        Estudiante v = new Estudiante("56462161","Paula","Valencia","15-25",true,5000);
        Estudiante c = new Estudiante("6451516","Julio","Hurtado","15-25",false,9000);
        JOptionPane.showMessageDialog(null,"Alumno 1: "+ "  CC: "+ m.getCedula()+ "  Nombre: "+  m.getNombre()+ "  Apellido: "+ m.getApellidos()+ "  Direccion: "+ m.getDireccion()+ "  Matricula: "+ m.getMatricula());
        JOptionPane.showMessageDialog(null,"Alumno 2: "+ "  CC: "+ n.getCedula()+ "  Nombre: "+  n.getNombre()+ "  Apellido: "+ n.getApellidos()+ "  Direccion: "+ n.getDireccion()+ "  Matricula: "+ n.getMatricula());
        JOptionPane.showMessageDialog(null,"Alumno 3: "+ "  CC: "+ b.getCedula()+ "  Nombre: "+  b.getNombre()+ "  Apellido: "+ b.getApellidos()+ "  Direccion: "+ b.getDireccion()+ "  Matricula: "+ b.getMatricula());
        JOptionPane.showMessageDialog(null,"Alumno 4: "+ "  CC: "+ v.getCedula()+ "  Nombre: "+  v.getNombre()+ "  Apellido: "+ v.getApellidos()+ "  Direccion: "+ v.getDireccion()+ "  Matricula: "+ v.getMatricula());
        JOptionPane.showMessageDialog(null,"Alumno 5: "+ "  CC: "+ c.getCedula()+ "  Nombre: "+  c.getNombre()+ "  Apellido: "+ c.getApellidos()+ "  Direccion: "+ c.getDireccion()+ "  Matricula: "+ c.getMatricula()); 
        Inicio a = new Inicio();
        a.setVisible(true);
    }
    public static void ClaseTren()
    {
        Clasestren  A = new Clasestren( "P012", "yositoko", "premier",2021 ,false );
        Clasestren  B = new Clasestren( "poll1", "yossho", "eva01",2030 ,true );
        Clasestren  C = new Clasestren( "premi1", "kothi", "kho1",2017 ,false );
        Clasestren  D = new Clasestren( "231F", "Ppe21", "cool21",2022 ,true );
        Clasestren  E = new Clasestren( "def12", "kotlin", "12prem",2018 ,false );
        
        JOptionPane.showMessageDialog(null," ID = "+A.getID()+" Marca = "+A.getMarca()+" Modelo = "+A.getModelo()+" Año = "+A.getAño()+" Velocidad = "+A.isVelocidad());
        JOptionPane.showMessageDialog(null," ID = "+B.getID()+" Marca = "+B.getMarca()+" Modelo = "+B.getModelo()+" Año = "+B.getAño()+" Velocidad = "+B.isVelocidad());
        JOptionPane.showMessageDialog(null," ID = "+C.getID()+" Marca = "+C.getMarca()+" Modelo = "+C.getModelo()+" Año = "+C.getAño()+" Velocidad = "+C.isVelocidad());
        JOptionPane.showMessageDialog(null," ID = "+D.getID()+" Marca = "+D.getMarca()+" Modelo = "+D.getModelo()+" Año = "+D.getAño()+" Velocidad = "+D.isVelocidad());
        JOptionPane.showMessageDialog(null," ID = "+E.getID()+" Marca = "+E.getMarca()+" Modelo = "+E.getModelo()+" Año = "+E.getAño()+" Velocidad = "+E.isVelocidad());
        Inicio a = new Inicio();
        a.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
