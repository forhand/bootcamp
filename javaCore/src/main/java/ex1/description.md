## Условия задачи
1. Создать класс `User` со следующими полями:

* имя;
* возраст;
* место работы;
* адрес.

2. В этом же классе создать статический метод `groupUsers`, который 
принимает `List` из объектов `User` и возвращает `Map`, где ключом является возраст 
пользователя, а значением — список из всех пользователей в оригинальном списке, которые 
имеют соответствующий возраст.