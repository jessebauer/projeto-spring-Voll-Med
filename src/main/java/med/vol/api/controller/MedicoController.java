package med.vol.api.controller;

import med.vol.api.medico.DadosCadastroMedico;
import med.vol.api.medico.Medico;
import med.vol.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired //Injeção de dependencias, auto instanciação feita pelo Spring
    private MedicoRepository repository;

    @PostMapping // Realizar post
    @Transactional // Transação ativa com banco de dados devido a inserção de dados nele
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
    repository.save(new Medico(dados));
    }
}
