package portfolio_backend.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity(name = "profiles")
public class Profile implements Serializable {

    /**
     * シリアルバージョンUID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "display_order")
    private Integer displayOrder;

    @Column(name = "date_type")
    private boolean dateType;

}
