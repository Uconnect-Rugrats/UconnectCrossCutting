package uco.doo.rugrats.uconnect.utils;

import uco.doo.rugrats.uconnect.crosscutting.exception.UconnectCrossCuttingException;
import uco.doo.rugrats.uconnect.utils.messages.UconnectDataMessages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class UtilSql {

	private UtilSql() {
	}

	public static final void initTransaction(final Connection connection) {
		if (!connectionIsOpen(connection)) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_USER_MESSAGE);
		}

		try {
			if (!connection.getAutoCommit()) {
				throw UconnectCrossCuttingException.create(
						UconnectDataMessages.UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_TECHNICAL_MESSAGE,
						UconnectDataMessages.UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_USER_MESSAGE);
			}

		} catch (final SQLException exception) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.SQL_EXCEPTION_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.SQL_EXCEPTION_USER_MESSAGE, exception);
		}

		try {
			connection.setAutoCommit(false);
		} catch (final SQLException exception) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.INIT_TRANSACTION_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.INIT_TRANSACTION_USER_MESSAGE, exception);
		}
	}

	public static final void commitTransaction(final Connection connection) {
		if (!connectionIsOpen(connection)) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_USER_MESSAGE);
		}

		try {
			if (connection.getAutoCommit()) {
				throw UconnectCrossCuttingException.create(
						UconnectDataMessages.UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_TECHNICAL_MESSAGE,
						UconnectDataMessages.UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_USER_MESSAGE);
			}

		} catch (SQLException exception) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.SQL_EXCEPTION_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.SQL_EXCEPTION_USER_MESSAGE);
		}
		try {
			connection.commit();
		} catch (final SQLException exception) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.COMMIT_TRANSACTION_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.COMMIT_TRANSACTION_USER_MESSAGE, exception);
		}
	}

	public static final void rollbackTransaction(final Connection connection) {
		if (!connectionIsOpen(connection)) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.TRANSACTION_IS_NOT_OPEN_USER_MESSAGE);
		}

		try {
			if (connection.getAutoCommit()) {
				throw UconnectCrossCuttingException.create(
						UconnectDataMessages.UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_TECHNICAL_MESSAGE,
						UconnectDataMessages.UtilSqlMessages.TRANSACTION_AUTO_COMMIT_IS_TRUE_USER_MESSAGE);
			}
		} catch (final SQLException exception) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.SQL_EXCEPTION_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.SQL_EXCEPTION_USER_MESSAGE);
		}
		try {
			connection.rollback();
		} catch (SQLException exception) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.ROLLBACK_TRANSACTION_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.ROLLBACK_TRANSACTION_USER_MESSAGE, exception);
		}
	}

	public static final Connection openConnection(final String url, final String username, final String password) {
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (final SQLException exception) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.OPEN_CONNECTION_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.OPEN_CONNECTION_USER_MESSAGE, exception);
		}
	}

	public static final void closeConnection(final Connection connection) {
		try {
			if (!connectionIsOpen(connection))
				connection.close();

		} catch (final SQLException exception) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION,
					UconnectDataMessages.UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE, exception);
		}
	}

	public static final boolean connectionIsOpen(final Connection connection) {
		if (UtilObject.isNull(connection))
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION,
					UconnectDataMessages.UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE);

		try {
			return !connection.isClosed();
		} catch (final SQLException exception) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_MESSAGE,
					UconnectDataMessages.UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE, exception);

		} catch (final Exception exeption) {
			throw UconnectCrossCuttingException.create(
					UconnectDataMessages.UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION,
					UconnectDataMessages.UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE, exeption);

		}
	}

	public static final String appendWhereOrAnd(final boolean setWhere) {
		return setWhere ? "WHERE  " : "AND ";
	}
}