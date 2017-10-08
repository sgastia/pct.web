package pct.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pct.model.Coleccion;
import pct.model.Concierto;
import pct.model.Integrante;
import pct.model.Video;
import pct.services.IPCTService;

@Controller
public class FrontEndController {

	@Autowired
	IPCTService pctServ;
	
	public void setPctServ(IPCTService pctServ) {
		this.pctServ = pctServ;
	}
	
	public IPCTService getPctServ(){
		return pctServ;
	}
	
	@RequestMapping("/integrantes")
	public @ResponseBody Coleccion<Integrante> getIntegrantes(
			@RequestParam(value="idconcierto", required=false, defaultValue="0") Integer idConcierto){
		Coleccion<Integrante> integrantes = getPctServ().getIntegrantes(idConcierto);
		return integrantes;
	}
	
	
	@RequestMapping("/conciertos")
	public @ResponseBody Coleccion<Concierto> getConciertos(){
		Coleccion<Concierto> conciertos = getPctServ().getConciertos();
		return conciertos;
	}
	
	@RequestMapping("/videos")
	public @ResponseBody Coleccion<Video> getVideos(){
		Coleccion<Video> videos = getPctServ().getVideos();
		return videos;
	}
}
