package com.jvmitenas.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
	name = "Customer",
	description = "Schema to hold Customer and Accounts Information"
)
public class CustomerDto {
	
	@Schema(
		description = "Name of the customer", example = "Will Smith"
	)
	@NotEmpty(message = "Nama tidak boleh null atau kosong!")
	@Size(min = 5, max = 30, message = "Panjang nama customer harus dalam rentang 5 sampai 30 karakter!")
	private String name;
	
	@Schema(
		description = "Email address of the customer", example = "willsmith@jvmitenas.com"
	)
	@NotEmpty(message = "Email tidak boleh null atau kosong!")
	@Email(message = "Penulisan email harus sesuai format!")
	private String email;
	
	@Schema(
		description = "Mobile number of the customer", example = "0123456789"
	)
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Nomor handphone harus 10 digit angka!")
	private String mobileNumber;
	
	@Schema(
		description = "Account details of  the Customer"
	)
	private AccountsDto accountsDto;
}
