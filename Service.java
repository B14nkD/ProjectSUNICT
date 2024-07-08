import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Tạo một nhân viên mới
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Tìm tất cả nhân viên
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
