create database SanrioFansMemberDb;

CREATE TABLE users (
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    favorite_character VARCHAR(100),
    phone_number VARCHAR(15)
);
INSERT INTO users (first_name, last_name, email, password, favorite_character, phone_number) VALUES ('Mack', 'Cito', 'titi@gmail.com', 'mango', 'Gudetama', '1234567890');

INSERT INTO users (first_name, last_name, email, password, favorite_character, phone_number) VALUES
('Juan', 'Perez', 'juan.perez@gmail.com', '1234', 'Hello Kitty', '809-555-1234'),
('Maria', 'Gomez', 'maria.gomez@outlook.com', '12345', 'My Melody', '829-555-5678'),
('Pedro', 'Rodriguez', 'pedro.rodriguez@live.com', 'hashed_password_3', 'Keroppi', '849-555-9101'),
('Ana', 'Martinez', 'ana.martinez@gmail.com', 'hashed_password_4', 'Badtz-Maru', '809-555-2345'),
('Carlos', 'Garcia', 'carlos.garcia@outlook.com', 'hashed_password_5', 'Pompompurin', '829-555-6789'),
('Laura', 'Hernandez', 'laura.hernandez@live.com', 'hashed_password_6', 'Cinnamoroll', '849-555-1112'),
('Luis', 'Lopez', 'luis.lopez@gmail.com', 'hashed_password_7', 'Kuromi', '809-555-3456'),
('Elena', 'Diaz', 'elena.diaz@outlook.com', 'hashed_password_8', 'Chococat', '829-555-7890'),
('Jose', 'Sanchez', 'jose.sanchez@live.com', 'hashed_password_9', 'Little Twin Stars', '849-555-1314'),
('Rosa', 'Ramirez', 'rosa.ramirez@gmail.com', 'hashed_password_10', 'Tuxedo Sam', '809-555-4567'),
('Miguel', 'Fernandez', 'miguel.fernandez@outlook.com', 'hashed_password_11', 'Gudetama', '829-555-8901'),
('Carmen', 'Mendez', 'carmen.mendez@live.com', 'hashed_password_12', 'Dear Daniel', '849-555-1516'),
('Javier', 'Alvarez', 'javier.alvarez@gmail.com', 'hashed_password_13', 'Pochacco', '809-555-5678'),
('Patricia', 'Castillo', 'patricia.castillo@outlook.com', 'hashed_password_14', 'Mimmy', '829-555-9012'),
('Fernando', 'Morales', 'fernando.morales@live.com', 'hashed_password_15', 'Keroppi', '849-555-1718');


SELECT * FROM users;