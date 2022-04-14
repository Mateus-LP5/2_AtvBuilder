import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteBuilderTest {

    @Test
    void deveRetornarExcecaoParaPacienteSemMatricula(){
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setNomeConvenio("A")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Matrícula de conveniado inválida.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPacienteSemNomeConvenio(){
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setMatriculaConveniado(1)
                    .build();
            fail();
        }   catch (IllegalArgumentException e) {
            assertEquals("Nome de convênio inválido.", e.getMessage());
        }
    }

    @Test
    void deveRetornarPacienteValido(){
        PacienteBuilder pacienteBuilder = new PacienteBuilder();
        Paciente paciente = pacienteBuilder
                .setMatriculaConveniado(1)
                .setNomeConvenio("A")
                .build();

        assertNotNull(paciente);
    }
}