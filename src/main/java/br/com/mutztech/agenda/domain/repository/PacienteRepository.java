package br.com.mutztech.agenda.domain.repository;

import br.com.mutztech.agenda.domain.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, UUID> {

   Optional<Paciente> findByCpf(String cpf);
}
