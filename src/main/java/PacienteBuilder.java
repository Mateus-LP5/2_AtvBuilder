import java.util.Date;
import java.util.Locale;

public class PacienteBuilder {

    private Paciente paciente;

    public PacienteBuilder(){
        paciente = new Paciente();
    }

    public Paciente build() {
        if (paciente.getMatriculaConveniado() == 0) {
            throw new IllegalArgumentException("Matrícula de conveniado inválida.");
        }
        if (paciente.getNomeConvenio().equals("")) {
            throw new IllegalArgumentException("Nome de convênio inválido.");
        }
        return paciente;
    }

    public PacienteBuilder setNome(String nome) {
        paciente.setNome(nome);
        return this;
    }

    public PacienteBuilder setRg(String rg) {
        paciente.setRg(rg);
        return this;
    }

    public PacienteBuilder setCPF(String CPF) {
        paciente.setCPF(CPF);
        return this;
    }

    public PacienteBuilder setSexo(boolean sexo) {
        paciente.setSexo(sexo);
        return this;
    }

    public PacienteBuilder setDataNasc(Date dataNasc) {
        paciente.setDataNasc(dataNasc);
        return this;
    }

    public PacienteBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        paciente.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public PacienteBuilder setEnderecoNumero(int enderecoNumero) {
        paciente.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public PacienteBuilder setEnderecoComplemento(String enderecoComplemento) {
        paciente.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public PacienteBuilder setEnderecoBairro(String enderecoBairro) {
        paciente.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public PacienteBuilder setEnderecoCidade(String enderecoCidade) {
        paciente.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public PacienteBuilder setEnderecoUF(String enderecoUF) {
        paciente.setEnderecoUF(enderecoUF);
        return this;
    }

    public PacienteBuilder setCep(String cep) {
        paciente.setCep(cep);
        return this;
    }

    public PacienteBuilder setTelefone(String telefone) {
        paciente.setTelefone(telefone);
        return this;
    }

    public PacienteBuilder setNomeConvenio(String nomeConvenio) {
        paciente.setNomeConvenio(nomeConvenio);
        return this;
    }

    public PacienteBuilder setMatriculaConveniado(int matriculaConveniado) {
        paciente.setMatriculaConveniado(matriculaConveniado);
        return this;
    }
}
