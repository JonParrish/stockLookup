CREATE TABLE IF NOT EXISTS `mydb`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))

CREATE TABLE IF NOT EXISTS `mydb`.`storedStocks` (
  `stock_id` INT NOT NULL AUTO_INCREMENT,
  `stockName` VARCHAR(45) NOT NULL,
  `stockPrice` INT NOT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`stock_id`),
  INDEX `fk_storedStocks_users1_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_storedStocks_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
ENGINE = InnoDB
