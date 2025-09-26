package controller.cadastros;

import controller.buscas.ControllerBuscaServico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadServico;
import view.TelaBuscaServico;

public class ControllerCadServico implements ActionListener {
    TelaCadServico telaCadServico;

    public ControllerCadServico(TelaCadServico telaCadServico) {
        this.telaCadServico = telaCadServico;
        
        this.telaCadServico.getjButtonNovo().addActionListener(this);
        this.telaCadServico.getjButtonBuscar().addActionListener(this);
        this.telaCadServico.getjButtonSalvar().addActionListener(this);
        this.telaCadServico.getjButtonCancelar().addActionListener(this);
        this.telaCadServico.getjButtonFechar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadServico.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadServico.getjPanelDados(), false);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadServico.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadServico.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadServico.getjPanelDados(), true);
            
        }else if(e.getSource() == this.telaCadServico.getjButtonBuscar()) {
            TelaBuscaServico telaBuscaServico = new TelaBuscaServico(null, true);
            ControllerBuscaServico controllerBuscaServico = new ControllerBuscaServico(telaBuscaServico);
            telaBuscaServico.setVisible(true);
            
        }else if(e.getSource() == this.telaCadServico.getjButtonSalvar()) {
            utilities.Utilities.ativaDesativa(this.telaCadServico.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadServico.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadServico.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadServico.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadServico.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadServico.getjButtonFechar()) {
            this.telaCadServico.dispose();
        }
    }
}