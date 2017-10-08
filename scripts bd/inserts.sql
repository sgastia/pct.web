--select SYSDATETIME()
--go

----------------------------------------------------------------------------------------------------------
--delete from dbo.instrumentos
/*
insert into instrumentos(idinstrumento,nombre)values(0,'Trompeta')
go

insert into instrumentos(idinstrumento,nombre)values(1,'Flugel')
go

insert into instrumentos(idinstrumento,nombre)values(2,'Corno')
go

insert into instrumentos(idinstrumento,nombre)values(3,'Trombon')
go

insert into instrumentos(idinstrumento,nombre)values(4,'Tuba')
go
*/
select * from dbo.instrumentos
go

----------------------------------------------------------------------------------------------------------
--delete from dbo.integrantes
/*
insert into dbo.integrantes(nombre,apellido,idinstrumento)values('Sebastian','Gastiazoro',0)
go
insert into dbo.integrantes(nombre,apellido,idinstrumento)values('Thomas','Imgraben',0)
go
insert into dbo.integrantes(nombre,apellido,idinstrumento)values('Alejandro','Muchile',1)
go
insert into dbo.integrantes(nombre,apellido,idinstrumento)values('Heini','Schneebeli',3)
go
insert into dbo.integrantes(nombre,apellido,idinstrumento)values('Pedro','Pulzovan',4)
go
*/

select * from dbo.integrantes
go

----------------------------------------------------------------------------------------------------------

--insert into dbo.conciertos(nombre,fecha,lugar,posterhtml)values('concierto 1',SYSDATETIME(),null,null)
--insert into dbo.conciertos(nombre,fecha,lugar,posterhtml)values('concierto 2',SYSDATETIME(),null,null)
--insert into dbo.conciertos(nombre,fecha,lugar,posterhtml)values('concierto 2',SYSDATETIME(),'iglesia temperley',null)

select * from dbo.conciertos
go