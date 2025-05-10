Olá, este repositório contém meu código em resposta a um exercício sobre listas em Java!

Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.

Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar operação final. Ao final, mostrar a listagem atualizada dos funcionários conforme exemplos.

Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pde ser aumentado com base em um operação de aumento por porcentagem dada. 


Exemplo 1 (Id correto):
How many employees will be registered? 3

Employee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Employee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Employee #3:
Id: 772
Name: Bob Green
Salary: 5000.00

Enter the employee id that will have salary increase : 536  
Enter the percentage: 10.0

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00


Exemplo 2 (Id incorreto):
How many employees will be registered? 2

Employee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Employee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Enter the employee id that will have salary increase: 776  
This id does not exist!

List of employees:
333, Maria Brown, 4000.00  
536, Alex Grey, 3000.00

