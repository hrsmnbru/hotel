package controller.buscas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaVeiculo;

public class ControllerBuscaVeiculo implements ActionListener {
    TelaBuscaVeiculo telaBuscaVeiculo;

    public ControllerBuscaVeiculo(TelaBuscaVeiculo telaBuscaVeiculo) {
        this.telaBuscaVeiculo = telaBuscaVeiculo;
        
        this.telaBuscaVeiculo.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaVeiculo.getjButtonCarregar().addActionListener(this);
        this.telaBuscaVeiculo.getjButtonCancelar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaVeiculo.getjButtonCarregar()) {
            if (this.telaBuscaVeiculo.getjTableDados().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado selecionado.");
            } else {
                JOptionPane.showMessageDialog(null, "Aguarde, carregando dados");
            }
        } else if (e.getSource() == this.telaBuscaVeiculo.getjButtonFiltrar()) {
            JOptionPane.showMessageDialog(null, "Aguarde, filtrando dados");
            if (this.telaBuscaVeiculo.getjTextFieldFiltro().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Nenhum filtro inserido.");
            } else {
                if (this.telaBuscaVeiculo.getjComboBoxFiltro().getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por ID");
                } else if (this.telaBuscaVeiculo.getjComboBoxFiltro().getSelectedIndex() == 1) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por nome");
                } else if (this.telaBuscaVeiculo.getjComboBoxFiltro().getSelectedIndex() == 2) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por CPF");
                } else if (this.telaBuscaVeiculo.getjComboBoxFiltro().getSelectedIndex() == 3) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por cidade");
                } 
            }
        } else if (e.getSource() == this.telaBuscaVeiculo.getjButtonCancelar()) {
            this.telaBuscaVeiculo.dispose();
        }
    }
}
