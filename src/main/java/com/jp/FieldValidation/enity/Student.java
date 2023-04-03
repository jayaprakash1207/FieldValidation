package com.jp.FieldValidation.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @Column(name = "id")
    private long id;

    @NotNull(message = "First Name shouldn't be empty")
    @Size(min = 2, max = 18, message = "First Name must be between 2 and 18")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "Last Name shouldn't be empty")
    @Size(min = 2, max = 18, message = "Last Name must be between 2 and 18")
    @Column(name = "last_name")
	private String lastName;

    @NotNull(message = "Email shouldn't be empty")
    @Email(message = "Provide proper EmailID")
    @Column(name = "email")
	private String email;

    @NotNull(message = "Mobile Number should not be empty")
    @Size(min=10, message = "Minimum 10 digits should be provided")
    @NotNull
    @Column(name = "mobile_number")
    private String mobileNumber;

    @NotNull
    @Column(name = "date_of_birth")
	private String dob;

    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "address_line_1")
    private String addressLine1;

    @NotNull
    @Size(min = 2, max = 20)
    @Column(name = "address_line_2")
    private String addressLine2;

    @NotNull
    @Column(name = "city")
    private String city;

    @NotNull
    @Column(name = "state")
    private String state;

    @NotNull
    @Column(name = "postal_code")
    private String postalCode;

    @NotNull
    @Column(name = "country")
    private String country;
}
