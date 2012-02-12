/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.asunnot.service;

import java.util.List;
import wad.asunnot.domain.Asunto;

/**
 *
 * @author kviiri
 */
public interface AsuntoService {
    void create(Asunto asunto);
    Asunto getById(Long id);
    List<Asunto> list();
    
}
