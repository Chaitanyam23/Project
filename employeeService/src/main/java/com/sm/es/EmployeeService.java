package com.sm.es;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> listAll(){
		return repository.findAll();
	}
	public Employee get(Integer id) {
		return repository.findById(id).get();
	}
	public void save(Employee employee) {
		repository.save(employee);
	}
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
