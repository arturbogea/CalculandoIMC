# Calculadora IMC

Fiz um novo aplicativo . 
Nesta nova versão, pus em prática meus conhecimentos em fragments. Utilizando apenas uma activity, pude implementar vários fragments conforme necessário. 
No meu caso, utilizei 2 fragments: um para receber os dados do usuário e outro para realizar os cálculos e exibir o resultado final. 
Com o tempo, pretendo aprimorar minhas habilidades de design de interface para deixar o aplicativo mais atraente visualmente.

Para desenvolvê-lo, utilizei várias ferramentas e tecnologias, como:


* Fragmentos (Fragments): Utilizei fragmentos para dividir a interface do usuário em partes modulares e reutilizáveis.
* View Binding: Utilizei o recurso de View Binding para vincular os elementos da interface do usuário (como botões, campos de texto) no layout XML aos seus equivalentes no código Kotlin, evitando a necessidade de usar findViewById.
* Bundles: Utilizei  Bundles para passar dados entre fragmentos, como ao passar os valores de peso e altura do CalculoIMC para o ResultadoIMC.
* Navigation Component: utilizei o Navigation Component para gerenciar a navegação entre os fragmentos, especificamente no método btnCalcular.setOnClickListener onde você está navegando do CalculoIMC para o ResultadoIMC.
* Recursos de Interface do Usuário (UI): VUtilizei para alterar a aparência e o conteúdo da interface do usuário com base em diferentes condições, como o resultado do cálculo do IMC, alterando as cores do texto e a imagem exibida com base no resultado do IMC.
* Manipulação de Exceções: Para tratar caso algum dado retorne nulo

=
https://github.com/arturbogea/CalculandoIMC/assets/41833522/92056f3b-888c-4764-96c2-d2a9cbca93a5

