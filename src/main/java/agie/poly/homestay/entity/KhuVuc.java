package agie.poly.homestay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "khuvuc")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class KhuVuc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tenKhuVuc;
    @ManyToOne
    @JoinColumn(name = "maHomeStay")
    private HomeStay homeStay;
}
