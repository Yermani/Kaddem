package tn.esprit.coursdesoir.project.kaddem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.coursdesoir.project.kaddem.entities.Departement;
import tn.esprit.coursdesoir.project.kaddem.services.department.IDepartmentService;
import tn.esprit.coursdesoir.project.kaddem.services.etudiant.IEtudiantService;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentRestController {
    IDepartmentService departmentService;
    IEtudiantService etudiantService;

    // http://localhost:8089/kaddem/departement/retrieve-all-department
    @GetMapping("/retrieve-all-department")
    public List<Departement> getUniversites() {
        return departmentService.retrieveAllDepartement();
    }

    // http://localhost:8089/kaddem/department/retrieve-department/8
    @GetMapping("/retrieve-department/{department-id}")
    public Departement retrieveUniversite(@PathVariable("department-id") Integer departmentId) {
        return departmentService.retrieveDepartement(departmentId);
    }

    // http://localhost:8089/kaddem/department/add-department
    @PostMapping("/add-department")
    public Departement addUniversite(@RequestBody Departement u) {
        return departmentService.addDepartement(u);
    }

    // http://localhost:8089/kaddem/department/remove-department/1
    @DeleteMapping("/remove-department/{department-id}")
    public void removeUniversite(@PathVariable("department-id") Integer universiteId) {
        departmentService.removeDepartement(universiteId);
    }

    // http://localhost:8089/kaddem/department/update-department
    @PutMapping("/update-department")
    public Departement updateUniversite(@RequestBody Departement u) {
        return departmentService.updateDepartement(u);
    }

    // http://localhost:8089/kaddem/departement/assign-student-to-department/1/2
    @PutMapping("/assign-student-to-department/{student-id}/{department-id}")
    public void assignStudentToDepartment(
            @PathVariable("student-id") Integer studentId,
            @PathVariable("department-id") Integer departmentId
    ) {
        departmentService.assignEtudiantToDepartment(studentId, departmentId);
    }
}
