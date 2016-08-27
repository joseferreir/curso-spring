/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.wine.model;

/**
 *
 * @author jose2
 */
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vinho")
public class Vinho{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codico;
    private String nome;
    @Enumerated(EnumType.STRING)
    private TipoVinho tipo;
    private Integer safra;
    private Integer volume;
    private BigDecimal valor;

    public long getCodico() {
        return codico;
    }

    public void setCodico(long codico) {
        this.codico = codico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoVinho getTipo() {
        return tipo;
    }

    public void setTipo(TipoVinho tipo) {
        this.tipo = tipo;
    }

    public Integer getSafra() {
        return safra;
    }

    public void setSafra(Integer safra) {
        this.safra = safra;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vinho other = (Vinho) obj;
        if (this.codico != other.codico) {
            return false;
        }
        return true;
    }

}
