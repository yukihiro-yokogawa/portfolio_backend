package portfolio_backend.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    final Integer id;

    @Column(name = "name")
    final String name;

    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    final Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    final Date endDate;

    @Column(name = "add_date")
    @Temporal(TemporalType.TIMESTAMP)
    final Date addDate;

    @OneToMany(mappedBy = "projectId")
    final List<ProjectTechnique> projectTechniques;

    @OneToMany(mappedBy = "projectId")
    final List<ProjectAbout> projectAbouts;

    @OneToMany(mappedBy="projectId")
    final List<ProjectImage> projectImages;

}
