==================
Задание на экзамен
==================

Часть 1. Работа с Git
=====================

1. Из ветки ``main`` репозитория создайте ветку ``git-practice-1``.

2. В ветке ``git-practice-1`` отредактируйте файл `STUDENT.txt
   </student.txt>`_, путём замены выражений в фигурных скобках (``{{ ... }}``)
   на соответствующие значения. Например, вместо ``{{ ГРУППА }}`` вы должны
   подставить название вашей учебной группы ``ИП-86``. Зафиксируйте изменения
   при помощи одного или более коммитов.

3. Слейте изменения из ветки ``git-practice-1`` в ветку ``main`` при помощи
   merge-commit.

   .. important::

      Не удаляйте ветку ``git-practice-1`` после слияния. Оставьте её в истории репозитория.

4. Создайте ветку ``git-practice-2``.

5. В ветке ``git-practice-2`` создайте файл ``HelloExam.java`` со следующим содержанием:

   .. code-block:: java

      public class HelloExam {
        public static void main(String[] args) {
            System.out.println("Hello, exam");
        }
      }

   Зафиксируйте изменения создав коммит.

6. В ветке ``git-practice-2`` внесите изменения в файл ``HelloExam.java``
   (созданный в предыдущем пункте) так, чтоб содержимое файла было следующим:

   .. code-block:: java

      import java.util.Date;

      public class HelloExam{
        private Date date;

        public static void main(String[] args){
          HelloExam greeter = new HelloExam();
          greeter.greet();
        }

        HelloExam() {
          this.date = new Date();
        }

        public void greet() {
          System.out.println("Hello Exam!");
          System.out.println("Today is " + this.date);
        }
      }

   Зафиксируйте изменения, создав коммит.

7. Выполните слияние ветки ``git-practice-2`` в ветку ``main`` используя fast-forward.

Часть 2. Написание кода и тестов
================================

Нужно реализовать проект в папке `heapster_watch </heapster_watch>`_, добавив
реализацию класса ``HeapsterWatchImpl`` и написав тесты. Все изменения в
проекте зафиксировать одним или несколькими коммитами.


Спецификация класса HeapsterWatchImpl описана в документации интерфейса ``HeapsterWatch``.
