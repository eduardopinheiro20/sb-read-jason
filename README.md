Json para add Pix
	{   
		"idTransacao":12345, 
		"idFraudes":123456, 
		"idEfetivacao":12345678, 
		"status":"”APROVADA_FRAUDES”", 
		"payloadPix": { 
			"chavePix":  { 
			   	"codigoChave": "764.123.548-39", 
			   	"tipoChave": "CPF" 
			   	
			}, 
		   "data": "2021-08-26T15:52:49.125Z", 
		   "descricao": "string", 
		   "dtVencimentoPagamento": "string", 
		   "favorecido": { 
		   		"contaPix": { 
		   			"agenciaConta": 2020, 
		   			"numeroConta": 123467, 
		   			"participante": { 
		   				"idParticipante": 59588111, 
		   				"nomeParticipante": "BANCO DO NORDESTE DO BRASIL S.A." 
		   				
		   			}, 
		   			"tipoConta": 5 
		   		}, 
		   		"documentoFavorecido": 12312312312, 
		   		"nomeFavorecido": "João das Neves"
		   	}, 
	   		"idPagamento": "string", 
	   		"nsu": "string", 
	   		"numeroQrCode": "string", 
	   		"salvarContrato": true, 
	   		"seqTransacao": 1, 
	   		"valor": 1.99
		} 
		
	}

Json para add Ted
{
   "idTransacao":12345,
   "idFraudes":123456,
   "idEfetivacao":12345678,
   "status":"”APROVADA_FRAUDES”",
   "payload":{
      "codigoFinalidade":1,
      "codigoLiquidacao":31,
      "codigoSistemaOrigem":222,
      "codigoTipoContaFavorecido":14,
      "codigoTipoContaRemetente":5,
      "codigoTipoTransacao": 1,
      "dataTransferencia":"2019-12-10",
      "descricaoTransacao":"Pagamento de aluguel.",
      "identificadorBancoFavorecido":33,
      "identificadorBancoRemetente":21,
      "nomeFavorecido":"João Silva",
      "numeroAgenciaFavorecido":720,
      "numeroAgenciaRemetente":7190,
      "numeroContaFavorecido":22313,
      "numeroContaRemetente":27868,
      "numeroCpfCnpjFavorecido":76907468026,
      "salvarFavorecido":true,
      "tipoPessoaFavorecido":"f",
      "valorTransacao":1000.23
   }
},

Json para add Tef
{
   "idTransacao":12345,
   "idFraudes":123456,
   "idEfetivacao":12345678,
   "status":"”APROVADA_FRAUDES”",
   "payload":{
      "codigoBancoFavorecido": 0,
      "codigoBancoRemetente": 0,
      "codigoLiquidacao": 0,
      "codigoSistemaOrigem": 0,
      "codigoTipoContaFavorecido": 0,
      "codigoTipoContaRemetente": 0,
      "codigoTipoTransacao": 0,
      "dataTransferencia": "2017-07-21",
      "descricaoTransacao": "string",
      "numeroAgenciaFavorecido": "string",
      "numeroAgenciaRemetente": "string",
      "numeroContaFavorecido": 0,
      "numeroContaRemetente": 0,
      "salvarFavorecido": true,
      "valorTransacao": 0
    }
}

Json para add Boleto


