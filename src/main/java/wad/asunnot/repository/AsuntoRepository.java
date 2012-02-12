/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.asunnot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.asunnot.domain.Asunto;

/**
 *
 * @author kviiri
 */
public interface AsuntoRepository extends JpaRepository<Asunto, Long> {
    
}
