package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {

        if(Duration.between(LocalDateTime.now(), dados.data()).toMinutes() < 30) {
            throw new ValidacaoException("Consulta deve ser agendada com antecedencia minimoa de 30 minutos");
        }
    }
}
