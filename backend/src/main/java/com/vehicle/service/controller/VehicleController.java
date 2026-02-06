@RestController
@RequestMapping("/vehicles")
@CrossOrigin("*")
public class VehicleController {

    @Autowired
    VehicleRepo repo;

    @PostMapping
    public Vehicle add(@RequestBody Vehicle v){
        return repo.save(v);
    }

    @GetMapping
    public List<Vehicle> all(){
        return repo.findAll();
    }
}
