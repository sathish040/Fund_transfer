package com.fundTransfer.fundTransfer.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@Table("beneficiary")
public class Beneficiary {
	@Id
	private Long id;
	private String Name;
	private String AccountNumber;
	private String NickName;

	public Beneficiary(Long id, String name, String accountNumber, String nickName) {
		this.id = id;
		Name = name;
		AccountNumber = accountNumber;
		NickName = nickName;
	}

	public Beneficiary() {

	}

	public void setAccountNumber(String accountNumber) {
	}

	public void setName(String name) {
	}

	public void setNickName(String nickName) {
	}
}
