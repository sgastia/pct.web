USE [PCT]
GO

/****** Object:  Table [dbo].[integrantes]    Script Date: 2 oct. 2017 21:13:44 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[integrantes](
	[idintegrante] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [nchar](50) NOT NULL,
	[apellido] [nchar](50) NOT NULL,
	[idinstrumento] [int] NOT NULL,
 CONSTRAINT [PK_integrantes] PRIMARY KEY CLUSTERED 
(
	[idintegrante] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[integrantes]  WITH CHECK ADD  CONSTRAINT [FK_integrantes_instrumentos] FOREIGN KEY([idinstrumento])
REFERENCES [dbo].[instrumentos] ([idinstrumento])
GO

ALTER TABLE [dbo].[integrantes] CHECK CONSTRAINT [FK_integrantes_instrumentos]
GO


