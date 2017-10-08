package pct.services;

import pct.model.Coleccion;
import pct.model.Concierto;
import pct.model.Integrante;
import pct.model.Video;

public interface IPCTService {

	Coleccion<Integrante> getIntegrantes(Integer idConcierto);

	Coleccion<Concierto> getConciertos() ;

	Coleccion<Video> getVideos();
}
