
package view;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.crud;
import model.dao.crudDAO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class ViewJTable extends javax.swing.JFrame {

   
    public ViewJTable() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTPessoas.getModel();
        jTPessoas.setRowSorter(new TableRowSorter(modelo));

        listarJTable();

    }

    public void listarJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTPessoas.getModel();
        //EVITA DUPLICAÇÃO
        modelo.setNumRows(0);
        crudDAO pdao = new crudDAO();

        //PASSANDO OS VALORES PARA A TABELA GRAFICA
        for (crud p : pdao.Listar()) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getIdade(),
                p.getUf(),
                p.getCpf(),
                p.getDatadeaniversario(),
                p.getNomedamae(),
                p.getUltimolocaltrabalhado(),
                p.getcargoesperado(),
                p.getExperiencia(),
                p.getEscolaridade(),
                p.getendereco()
            });

        }

    }
    public void readJTableForDesc(String nom) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTPessoas.getModel();
        modelo.setNumRows(0);
        crudDAO pdao = new crudDAO();

        for (crud p : pdao.listarNome(nom)) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getIdade(),
                p.getUf(),
                p.getCpf(),
                p.getDatadeaniversario(),
                p.getNomedamae(),
                p.getUltimolocaltrabalhado(),
                p.getcargoesperado(),
                p.getExperiencia(),
                p.getEscolaridade(),
                p.getendereco()
                
            });

        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNom = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        txtUf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        experiencia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nomedamae = new javax.swing.JTextField();
        nomedopai = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        carteiradetrabalho = new javax.swing.JTextField();
        identidadedegenero = new javax.swing.JTextField();
        escolaridade = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cargoesperado = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ultimolocaltrabalhado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPessoas = new javax.swing.JTable();
        datadeaniversario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        proximaetapa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CPF");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("AGE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("UF");

        jButton1.setBackground(new java.awt.Color(0, 128, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(248, 248, 255));
        jButton2.setText("EXCLUIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ATUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("GERAR PDF");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("NAME");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("ADDRESS");

        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        experiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experienciaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("EXPERIENCES");

        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("FATHER'S NAME");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("FONE");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("MOTHER'S NAME");

        nomedopai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomedopaiActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("GENDER IDENTITY");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("WORK CARD");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("EDUCATION");

        carteiradetrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carteiradetrabalhoActionPerformed(evt);
            }
        });

        identidadedegenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identidadedegeneroActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("POSITION APPLIED");

        cargoesperado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoesperadoActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("LAST COMPANY WORKED");

        ultimolocaltrabalhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimolocaltrabalhadoActionPerformed(evt);
            }
        });

        jTPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "CPF", "ADDRESS", "UF", "EXPERIENCES", "FATHER'S NAME", "MOTHER'S NAME", "AGE", "WORK CARD", "GENDER IDENTITY", "EDUCATION", "TELEPHONE", "POSITION APPLIED", "LAST COMPANY WORKED"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPessoasMouseClicked(evt);
            }
        });
        jTPessoas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPessoasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTPessoas);

        datadeaniversario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datadeaniversarioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("birth date");

        proximaetapa.setText("Proxima Etapa");
        proximaetapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximaetapaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(proximaetapa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addComponent(jLabel24)
                            .addComponent(jLabel21)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefone, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addComponent(nomedamae)
                            .addComponent(escolaridade, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(cargoesperado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carteiradetrabalho)
                                    .addComponent(cpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ultimolocaltrabalhado))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel5))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(identidadedegenero, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addGap(11, 11, 11)
                                                .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(datadeaniversario)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton1))))))))
                            .addComponent(experiencia)
                            .addComponent(nomedopai))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datadeaniversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(carteiradetrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(cargoesperado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel19)
                            .addComponent(identidadedegenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(ultimolocaltrabalhado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(nomedopai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(nomedamae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(escolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(proximaetapa)
                        .addContainerGap())
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPessoasMouseClicked
        // TODO add your handling code here:

        if (jTPessoas.getSelectedRow() != -1) {

            txtNom.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 1).toString());
            idade.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 2).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 3).toString());
            cpf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 4).toString());
            telefone.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 5).toString());
            endereco.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 6).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 7).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 8).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 9).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 10).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 11).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 12).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 13).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 14).toString());
            
            

        }

    }//GEN-LAST:event_jTPessoasMouseClicked

    private void jTPessoasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPessoasKeyReleased
        // TODO add your handling code here:

        if (jTPessoas.getSelectedRow() != -1) {

            txtNom.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 1).toString());
            idade.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 2).toString());
            txtUf.setText(jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 3).toString());
            

        }

    }//GEN-LAST:event_jTPessoasKeyReleased

    private void ultimolocaltrabalhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimolocaltrabalhadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ultimolocaltrabalhadoActionPerformed

    private void cargoesperadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoesperadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoesperadoActionPerformed

    private void identidadedegeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identidadedegeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identidadedegeneroActionPerformed

    private void carteiradetrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carteiradetrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carteiradetrabalhoActionPerformed

    private void nomedopaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomedopaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomedopaiActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void experienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experienciaActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Connection conn = ConnectionFactory.getConnection();

        String src = "DadosPessoa.jasper";
        JasperPrint jaspertPrint = null;

        try {
            jaspertPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (JRException ex) {
            System.out.println("Error: "+ex);
        }

        JasperViewer view = new JasperViewer(jaspertPrint,false);

        view.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        if (jTPessoas.getSelectedRow() != -1) {

            crud p = new crud();
            crudDAO dao = new crudDAO();

            p.setNome(txtNom.getText());
            p.setIdade(Integer.parseInt(idade.getText()));
            p.setUf(txtUf.getText());
            p.setId((int) jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 0));
            dao.atualizar(p);

            txtNom.setText("");
            idade.setText("");
            txtUf.setText("");

            listarJTable();

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //
        if (jTPessoas.getSelectedRow() != -1) {

            crud p = new crud();
            crudDAO dao = new crudDAO();

            p.setId((int) jTPessoas.getValueAt(jTPessoas.getSelectedRow(), 0));

            dao.delete(p);

            txtNom.setText("");
            idade.setText("");
            txtUf.setText("");

            listarJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        crud p = new crud();
        crudDAO dao = new crudDAO();

        p.setNome(txtNom.getText());
        p.setIdade(Integer.parseInt(idade.getText()));
        p.setUf(txtUf.getText());
        p.setcargoesperado(cargoesperado.getText());
        p.setUltimolocaltrabalhado(ultimolocaltrabalhado.getText());
        p.settelefone(Integer.valueOf(telefone.getText()));
        p.setendereco(endereco.getText());
        p.setCpf(cpf.getText());
        p.setNomedopai(nomedopai.getText());
        p.setNomedamae(nomedamae.getText());
        p.setEscolaridade(escolaridade.getText());
        p.setcarteiradetrabalho(Integer.valueOf(carteiradetrabalho.getText()));
        p.setExperiencia(experiencia.getText());
        p.setIdentidadedegenero(identidadedegenero.getText());
        p.setDatadeaniversario(Integer.valueOf(datadeaniversario.getText()));
        
        
        
        
        
        
        
        dao.crud(p);

        txtNom.setText("");
        idade.setText("");
        txtUf.setText("");
        cargoesperado.setText("");
        cpf.setText("");
         
        

        listarJTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void datadeaniversarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datadeaniversarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datadeaniversarioActionPerformed

    private void proximaetapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximaetapaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proximaetapaActionPerformed

  
    public static void main(String args[]) {
     
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewJTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cargoesperado;
    private javax.swing.JTextField carteiradetrabalho;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField datadeaniversario;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField escolaridade;
    private javax.swing.JTextField experiencia;
    private javax.swing.JTextField idade;
    private javax.swing.JTextField identidadedegenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPessoas;
    private javax.swing.JTextField nomedamae;
    private javax.swing.JTextField nomedopai;
    private javax.swing.JButton proximaetapa;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtUf;
    private javax.swing.JTextField ultimolocaltrabalhado;
    // End of variables declaration//GEN-END:variables
}
