package portfolio_backend.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name="my_techniques")
public class MyTechnique implements Serializable {

    /**
     * シリアルバージョンUID.
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;

    @Column(name = "technique_id")
    private final Integer techniqueId;

    @Column(name = "coimprehension")
    private final Integer coimprehension;

    @OneToMany
    @JoinColumn(name = "id")
    private final List<Technique> techniques;

}
