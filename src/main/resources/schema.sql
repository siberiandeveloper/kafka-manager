CREATE TABLE IF NOT EXISTS messages (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    sender      VARCHAR NOT NULL,
    recipient   VARCHAR NOT NULL,
    text        VARCHAR NOT NULL
);