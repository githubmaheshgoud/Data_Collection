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
 * @NoArgsConstructor public class PlanSelection {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy =GenerationType.AUTO ) private PlanName planName;
 * 
 * @OneToOne
 * 
 * @JoinColumn(name="Case Number") private CreateCase create;
 * 
 * }
 */