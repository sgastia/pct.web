USE [PCT]
GO

/****** Object:  Table [dbo].[conciertos]    Script Date: 2 oct. 2017 20:16:41 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[conciertos](
	[idconcierto] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [nchar](100) NOT NULL,
	[fecha] [date] NULL,
	[lugar] [nchar](100) NULL,
	[posterHtml] [text] NULL,
 CONSTRAINT [PK_conciertos] PRIMARY KEY CLUSTERED 
(
	[idconcierto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO


