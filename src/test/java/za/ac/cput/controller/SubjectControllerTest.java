//package za.ac.cput.controller;
//
//
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.http.*;
//import za.ac.cput.domain.Student;
//import za.ac.cput.domain.Subject;
//import za.ac.cput.factory.SubjectFactory;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class SubjectControllerTest {
//    @LocalServerPort
//    private int port;
//    @Autowired
//    private SubjectController subjectController;
//    @Autowired private TestRestTemplate restTemplate;
//    private Subject subject;
//    private  String baseUrl;
//
//    @BeforeEach
//    void setUp() {
//        assertNotNull(subjectController);
//        this.subject = SubjectFactory
//                .build(12345,"MATH101");
//        this.baseUrl = "http://localhost:" + this.port +"Student_Management-ADP3-Group14/subject";
//    }
//
//    @Test
//    @Order(1)
//    void save() {
//        String url = baseUrl + "save_subject";
//        System.out.println(url);
//        ResponseEntity<Subject> response = this.restTemplate
//                .postForEntity(url, this.subject, Subject.class);
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
//        String url = baseUrl + "readSubject" + this.subject.getSubjectID();
//        System.out.println(url);
//        ResponseEntity<Subject> response = this.restTemplate.getForEntity(url,Subject.class);
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
//        String url = baseUrl + "delete/" + this.subject.getSubjectID();
//        this.restTemplate.delete(url);
//        assertAll(
//                () -> assertSame(12345, this.subject.getSubjectID()),
//                () -> assertNotNull(this.subject.getSubjectID()));
//
//    }
//
//    @Test
//    @Order(3)
//    void getAll() {
//        String url = baseUrl + "readAllStudents";
//        System.out.println(url);
//        ResponseEntity<Subject[]> response =
//                this.restTemplate.getForEntity(url, Subject[].class);
//        System.out.println(Arrays.asList(response.getBody()));
//        assertAll(
//                ()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                ()-> assertTrue(response.getBody().length == 0)
//        );
//
//    }
//
//    @Order(5)
//    @Test
//    void getSubjectByName() {
//        String url = baseUrl + "getSubjectByName";
//        ResponseEntity<Subject[]> response = this.restTemplate.getForEntity(url, Subject[].class);
//        System.out.println(Arrays.asList(response.getBody()));
//        assertAll(
//                ()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                ()-> assertTrue(response.getBody().length == 0)
//        );
//
//    }
//}
