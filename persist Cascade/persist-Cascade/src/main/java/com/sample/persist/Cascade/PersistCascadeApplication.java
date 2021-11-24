package com.sample.persist.Cascade;

import com.sample.persist.Cascade.entity.Student;
import com.sample.persist.Cascade.entity.Subject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class PersistCascadeApplication {

	public static void main(String[] args) {

		SpringApplication.run(PersistCascadeApplication.class, args);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Student_details");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Ram");
		s1.setAge(21);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Raju");
		s2.setAge(22);

		Subject sb1 = new Subject();
		sb1.setS_name("English");
		sb1.setS_marks(94);
		sb1.setId(s1.getId());

		Subject sb2 = new Subject();
		sb2.setS_name("Maths");
		sb2.setS_marks(99);
		sb2.setId(s2.getId());

		s1.setSubject(sb1);
		s2.setSubject(sb2);

		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
