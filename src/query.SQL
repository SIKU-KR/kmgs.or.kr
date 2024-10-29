CREATE TABLE image
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    order_num  INT          NOT NULL,
    url        VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CONVERT_TZ(CURRENT_TIMESTAMP, 'US/Pacific', 'Asia/Seoul')
);

CREATE TABLE notice
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    title      VARCHAR(255) NOT NULL,
    content    TEXT,
    created_at TIMESTAMP DEFAULT CONVERT_TZ(CURRENT_TIMESTAMP, 'US/Pacific', 'Asia/Seoul'),
    expired_at TIMESTAMP DEFAULT NULL
);

CREATE TABLE president
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    img_url    VARCHAR(255),
    title      VARCHAR(255) NOT NULL,
    content    TEXT,
    created_at TIMESTAMP DEFAULT CONVERT_TZ(CURRENT_TIMESTAMP, 'US/Pacific', 'Asia/Seoul')
);

CREATE TABLE member
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    position     VARCHAR(100),
    name         VARCHAR(100) NOT NULL,
    organization VARCHAR(100),
    created_at   TIMESTAMP DEFAULT CONVERT_TZ(CURRENT_TIMESTAMP, 'US/Pacific', 'Asia/Seoul')
);