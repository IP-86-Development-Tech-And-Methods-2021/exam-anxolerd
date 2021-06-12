==================
Задание на экзамен
==================

.. note::

   Это пример выполнения экзаменационного задания, а не еднственно верный
   способ его выполнить.

Выполнение
==========

Часть 1. Работа с Git
---------------------

Пример выполнения задания:

.. code-block:: bash

   # Клонирую репозиторий для работы с ним локально
   git clone ...

   # создаю ветку `git-practice-1` и сразу же на неё переключаюсь
   git checkout -b git-practice-1

   # После редактирования файла STUDENT.txt фиксирую изменения
   git add STUDENT.txt
   git commit

   # отправляю изменения на GitHub
   git push origin git-practice-1

   # переключаюсь на ветку main
   git checkout main

   # выполняю слияние ветки git-practice-1 в ветку `main`
   # Обратите внимание на аргумент --no-ff: он нужен для того, чтобы создать
   # merge-commit, а не просто fast-forward
   git merge --no-ff git-practice-1

   # создаю ветку `git-practice-2` и переключаюсь на нее
   git checkout -b git-practice-2

   # создаю файл HelloExam.java и добавляю в него первую версию содержания
   # (процесс редактирования файлов в примере пропущен, так как каждый волен
   # редактировать файл как им удобно)
   # после чего фиксирую изменения
   git add HelloExam.java
   git commit

   # редактирую файл HelloExam.java и изменяю его содержимое согласно задания
   # (процесс редактирования файлов в примере пропущен, так как каждый волен
   # редактировать файл как им удобно)
   # после чего фиксирую изменения
   git add HelloExam.java
   git commit

   # переключаюсь на ветку main
   git checkout main

   # Выполняю слияние ветки `git-practice-2` в ветку `main` используя fast-forward
   # Обратите внимание на аргумент --ff, он указывает на то,
   # что необходимо выполнить слияние методом fast-forward
   git merge --ff git-practice-1

Часть 2. Написание кода и тестов
--------------------------------

Все изменения, связанные с выполнением второй части задания доступны по ссылке:
`Часть 2. Пример выполнения задания
<https://github.com/IP-86-Development-Tech-And-Methods-2021/exam-anxolerd/compare/5ff6ad6a25ddb4266060f32b9ecd3206150e6ba3...83b4ae1>`_


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
