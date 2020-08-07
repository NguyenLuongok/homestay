package agie.poly.homestay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.List;


@Entity
@Table(name = "hoadon")
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldNameConstants
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String maCode;

    @ManyToOne
    @JoinColumn(name = "maTaiKhoan")
    private TaiKhoan taiKhoan;

    private double gia;

    @Column(name = "date_check_in")
    private Date dateCheckIn;

    @Column(name = "date_check_out")
    private Date dateCheckOut;

    private String tenKhachHang;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    private boolean status;

    @OneToOne
    @JoinColumn(name = "homeStayId")
    private HomeStay homeStay;

}
