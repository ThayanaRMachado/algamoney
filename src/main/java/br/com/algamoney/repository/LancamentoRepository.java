package br.com.algamoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoney.model.Lancamento;
import br.com.algamoney.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
