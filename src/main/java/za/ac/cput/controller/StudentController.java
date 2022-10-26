//package za.ac.cput.controller;
//
///* StudentController.java
//Author: Chante Lewis:216118395
//25/10/2022
// */
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//import za.ac.cput.domain.Student;
//import za.ac.cput.service.IStudentService;
//import javax.validation.Valid;
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("Student_Management-ADP3-Group14/student")
//@Slf4j
//public class StudentController {
//
//    private IStudentService repository;
//
//    @Autowired
//    StudentController(IStudentService repository) {
//        this.repository = repository;
//    }
//
//    @PostMapping("save_student")
//    public ResponseEntity<Student> save(@Valid @RequestBody Student saveStudent){
//        log.info("Save request: {}",saveStudent);
//
//        try{
//            Student newStudent = repository.save(saveStudent);
//            return ResponseEntity.ok(newStudent);
//
//        }catch(IllegalArgumentException e){
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
//        }
//    }
//
//    //Update
//    @PutMapping("update_student")
//    public ResponseEntity<Student> update(@Valid @RequestBody Student updateStudent){
//        try{
//            Student updatedStudent = this.repository.update(updateStudent);
//            return ResponseEntity.ok(updatedStudent);
//
//        }catch (IllegalArgumentException exception){
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
//        }
//    }
//
//    //Read
//    @GetMapping("readStudent/{studentID}")
//    public ResponseEntity<Optional<Student>> read(@PathVariable int studentID){
//        log.info("Read request: {}",studentID);
//
//        try {
//            Optional<Student> readStudent = repository.read(studentID);
//            return ResponseEntity.ok(readStudent);
//
//        }catch(IllegalArgumentException e){
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
//        }
//    }
//
//    //Delete student by id
//    @DeleteMapping("deleteStudent/{studentID}")
//    public ResponseEntity<Student> delete(@PathVariable int studentID){
//        log.info("Delete request: {}",studentID);
//        this.repository.deleteByID(studentID);
//        return ResponseEntity.noContent().build();
//
//    }
//
//    @GetMapping("readAllStudents")
//    public ResponseEntity<List<Student>> getAll(){
//        List<Student> list = this.repository.getAll();
//        return ResponseEntity.ok(list);
//    }
//
//}
//
//
