

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.dharam.hibernate.test.domain.Address;
import com.dharam.hibernate.test.domain.Certificate;
import com.dharam.hibernate.test.domain.Employee;

public class ManageEmployee {

	private static SessionFactory sessionFactory;
	public static void main(String args[]) {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (HibernateException e) {
			System.out.println("Error in instantiating session factory.");
			e.printStackTrace();
		}
		
		ManageEmployee manageEmployee = new ManageEmployee();
		
		HashSet set1 = new HashSet();
	      set1.add(new Certificate("MCA"));
	      set1.add(new Certificate("MBA"));
	      set1.add(new Certificate("PMP"));
	      Integer id1 = manageEmployee.addEmployee(new Employee("AAAA","aaaa",1111,set1));
		//TreeSet set2 = new TreeSet();
	      //set2.add(new Certificate("BCA"));
	      //set2.add(new Certificate("BA"));
		
		Integer id2 = manageEmployee.addEmployee(new Employee("BBBB","bbbb",2222,set1));
		/*Integer id3 = manageEmployee.addEmployee(new Employee("CCCC","cccc",3333));
		Integer id4 = manageEmployee.addEmployee(new Employee("DDDD","dddd",4444));*/
		
		/*Address address = new Address("Kanpur","Hydrabad","AP","531");
		address = manageEmployee.addAddress(address);
		
		Address address2 = new Address("Mumbai","Maharashtra","MH","400");
		address2 = manageEmployee.addAddress(address2);*/
		
		//Integer id1 = manageEmployee.addEmployee(new Employee("AA", "BB", 100000, address));
		
		//Integer id2 = manageEmployee.addEmployee(new Employee("Hello", "Bye", 300000, address2));
		
		//manageEmployee.listEmployee();
		//manageEmployee.listEmployeeViaCriteriaQuery();
		
		manageEmployee.countEmployee();
		//
		manageEmployee.updateEmployee(id1, 1000000);
		
		//manageEmployee.deleteEmployee(6);
		//System.out.println("------------------------------");
		System.out.println();
		
		manageEmployee.listEmployee();
		//manageEmployee.listEmployeeViaCriteriaQuery();
	}
	
	public void countEmployee() {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.setProjection(Projections.rowCount());
			
			List totalSalary = criteria.list();
			System.out.println(totalSalary.get(0));
			
			tx.commit();
		} catch (Exception e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
	}
	
	public Address addAddress(Address address) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer addressId = null;
		try{
			tx = session.beginTransaction();
			addressId = (Integer)session.save(address);
			address.setId(addressId);
			tx.commit();
		}
		catch (Exception e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return address;
	}
	
	//add employee
	public Integer addEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Integer employeeId = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			employeeId = (Integer)session.save(employee);
			tx.commit();
		} catch (Exception e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		
		return employeeId;
	}
	
	public void listEmployee() {
		Session session = sessionFactory.openSession();
		Transaction tx= null;
		try{
			tx = session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM Employee e where e.salary > :salary ").setParameter("salary", 1).list();
			System.out.format("%10s%32s%20s%70s","ID","Name","Salary","Address");
			System.out.println();
			for (Employee employee : employees) {
				System.out.format("%10d%32s%20d",employee.getId() , employee.getFirstName()+" "+employee.getLastName(), employee.getSalary());
				/*List<Certificate> certificates = employee.getCertificates();
				System.out.print("\tCertificate : ");
				for (Certificate certificate : certificates) {
					System.out.print( certificate.getId() + " --> " + certificate.getName() + ", ");
				}*/
				Address address = employee.getAddress();
				if(address != null)
					System.out.format("%20d%50s",address.getId(),address.getStreet()+ ", " + address.getCity() + ", "  +address.getState() + ", " + address.getZipcode());
				System.out.println();
			}
			System.out.format("%132s","--------------------------------------------------------------End of records----------------------------------------------");
			tx.commit();
		}
		catch(Exception e){
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	public void listEmployeeViaCriteriaQuery(){
		Session session = sessionFactory.openSession();
		Transaction tx= null;
		try{
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 10000));
			List<Employee> employees = criteria.list(); //createQuery("FROM Employee e where e.salary > :salary ").setParameter("salary", 10000).list();
			System.out.format("%10s%32s%20s%70s","ID","Name","Salary","Address");
			System.out.println();
			for (Employee employee : employees) {
				System.out.format("%10d%32s%20d",employee.getId() , employee.getFirstName()+" "+employee.getLastName(), employee.getSalary());
				/*List<Certificate> certificates = employee.getCertificates();
				System.out.print("\tCertificate : ");
				for (Certificate certificate : certificates) {
					System.out.print( certificate.getId() + " --> " + certificate.getName() + ", ");
				}*/
				Address address = employee.getAddress();
				if(address != null)
					System.out.format("%20d%50s",address.getId(),address.getStreet()+ ", " + address.getCity() + ", "  +address.getState() + ", " + address.getZipcode());
				System.out.println();
			}
			System.out.format("%132s","--------------------------------------------------------------End of records----------------------------------------------");
			tx.commit();
		}
		catch(Exception e){
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	public void updateEmployee(Integer employeeId, int salary) {
		Session session = sessionFactory.openSession();
		Transaction tx= null;
		try{
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, employeeId);
			employee.setSalary(salary);
			session.save(employee);
			tx.commit();
		}
		catch(Exception e){
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	public void deleteEmployee(Integer employeeId) {
		Session session = sessionFactory.openSession();
		Transaction tx= null;
		try{
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, employeeId);
			session.delete(employee);
			tx.commit();
		}
		catch(Exception e){
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
}
