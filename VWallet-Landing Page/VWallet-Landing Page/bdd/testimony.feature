Feature: HU06: Como usuario quiere corroborar los comentarios de otros usuarios
Scenario: E01: Usuario desea visualizar comentarios de otros usuarios
	TA01:
	Given: el usuario quiere ver los comentarios de otros usuarios
	When ingresa a la web 
	and Scrolea hacia abajo
	Then podrá visualizar los comentarios de los clientes que usaron la aplicación 
Example:
	|	Ventana principal	|	Scroll hacia abajo      	  |	 Visualiza los comentarios de los usuarios |

Esta HU se relaciona con la visualización de comentarios realizados por los mismos usuarios acerca de su experiencia con la aplicación.