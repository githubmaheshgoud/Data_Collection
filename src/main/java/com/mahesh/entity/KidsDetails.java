/*
 * package com.mahesh.entity;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.OneToOne; import
 * javax.persistence.Table;
 * 
 * import lombok.AllArgsConstructor; import lombok.Data; import
 * lombok.NoArgsConstructor;
 * 
 * @Entity
 * 
 * @Table
 * 
 * @Data
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor public class KidsDetails {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private Integer SSN; private
 * Integer kidAge; private String kidName;
 * 
 * @OneToOne
 * 
 * @JoinColumn(name="Case Number") private CreateCase create;
 * 
 * 
 * }
 */