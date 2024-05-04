package br.com.fiap.lojaToy.Repository;

import br.com.fiap.lojaToy.Models.Brinquedo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrinquedoRepository extends CrudRepository<Brinquedo, Long> {
}

