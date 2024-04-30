Feature: HU02: Como usuario quiero descargar la aplicación en mi celular
Scenario: E01: Usuario desea descargar la aplicación 
	TA01:
	Given el usuario quiere descargar la aplicación 
	When ingresa a la ventana principal
	Then scrolea hacia abajo 
	And da clic en descargar según su sistema operativo 
	Example:
	|	Ventana principal	|	Scroll hacia abajo      	  |	 Clic en descargar según el sistema operativo |

Esta HU hace referencia al proceso para descargar la aplicación desde la web hacia un dispositivo móvil
