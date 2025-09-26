package controller.cadastros;

import controller.buscas.ControllerBuscaFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadFuncionario;
import view.TelaBuscaFuncionario;

public class ControllerCadFuncionario implements ActionListener {
    TelaCadFuncionario telaCadFuncionario;

    public ControllerCadFuncionario(TelaCadFuncionario telaCadFuncionario) {
        this.telaCadFuncionario = telaCadFuncionario;
        
        this.telaCadFuncionario.getjButtonNovo().addActionListener(this);
        this.telaCadFuncionario.getjButtonBuscar().addActionListener(this);
        this.telaCadFuncionario.getjButtonSalvar().addActionListener(this);
        this.telaCadFuncionario.getjButtonCancelar().addActionListener(this);
        this.telaCadFuncionario.getjButtonFechar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadFuncionario.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadFuncionario.getjPanelDados(), false);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadFuncionario.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadFuncionario.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadFuncionario.getjPanelDados(), true);
            
        }else if(e.getSource() == this.telaCadFuncionario.getjButtonBuscar()) {
            TelaBuscaFuncionario telaBuscaFuncionario = new TelaBuscaFuncionario(null, true);
            ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(telaBuscaFuncionario);
            telaBuscaFuncionario.setVisible(true);
            
        }else if(e.getSource() == this.telaCadFuncionario.getjButtonSalvar()) {
            utilities.Utilities.ativaDesativa(this.telaCadFuncionario.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadFuncionario.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadFuncionario.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadFuncionario.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadFuncionario.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadFuncionario.getjButtonFechar()) {
            this.telaCadFuncionario.dispose();
        }
    }
}