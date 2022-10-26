package za.ac.cput.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class school implements Serializable {
    @Id @Column(name = "schoolCode")
    private String schoolCode;
    
    private String schoolName;
    
    protected school() {
    
    }
    
    private school(Builder builder) {
        this.schoolCode = builder.schoolCode;
        this.schoolName = builder.schoolName;
    }
    
    public String getSchoolCode() {
        return schoolCode;
    }
    
    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    @Override
    public String toString() {
        return "school{" +
                "schoolCode='" + schoolCode + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
    
    public static class Builder {
        private String schoolCode;
        private String schoolName;
    
    
        public Builder schoolCode(String schoolCode) {
            this.schoolCode = schoolCode;
            return this;
        }
    
        public Builder schoolName(String schoolName) {
            this.schoolName = schoolName;
            return this;
        }
    
        public Builder copy(school s) {
            this.schoolCode = s.schoolCode;
            this.schoolName = s.schoolName;
            return this;
        }
    
        public school build() {
            return new school(this);
        }
    }
}