


        // [ " CRIADOR: LUIZ ÂNGELO MARTINS " ]:



// PACOTE DA CLASSE:
package randomnumber;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxRenderer;


public class RandomNumberFrame extends javax.swing.JFrame {

    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    Random aleatorio = new Random();
    BasicComboBoxRenderer.UIResource UIResource = new BasicComboBoxRenderer.UIResource();  
    
    
    // " INICIALIZADOR ":
    public RandomNumberFrame() {
        
        initComponents();
        ImageIcon icone = new ImageIcon(getClass().getResource("/icones/chart_pie_add.png"));
        setIconImage(icone.getImage());
        
        UIResource.setHorizontalAlignment(SwingConstants.CENTER);  
        txt_quantia_de_itens.setRenderer(UIResource);
        txt_intervalo_de_itens.setRenderer(UIResource);
        txt_quantia_de_itens.removeAllItems();
        txt_intervalo_de_itens.removeAllItems();
        txt_area_de_texto.setEditable(false);
        txt_botao_limpar.setEnabled(false);
        
        int contador_de_itens = 1;
        while ( contador_de_itens != 101 ) {
            
            txt_quantia_de_itens.addItem(String.valueOf(contador_de_itens));
            txt_intervalo_de_itens.addItem(String.valueOf(contador_de_itens));
            contador_de_itens++;
            
        }
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_painel_geral = new javax.swing.JPanel();
        txt_painel_de_rolagem = new javax.swing.JScrollPane();
        txt_area_de_texto = new javax.swing.JTextArea();
        txt_quantia_de_itens = new javax.swing.JComboBox<>();
        txt_botao_limpar = new javax.swing.JButton();
        txt_botao_gerar = new javax.swing.JButton();
        txt_intervalo_de_itens = new javax.swing.JComboBox<>();
        txt_barra_de_menu_principal = new javax.swing.JMenuBar();
        txt_menu_geral = new javax.swing.JMenu();
        txt_sub_item_sair = new javax.swing.JMenuItem();
        txt_menu_sobre = new javax.swing.JMenu();
        txt_sub_item_info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GERADOR DE NUMEROS");
        setResizable(false);

        txt_painel_geral.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "- EXIBIÇÃO GERAL -", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txt_painel_de_rolagem.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "- NUMEROS -", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txt_area_de_texto.setColumns(20);
        txt_area_de_texto.setRows(5);
        txt_painel_de_rolagem.setViewportView(txt_area_de_texto);

        txt_quantia_de_itens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txt_quantia_de_itens.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "- QUANTIDADE -", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txt_botao_limpar.setBackground(new java.awt.Color(153, 255, 153));
        txt_botao_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/chart_pie_delete.png"))); // NOI18N
        txt_botao_limpar.setText("LIMPAR");
        txt_botao_limpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txt_botao_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_botao_limparActionPerformed(evt);
            }
        });

        txt_botao_gerar.setBackground(new java.awt.Color(153, 255, 153));
        txt_botao_gerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/chart_pie_add.png"))); // NOI18N
        txt_botao_gerar.setText("GERAR");
        txt_botao_gerar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txt_botao_gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_botao_gerarActionPerformed(evt);
            }
        });

        txt_intervalo_de_itens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txt_intervalo_de_itens.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "- INTERVALO -", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout txt_painel_geralLayout = new javax.swing.GroupLayout(txt_painel_geral);
        txt_painel_geral.setLayout(txt_painel_geralLayout);
        txt_painel_geralLayout.setHorizontalGroup(
            txt_painel_geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_painel_geralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txt_painel_geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_painel_de_rolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(txt_painel_geralLayout.createSequentialGroup()
                        .addComponent(txt_botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_intervalo_de_itens, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txt_painel_geralLayout.createSequentialGroup()
                        .addComponent(txt_botao_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_quantia_de_itens, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txt_painel_geralLayout.setVerticalGroup(
            txt_painel_geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_painel_geralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_painel_de_rolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_painel_geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_botao_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quantia_de_itens, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txt_painel_geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_botao_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_intervalo_de_itens, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txt_menu_geral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/script_gear.png"))); // NOI18N
        txt_menu_geral.setText("GERAL");

        txt_sub_item_sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        txt_sub_item_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancel.png"))); // NOI18N
        txt_sub_item_sair.setText("SAIR");
        txt_sub_item_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sub_item_sairActionPerformed(evt);
            }
        });
        txt_menu_geral.add(txt_sub_item_sair);

        txt_barra_de_menu_principal.add(txt_menu_geral);

        txt_menu_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/information.png"))); // NOI18N
        txt_menu_sobre.setText("SOBRE");

        txt_sub_item_info.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        txt_sub_item_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/error.png"))); // NOI18N
        txt_sub_item_info.setText("INFO");
        txt_sub_item_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sub_item_infoActionPerformed(evt);
            }
        });
        txt_menu_sobre.add(txt_sub_item_info);

        txt_barra_de_menu_principal.add(txt_menu_sobre);

        setJMenuBar(txt_barra_de_menu_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_painel_geral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_painel_geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // BOTÃO LIMPAR:
    private void txt_botao_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_botao_limparActionPerformed
        
        txt_botao_limpar.setEnabled(false);
        txt_area_de_texto.setText(null);
        txt_quantia_de_itens.setSelectedIndex(0);
        txt_intervalo_de_itens.setSelectedIndex(0);
        
    }//GEN-LAST:event_txt_botao_limparActionPerformed

    
    // SUB ITEM DE MENU - SAIR - [ MENU GERAL ]:
    private void txt_sub_item_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sub_item_sairActionPerformed
        
        int confirmar_sair = 0;
        confirmar_sair = 0;
        confirmar_sair = JOptionPane.showConfirmDialog(null, "REALMENTE DESEJA SAIR ?");

        if ( confirmar_sair == 0 ) {

            this.dispose();

        }

    }//GEN-LAST:event_txt_sub_item_sairActionPerformed

    
    // SUB ITEM DE MENU - INFO - [ MENU SOBRE ]:
    private void txt_sub_item_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sub_item_infoActionPerformed
        
        JOptionPane.showMessageDialog(null, "PROGRAMA SIMPLES PARA GERAR NÚMEROS ALEATÓRIOS.", "INFORMAÇÃO", 1);
        
    }//GEN-LAST:event_txt_sub_item_infoActionPerformed

    
    // BOTÃO GERAR:
    private void txt_botao_gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_botao_gerarActionPerformed
        
        // VARIAVEIS:
        int quantia_a_gerar = txt_quantia_de_itens.getSelectedIndex() + 1;
        int limite_gerador = txt_intervalo_de_itens.getSelectedIndex() + 1;
        int aux0 = 0;
        int repetidor1 = 0;
        int repetidor2 = 0;
        int vetor_numero[] = new int[quantia_a_gerar];
        String texto_numeros = "";
        
            // GERANDO O VETOR:
            while( repetidor1 != quantia_a_gerar ) {
                
                vetor_numero[repetidor1] = aleatorio.nextInt(limite_gerador);
                repetidor1++;
                
            }
            
            
            // ORDENANDO O VETOR:
            for ( int aux1 = 0; aux1 < vetor_numero.length; aux1++ ) {
                
                for ( int aux2 = 0; aux2 < vetor_numero.length; aux2++) {
                    
                    if ( vetor_numero[aux1] < vetor_numero[aux2] ) {
                        
                        aux0 = vetor_numero[aux1];
                        vetor_numero[aux1] = vetor_numero[aux2];
                        vetor_numero[aux2] = aux0;
                        
                    }
                    
                }
                
            }
               
            
            // EXIBINDO OS VALORES:
            while( repetidor2 != vetor_numero.length ) {
                
                texto_numeros = texto_numeros + "\n" + "ALEATÓRIO [ " + ( repetidor2 + 1 ) + " ] - " + vetor_numero[repetidor2]; 
                txt_area_de_texto.setText(texto_numeros);
                repetidor2++;
                
            }
            
            texto_numeros = texto_numeros + "\n\n" + "NUMEROS GERADOS COM SUCESSO!";
            txt_area_de_texto.setText(texto_numeros);
            txt_botao_limpar.setEnabled(true);
        
    }//GEN-LAST:event_txt_botao_gerarActionPerformed

    
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
            java.util.logging.Logger.getLogger(RandomNumberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomNumberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomNumberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomNumberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandomNumberFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea txt_area_de_texto;
    private javax.swing.JMenuBar txt_barra_de_menu_principal;
    private javax.swing.JButton txt_botao_gerar;
    private javax.swing.JButton txt_botao_limpar;
    private javax.swing.JComboBox<String> txt_intervalo_de_itens;
    private javax.swing.JMenu txt_menu_geral;
    private javax.swing.JMenu txt_menu_sobre;
    private javax.swing.JScrollPane txt_painel_de_rolagem;
    private javax.swing.JPanel txt_painel_geral;
    private javax.swing.JComboBox<String> txt_quantia_de_itens;
    private javax.swing.JMenuItem txt_sub_item_info;
    private javax.swing.JMenuItem txt_sub_item_sair;
    // End of variables declaration//GEN-END:variables
}




