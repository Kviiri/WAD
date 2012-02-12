/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.asunnot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.asunnot.domain.Henkilo;

/**
 *
 * @author kviiri
 */
public interface HenkiloRepository extends JpaRepository<Henkilo, Long> {
    
}
