package pct.services;

import pct.model.Coleccion;
import pct.model.Concierto;
import pct.model.Integrante;
import pct.model.Video;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Component
@Repository
public class PCTDao extends HibernateDaoSupport implements IPCTDao{
	
	@Autowired
	public void init(SessionFactory factory) {
	    setSessionFactory(factory);
	}
	
	@Transactional
	public Coleccion<Integrante> getIntegrantes(Integer idConcierto) {
		/*
		ArrayList<Integrante> integrantes = new ArrayList<Integrante>();
		integrantes.add(new Integrante("Sebastian","Gastiazoro",Instrumento.Trompeta));
		integrantes.add(new Integrante("Thomas","Imgraben",Instrumento.Trompeta));
		integrantes.add(new Integrante("Alejandro","Muchile",Instrumento.Flugel));
		integrantes.add(new Integrante("Heini","Schneebeli",Instrumento.Trombon));
		integrantes.add(new Integrante("Solon","Navarrete",Instrumento.Tuba));
		*/
		
		List<Integrante> integrantes = this.getSessionFactory().getCurrentSession().createQuery("from Integrante").list();
		
		Coleccion<Integrante> col = new Coleccion<Integrante>();
		col.coleccion = integrantes;
		return col;
	}

	@Transactional
	public Coleccion<Concierto> getConciertos() {
		List<Concierto> conciertos = this.getSessionFactory().getCurrentSession().createQuery("from Concierto").list();
		Coleccion<Concierto> col = new Coleccion<Concierto>();
		col.coleccion = (List<Concierto>)conciertos;
		return col;
	}

	public Coleccion<Video> getVideos() {
		ArrayList<Video> videos = new ArrayList<Video>();
		videos.add(new Video("https://www.youtube.com/watch?v=9P25StxRmIs","Video 1"));
		videos.add(new Video("https://www.youtube.com/watch?v=svTBZcxmBv4","Video 2"));
		videos.add(new Video("https://www.youtube.com/watch?v=4Qe3PBkpuH4","Video 3"));
		videos.add(new Video("#","Video 4"));
		Coleccion<Video> col = new Coleccion<Video>();
		col.coleccion = videos;
		return col;
	}

}
