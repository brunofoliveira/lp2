    private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {                                           
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        int rowSelected = tableUsuarios.getSelectedRow();

        inputNome.setText(dtm.getValueAt(rowSelected, 0).toString());
        inputData.setText(dtm.getValueAt(rowSelected, 1).toString());
        inputTel.setText(dtm.getValueAt(rowSelected, 2).toString());
        inputEnd.setText(dtm.getValueAt(rowSelected, 3).toString());
    }                                          

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {                                              
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        tableUsuarios.getModel();
        int rowSelected = tableUsuarios.getSelectedRow();
        
        if (rowSelected == -1) {
            JOptionPane.showMessageDialog (this, "Selecione uma linha para removê-la");
        }
        else {
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover?", "Confirme sua operação: ", JOptionPane.YES_NO_OPTION);
            if(opcao == JOptionPane.YES_OPTION){
                dtm.removeRow(rowSelected);
             }
        }
    }                                             

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
   
        String Nome = inputNome.getText();
        String Data = inputData.getText();
        String Tel = inputTel.getText();
        String End = inputEnd.getText();
        
        if(Nome.equals("")||(Data.equals(""))||(Tel.equals(""))||(End.equals(""))){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
        }
        else{
            String Row [] = new String [] {Nome, Data, Tel, End};
            dtm.addRow(Row);
        }
    }                                               

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
    
        int RowSelected = tableUsuarios.getSelectedRow();
        
        if(RowSelected == -1){
            String Nome = inputNome.getText();
            String Data = inputData.getText();
            String Tel = inputTel.getText();
            String End = inputEnd.getText();
            if (Nome.equals("") || (Data.equals("")) || (Tel.equals("")) || (End.equals(""))) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            }
            else{
                String Row [] = new String [] {Nome, Data, Tel, End};
                dtm.addRow(Row);
            }
        }
        else{
            dtm.setValueAt(inputNome.getText(), RowSelected, 0);
            dtm.setValueAt(inputData.getText(), RowSelected, 1);
            dtm.setValueAt(inputTel.getText(), RowSelected, 2);
            dtm.setValueAt(inputEnd.getText(), RowSelected, 3);
        
        }
    } 
