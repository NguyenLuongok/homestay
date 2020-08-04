package agie.poly.homestay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "hoadon")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String maCode;

    @ManyToOne
    @JoinColumn(name = "maTaiKhoan")
    private TaiKhoan taiKhoan;
    private double gia;

    @OneToMany
    @JoinColumn(name = "maHoaDon")
    private List<ChiTietHoaDon> chiTietHoaDons;

}
