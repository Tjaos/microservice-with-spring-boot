package br.com.thiagoamaral.catalog_service.util.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Version
    @JsonIgnore
    private Long versao;

    @CreatedDate
    @JsonIgnore
    private LocalDate dataCriacao;

    @LastModifiedDate
    @JsonIgnore
    private LocalDate dataUltimaModificacao;

}
