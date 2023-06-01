package uco.doo.rugrats.uconnect.utils.messages;

public final class UconnectDataMessages {

	private UconnectDataMessages() {
	}

	public static final class UtilSqlMessages {
		private UtilSqlMessages() {
		}

		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa. Por favor intente de nuevo y si el problema persiste comuníquese con el administrador del sistema.";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa. Por favor valide la traza de errores completa de la excepcion presentada.";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "No es posible validar si una conexion esta abierta cuando se encuentra nula. Por favor valide la traza de errores completa de la excepcion presentada. Por favor valida la traza de errores completa de la excepcion presentada.";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valide la traza de errores completa de la excepcion presentada.";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valide la traza de errores completa de la excepcion presentada.";
		public static final String OPEN_CONNECTION_USER_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos. Por favor intente de nuevo y si el problema persiste comuníquese con el administrador del sistema.";
		public static final String OPEN_CONNECTION_TECHNICAL_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos. Por favor valida la traza de errores completa de la excepcion presentada.";
		public static final String UPDATE_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar la actualización. Por favor intente de nuevo y si el problema persiste comuníquese con el administrador del sistema.";
		public static final String UPDATE_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar la actualización. Por favor valida la traza de errores completa de la excepcion presentada.";
		public static final String COMMIT_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de confirmar la transaccion. Por favor valida la traza de errores completa de la excepcion presentada.";
		public static final String COMMIT_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejecutar el commit de la transacción. Por favor valida la traza de errores completa de la excepcion presentada.";
		public static final String ROLLBACK_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de cancelar la transacción. Por favor intente de nuevo y si el problema persiste comuníquese con el administrador del sistema.";
		public static final String ROLLBACK_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar el rollback de la transaccion. Por favor valida la traza de errores completa de la excepcion presentada.";
		public static final String TRANSACTION_IS_NOT_OPEN_USER_MESSAGE = "Se ha presentado un error tratando de ejecutar la acción solicitada. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación";
		public static final String TRANSACTION_IS_NOT_OPEN_TECHNICAL_MESSAGE = "se he presentado una excepción tratando de validar si la conexión esta abierta o no al momento de ejecutar la acción solicitada. Por favor valide la traza completa de la excepción presentada";
		public static final String TRANSACTION_AUTO_COMMIT_IS_TRUE_USER_MESSAGE = "Se ha presentado un error tratando de ejecutar la acción solicitada. Por favor intente de nuevo y si el problema persiste comuníquese con el administrador de la aplicación";
		public static final String TRANSACTION_AUTO_COMMIT_IS_TRUE_TECHNICAL_MESSAGE = "se he presentado una excepción tratando de validar si el auto commit esta activo o no  al momento de ejecutar la acción solicitada. Por favor valide la traza completa de la excepción presentada";
		public static final String INIT_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora iniciar la transaccion. Por favor intente de nuevo y si el problema persiste comuníquese con el administrador del sistema.";
		public static final String INIT_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora ejectural el Init de la transaccion¿. Por favor valida la traza de errores completa de la excepcion presentada.";
		public static final String SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado una excepción desconocida a la hora de ejecutar la tarea solicitada.  Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación";
		public static final String SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción desconocida a la hora de ejecutar la tarea solicitada. Por favor valida la traza de errores completa de la excepcion presentada.";
	}

	public static final class PostgreSqlDAO {
		private PostgreSqlDAO() {
		}

		public static final String USER_MESSAGE_DATASOURCE = "Se ha presentado un error tratando de conectarse a la fuente de información. Por favor intente de nuevo y si el problema persiste comuníquese con el administrador del sistema.";
		public static final String TECHNICAL_MESSAGE_DATASOURCE_HIKARI_EXCEPTION = "Se ha presentado una excepcion de tipo PotentialHikariException en la clase PostgeSqlDaoFactory en la creación o asignacion Static del DATASOURCE. Por favor determine la traza completa de la exepción.";
		public static final String TECHNICAL_MESSAGE_DATASOURCE_EXCEPTION = "Se ha presentado una excepcion inesperada de tipo Exception en la clase PostgeSqlDaoFactory en la creación o asignacion Static del DATASOURCE. Por favor determine la traza completa de la exepción.";

