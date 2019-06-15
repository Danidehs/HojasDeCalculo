package prueba;

import Clases.ListaHoja;
import Clases.NodoHoja;
import Clases.Pila;
import Clases.ListaSimple;
import Clases.NodoSimple;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

public class Interfaz extends javax.swing.JFrame {
    int x;
    int y;
    ListaHoja libro = new ListaHoja(crearHoja());
    NodoHoja hoja = libro.getCabeza();
    String texto;
    
    
    public Interfaz(String texto){
        this.texto = texto;
        initComponents();
        hoja.imprimirHoja();
        
    }
    
    public Interfaz() {
        initComponents();
        
        hoja.imprimirHoja();
        }
    
    public NodoHoja crearHoja (){
        NodoHoja nuevo = new NodoHoja();
        return nuevo;
    }
 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        insertarF = new javax.swing.JButton();
        eliminarF = new javax.swing.JButton();
        insertarC = new javax.swing.JButton();
        eliminarC = new javax.swing.JButton();
        Renombrar = new javax.swing.JButton();
        CrearHoja = new javax.swing.JButton();
        nuevaCelda = new javax.swing.JButton();
        elminarCelda = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        finale = new javax.swing.JButton();
        deshacer = new javax.swing.JButton();
        copiar = new javax.swing.JButton();
        pegar = new javax.swing.JButton();
        anterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MetroExcel");
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(113, 136, 182));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTabbedPane1.setName("Hoja"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        Table.setAutoCreateRowSorter(true);
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), null, null, null, null, null, null, null, null, null, null},
                { new Integer(2), null, null, null, null, null, null, null, null, null, null},
                { new Integer(3), null, null, null, null, null, null, null, null, null, null},
                { new Integer(4), null, null, null, null, null, null, null, null, null, null},
                { new Integer(5), null, null, null, null, null, null, null, null, null, null},
                { new Integer(6), null, null, null, null, null, null, null, null, null, null},
                { new Integer(7), null, null, null, null, null, null, null, null, null, null},
                { new Integer(8), null, null, null, null, null, null, null, null, null, null},
                { new Integer(9), null, null, null, null, null, null, null, null, null, null},
                { new Integer(10), null, null, null, null, null, null, null, null, null, null},
                { new Integer(11), null, null, null, null, null, null, null, null, null, null},
                { new Integer(12), null, null, null, null, null, null, null, null, null, null},
                { new Integer(13), null, null, null, null, null, null, null, null, null, null},
                { new Integer(14), null, null, null, null, null, null, null, null, null, null},
                { new Integer(15), null, null, null, null, null, null, null, null, null, null},
                { new Integer(16), null, null, null, null, null, null, null, null, null, null},
                { new Integer(17), null, null, null, null, null, null, null, null, null, null},
                { new Integer(18), null, null, null, null, null, null, null, null, null, null},
                { new Integer(19), null, null, null, null, null, null, null, null, null, null},
                { new Integer(20), null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setToolTipText("");
        Table.setColumnSelectionAllowed(true);
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table.setSelectionBackground(new java.awt.Color(204, 255, 255));
        Table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TableFocusLost(evt);
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TableKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TableKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMinWidth(25);
            Table.getColumnModel().getColumn(0).setMaxWidth(25);
            Table.getColumnModel().getColumn(0).setHeaderValue("");
            Table.getColumnModel().getColumn(1).setHeaderValue("A");
            Table.getColumnModel().getColumn(2).setHeaderValue("B");
            Table.getColumnModel().getColumn(3).setHeaderValue("C");
            Table.getColumnModel().getColumn(4).setHeaderValue("D");
            Table.getColumnModel().getColumn(5).setHeaderValue("E");
            Table.getColumnModel().getColumn(6).setHeaderValue("F");
            Table.getColumnModel().getColumn(7).setHeaderValue("G");
            Table.getColumnModel().getColumn(8).setHeaderValue("H");
            Table.getColumnModel().getColumn(9).setHeaderValue("I");
            Table.getColumnModel().getColumn(10).setHeaderValue("J");
        }

        insertarF.setText("Insertar Fila");
        insertarF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        insertarF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertarFMouseClicked(evt);
            }
        });
        insertarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarFActionPerformed(evt);
            }
        });

        eliminarF.setText("Eliminar Fila");
        eliminarF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFActionPerformed(evt);
            }
        });

        insertarC.setText("Insertar Columna");
        insertarC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        insertarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertarCMouseClicked(evt);
            }
        });
        insertarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarCActionPerformed(evt);
            }
        });

        eliminarC.setText("Eliminar Columna");
        eliminarC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarCMouseClicked(evt);
            }
        });
        eliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCActionPerformed(evt);
            }
        });

        Renombrar.setText("Renombrar");
        Renombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenombrarActionPerformed(evt);
            }
        });

        CrearHoja.setText("Crear Hoja");
        CrearHoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearHojaMouseClicked(evt);
            }
        });
        CrearHoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearHojaActionPerformed(evt);
            }
        });

        nuevaCelda.setText("Insertar celda");
        nuevaCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaCeldaActionPerformed(evt);
            }
        });

        elminarCelda.setText("Eliminar celda");
        elminarCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elminarCeldaActionPerformed(evt);
            }
        });

        guardar.setText("Guardar Dato");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        finale.setText("Final");
        finale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finaleActionPerformed(evt);
            }
        });

        deshacer.setText("Deshacer");
        deshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshacerActionPerformed(evt);
            }
        });

        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });

        pegar.setText("Pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });

        anterior.setText("Hoja Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CrearHoja, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(copiar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(pegar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Renombrar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(deshacer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(196, 196, 196)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nuevaCelda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(elminarCelda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(eliminarC)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(insertarC, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(insertarF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finale, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(insertarC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nuevaCelda)
                        .addComponent(copiar)
                        .addComponent(CrearHoja)
                        .addComponent(Renombrar))
                    .addComponent(insertarF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(eliminarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(elminarCelda)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pegar)
                        .addComponent(anterior)
                        .addComponent(deshacer)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hoja", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarFMouseClicked
     
       
    }//GEN-LAST:event_insertarFMouseClicked

    private void insertarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarFActionPerformed
        
        hoja.insertarFila();
        hoja.imprimirHoja();

        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        Object aux[] = {model.getRowCount()+1,"",""};
        model.addRow(aux);
    }//GEN-LAST:event_insertarFActionPerformed

    private void eliminarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFActionPerformed
        hoja.eliminarFila();
        hoja.imprimirHoja();

        DefaultTableModel model2 = (DefaultTableModel) Table.getModel();
        model2.removeRow(Table.getSelectedRow());
        
    }//GEN-LAST:event_eliminarFActionPerformed

    private void insertarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarCMouseClicked
        
    }//GEN-LAST:event_insertarCMouseClicked

    private void insertarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarCActionPerformed
        hoja.insertarColumna();
        hoja.imprimirHoja();
        DefaultTableModel mod = (DefaultTableModel) Table.getModel();
        TableColumn c = new TableColumn(mod.getColumnCount()-1);
        c.setHeaderValue("K");
        Table.getColumnModel().addColumn(c);
        
    }//GEN-LAST:event_insertarCActionPerformed

    private void eliminarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarCMouseClicked
        
    }//GEN-LAST:event_eliminarCMouseClicked

    private void eliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCActionPerformed
        int x = (Table.getSelectedColumn());
        hoja.eliminarColumna();
        hoja.imprimirHoja();

        Table.removeColumn(Table.getColumnModel().getColumn(Table.getSelectedColumn()));
    }//GEN-LAST:event_eliminarCActionPerformed

    private void RenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenombrarActionPerformed
        ImageIcon icon = new ImageIcon("ask.png");
        String cambio = (String)JOptionPane.showInputDialog(new JFrame(),"Introduzca el nuevo nombre de la hoja", null, JOptionPane.INFORMATION_MESSAGE,icon, null,"");
        jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(), cambio);   
        hoja.setNombre(cambio); 
        hoja.imprimirHoja();
        
    }//GEN-LAST:event_RenombrarActionPerformed

    private void CrearHojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearHojaActionPerformed
        libro.insertarFinal(crearHoja());
        
        hoja = hoja.getProximo();
        hoja.imprimirHoja();
        
        //interfaz.setVisible(false);
        new Interfaz(texto).setVisible(true);
        
        
        /*NuevaHoja nuevaInterfaz = new NuevaHoja();
        nuevaInterfaz.setVisible(true);*/
    }//GEN-LAST:event_CrearHojaActionPerformed

    private void CrearHojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearHojaMouseClicked
        
    }//GEN-LAST:event_CrearHojaMouseClicked

    private void TableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyTyped
    }//GEN-LAST:event_TableKeyTyped

    private void TableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
        String data;
        
            data = (String)Table.getValueAt(y, x);
        
        
        hoja.insertarData(x, y, data);
      
          hoja.imprimirHoja();
    }
    }//GEN-LAST:event_TableKeyPressed

    private void TableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TableFocusGained
    }//GEN-LAST:event_TableFocusGained
    private void TableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TableFocusLost
    }//GEN-LAST:event_TableFocusLost

    private void nuevaCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaCeldaActionPerformed
        // TODO add your handling code here:
        int b = Table.getSelectedRow();
        hoja.nuevaCelda(b);
    }//GEN-LAST:event_nuevaCeldaActionPerformed

       
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
  
        String data = (String)Table.getValueAt(y, x);
        
        hoja.insertarData(x, y, data);
        hoja.imprimirHoja();
        
    }//GEN-LAST:event_guardarActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked

         x = Table.columnAtPoint(evt.getPoint());
         y = Table.rowAtPoint(evt.getPoint());
      
    }//GEN-LAST:event_TableMouseClicked
    private void elminarCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elminarCeldaActionPerformed
        int a = Table.getSelectedRow();
        hoja.eliminarCelda(a);
    }//GEN-LAST:event_elminarCeldaActionPerformed

    private void finaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finaleActionPerformed
        ImageIcon icon = new ImageIcon("perro.jpg");
        //JOptionPane.showConfirmDialog(new JFrame(), "Profe, sera compasiva corrigiendo los parciales?", null, JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);

        int reply = JOptionPane.showConfirmDialog(null, "¿Profe, sera compasiva corrigiendo?", null, JOptionPane.YES_NO_OPTION, 0, icon);

        if (reply == JOptionPane.YES_OPTION)
        {
            ImageIcon icon2 = new ImageIcon("aplauso.jpg");
            JOptionPane.showMessageDialog(null, "¡¡¡ Es un chiste, pero igual gracias por probar !!!", null, JOptionPane.INFORMATION_MESSAGE, icon2);
        }
        else
        {
            int reply2 = JOptionPane.showConfirmDialog(null, "¿Profe, sera compasiva corrigiendo? ", null, JOptionPane.YES_NO_OPTION, 0, icon);

            if (reply2 == JOptionPane.YES_OPTION)
            {
                ImageIcon icon2 = new ImageIcon("aplauso.jpg");
                JOptionPane.showMessageDialog(null, "¡¡¡ Gracias !!!", null, JOptionPane.INFORMATION_MESSAGE, icon2);
            }
            else
            {
                int reply3 = JOptionPane.showConfirmDialog(null, "¿Profe, sera compasiva corrigiendo?", null, JOptionPane.YES_NO_OPTION, 0, icon);

                if (reply3 == JOptionPane.YES_OPTION)
                {
                    ImageIcon icon2 = new ImageIcon("aplauso.jpg");
                    JOptionPane.showMessageDialog(null, "¡¡¡ Gracias !!!", null, JOptionPane.INFORMATION_MESSAGE, icon2);
                }
                else
                {
                    int reply4 = JOptionPane.showConfirmDialog(null, "¿Profe, sera compasiva corrigiendo?", null, JOptionPane.YES_NO_OPTION, 0, icon);

                    if (reply4 == JOptionPane.YES_OPTION)
                    {
                        ImageIcon icon2 = new ImageIcon("aplauso.jpg");
                        JOptionPane.showMessageDialog(null, "¡¡¡ Gracias !!!", null, JOptionPane.INFORMATION_MESSAGE, icon2);
                    }
                    else
                    {

                    }      }      }        }      
    }//GEN-LAST:event_finaleActionPerformed

    private void deshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshacerActionPerformed
        
        hoja.deshacer();
    }//GEN-LAST:event_deshacerActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        
        texto = (String)Table.getValueAt(y, x);

    }//GEN-LAST:event_copiarActionPerformed
    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        // TODO add your handling code here:
        
        Table.setValueAt(texto, y, x);
        hoja.pegar(x, y, texto);
        hoja.insertarData(x, y, texto);
    }//GEN-LAST:event_pegarActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
        hoja = hoja.getAnterior();
        
        dispose();
        
    }//GEN-LAST:event_anteriorActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
              Interfaz interfaz = new Interfaz();

                interfaz.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearHoja;
    private javax.swing.JButton Renombrar;
    private javax.swing.JTable Table;
    private javax.swing.JButton anterior;
    private javax.swing.JButton copiar;
    private javax.swing.JButton deshacer;
    private javax.swing.JButton eliminarC;
    private javax.swing.JButton eliminarF;
    private javax.swing.JButton elminarCelda;
    private javax.swing.JButton finale;
    private javax.swing.JButton guardar;
    private javax.swing.JButton insertarC;
    private javax.swing.JButton insertarF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton nuevaCelda;
    private javax.swing.JButton pegar;
    // End of variables declaration//GEN-END:variables
}
