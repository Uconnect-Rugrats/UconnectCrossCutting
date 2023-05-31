package uco.doo.rugrats.uconnect.utils;

public class Messages {
	
	public static final class UtilSqlMessages{
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "No es posible validar si una conexion esta abierta cuando se encuentra nula";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String OPEN_CONNECTION_USER_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String OPEN_CONNECTION_TECHNICAL_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String UPDATE_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String UPDATE_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String BEGIN_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String BEGIN_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CONFIRM_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CONFIRM_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CANCEL_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CANCEL_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
	}
	public static final class EstadoFacadeImplMessages{
		private EstadoFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el estado, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el estado, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class AdministradorEstructuraFacadeImplMessages{
		private AdministradorEstructuraFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Administrador Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Administrador Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Administrador Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Administrador Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Administrador Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class AdministradorOrganizacionFacadeImplMessages{
		private AdministradorOrganizacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Administrador Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Administrador Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Administrador Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Administrador Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Administrador Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Administrador Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Administrador Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Administrador Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Administrador Organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Administrador Organizacion, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class AgendaFacadeImplMessages{
		private AgendaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Agenda. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Agenda, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Agenda. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Agenda, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Agenda. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Agenda, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Agenda. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Agenda, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado de la Agenda. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado de la Agenda, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class CausaReporteFacadeImplMessages{
		private CausaReporteFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Causa Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Causa Reporte, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Causa Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Causa Reporte, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Causa Reporte. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Causa Reporte, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la v. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Causa Reporte, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ChatFacadeImplMessages{
		private ChatFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Chat. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Chat, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Chat. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Chat, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Chat. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Chat, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Chat. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Chat, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Chat. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Chat, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ComentarioFacadeImplMessages{
		private ComentarioFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Comentario, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class EstructuraAdministradorEstructuraFacadeImplMessages{
		private EstructuraAdministradorEstructuraFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Administrador a la Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Estructura Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Estructura Administrador Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Estructura Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Estructura Administrador Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Estructura Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Estructura Administrador Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Estructura Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado de la Estructura Administrador Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado de la Estructura Administrador Estructura, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class EstructuraFacadeImplMessages{
		private EstructuraFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Estructura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado de la Estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado de la Estructura, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class EventoFacadeImplMessages{
		private EventoFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Evento. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Evento, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Evento. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Evento, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Evento. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Evento, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Evento. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Evento, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Evento. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Evento, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class GrupoFacadeImplMessages{
		private GrupoFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Grupo, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class HistorialChatGrupoFacadeImplMessages{
		private HistorialChatGrupoFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Historial Chat del Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Historial Chat Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Historial Chat Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Historial Chat Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Historial Chat Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Historial Chat Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Historial Chat Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Historial Chat Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Historial Chat Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Historial Chat Grupo, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class HistorialLecturaFacadeImplMessages{
		private HistorialLecturaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Historial de Lectura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Historial Lectura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Historial Lectura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Historial Lectura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Historial Lectura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Historial Lectura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Historial Lectura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Historial Lectura, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Historial Lectura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Historial Lectura, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class MensajeFacadeImplMessages{
		private MensajeFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Mensaje, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class  OrganizacionAdministradorOrganizacionFacadeImplMessages{
		private OrganizacionAdministradorOrganizacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Organización Administrador Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Organización Administrador Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Organización Administrador Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Organización Administrador Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Organización Administrador Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Organización Administrador Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Organización Administrador Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Organización Administrador Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado de la Organizacion Administrador Organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado de la Organizacion Administrador Organizacion, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class  OrganizacionFacadeImplMessages{
		private OrganizacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Organización, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Organización. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Organización, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class PaisFacadeImplMessages{
		private PaisFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el País. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo País, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el País. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el País, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el País. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el País, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el País. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el País, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ParticipanteFacadeImplMessages{
		private ParticipanteFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Participante, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Participante, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Participante, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Participante, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Participante, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ParticipanteGrupoFacadeImplMessages{
		private ParticipanteGrupoFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Participante Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Participante Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Participante Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Participante Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Participante Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Participante Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Participante Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Participante Grupo, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Participante Grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Participante Grupo, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class  PersonaFacadeImplMessages{
		private PersonaFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Persona, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Persona, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Persona, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Persona, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class  PublicacionFacadeImplMessages{
		private PublicacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado de la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado de la Publicación, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class  ReaccionFacadeImplMessages{
		private ReaccionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de reaccionar. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Reacción, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Reacción. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Reacción, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Reacción. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Reacción, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Reacción. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Reacción, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado de la Reacción. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado de la Reacción, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ReporteComentarioFacadeImplMessages{
		private ReporteComentarioFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Reporte al Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Reporte Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Reporte Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Reporte Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Reporte Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ReporteMensajeFacadeImplMessages{
		private ReporteMensajeFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Reporte al Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Reporte Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Reporte Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Reporte Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Reporte Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class ReportePublicacionFacadeImplMessages{
		private ReportePublicacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de registrar el Reporte a la Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar el nuevo Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar el Reporte Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar el Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Reporte Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar el Reporte Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar el Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado del Reporte Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado del Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class  RespuestaReporteComentarioFacadeImplMessages{
		private RespuestaReporteComentarioFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de Responder a al Comentario Reportado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Respuesta Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Respuesta Reporte Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Respuesta Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Respuesta Reporte Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Respuesta Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Respuesta Reporte Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Respuesta Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado de la Respuesta al Reporte Comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado de la Respuesta Reporte Comentario, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class  RespuestaReporteMensajeFacadeImplMessages{
		private RespuestaReporteMensajeFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de Responder a al Mensaje Reportado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Respuesta Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Respuesta Reporte Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Respuesta Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Respuesta Reporte Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Respuesta Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Respuesta Reporte Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Respuesta Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado de la Respuesta Reporte Mensaje. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado de la Respuesta Reporte Mensaje, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class  RespuestaReportePublicacionFacadeImplMessages{
		private RespuestaReportePublicacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_REGISTER = "Se ha presentado un problema tratando de Responder a la Publicación Reportada. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_REGISTER = "Se ha presentado una excepcion no conocida al momento de registrar la nueva Respuesta Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_MODIFY = "Se ha presentado un problema tratando de modificar la Respuesta Reporte Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_MODIFY = "Se ha presentado una excepcion no conocida al momento de modificar la Respuesta Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar la Respuesta Reporte Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar la Respuesta Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_DROP = "Se ha presentado un problema tratando de eliminar la Respuesta Reporte Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DROP = "Se ha presentado una excepcion no conocida al momento de eliminar la Respuesta Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_STATE = "Se ha presentado un problema tratando de obtener el estado de la Respuesta Reporte Publicación. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_STATE = "Se ha presentado una excepcion no conocida al momento de obtener el estado de la Respuesta Reporte Publicación, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class TipoEstadoFacadeImplMessages{
		private TipoEstadoFacadeImplMessages(){}
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Estado, por favor valide la traza completa de la excepcion presentada";
		}
	public static final class TipoEventoFacadeImplMessages{
		private TipoEventoFacadeImplMessages(){}
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Evento. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Evento, por favor valide la traza completa de la excepcion presentada";
		}
	public static final class TipoIdentificacionFacadeImplMessages{
		private TipoIdentificacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Identificacion, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class TipoOrganizacionFacadeImplMessages{
		private TipoOrganizacionFacadeImplMessages(){}
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Organizacion, por favor valide la traza completa de la excepcion presentada";
	}
	public static final class TipoReaccionFacadeImplMessages{
		private TipoReaccionFacadeImplMessages(){}
		public static final String USER_MESSAGE_LIST = "Se ha presentado un problema tratando de listar el Tipo Reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_LIST = "Se ha presentado una excepcion no conocida al momento de listar el Tipo Reaccion, por favor valide la traza completa de la excepcion presentada";
	}

	public static final class SqlDAO{
		private SqlDAO(){}
		public static final String USER_MESSAGE_CONNECTION_NOT_OPEN = "Se ha presentado un problema trantando de llevar a cabo la operación deseada... intente de nuevo y si el problema persiste contacte el administrador del sistema";
		public static final String TECHNICAL_MESSAGE_CONNECTION_NOT_OPEN = "No se ha podido crear la operación deseada, debido a que la conexión no esta abierta";
		
		public static final class ComentarioSql{
			private ComentarioSql() {}
			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase ComentarioSqlDAO de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase ComentarioSqlDAO de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase ComentarioSqlDAO de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase ComentarioSqlDAO de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del comentario . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase ComentarioSqlDAO de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase ComentarioSqlDAO de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase ComentarioSqlDAO de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase ComentarioSqlDAO de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase ComentarioSqlDAO de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION= "Se ha presentado un problema inesperado dentro del método delete de la clase ComentarioSqlDAO de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase ComentarioSqlDAO de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION= "Se ha presentado un problema inesperado dentro del método execute de la clase ComentarioSqlDAO de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}
		
	}

}
