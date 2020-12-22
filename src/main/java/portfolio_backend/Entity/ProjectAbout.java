package portfolio_backend.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity(name = "project_abouts")
public class ProjectAbout implements Serializable {

    /**
     * シリアルバージョンUID.
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    final Integer id;

    @Column(name = "about_id")
    final Integer aboutId;

    @Column(name = "project_id")
    final Integer projectId;

    @Column(name = "description")
    final String description;

    @Column(name = "display_order")
    final Integer displayOrder;

    @OneToOne
    @JoinColumn(name = "id")
    final About abouts;

}
