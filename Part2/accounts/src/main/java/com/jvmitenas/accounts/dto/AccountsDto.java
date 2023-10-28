package com.jvmitenas.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
	name = "Accounts",
	description = "Schema to hold Account Information"
)
public class AccountsDto {
	@NotEmpty(message = "Nomor akun tidak boleh null atau kosong")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Nomor account harus 10 digit angka!")
	@Schema(
		description = "Account Number for Itenas Bank account", example = "1325546981"
	)
	private Long accountNumber;
	
	@NotEmpty(message = "Jenis akun tidak boleh null atau kosong")
	@Schema(
		description = "Account Type for Itenas Bank account", example = "Savings"
	)
	private String accountType;
	
	@NotEmpty(message = "Alamat cabang tidak boleh null atau kosong")
	@Schema(
		description = "Itenas Bank branch address", example = "123 Main Street, New York"
	)
	private String branchAddress;
}
