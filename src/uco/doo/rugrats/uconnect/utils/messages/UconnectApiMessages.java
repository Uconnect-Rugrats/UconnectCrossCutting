package uco.doo.rugrats.uconnect.utils.messages;

public class UconnectApiMessages {
	private UconnectApiMessages() {
		super();
	}

	public static final String UNEXPECTED_TECHNYCAL_ERROR_MESSAGE = "Se ha presentado un problema inesperado. Por favor, validar la consola";
	public static final String UNEXPECTED_USER_ERROR_MESSAGE = "Se ha presentado un problema inesperado. Por favor contacte con el administrador del sistema";

	public class ComentarioControllerMessages {
		private ComentarioControllerMessages() {
			super();
		}

		public static final String CREATE_MESSAGE = "los comentarios han sido consultados exitosamente";
		public static final String LIST_MESSAGE = "El nuevo comentario fue registrado de forma satisfactoria";
		public static final String MODIFY_MESSAGE = "El comentario fue modificado de forma satisfactoria";
		public static final String DELETE_MESSAGE = "El comentario fue eliminado de forma satisfactoria";
	}

	public class EstadoControllerMessages {
		private EstadoControllerMessages() {
			super();
		}

		public static final String READ_MESSAGE = "Estados consultados exitosamente";
	}

	public class GrupoControllerMessages {
		private GrupoControllerMessages() {
			super();
		}

		public static final String READ_MESSAGE = "Grupos consultados exitosamente";
	}

	public class OrganizacionControllerMessages {
		private OrganizacionControllerMessages() {
			super();
		}

		public static final String READ_MESSAGE = "Estados consultados exitosamente";
	}

	public class CommonValidators {
		private CommonValidators() {
			super();
		}

		public static class CommonUUIDValidator {
			private CommonUUIDValidator() {
				super();
			}

			public static final String UUID_IS_DEFAULT = "No es posible tener el identificador por defecto";
			public static final String UUID_IS_NULL = "No es posible continuar con el identificador vacío";
		}

		public static class CommonTextValidator {
			private CommonTextValidator() {
				super();
			}

			public static final String TEXT_IS_NULL = "No es posible continuar con el contenido del comentario vacío";

			public static final String generateMessagetextHasNOTLenghtAllowed(final int minimunLenght, final int maximunLenght) {
				return "El contenido del comentario no puede ser menor a " + minimunLenght + " y mayor a "
						+ maximunLenght + " caracteres";
			}
		}

		public static class CommonDateValidator {
			private CommonDateValidator() {
				super();
			}

			public static final String DATE_IS_NULL = "No es posible continuar con la fecha vacío";
		}
		
		public static class CommonObjectValidator {
			private CommonObjectValidator() {
				super();
			}

			public static final String generateMessageObjectIsNull(String businessName) {
				return "No es posible continuar con los datos de " + businessName + " del grupo vacios";
			}
			
			public static final String generateMessageObjectIsDefault(String businessName) {
				return "No es posible continuar con los datos de " + businessName + " del grupo con sus valores por defecto";
			}
		}
	}
}
