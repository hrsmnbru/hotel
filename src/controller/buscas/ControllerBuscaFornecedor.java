package controller.buscas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaFornecedor;

public class ControllerBuscaFornecedor implements ActionListener {
    TelaBuscaFornecedor telaBuscaFornecedor;

    public ControllerBuscaFornecedor(TelaBuscaFornecedor telaBuscaFornecedor) {
        this.telaBuscaFornecedor = telaBuscaFornecedor;
        
        this.telaBuscaFornecedor.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaFornecedor.getjButtonCarregar()) {
            if (this.telaBuscaFornecedor.getjTableDados().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado selecionado.");
            } else {
                JOptionPane.showMessageDialog(null, "Aguarde, carregando dados");
            }
        } else if (e.getSource() == this.telaBuscaFornecedor.getjButtonFiltrar()) {
            JOptionPane.showMessageDialog(null, "Aguarde, filtrando dados");
            if (this.telaBuscaFornecedor.getjTextFieldFiltro().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Nenhum filtro inserido.");
            } else {
                if (this.telaBuscaFornecedor.getjComboBoxFiltro().getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por ID");
                } else if (this.telaBuscaFornecedor.getjComboBoxFiltro().getSelectedIndex() == 1) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por nome");
                } else if (this.telaBuscaFornecedor.getjComboBoxFiltro().getSelectedIndex() == 2) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por CPF");
                } else if (this.telaBuscaFornecedor.getjComboBoxFiltro().getSelectedIndex() == 3) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por cidade");
                } 
            }
        } else if (e.getSource() == this.telaBuscaFornecedor.getjButtonCancelar()) {
            this.telaBuscaFornecedor.dispose();
        }
    }
}