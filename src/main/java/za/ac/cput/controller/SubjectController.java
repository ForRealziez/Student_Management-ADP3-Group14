//package za.ac.cput.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//import za.ac.cput.domain.Student;
//import za.ac.cput.domain.Subject;
//import za.ac.cput.service.ISubjectService;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("Student_Management-ADP3-Group14/subject")
//@Slf4j
//public class SubjectController {
//
//    private ISubjectService repository;
//
//    @Autowired
//    public SubjectController( ISubjectService repository) {
//        this.repository = repository;
//    }
//
//    //Save student
//    @PostMapping("save_subject")
//    public ResponseEntity<Subject> save(@Valid @RequestBody Subject subject) {
//        log.info("Save request: {}", subject);
//        Subject save = repository.save(subject);
//        return ResponseEntity.ok(save);
//
//    }
//
//    //Update Subject
//    @PutMapping("update_subject")
//    public ResponseEntity<Subject> update(@Valid @RequestBody Subject updateSubject){
//        try{
//            Subject updatedSubject = this.repository.update(updateSubject);
//            return ResponseEntity.ok(updatedSubject);
//
//        }catch (IllegalArgumentException exception){
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
//        }
//    }
//
//
//    //Read subject by id
//    @GetMapping("readSubject/{subjectID}")
//    public ResponseEntity<Subject> read(@PathVariable int subjectID) {
//        log.info("Read request: {}", subjectID);
//        Subject subject = this.repository.read(String.valueOf(subjectID))
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//        return ResponseEntity.ok(subject);
//
//    }
//
//    //Delete subject by id
//    @DeleteMapping("deleteSubject/{subjectID}")
//    public ResponseEntity<Void> delete(@PathVariable int subjectID) {
//        log.info("Delete request: {}", subjectID);
//        this.repository.deleteByID(subjectID);
//        return ResponseEntity.noContent().build();
//    }
//
//    //Get all subjects
//    @GetMapping("readAllSubjects")
//    public ResponseEntity<List<Subject>> getAll() {
//        List<Subject> subject = this.repository.getAll();
//        return ResponseEntity.ok(subject);
//    }
//}