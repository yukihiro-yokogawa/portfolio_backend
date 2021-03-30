package portfolio_backend.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity(name = "my_profiles")
public class MyProfile implements Serializable {

    /**
     * シリアルバージョンUID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "deleted")
    private boolean deleted;

    @OneToOne
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

}
