@Entity
public class EnergyReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reading_date")
    private LocalDate readingDate;

    @Column(name = "reading_time")
    private LocalTime readingTime;

    @Column(name = "energy_consumption")
    private double energyConsumption;

    // ... getters and setters
}