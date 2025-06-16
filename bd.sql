use vsptours;
CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,        -- Identificador único del usuario
    nombre VARCHAR(100) NOT NULL,             -- Nombre completo del usuario
    email VARCHAR(100) UNIQUE NOT NULL,       -- Correo electrónico único
    telefono VARCHAR(15) NOT NULL,            -- Número de teléfono del usuario
    fechaNacimiento DATE NOT NULL,            -- Fecha de nacimiento del usuario
    contrasena VARCHAR(255) NOT NULL          -- Contraseña hasheada
);

CREATE TABLE reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,        -- Identificador único de la reserva
    nombreCliente VARCHAR(100) NOT NULL,      -- Nombre del cliente que realiza la reserva
    apellidosCliente VARCHAR(100) NOT NULL,   -- Apellidos del cliente
    numeroTelefono VARCHAR(15) NOT NULL,      -- Número de teléfono del cliente
    correo VARCHAR(100) NOT NULL,             -- Correo del cliente
    distrito VARCHAR(100) NOT NULL,           -- Distrito del cliente
    fechaViaje DATE NOT NULL,                 -- Fecha del viaje
    destino VARCHAR(100) NOT NULL,            -- Lugar de destino
    tipoMovilidad VARCHAR(50) NOT NULL,       -- Tipo de movilidad (Minivan, Van, etc.)
    ubicacionRecojo VARCHAR(255),             -- Ubicación de recojo (puede ser opcional)
    usuario_id INT,                           -- Relación con el usuario que hizo la reserva
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)  -- Clave foránea que conecta con la tabla usuario
);

CREATE TABLE contacto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    mensaje TEXT NOT NULL,
    fechaEnvio DATETIME(6) NOT NULL
);