package model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String priority;
    private Date deadline;
    private String status; // Pending, In Progress, Completed

    @ManyToOne
    @JoinColumn(name = "team_member_id")
    private TeamMember assignedTeamMember;


    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    public Date getDeadline() { return deadline; }
    public void setDeadline(Date deadline) { this.deadline = deadline; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public TeamMember getAssignedTeamMember() { return assignedTeamMember; }
    public void setAssignedTeamMember(TeamMember assignedTeamMember) { this.assignedTeamMember = assignedTeamMember; }
}