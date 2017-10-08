package pct.services;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import pct.model.*;

//@Component //TODO: ¿cual es la diferencia entre @Component y @Service ??
@Service
public class PCTService implements IPCTService{

	@Autowired
	IPCTDao pctDao;
	
	public void setPctDao(IPCTDao pctDao){
		this.pctDao = pctDao;
	}
	
	public IPCTDao getPctDao(){
		return this.pctDao;
	}
	
	public Coleccion<Integrante> getIntegrantes(Integer idConcierto){
		return getPctDao().getIntegrantes(idConcierto);
		
	}

	public Coleccion<Concierto> getConciertos() {
		return getPctDao().getConciertos();
	}

	public Coleccion<Video> getVideos() {
		return getPctDao().getVideos();
	}
}
