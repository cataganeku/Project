package de.ebcsoft.Project;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnergyReadingController {

    @Autowired
    private EnergyReadingRepository energyReadingRepository;

    @GetMapping("/energy-readings")
    public String showEnergyReadings(Model model) {
        var readings = energyReadingRepository
                .findAll(Sort.by("readingDate").descending().and(Sort.by("readingTime").descending()))
                .subList(0, 10);
        model.addText("readings");
        return "energy-readings";
    }

    // ... otros métodos de controlador para manejar otras solicitudes HTTP
}