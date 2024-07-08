import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Tạo một nhân viên mới
    @PostMapping("/")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    // Lấy tất cả nhân viên
    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }
}
