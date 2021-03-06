package elotech.teste.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import elotech.teste.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
	
	List<Contato> findAllByOrderByNameAsc();
	

}
