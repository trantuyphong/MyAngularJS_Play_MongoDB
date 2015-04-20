/**
 * author: trinhtv3
 */


package services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public interface StudentService {

  public ArrayNode allStudents();
  
  public void createStudent();
  
  public ObjectNode getStudent(String id);
  
  public void doUpdateStudent(String id);
  
  public ObjectNode updateStudent(String id);
  
  public void deleteStudent(String id);
  
  public String checkLogin();
  
  public ArrayNode getBoyStudent();
  
  public ArrayNode getGirlStudent();
  
  public ArrayNode getStudentsByPage(String pageNumber);

}




