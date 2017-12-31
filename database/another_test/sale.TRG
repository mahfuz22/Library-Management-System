TYPE=TRIGGERS
triggers='CREATE DEFINER=`root`@`localhost` TRIGGER `another_test`.`before_sale` before insert on sale\nFOR EACH ROW BEGIN\n  update books set qty=qty-NEW.qty\n  where b_id=NEW.b_id;\nEND'
sql_modes=1344274432
definers='root@localhost'
