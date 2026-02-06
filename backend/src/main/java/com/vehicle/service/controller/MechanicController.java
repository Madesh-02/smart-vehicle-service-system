@RestController
@RequestMapping("/mechanics")
@CrossOrigin("*")
public class MechanicController {

    @Autowired
    MechanicRepo repo;

    @GetMapping
    public List<Mechanic> all(){
        return repo.findAll();
    }
}
