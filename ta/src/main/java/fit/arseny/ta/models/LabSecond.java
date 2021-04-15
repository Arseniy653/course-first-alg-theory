package fit.arseny.ta.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LabSecond {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Float a;
    private Float b;
    private Float c;
    private Float d;
    private Float res;

    public LabSecond(){}

    public LabSecond(Float a, Float b, Float c, Float d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        this.count();
    }

    public void count(){
        float tmp = a+b+c;
        if(tmp != 0) this.res = d/tmp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getA() {
        return a;
    }

    public void setA(Float a) {
        this.a = a;
    }

    public Float getB() {
        return b;
    }

    public void setB(Float b) {
        this.b = b;
    }

    public Float getC() {
        return c;
    }

    public void setC(Float c) {
        this.c = c;
    }

    public Float getD() {
        return d;
    }

    public void setD(Float d) {
        this.d = d;
    }

    public Float getRes() {
        return res;
    }

    public void setRes(Float res) {
        this.res = res;
    }
}
