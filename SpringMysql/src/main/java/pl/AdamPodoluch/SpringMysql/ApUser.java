package pl.AdamPodoluch.SpringMysql;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class ApUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String user_name;
    private String roles;
    private String password;
}
