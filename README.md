# Final-project, 9 вариант
Последовательность выполнения моей итоговой работы:
  1.В классе Main.java мы создаём объект класса Schools.java, в который предаём относительную ссылку на CSV файл.
  
  2.В классе Schools.java создаётся список listSchools, в котором будут храниться все данные о школах.
  
  3.listSchools мы заполняем при помощи CSV парсера.
  
  4.CSV парсер проходит по всем строкам CSV файла school.csv и заполняет listSchools элементами класса School, в которых хранится вся информация об отдельно взятой школе.
  
  5.Далее мы создаем объект клсса DbHandler.java, чтобы подключится к нашей базе данных, в которую мы будем выгружать данные с помощью метода addSchoolInDB.
  
  6.Далее приступим к выполнению задач из нашего варианта.
  
  7.1 При помощи sql запросовв методах: findAverageNumberPeopleInTenCountries, displayAverageAmountExpenses, displaySchoolWithMaxMath. Получаем данные для выполния задач. Так же мы строим график при помощи библиотеки JFreeChart для превой задачи.
  
  Выходные данные для первой задачи: ![image](https://user-images.githubusercontent.com/74546538/147416521-4d22c854-3505-49ba-a89a-d016d4e62096.png)
  График для первой задачи: ![image](https://user-images.githubusercontent.com/74546538/147416563-117a1d5d-9149-4927-b669-83a5fd8fa42b.png)
  
  Выходные данные для второй задачи: ![image](https://user-images.githubusercontent.com/74546538/147416533-082c61c2-5d22-47cc-a60d-cee204a90fa5.png)
  
  Выходные данные для nhtntq задачи: ![image](https://user-images.githubusercontent.com/74546538/147416537-27de8f9a-2f93-40b3-8c05-ee64cc033404.png)
