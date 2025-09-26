package controller.buscas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaFuncionario;

public class ControllerBuscaFuncionario implements ActionListener {
    TelaBuscaFuncionario telaBuscaFuncionario;

    public ControllerBuscaFuncionario(TelaBuscaFuncionario telaBuscaFuncionario) {
        this.telaBuscaFuncionario = telaBuscaFuncionario;
        
        this.telaBuscaFuncionario.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaFuncionario.getjButtonCarregar().addActionListener(this);
        this.telaBuscaFuncionario.getjButtonCancelar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaFuncionario.getjButtonCarregar()) {
            if (this.telaBuscaFuncionario.getjTableDados().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado selecionado.");
            } else {
                JOptionPane.showMessageDialog(null, "Aguarde, carregando dados");
            }
        } else if (e.getSource() == this.telaBuscaFuncionario.getjButtonFiltrar()) {
            JOptionPane.showMessageDialog(null, "Aguarde, filtrando dados");
            if (this.telaBuscaFuncionario.getjTextFieldFiltro().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Nenhum filtro inserido.");
            } else {
                if (this.telaBuscaFuncionario.getjComboBoxFiltro().getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por ID");
                } else if (this.telaBuscaFuncionario.getjComboBoxFiltro().getSelectedIndex() == 1) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por nome");
                } else if (this.telaBuscaFuncionario.getjComboBoxFiltro().getSelectedIndex() == 2) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por CPF");
                } else if (this.telaBuscaFuncionario.getjComboBoxFiltro().getSelectedIndex() == 3) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por cidade");
                } 
            }
        } else if (e.getSource() == this.telaBuscaFuncionario.getjButtonCancelar()) {
            this.telaBuscaFuncionario.dispose();
        }
    }
}
