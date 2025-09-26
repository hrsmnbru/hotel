package controller.cadastros;

import controller.buscas.ControllerBuscaHospede;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.bo.Hospede;
import view.TelaCadHospede;
import view.TelaBuscaHospede;

public class ControllerCadHospede implements ActionListener {

    TelaCadHospede telaCadHospede;
    public static int codigo;

    public ControllerCadHospede(TelaCadHospede telaCadHospede) {
        this.telaCadHospede = telaCadHospede;

        this.telaCadHospede.getjButtonNovo().addActionListener(this);
        this.telaCadHospede.getjButtonBuscar().addActionListener(this);
        this.telaCadHospede.getjButtonSalvar().addActionListener(this);
        this.telaCadHospede.getjButtonCancelar().addActionListener(this);
        this.telaCadHospede.getjButtonFechar().addActionListener(this);

        utilities.Utilities.ativaDesativa(this.telaCadHospede.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadHospede.getjPanelDados(), false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadHospede.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadHospede.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadHospede.getjPanelDados(), true);
            
            this.telaCadHospede.getjTextFieldId().setEnabled(false);
            
            java.util.Date dataAtual = new Date();
            SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            String novaData = dataFormatada.format(dataAtual);
            this.telaCadHospede.getjFormattedTextFieldDataCadastro().setText(novaData);
            this.telaCadHospede.getjFormattedTextFieldDataCadastro().setEnabled(false);
        } else if (e.getSource() == this.telaCadHospede.getjButtonBuscar()) {
            codigo = 0;

            TelaBuscaHospede telaBuscaHospede = new TelaBuscaHospede(null, true);
            ControllerBuscaHospede controllerBuscaHospede = new ControllerBuscaHospede(telaBuscaHospede);
            telaBuscaHospede.setVisible(true);

            if (codigo != 0) {
                utilities.Utilities.ativaDesativa(this.telaCadHospede.getjPanelBotoes(), false);
                utilities.Utilities.ativaDesativa(this.telaCadHospede.getjPanelDados(), true);

                this.telaCadHospede.getjTextFieldId().setText(codigo + "");
                this.telaCadHospede.getjTextFieldId().setEnabled(false);

                Hospede hospede = new Hospede();
                hospede = service.HospedeService.Carregar(codigo);

                this.telaCadHospede.getjFormattedTextFieldCep().setText(hospede.getCep());
                this.telaCadHospede.getjFormattedTextFieldCnpj().setText(hospede.getCnpj());
                this.telaCadHospede.getjFormattedTextFieldCpf().setText(hospede.getCpf());
                this.telaCadHospede.getjFormattedTextFieldDataCadastro().setText(hospede.getDataCadastro());
                this.telaCadHospede.getjFormattedTextFieldFone1().setText(hospede.getFone1());
                this.telaCadHospede.getjFormattedTextFieldFone2().setText(hospede.getFone2());
                this.telaCadHospede.getjFormattedTextFieldInscricaoEstadual().setText(hospede.getInscricaoEstadual());
                this.telaCadHospede.getjFormattedTextFieldRg().setText(hospede.getRg());
                this.telaCadHospede.getjTextFieldBairro().setText(hospede.getBairro());
                this.telaCadHospede.getjTextFieldCidade().setText(hospede.getCidade());
                this.telaCadHospede.getjTextFieldComplemento().setText(hospede.getComplemento());
                this.telaCadHospede.getjTextFieldContato().setText(hospede.getContato());
                this.telaCadHospede.getjTextFieldEmail().setText(hospede.getEmail());
                this.telaCadHospede.getjTextFieldLogradouro().setText(hospede.getLogradouro());
                this.telaCadHospede.getjTextFieldNome().setText(hospede.getNome());
                this.telaCadHospede.getjTextFieldObservacoes().setText(hospede.getObs());
                this.telaCadHospede.getjTextFieldRazaoSocial().setText(hospede.getRazaoSocial());

                this.telaCadHospede.getjTextFieldObservacoes().requestFocus();

            }
        } else if (e.getSource() == this.telaCadHospede.getjButtonSalvar()) {
            if (this.telaCadHospede.getjTextFieldNome().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Insira os dados obrigatórios *.");
                this.telaCadHospede.getjTextFieldNome().requestFocus();

            } else {
                JOptionPane.showMessageDialog(null, "mensagem teste primeiro else antes criar hospede");
                Hospede hospede = new Hospede();
                JOptionPane.showMessageDialog(null, "mensagem teste primeiro else depois criar hospede");
                hospede.setId(Integer.parseInt(this.telaCadHospede.getjTextFieldId().getText()));
                hospede.setNome(this.telaCadHospede.getjTextFieldNome().getText());
                hospede.setBairro(this.telaCadHospede.getjTextFieldBairro().getText());
                //completar com outros atributos exceto status
                JOptionPane.showMessageDialog(null, "mensagem teste primeiro else");

                if (this.telaCadHospede.getjTextFieldId().getText().trim().equalsIgnoreCase("")) {
                    hospede.setStatus('A');
                    service.HospedeService.Criar(hospede);
                    JOptionPane.showMessageDialog(null, "mensagem teste criar");
                } else {
                    hospede.setId(Integer.parseInt(this.telaCadHospede.getjTextFieldId().getText()));
                    service.HospedeService.Atualizar(hospede);
                    JOptionPane.showMessageDialog(null, "mensagem teste atualizar");
                }
                JOptionPane.showMessageDialog(null, "mensagem teste utilities");
                utilities.Utilities.ativaDesativa(this.telaCadHospede.getjPanelBotoes(), true);
                utilities.Utilities.limpaComponentes(this.telaCadHospede.getjPanelDados(), false);
            }

        } else if (e.getSource() == this.telaCadHospede.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadHospede.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadHospede.getjPanelDados(), false);

        } else if (e.getSource() == this.telaCadHospede.getjButtonFechar()) {
            this.telaCadHospede.dispose();
        }
    }
}