		public static final String USER_MESSAGE_OPEN_CONNECTION_DS = "Se ha presentado un error tratando de conectarse a la fuente de información. Por favor intente de nuevo y si el problema persiste comuníquese con el administrador del sistema.";
		public static final String TECHNICAL_MESSAGE_OPEN_CONNECTION_DS_HIKARI_EXCEPTION = "Se ha presentado una excepcion de tipo PotentialHikariException en la clase PostgeSqlDaoFactory en la creación o asignacion Static del DATASOURCE. Por favor determine la traza completa de la exepción.";
		public static final String TECHNICAL_MESSAGE_OPEN_CONNECTION_DS_EXCEPTION = "Se ha presentado una excepcion inesperada de tipo Exception en la clase PostgeSqlDaoFactory en la creación o asignacion Static del DATASOURCE. Por favor determine la traza completa de la exepción.";
		public static final String TECHNICAL_MESSAGE_OPEN_CONNECTION_DS_SQL_EXCEPTION = "Se ha presentado una excepcion de tipo SqlException en la clase PostgeSqlDaoFactory en la creación o asignacion Static del DATASOURCE. Por favor determine la traza completa de la exepción.";

	}

	public static final class SqlDAO {
		private SqlDAO() {
		}

		public static final String USER_MESSAGE_CONNECTION_NOT_OPEN = "Se ha presentado un problema trantando de llevar a cabo la operación deseada... intente de nuevo y si el problema persiste contacte el administrador del sistema";
		public static final String TECHNICAL_MESSAGE_CONNECTION_NOT_OPEN = "No se ha podido crear la operación deseada, debido a que la conexión no esta abierta";

