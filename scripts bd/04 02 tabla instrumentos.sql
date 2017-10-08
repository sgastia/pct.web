USE [PCT]
GO

/****** Object:  Table [dbo].[instrumentos]    Script Date: 2 oct. 2017 21:12:47 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[instrumentos](
	[idinstrumento] [int] NOT NULL,
	[nombre] [nchar](50) NOT NULL,
 CONSTRAINT [PK_instrumentos] PRIMARY KEY CLUSTERED 
(
	[idinstrumento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


