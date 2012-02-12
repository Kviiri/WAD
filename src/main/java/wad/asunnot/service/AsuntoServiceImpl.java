/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.asunnot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.asunnot.domain.Asunto;
import wad.asunnot.repository.AsuntoRepository;

/**
 *
 * @author kviiri
 */
@Service
public class AsuntoServiceImpl implements AsuntoService {

    @Autowired
    AsuntoRepository repo;
    
    @Transactional
    @Override
    public void create(Asunto asunto) {
        repo.saveAndFlush(asunto);
    }

    @Override
    public List<Asunto> list() {
        return repo.findAll();
    }

    @Override
    public Asunto getById(Long id) {
        return repo.findOne(id);
    }
    
}