		public static final class EstadoSqlDao {
			private EstadoSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase EstadoSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase EstadoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase EstadoSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase EstadoSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del estado . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase EstadoSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase EstadoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase EstadoSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase EstadoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase EstadoSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase EstadoSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase EstadoSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase EstadoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class TipoEstadoSql {
			private TipoEstadoSql() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase TipoEstadoSql de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase TipoEstadoSql de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del tipo estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase TipoEstadoSql de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase TipoEstadoSql de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del tipo estado . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase TipoEstadoSql de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase TipoEstadoSql de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en tipo estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase TipoEstadoSql de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase TipoEstadoSql de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del tipo estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase TipoEstadoSql de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase TipoEstadoSql de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en tipo estado. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase TipoEstadoSql de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase TipoEstadoSql de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class OrganizacionSqlDao {
			private OrganizacionSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase OrganizacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase OrganizacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase OrganizacionSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase OrganizacionSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del organizacion . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase OrganizacionSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase OrganizacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase OrganizacionSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase OrganizacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase OrganizacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase OrganizacionSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase OrganizacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase OrganizacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class EstructuraSqlDao {
			private EstructuraSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase EstructuraSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase EstructuraSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase EstructuraSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase EstructuraSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del estructura . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase EstructuraSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase EstructuraSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase EstructuraSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase EstructuraSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase EstructuraSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase EstructuraSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en estructura. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase EstructuraSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase EstructuraSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class GrupoSqlDao {
			private GrupoSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase GrupoSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase GrupoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase GrupoSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase GrupoSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del grupo . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase GrupoSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase GrupoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase GrupoSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase GrupoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase GrupoSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase GrupoSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase GrupoSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase GrupoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class ParticipanteGrupoSqlDao {
			private ParticipanteGrupoSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo participante grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase ParticipanteGrupoSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase ParticipanteGrupoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del participante grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase ParticipanteGrupoSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase ParticipanteGrupoSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del participante grupo . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase ParticipanteGrupoSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase ParticipanteGrupoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en participante grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase ParticipanteGrupoSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase ParticipanteGrupoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del participante grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase ParticipanteGrupoSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase ParticipanteGrupoSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en participante grupo. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase ParticipanteGrupoSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase ParticipanteGrupoSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class ParticipanteSqlDao {
			private ParticipanteSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase ParticipanteSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase ParticipanteSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase ParticipanteSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase ParticipanteSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del participante . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase ParticipanteSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase ParticipanteSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase ParticipanteSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase ParticipanteSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase ParticipanteSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase ParticipanteSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en participante. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase ParticipanteSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase ParticipanteSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class PersonaSqlDao {
			private PersonaSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase PersonaSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase PersonaSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase PersonaSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase PersonaSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del persona . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase PersonaSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase PersonaSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase PersonaSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase PersonaSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase PersonaSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase PersonaSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en persona. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase PersonaSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase PersonaSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class PaisSqlDao {
			private PaisSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo pais. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase PaisSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase PaisSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del pais. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase PaisSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase PaisSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del pais . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase PaisSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase PaisSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en pais. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase PaisSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase PaisSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del pais. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase PaisSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase PaisSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en pais. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase PaisSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase PaisSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class TipoIdentificacionSqlDao {
			private TipoIdentificacionSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase TipoIdentificacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase TipoIdentificacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del tipo identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase TipoIdentificacionSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase TipoIdentificacionSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del tipo identificacion . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase TipoIdentificacionSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase TipoIdentificacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en tipo identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase TipoIdentificacionSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase TipoIdentificacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del tipo identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase TipoIdentificacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase TipoIdentificacionSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en tipo identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase TipoIdentificacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase TipoIdentificacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class TipoReaccionSqlDao{
		    private TipoReaccionSqlDao() {}

		public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase TipoReaccionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
		public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase TipoReaccionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del tipo reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase TipoReaccionSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
		public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase TipoReaccionSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del tipo reaccion . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase TipoReaccionSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
		public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase TipoReaccionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en tipo reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase TipoReaccionSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
		public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase TipoReaccionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del tipo reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase TipoReaccionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
		public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION= "Se ha presentado un problema inesperado dentro del método delete de la clase TipoReaccionSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
		public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en tipo reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
		public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase TipoReaccionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
		public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION= "Se ha presentado un problema inesperado dentro del método execute de la clase TipoReaccionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class TipoOrganizacionSqlDao {
			private TipoOrganizacionSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase TipoOrganizacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase TipoOrganizacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del tipo organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase TipoOrganizacionSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase TipoOrganizacionSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del tipo organizacion . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase TipoOrganizacionSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase TipoOrganizacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en tipo organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase TipoOrganizacionSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase TipoOrganizacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del tipo organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase TipoOrganizacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase TipoOrganizacionSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en tipo organizacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase TipoOrganizacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase TipoOrganizacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class PublicacionSqlDao {
			private PublicacionSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo publicacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase PublicacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase PublicacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del publicacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase PublicacionSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase PublicacionSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del publicacion . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase PublicacionSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase PublicacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en publicacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase PublicacionSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase PublicacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del publicacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase PublicacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase PublicacionSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en publicacion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase PublicacionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase PublicacionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class ComentarioSqlDao {
			private ComentarioSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase ComentarioSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase ComentarioSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase ComentarioSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase ComentarioSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del comentario . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase ComentarioSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase ComentarioSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase ComentarioSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase ComentarioSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase ComentarioSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase ComentarioSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en comentario. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase ComentarioSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase ComentarioSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}

		public static final class ReaccionSqlDao {
			private ReaccionSqlDao() {
			}

			public static final String USER_MESSAGE_CREATE = "Se ha presentado un problema tratando de registrar la informacion del nuevo reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_CREATE = "Se ha presentado un problema dentro del método create de la clase ReaccionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_CREATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método create de la clase ReaccionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_SET_PARAMETERS = "Se ha presentado un error tratando de asignar los valores del reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS = "Se ha presentado un problema dentro del metodo setParameters de clase ReaccionSqlDao de tipo SqlException.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_SET_PARAMETERS_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del metodo setParameters de clase ReaccionSqlDao de tipo Exception. Por favor verifique la trazacompleta de la excepcion presentada";
			public static final String USER_MESSAGE_UPDATE = "Se ha presentado un problema tratando de modificar la informacion del reaccion . Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_UPDATE = "Se ha presentado un problema dentro del método update de la clase ReaccionSqlDao de tipo Sqlexception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_UPDATE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método update de la clase ReaccionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_READ = "Se ha presentado un problema tratando de traer la información solicitada en reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_READ = "Se ha presentado un problema dentro del metodo read de la clase ReaccionSqlDao de tipo SqlException. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_READ_JAVA_EXCEPTION = "Se ha presentado un  problema inesperado dentro del metodo READ de la clase ReaccionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_DELETE = "Se ha presentado un problema tratando de eliminar la informacion del reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_DELETE = "Se ha presentado un problema dentro del método delete de la clase ReaccionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_DELETE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método delete de la clase ReaccionSqlDao de tipo Exception.Por favor verifique la traza completa de la excepcion presentada";
			public static final String USER_MESSAGE_EXECUTE = "Se ha presentado un problema tratando de ejecutar la accion solicitada en reaccion. Por favor intente de nuevo y si el problema persiste contacte al administrador respectivo";
			public static final String TECHNICAL_MESSAGE_EXECUTE = "Se ha presentado un problema dentro del metodo execute de la clase ReaccionSqlDao de tipo Sqlexception. Por favor verifique la traza completa de la excepcion presentada";
			public static final String TECHNICAL_MESSAGE_EXECUTE_JAVA_EXCEPTION = "Se ha presentado un problema inesperado dentro del método execute de la clase ReaccionSqlDao de tipo Exception. Por favor verifique la traza completa de la excepcion presentada";
		}
	}
}
