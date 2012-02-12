package wad.asunnot.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wad.asunnot.domain.Asunto;
import wad.asunnot.domain.Henkilo;
import wad.asunnot.service.AsuntoService;
import wad.asunnot.service.HenkiloService;

/**
 *
 * @author kviiri
 */
@Controller
public class AsuntoController {

    @Autowired
    HenkiloService hs;
    @Autowired
    AsuntoService as;

    @RequestMapping(value = "lahetaIlmoitus", method = RequestMethod.POST)
    public String lahetaAsuntoIlmoitus(@ModelAttribute Asunto asunto, @ModelAttribute Henkilo henkilo) {
        as.create(asunto);
        hs.create(henkilo);
        henkilo.lisaaKohde(asunto);
        return "REDIRECT:/listaus";
    }

    @RequestMapping(value = "asunto/{asuntoID}", method = RequestMethod.GET)
    public String naytaAsunto(@PathVariable Long asuntoID, HttpSession session) {
        session.setAttribute("asunto", as.getById(asuntoID));
        return "asunto";
    }
    @RequestMapping(value = "listaus", method = RequestMethod.GET)
    public String listaaAsunnot(HttpSession session) {
        List<Asunto> asunnot = as.list();
        session.setAttribute("asunnot", asunnot);
        return "listaus";
    }
}
