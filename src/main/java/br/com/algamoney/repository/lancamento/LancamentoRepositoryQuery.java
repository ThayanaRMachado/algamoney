package br.com.algamoney.repository.lancamento;

import br.com.algamoney.model.Lancamento;
import br.com.algamoney.repository.filter.LancamentoFilter;
import br.com.algamoney.repository.projection.ResumoLancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);//Pode filtrar e paginar.
}
