@Controller
public class EnergyReadingController {

    @Autowired
    private EnergyReadingRepository energyReadingRepository;

    @GetMapping("/energy-readings")
    public String showEnergyReadings(Model model) {
        List<EnergyReading> readings = energyReadingRepository
                .findAll(Sort.by("readingDate").descending().and(Sort.by("readingTime").descending()))
                .subList(0, 10);
        model.addAttribute("readings", readings);
        return "energy-readings";
    }

    // ... otros métodos de controlador para manejar otras solicitudes HTTP
}