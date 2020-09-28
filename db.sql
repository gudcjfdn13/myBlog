# 데이터베이스 생성
DROP DATABASE IF EXISTS `myBlog`;
CREATE DATABASE `myBlog`;

USE `myBlog`;

# article 테이블 생성
CREATE TABLE article(
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    `title` CHAR(200) NOT NULL,
    `body` TEXT NOT NULL
);

# article 데이터 생성

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
`title` = '제목1', 
`body` = '내용1';

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
`title` = '제목2', 
`body` = '내용2';