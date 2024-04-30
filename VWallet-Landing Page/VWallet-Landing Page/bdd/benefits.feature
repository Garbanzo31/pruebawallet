Feature: HU03: Como usuario saber los beneficios de la web y la aplicación 
Scenario: E01: Usuario desea saber cuales son los beneficios de utilizar la aplicación  
	TA01:
	Given el usuario ingresa a la web
	When el usuario se encuentre en la pantalla principal 
	and se desplaza hacia abajo
	Then podrá apreciar todos los beneficios que se ofrecen con la app.
Example:
|	Ventana principal	|	 Visualiza la información |

Scenario: E02: Usuario ingresa a la opción de Contáctanos para obtener más información sobre los beneficios de la aplicación 
	TA02:
	Given el usuario quiere obtener detalle sobre la aplicación 
	When selecciona la opción Contáctanos
Then visualiza un menú para llenar sus datos 
and se podrá contactar con un asesor para obtener mayor detalle.
	Example:
		|	Página principal	|	Botón Contáctanos	|	Llenado del formulario	| Clic en Enviar	| Se le brinda detalle sobre el uso de la app y los beneficios |

Esta HU se relaciona con la opción de poder contactarse con el área de atención al usuario y así saber sobre los beneficios de utilizar la app.