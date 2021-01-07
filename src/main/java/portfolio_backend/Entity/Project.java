package portfolio_backend.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "projects")
public class Project implements Serializable {

    /**
     * シリアルバージョンUID.
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "add_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addDate;

    @Column(name = "git_url")
    private String gitUrl;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private Set<ProjectTechnique> projectTechniques = new HashSet<ProjectTechnique>();

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private Set<ProjectAbout> projectAbouts = new HashSet<ProjectAbout>();

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private Set<ProjectImage> projectImages = new HashSet<ProjectImage>();

}
