//package za.ac.cput.controller;
//
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.http.*;
//import za.ac.cput.domain.Student;
//import za.ac.cput.domain.user;
//import za.ac.cput.factory.StudentFactory;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class StudentControllerTest {
//    @LocalServerPort
//    private int port;
//    @Autowired
//    private StudentController studentController;
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private Student student;
//    private String baseUrl;
//
//    @BeforeEach
//    void setUp() {
//        assertNotNull(studentController);
//        this.student = StudentFactory
//                .build(123456,"test-id","test-email","test-address","test-user","test-pass","test-school",0);
//        this.baseUrl = "http://localhost:" + this.port +"Student_Management-ADP3-Group14/student";
//    }
//
//    @Test
//    @Order(1)
//    void save() {
//        String url = baseUrl + "save_student";
//        System.out.println(url);
//        ResponseEntity<Student> response = this.restTemplate
//                .postForEntity(url, this.student, Student.class);
//        System.out.println(response);
//        assertAll(
//                ()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                ()-> assertNotNull(response.getBody())
//        );
//    }
//
//    @Test
//    @Order(2)
//    void read() {
//        String url = baseUrl + "readStudent" + this.student.getStudentID();
//        System.out.println(url);
//        ResponseEntity<Student> response = this.restTemplate.getForEntity(url,Student.class);
//        System.out.println(response);
//        assertAll(
//                ()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                ()-> assertNotNull(response.getBody())
//        );
//    }
//
//    @Test
//    @Order(4)
//    void delete() {
//        String url = baseUrl + "deleteStudent/" + this.student.getStudentID();
//        this.restTemplate.delete(url);
//        assertAll(
//                () -> assertSame(123456, this.student.getStudentID()),
//                () -> assertNotNull(this.student.getStudentID()));
//
//    }
//
//
//    @Test
//    @Order(3)
//    void getAll()
//    {
//        String url = baseUrl + "readAllStudents";
//        System.out.println(url);
//        ResponseEntity<Student[]> responseEntity = this.restTemplate.getForEntity(url, Student[].class);
//        System.out.println(Arrays.asList(responseEntity.getBody()));
//        assertAll(
//                () -> assertEquals(HttpStatus.OK, responseEntity.getStatusCode()),
//                () -> assertTrue(responseEntity.getBody().length == 0));
//    }
//
//    @Order(5)
//    @Test
//    void getStudentsByID() {
//        String url = baseUrl + "getStudentsByID";
//        ResponseEntity<Student[]> response = this.restTemplate.getForEntity(url, Student[].class);
//        System.out.println(Arrays.asList(response.getBody()));
//        assertAll(
//                ()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                ()-> assertTrue(response.getBody().length == 0)
//        );
//
//    }
//}
//
