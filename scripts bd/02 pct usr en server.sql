USE [master]
GO

/* For security reasons the login is created disabled and with a random password. */
/****** Object:  Login [pctweb_usr]    Script Date: 2 oct. 2017 19:57:58 ******/
CREATE LOGIN [pctweb_usr] WITH PASSWORD=N'WU1Tyfyvh5k2fE6il31qbexrwWzyyBCdDWwEW4WrW7k=', DEFAULT_DATABASE=[PCT], DEFAULT_LANGUAGE=[us_english], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO

ALTER LOGIN [pctweb_usr] DISABLE
GO


