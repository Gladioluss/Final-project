# Final-project, 9 вариант
Последовательность выполнения моей итоговой работы:
  
  1.В классе Main.java мы создаём объект класса Schools.java, в который предаём относительную ссылку на CSV файл.
  
  2.В классе Schools.java создаётся список listSchools, в котором будут храниться все данные о школах.
  
  3.listSchools мы заполняем при помощи CSV парсера.
  
  4.CSV парсер проходит по всем строкам CSV файла school.csv и заполняет listSchools элементами класса School, в которых хранится вся информация об отдельно взятой школе.
  
  5.Далее мы создаем объект клсса DbHandler.java, чтобы подключится к нашей базе данных, в которую мы будем выгружать данные с помощью метода addSchoolInDB.
  
  6.Далее приступим к выполнению задач из нашего варианта.
  
  7.1 При помощи sql запросовв методах: findAverageNumberPeopleInTenCountries, displayAverageAmountExpenses, displaySchoolWithMaxMath. Получаем данные для выполния задач. Так же мы строим график при помощи библиотеки JFreeChart для превой задачи.
  
  Выходные данные для первой задачи: 
  
  ![image](https://user-images.githubusercontent.com/74546538/147416808-76d1add3-1a2d-448a-b878-e0c113efe484.png)
  
  
  График для первой задачи: 
  ![image](https://user-images.githubusercontent.com/74546538/147416563-117a1d5d-9149-4927-b669-83a5fd8fa42b.png)
  
  Выходные данные для второй задачи: 
  ![image](https://user-images.githubusercontent.com/74546538/147416829-4a428b41-4655-4890-82d5-c46622e049b1.png)
  
  Выходные данные для nhtntq задачи: 
  ![image](https://user-images.githubusercontent.com/74546538/147416842-368a279a-3703-4018-be83-7a7a7672e8cf.png)
