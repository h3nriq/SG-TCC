/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import dao.AlunoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sg.tcc.Aluno;

/**
 *
 * @author paulo
 */
public class jifReadAluno extends javax.swing.JInternalFrame {

    private DefaultTableModel tabelaAluno;



    /**
     * Creates new form jifReadAluno
     */
    public jifReadAluno() {
        initComponents();
        tabelaAluno = (DefaultTableModel) jTable2.getModel();
        tabelaAluno.setRowCount(0);
        tabelaAluno.setColumnCount(0);
        tabelaAluno.addColumn("ID");
        tabelaAluno.addColumn("Nome");
        tabelaAluno.addColumn("Matrícula");
        tabelaAluno.addColumn("E-mail");
        tabelaAluno.addColumn("Telefone");

        AlunoDAO dao = new AlunoDAO();
        List<Aluno> listaAluno = dao.readLista();
        for (Aluno aluno : listaAluno) {
            tabelaAluno.addRow(new Object[]{
  				aluno.getId(),
  				aluno.getNome(),
  				aluno.getNrMatricula(),
  				aluno.getEmail(),
  				aluno.getTelefone()
  				});
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

        jPanel1 = new javax.swing.JPanel();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Lista de Aluno");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Alunos"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jTable2.setModel(tabelaAluno);
        jPanel1.add(jTable2, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
