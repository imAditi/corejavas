package DAO;

import java.util.List;
import java.util.Scanner;

public class IssueMain {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
IssueDAO issueDAO = new IssueDAOImpl();
for (Issues issues : issueDAO.issues()) {
System.out.println("Issue: [issueDate : " + issues.getCreatedDate() + ", Issue_Name : " + issues.getName() + " ]");
      }
System.out.println("Enter a date of issue :(dd-mm-yyyy)");
String issueDate = scanner.nextLine();
for (Issues issues : issueDAO.issues()) {
if(issues.getCreatedDate().equals(issueDate))
System.out.println("Issue: [issueDate : " + issues.getCreatedDate() + ", Issue_Name : " + issues.getName() + " ]");
      }
}

}