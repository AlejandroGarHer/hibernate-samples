package curso.java.hibernate.data.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBL_TASK")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String taskName;
    @Column
    private String taskDescription;
    @Column
    private Integer employeeId;
    @Column
    private Integer idScope;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Set<Scope> scopes = new HashSet<>();

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public Integer getIdScope(Integer idScope) {
        return idScope;
    }

    public void setIdScope(Integer idScope) {
        this.idScope = idScope;
    }

    public Set<Scope> getScopes() {
        return scopes;
    }
    public void setScopes(Set<Scope> scopes) {
        this.scopes = scopes;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", idScope='" + idScope + '\'' +
                ", scopes='" + scopes + '\'' +
                '}';
    }
}
