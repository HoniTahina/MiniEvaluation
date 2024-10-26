package com.groupeisi.evaluation.controller;

import com.groupeisi.evaluation.dto.CoursDto;
import com.groupeisi.evaluation.service.CoursService;
import com.groupeisi.evaluation.service.ICoursService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CoursController {
    private static final Logger logger = LoggerFactory.getLogger(CoursController.class);

    private ICoursService coursService;

    public CoursController(){
        this.coursService = new CoursService();
    }

    @GetMapping("/cours")
    public String showCours(Model model) {
        logger.info("CoursController - Méthode GET appelée pour afficher les Courss");

        try {
            Optional<List<CoursDto>> cours = coursService.findAll();
            if (cours.isPresent()) {
                logger.info("CoursController - Liste des Courss récupérée avec succès");
                model.addAttribute("coursList", cours.get());
            } else {
                logger.info("CoursController - Aucun Cours trouvé");
                model.addAttribute("coursList", new ArrayList<CoursDto>());
            }
        } catch (Exception e) {
            logger.error("CoursController - Erreur lors de la récupération des Courss", e);
        }

        return "cours";
    }

    @PostMapping("/cours")
    public String saveCours(
            @RequestParam("matiere") String matiere,
            @RequestParam("prof") String prof,
            @RequestParam("classe") String classe){

        CoursDto coursDto = new CoursDto();
        coursDto.setMatiere(matiere);
        coursDto.setProf(prof);
        coursDto.setClasse(classe);

        try {
            boolean coursSaved = coursService.save(coursDto);

            if (coursSaved) {
                logger.info("CoursController - Cours enregistré avec succès");
            } else {
                logger.warn("CoursController - Échec de l'enregistrement du Cours");
            }
        } catch (Exception e) {
            logger.error("CoursController - Erreur lors de l'enregistrement du Cours", e);
        }

        return "redirect:/cours";
    }
}
