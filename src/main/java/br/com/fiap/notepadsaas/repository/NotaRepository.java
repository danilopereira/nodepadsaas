package br.com.fiap.notepadsaas.repository;

import br.com.fiap.notepadsaas.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by danilopereira on 08/08/17.
 */
public interface NotaRepository extends MongoRepository<Nota, String>{
}
