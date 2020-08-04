package agie.poly.homestay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "homestay")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HomeStay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tenHomeStay;
    private  String diaChi;
    private  double gia;
    private int soNguoiLon;
    private int soTreCon;
    private String dichVu;
    private  String tienNghi;
    private  double dienTich;
    private String kieuHomeStay;
    private double soLuongPhong;
    private String tinhTrang;
    @OneToMany
    @JoinColumn(name = "maHomeStay")
    private List<ChiTietHoaDon> chiTietHoaDons;
    @OneToMany
    @JoinColumn(name = "maHomeStay")
    private List<KhuVuc> khuVucs;
}
