package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.repository;

import com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain.Pix;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GestaoTransacoesRepository  extends JpaRepository<Pix, Long> {
}
