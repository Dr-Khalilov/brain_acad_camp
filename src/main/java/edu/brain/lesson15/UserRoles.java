package edu.brain.lesson15;

enum UserRoles {
    DIRECTOR("Директор магазина, может управлять кадрами, и ценами!"),
    ADMINISTRATOR("Администратор магазина, может добавлять товары и редактировать их описание!"),
    MANAGER("Менеджер магазина, может общаться с клиентами!"),
    CUSTOMER("Клиент магазина, может покупать товары и пользоваться дисконтом!"),
    ANONYMOUS("Анонимный пользователь, может покупать товары и авторизоваться!");

    final String description;

    UserRoles(String description) {
        this.description = description;
    }
}
