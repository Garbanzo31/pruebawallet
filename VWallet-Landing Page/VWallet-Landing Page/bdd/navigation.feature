Feature: HU04: Como usuario quiere utilizar los enlaces web
Scenario: E01: Usuario desea aplicar los enlaces web 
	TA01:
	Given el usuario ingresa a la web
	When el usuario se encuentre en la pantalla principal 
	and se desplaza hacia abajo
	Then podrá apreciar todos los enlaces web que se tiene dentro de la web
	Example:
|	Ventana principal	|	Scroll hacia abajo      	  |	 Visualiza la información |

El HU se relaciona con los enlaces a utilizar en la web