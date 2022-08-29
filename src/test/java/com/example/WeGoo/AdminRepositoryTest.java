package com.example.WeGoo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;


import com.example.WeGoo.Domain.Admin;
import com.example.WeGoo.Repository.AdminRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class AdminRepositoryTest {
	
	@Autowired
	private AdminRepository adminRepository;

	@Test
	public void testAddNew() {
		Admin admin = new Admin();
		admin.setId(0);
		admin.setFirstName("bla");
		admin.setLastName("bla");
		admin.setGender("Female");
		admin.setDob("2021");
		admin.setNid("1234567812345678");
		admin.setEmail("bla@gmail.com");
		admin.setPassword("bla");
		admin.setPhoneNo("1234512345");
		admin.setRole("Admin");
		admin.setStatus("Active");

		Admin savedAdmin = adminRepository.save(admin);

		Assertions.assertThat(savedAdmin).isNotNull();
		Assertions.assertThat(savedAdmin.getId()).isGreaterThan(0);
	}


}
