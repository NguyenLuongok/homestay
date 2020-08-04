package agie.poly.homestay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "chitiethoadon")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChiTietHoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @ManyToOne
    @JoinColumn(name = "maHomeStay")
    private HomeStay homeStay;
    @ManyToOne
    @JoinColumn(name = "maHoaDon")
    private HoaDon hoaDon;


}
