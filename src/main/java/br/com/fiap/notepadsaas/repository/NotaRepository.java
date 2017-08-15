package br.com.fiap.notepadsaas.repository;

import br.com.fiap.notepadsaas.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by danilopereira on 08/08/17.
 */
public interface NotaRepository extends MongoRepository<Nota, String>{

    List<Nota> findByTitulo(String titulo);
}
