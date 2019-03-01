package DAO;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class IssueDAOImpl implements IssueDAO {
public List<Issues> issues;


@Override
public List<Issues> issues() {
	return issues;
}
	public IssueDAOImpl() {
		issues = new ArrayList<Issues>();{
		Issues issue1 = new Issues("Exception issue", "31-02-2018");
		Issues issue2 = new Issues("Convention Issue", "12-05-2018");
		Issues issue3 = new Issues("Runtime Issue", "20-09-2018");
		Issues issue4 = new Issues("Compile Time Issue", "09-06-2018");
		Issues issue5 = new Issues("Runtime Issue", "18-09-2018");

		issues.add(issue1);
		issues.add(issue2);
		issues.add(issue3);
		issues.add(issue4);
		issues.add(issue5);

		}

	return;

}
}

