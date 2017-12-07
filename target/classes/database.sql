
--DROP SEQUENCE public.articles_id_seq;
CREATE SEQUENCE IF NOT EXISTS public.articles_id_seq;
-- Dumping structure for table concretepage.articles
CREATE TABLE IF NOT EXISTS public.articles (
article_id integer NOT NULL DEFAULT nextval('articles_id_seq'::regclass),
title varchar(200) NOT NULL,
category varchar(100) NOT NULL,
PRIMARY KEY (article_id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE public.roles
  OWNER TO postgres;
-- Dumping data for table concretepage.articles: ~4 rows (approximately)
/*!40000 ALTER TABLE `articles` DISABLE KEYS */;
INSERT INTO public.articles (title, category) VALUES
('Angular 2 Tutorial using CLI', 'Angular'),
('Spring Boot Getting Started', 'Spring Boot'),
('Lambda Expressions Java 8 Example', 'Java 8'),
('Android AsyncTask Example', 'Android');