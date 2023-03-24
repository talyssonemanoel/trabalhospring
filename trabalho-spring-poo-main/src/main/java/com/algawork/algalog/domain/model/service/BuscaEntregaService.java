package com.algawork.algalog.domain.model.service;

import org.springframework.stereotype.Service;

import com.algawork.algalog.domain.exception.EntidadeNaoEncontradaException;
import com.algawork.algalog.domain.model.Entrega;

import com.algawork.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;
	
	public Entrega buscar (Long EntregaId) {
		return entregaRepository.findById(EntregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("entrega não encontrada"));
				
}
}
