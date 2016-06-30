package br.com.leandro.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.leandro.model.Contato;
import br.com.leandro.repository.ContatoRepository;

@Controller
public class ContatoController {

	@Autowired
	ContatoRepository repository;
	
	@RequestMapping(value = "/contato", method = RequestMethod.GET)
    public String contatos(Model model) {
        List<Contato> contatos = (List<Contato>) repository.findAll();
        model.addAttribute("contatos", contatos);
        System.out.println("Contatos " + contatos.toString());
        return "contato/contatoList";
    }

    @RequestMapping(value = "/contato/new", method = RequestMethod.GET)
    public String initCreationForm(Model model) {
        Contato contato = new Contato();
        model.addAttribute("contato", contato);
        return "contato/contatoForm";
    }

    @RequestMapping(value = "/contato/new", method = RequestMethod.POST)
    public String processCreationForm(@Valid Contato contato, BindingResult result,
            SessionStatus status, RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            System.out.println("Contato in if");
            System.out.println("Contato " + result.toString());
            return "contato/contatoForm";
        } else {
            System.out.println("Contato in else");
            repository.save(contato);

            String msginfo = "<script>$(document).ready(function() {toastr.success('Contato incluído com sucesso !');});</script>";
            redirectAttributes.addFlashAttribute("msginfo", msginfo);

            status.setComplete();
            return "redirect:/contato";
        }
    }

    @RequestMapping(value = "/contato/{contatoId}/edit", method = RequestMethod.GET)
    public String initUpdateForm(@PathVariable("contatoId") int contatoId,
            Model model) {
        Contato contato = repository.findOne((long) contatoId);
        model.addAttribute("contato", contato);

        return "contato/contatoForm";
    }

    @RequestMapping(value = "/contato/{contatoId}/edit", method = RequestMethod.POST)
    public String processUpdateForm(@PathVariable("contatoId") int contatoId,
            @Valid Contato contato, BindingResult result, SessionStatus status,
            RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {

            return "contato/contatoForm";
        } else {
            Contato contatoUpdate = repository.findOne((long) contatoId);
            contatoUpdate.setNome(contato.getNome());
            contatoUpdate.setEmail(contato.getEmail());
            
            repository.save(contatoUpdate);

            String msginfo = "<script>$(document).ready(function() {toastr.success('Contato atualizado com sucesso !');});</script>";
            redirectAttributes.addFlashAttribute("msginfo", msginfo);

            status.setComplete();
            return "redirect:/contato";
        }
    }

    @RequestMapping(value = "/contato/{contatoId}/detail", method = RequestMethod.GET)
    public String detail(@PathVariable("contatoId") int contatoId, Model model) {
        Contato contato = repository.findOne((long) contatoId);
        model.addAttribute("contato", contato);

        return "contato/contatoDetail";
    }

    @RequestMapping(value = "/contato/{contatoId}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable("contatoId") int contatoId,
            SessionStatus status) {

        repository.delete((long) contatoId);
        status.setComplete();
        return "redirect:/contato";
    }
	
}
