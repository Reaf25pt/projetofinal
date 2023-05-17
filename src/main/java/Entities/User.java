package Entities;


import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;


import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="User")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    // coluna 1: id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId", nullable = false, unique = true, updatable = false)
    private int userId;

    // coluna 2: nome
    @Column(name = "firstName", nullable = true, unique = false, updatable = true)
    private String firstName;

    // coluna 3: apelido
    @Column(name = "lastName", nullable = true, unique = false, updatable = true)
    private String lastName;

/*	// coluna 4: username
	@Column(name="username", nullable = false, unique = true, updatable = false)
	private String username;*/

    // coluna 5: password
    @Column(name = "password", nullable = false, unique = false, updatable = true)
    private String password;

    // coluna 6: email
    @Column(name = "email", nullable = false, unique = true, updatable = true)
    private String email;

    // coluna 7: número telefone
    @Column(name = "phone", nullable = true, unique = false, updatable = true)
    private String phone;

    // coluna 8:  fotografia (url)
    @Column(name = "photoUrl", nullable = true, unique = false, updatable = true)
    private String photoUrl;

    // coluna 9: tipo de user
    @Column(name = "admin", nullable = false, unique = false, updatable = true)
    private boolean admin = false;

    // coluna 10: estado
    @Column(name = "active", nullable = false, unique = false, updatable = true)
    private boolean active = true;

    // coluna : estado validado / não validado
    @Column(name = "validated", nullable = false, unique = false, updatable = true)
    private boolean validated = false;

    // coluna : estado à espera do registo - para solucionar questão de user n existir na partilha de categorias
    @Column(name = "waitingForRegist", nullable = false, unique = false, updatable = true)
    private boolean waitingForRegist = false;

    // coluna : momento em que user é registado
    @Column(name = "registTime", nullable = false, unique = false, updatable = true)
    private Date registTime = Date.from(Instant.now());
    ;

    // coluna 11: token
    @Column(name = "token", nullable = true, unique = false, updatable = true)
    private String token;

    // coluna 12: timestamp when token is created
    @Column(name = "timestamp", nullable = true, unique = false, updatable = true)
    private long timestamp;


    // lista de categorias partilhadas
    //@OneToMany(mappedBy="userSharedCat")
    //private List<SharedCategoryEntity> sharedCategoriesList = new ArrayList<>();

	/*
	//lista de categorias partilhadas em q é owner
	@OneToMany(mappedBy = "catOwnerUser")
	private List<SharedCategoryEntity> listCatShared_Owner = new ArrayList<>();

	//lista de categorias partilhadas em q não é owner
	@OneToMany(mappedBy = "userSharedCat")
	private List<SharedCategoryEntity> listCatShared_user = new ArrayList<>();
	*/


    // CONSTRUTORES
    // construtor vazio (default)
    public User() {
    }


    // GETTERS & SETTERS
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

/*	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}*/

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }


    public boolean isAdmin() {
        return admin;
    }


    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

}