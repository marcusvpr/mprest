package com.mpxds.mprest.services;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpxds.mprest.domain.MpmFeriado;
import com.mpxds.mprest.domain.MpmImportarControle;
import com.mpxds.mprest.repositories.MpmImportarControleRepository;
import com.mpxds.mprest.util.MpUtility;

@Service
public class MpmImportarControleService {
	//
	@Autowired
	private MpmImportarControleRepository mpRepo;
	@Autowired
	private MpmFeriadoService mpmFeriadoService;
	
	public MpmImportarControle buscarId(Integer id) {
		//
		Optional<MpmImportarControle> mpObj = mpRepo.findById(id);
		//
		return mpObj.orElse(null);
	}
	
	public MpmImportarControle buscarDataDistribuicao(Date dataDistribuicao) {
		//
		Optional<MpmImportarControle> mpObj = mpRepo.findByDataDistribuicao(dataDistribuicao);
		//
		return mpObj.orElse(null);
	}
	
    public MpmImportarControle calculaDataProtocoloAndDataAte(MpmImportarControle mpmImportarControleCalcD) {
    	//
		String diaSemana = "";
    	Integer contadorDiaUtil = 0;
    	//
		Calendar tIni = Calendar.getInstance();
		Calendar tEvt = Calendar.getInstance();
		Calendar tFim = Calendar.getInstance();
		//
		tIni.setTime(mpmImportarControleCalcD.getDataDistribuicao());
		tFim.add(Calendar.DAY_OF_MONTH, 50);
		
		for (Date dateX = tIni.getTime(); tIni.before(tFim); tIni.add(Calendar.DATE, 1),
																		dateX = tIni.getTime()) {
			//
			MpmFeriado mpmFeriado = mpmFeriadoService.buscarDataFeriado(dateX);
			if (null == mpmFeriado)
				diaSemana = MpUtility.diaSemana(dateX).toUpperCase();
			else
				diaSemana = "FERIADO";
			
			tEvt.setTime(dateX);
			// Trata feriado sabado e domingo !
			if (diaSemana.equals("FERIADO")
			||  diaSemana.equals("SÁBADO") 
			|| 	diaSemana.equals("DOMINGO"))
				assert(true);
			else {
				contadorDiaUtil++;
				
				if (contadorDiaUtil == 2)
					mpmImportarControleCalcD.setDataProtocolo(dateX);
				else
					if (contadorDiaUtil == 4) {
						//
						mpmImportarControleCalcD.setDataAte(dateX);
						//
						break;
					}
			}
		}
		//
		return mpmImportarControleCalcD;
    }	

}
