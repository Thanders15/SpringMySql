Aplikacja webowa z bazą danych MySql.
Użytkownicy znajdują się w lokalnej bazie danych, logowanie następuje w sytuacji gdy użytkownik poda poprawne dane logowania. Są dwa rodzaje użytkowników, ADMIN i USER. 
Posiadają oni dostęp do różnych stron (Admin ma taki zasięg jak user tylko powiększony). Póki co gdy użytkownik nie posiadający Admina zaloguje się, a następnie będzie
chcieć przenieść się na stronę dla Admina to dostanie błąd 403.
