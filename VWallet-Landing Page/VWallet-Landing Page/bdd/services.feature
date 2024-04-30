Feature: HU05: Como usuario deseo ver a detalle los servicios que brinda la aplicación
Scenario: E01: Usuario visualiza los servicios que ofrece la aplicación
	TA01:
	Given el usuario quiere ver los servicios que ofrece la aplicación 
	When ingresa a la web
	Then visualiza a detalle las opciones que brinda la aplicación
	Example: 
		|	Ventana de Inicio	|	Visualiza información |
  
Scenario: E02: Usuario ingresa a la opción de Contáctanos para obtener más información sobre los servicios de la aplicación 
	TA02:
	Given el usuario quiere obtener detalle sobre la aplicación 
	When selecciona la opción Contáctanos
	Then visualiza un menú para llenar sus datos y contactarse con un asesor.
	Example:
		|	Página principal	|	Botón Contáctanos	|	Llenado del formulario	| Clic en Enviar |

Esta HU se relaciona con las características que brinda la app para los clientes.