-- Create database
CREATE DATABASE IF NOT EXISTS vehicle_db;

USE vehicle_db;

---------------------------------------------------
-- Vehicle Table
---------------------------------------------------
CREATE TABLE IF NOT EXISTS vehicle (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    owner_name VARCHAR(100),
    vehicle_number VARCHAR(50),
    model VARCHAR(100),
    type VARCHAR(50)
);

---------------------------------------------------
-- Booking Table
---------------------------------------------------
CREATE TABLE IF NOT EXISTS booking (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    vehicle_number VARCHAR(50),
    service_type VARCHAR(100),
    date VARCHAR(50),
    status VARCHAR(50)
);

---------------------------------------------------
-- Mechanic Table
---------------------------------------------------
CREATE TABLE IF NOT EXISTS mechanic (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    location VARCHAR(150),
    phone VARCHAR(20)
);

---------------------------------------------------
-- Sample mechanics (for testing)
---------------------------------------------------
INSERT INTO mechanic (name, location, phone) VALUES
('Ravi Auto Works', 'Chennai', '9876543210'),
('Speed Garage', 'Coimbatore', '9123456780'),
('City Car Care', 'Madurai', '9000011111');
