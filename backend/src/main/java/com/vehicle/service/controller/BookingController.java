@RestController
@RequestMapping("/bookings")
@CrossOrigin("*")
public class BookingController {

    @Autowired
    BookingRepo repo;

    @PostMapping
    public Booking book(@RequestBody Booking b){
        b.setStatus("Pending");
        return repo.save(b);
    }

    @GetMapping
    public List<Booking> list(){
        return repo.findAll();
    }
}

