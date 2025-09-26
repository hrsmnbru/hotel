package controller.buscas;

import controller.cadastros.ControllerCadHospede;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaHospede;

public class ControllerBuscaHospede implements ActionListener {
    TelaBuscaHospede telaBuscaHospede;

    public ControllerBuscaHospede(TelaBuscaHospede telaBuscaHospede) {
        this.telaBuscaHospede = telaBuscaHospede;
        
        this.telaBuscaHospede.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaHospede.getjButtonCarregar().addActionListener(this);
        this.telaBuscaHospede.getjButtonCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaHospede.getjButtonCarregar()) {
            if (this.telaBuscaHospede.getjTableDados().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado selecionado.");
            } else {
                JOptionPane.showMessageDialog(null, "Aguarde, carregando dados");
                ControllerCadHospede.codigo = (int)this.telaBuscaHospede.getjTableDados().getValueAt(this.telaBuscaHospede.getjTableDados().getSelectedRow(), 0);
                this.telaBuscaHospede.dispose();
            }
        } else if (e.getSource() == this.telaBuscaHospede.getjButtonFiltrar()) {
            JOptionPane.showMessageDialog(null, "Aguarde, filtrando dados");
            if (this.telaBuscaHospede.getjTextFieldFiltro().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Nenhum filtro inserido.");
            } else {
                if (this.telaBuscaHospede.getjComboBoxFiltro().getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por ID");
                } else if (this.telaBuscaHospede.getjComboBoxFiltro().getSelectedIndex() == 1) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por nome");
                } else if (this.telaBuscaHospede.getjComboBoxFiltro().getSelectedIndex() == 2) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por CPF");
                } else if (this.telaBuscaHospede.getjComboBoxFiltro().getSelectedIndex() == 3) {
                    JOptionPane.showMessageDialog(null, "Filtrando hóspedes por cidade");
                } 
            }
        } else if (e.getSource() == this.telaBuscaHospede.getjButtonCancelar()) {
            this.telaBuscaHospede.dispose();
        }
    }
}
