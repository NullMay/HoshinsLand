# HoshinsLand

Система фриланса

Читатели приходят, видят список работ, опять же, выбирают что хотят. Приходит переводчик , видит спрос на работу и говорит "я готов перевести эту работу за 10$". Люди собирают ему на работу, после того как деньги были собраны ему отправляется половина суммы. Остальная половина оплачивается после того, как он выкладывает работу. В случае если люди внесли деньги , но сумма не собралась, деньги после некоторого времени возвращаются.
Немалая часть твоей части была в аудио, так что соррян, скорее всего я воспроизвел близко не до конца или неверно



Система контеста

Контест начинается с выхода главы, длительность контеста условно неделя. За эту неделю собирается приз и в конце выкладываются все работы переводчиков разом. Если за неделю не было прислано работ, то у читателя есть выбор повысить ставку,забрать деньги или оставить их. Срок вывода ограничен, условно 1-2 дня.Спустя очередной срок проведения контеста в случае отсутствия работ процесс повторяется.В случае если переводы были выложены, то дается еще одная условная неделя на оценку. Общий рейтинг устанавливается по этой формуле https://www.evanmiller.org/how-not-to-sort-by-average-rating.html . Оценка читателей показывается только после окончания контеста. Приз делится по процентно/местам/достается победителю.

1) Users, Roles, Novels, Contests, Translations, Accounts (счёт пользователя), Wallets (потом, пока без него): основные объекты
2) Roles, как часть для Users: Admin, Reader, Translator
3)  - Reader, Translator -> Добавить новеллу, изменить или удалить то, что сам добавил (спорно, надо подумать, но пока можно так);
	- Reader -> пополнить счёт на определённю сумму usd/rub, вообще то это Wallets, поэтому лучше оставить пока этот функцинонал и сделать, как в след пункте
	- Admin -> Изменять счета пользователя (пополнять, изменять), кажется сейчас лучше сделать только так, без прямого пополнения юзером, это сложно
	- Admin -> Создасть контест по какой-либо новелле (пока так, потом будет автоматически), завершить контест досрочно (просто для удобства, не будем же ждать неделю)
	- Reader -> участие в контесте, блокируется на счёте определённая сумма (допустим 100 rub или эквивалент в usd, вообще можно пока только rub), надо связать читетля и контест таблицей UserContests
	- Translator -> Выложить работу, т.е создать перевод в таблице Translations, нужно хранилище для переводов будет, если документ, либо ссылка на сайт с перводов, тоже надо подумать
	- Reader -> Оценить перевод (что кстати с количеством оценок? Он может оценить все работы? Или только несколько? Или только одну?)
4)  1- Начинается контест
	2- В течени недели (значение будет в таблице Contests) readers жмут Participate и у них на счету блокируется сумма, если достаточно средств (сумма также будет задана в таблице Contests)
	3- В течении этой же недели переводчики могут выкладывать свои переводы, но опубликовываться они не будут (просто чтобы переводчикам не приходилось ждать, чтобы опубликовать)
	4- По окончании недели система смотрит хватает ли работ (одной будет достаточно? Или нужно минимальное 2 или может дальше больше?)
		-да, хватает, то к пункту 5
		-нет, не хватает, тогда уведомляем пользователей о том, что у них есть 2 дня (задаётся в таблице Contests) на то, чтобы выбрать: отменить участие, увеличить сумму (например новая сумма стала равна 200, в 2 раза больше) или оставить как есть, по истчении 2 дней переходим к пункту 1. Сумма уже поменялась, не 100, как было изначально, а 200, т.е новые участиники должны платить 200 (или нет?)
		-слишком долго нет участиников, уже пол года допустим, при этом сумма общая особо больше не становится, надо чё-то делать в этом случае, пока что можно просто закрывать контест
	5- Уведомляем пользователей о том, что переводы стали доступны и они могут начать ознакомление и оценку (длится допустим неделю, также задаётся в таблице Contests), в течении этого времени читетели ставят оценки
	6- По истечении недели публикуем оценки и рассчитываем результат по той формуле, определяем общий score у переводов и распределяем награду по процентам, допустим по нашей формуле первые получил 0.6, второй 0.3, третий 0.1, четвёртый 0 => выведем score наверное по стобальной, т.е первый 60, второй 30, третий 10, четвёртый 0 и распределение соотвественно будет в процентном соотношении из общего скора, т.е 60+30+10+0=90, значит первый получает 60/90 приза=66%; второй 30/90=33%, третий 10/90=11%, четвёртый ничего не получает
	7- контест завершается, теперь осталось подумать что делать с переводами, какой к ним доступ? переводы надо прикрепить к новеллам и наврерное пускать оставить монетизацию, т.е также 100 руб чтобы прочитать и эти 100 руб переводчику (или как сделаем? может бесплатно?)
