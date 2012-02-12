/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.asunnot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.asunnot.domain.Henkilo;
import wad.asunnot.repository.HenkiloRepository;


/**
 *
 * @author kviiri
 */
@Service
public class HenkiloServiceImpl implements HenkiloService {

    @Autowired
    HenkiloRepository repo;
    
    @Transactional
    @Override
    public void create(Henkilo henkilo) {
        
    }
    
}
