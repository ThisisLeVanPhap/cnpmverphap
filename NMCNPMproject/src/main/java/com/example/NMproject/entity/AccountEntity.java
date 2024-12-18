package com.example.NMproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name = "account") // Đổi tên bảng từ "usersList" thành "account"
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String username;
	private String password;
	private String pathPicture;

	public AccountEntity(String email, String username, String password) {
		this.email = email;
		this.username = username;
		this.password = password;
	}
}
