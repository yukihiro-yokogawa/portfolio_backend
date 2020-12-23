package portfolio_backend.Entity;

import java.io.Serializable;
import java.util.Date;
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

@Data
@Entity(name = "projects")
public class Project implements Serializable {

    /**
     * シリアルバージョンUID.
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;

    @Column(name = "name")
    private final String name;

    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private final Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private final Date endDate;

    @Column(name = "add_date")
    @Temporal(TemporalType.TIMESTAMP)
    private final Date addDate;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private final Set<ProjectTechnique> projectTechniques;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private final Set<ProjectAbout> projectAbouts;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private final Set<ProjectImage> projectImages;

}
