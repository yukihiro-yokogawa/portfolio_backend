package portfolio_backend.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="my_skills")
public class MySkill implements Serializable {

    /**
     * シリアルバージョンUID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "level")
    private Integer level;

    @Column(name = "deleted")
    private boolean deleted;

    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "technique_id", referencedColumnName = "id")
    private Technique technique;

}
