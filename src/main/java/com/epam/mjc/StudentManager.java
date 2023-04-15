package com.epam.mjc;

class NotStudentException extends IllegalArgumentException{
    public NotStudentException(String message, Throwable cause) {
      super(message, cause);
    }
}
public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) {
    try {
      if (Student.getValueOf(studentID) != null) {
        return Student.getValueOf(studentID);
      } else {
        throw new IllegalArgumentException();
      }
    } catch (IllegalArgumentException e) {
      throw new NotStudentException("Could not find student with ID " + studentID, e);
    }
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

//    for (int i = 0; i < IDs.length; i++) {
//      Student student = manager.find(IDs[i]);
//      System.out.println("Student name " + student.getName());
//    }
      manager.find(1550);
  }
}