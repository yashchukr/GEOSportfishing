-------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------
--DROP SEQUENCE public.user_id_seq;
CREATE SEQUENCE IF NOT EXISTS fishingapp.user_id_seq;
-- Dumping structure for table public.users
CREATE TABLE IF NOT EXISTS fishingapp.users (
user_id integer NOT NULL DEFAULT nextval('fishingapp.user_id_seq'::regclass),
first_name varchar(200) NOT NULL,
last_name varchar(100) NOT NULL,
email varchar(200) NOT NULL,
password varchar(100) NOT NULL,
PRIMARY KEY (user_id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE fishingapp.users
  OWNER TO fisher;
-- Dumping data for table public.users: ~4 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO fishingapp.users (first_name, last_name, email, password) VALUES
('Admin', 'Admin', 'rostyslav.mazepa@gmail.com', 'Admin'),
('Rostyslav', 'Mazepa', 'rostyslav.mazepa@gmail.com', 'MaRo210583');
-------------------------------------------------------------------------------------
--DROP SEQUENCE public.articles_id_seq;
CREATE SEQUENCE IF NOT EXISTS fishingapp.dic_fish_type_id_seq;

-- Dumping structure for table public.dic_fish_type
CREATE TABLE IF NOT EXISTS fishingapp.dic_fish_type (
fish_type_id integer NOT NULL DEFAULT nextval('fishingapp.dic_fish_type_id_seq'::regclass),
fish_type_name varchar(200) NOT NULL,
PRIMARY KEY (fish_type_id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE fishingapp.dic_fish_type
  OWNER TO fisher;

-- Dumping data for table public.dic_fish_type: ~4 rows (approximately)
/*!40000 ALTER TABLE `dic_fish_type` DISABLE KEYS */;
INSERT INTO fishingapp.dic_fish_type (fish_type_name) VALUES
('Быстрянка'),('Белуга'),('Бобырец'),('Берш'),('Бычок-гонец'),('Бычок-головач'),('Белоглазка'),('Быстрянка русская'),
('Верховка'),('Вьюн'),('Вырезуб'),('Гольян обыкновенный'),('Гольян озерный'),('Горчак'),('Голавль'),('Густера'),
('Голец европейский'),('Ерш обыкновенный'),('Ерш носарь'),('Ерш Балони'),('Ерш полосатый'),('Елец'),('Елец Данилевского'),
('Жерех'),('Карп'),('Карась серебрянный'),('Карась золотой'),('Красноперка'),('Колюшка трехиглая'),('Колюшка малая южная'),
('Колюшка девятииглая'),('Линь'),('Лещ'),('Лосось дунайский'),('Минога карпатская'),('Минога украинская'),('Налим'),('Осетр Атлантический'),
('Осетр русский'),('Осетр персидский'),('Окунь'),('Перкарина'),('Подкаменщик обыкновенный'),('Подкаменщик пестроногий'),('Пуголовка звездчатая'),
('Пуголовка Браунера'),('Плотва обыкновенная'),('Плотва паннонская'),('Подуст'),('Подуст волжский'),('Пескарь обыкновенный'),
('Пескарь белоперый днепровский'),('Пескарь белоперый днестровский'),('Пескарь дунайский'),('Пуголовка звездчатая'),
('Пузанок'),('Рыбец'),('Рыбец малый'),('Севрюга'),('Стерлядь'),('Синец'),('Сом'),('Судак'),('Судак морской'),('Угорь'),
('Уклейка'),('Умбра'),('Усач обыкновенный'),('Усач днепровский'),('Усач крымский'),('Усач дунайско-днестровский'),
('Усач Валецкого'),('Форель ручьевая'),('Форель озерная'),('Хариус европейский'),('Чехонь'),('Чоп большой'),('Чоп малый'),
('Шип'),('Шемая крымская'),('Шемая азовская'),('Шемая черноморская'),('Щиповка обыкновенная'),('Щиповка сибирская'),
('Щиповка южнорусская'),('Щиповка дунайская'),('Щиповка азовская'),('Щиповка таврическая'),('Щиповка северная золотистая'),
('Щука'),('Язь'),('Амур белый'),('Амур черный'),('Гамбузия'),('Медака китайская'),('Ротан'),('Сом канальный'),('Солнечный окунь'),
('Толстолобик белый'),('Толстолобик пестрый'),('Чебачок амурский'),('Форель радужная');
-------------------------------------------------------------------------------------
--DROP SEQUENCE public.dic_fish_kind_id_seq;
CREATE SEQUENCE IF NOT EXISTS fishingapp.dic_fish_kind_id_seq;

-- Dumping structure for table public.dic_fish_kind
CREATE TABLE IF NOT EXISTS fishingapp.dic_fish_kind (
fish_kind_id integer NOT NULL DEFAULT nextval('fishingapp.dic_fish_kind_id_seq'::regclass),
fish_kind_name varchar(200) NOT NULL,
PRIMARY KEY (fish_kind_id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE fishingapp.dic_fish_kind
  OWNER TO fisher;

-- Dumping data for table public.dic_fish_type: ~4 rows (approximately)
/*!40000 ALTER TABLE `dic_fish_kind` DISABLE KEYS */;
INSERT INTO fishingapp.dic_fish_kind (fish_kind_name) VALUES
('ХИЩНАЯ'),('МИРНАЯ');
-------------------------------------------------------------------------------------