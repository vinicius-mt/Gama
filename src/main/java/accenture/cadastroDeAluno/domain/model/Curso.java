package accenture.cadastroDeAluno.domain.model;

import lombok.Getter;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class Curso {

    @NonNull
    public List<Disciplinas> disciplina;

}
