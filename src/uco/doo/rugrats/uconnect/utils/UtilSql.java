package uco.doo.rugrats.uconnect.utils;

import uco.doo.rugrats.uconnect.crosscutting.exception.UconnectCrossCuttingException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public final class UtilSql {
	

	private UtilSql() {
		super();
	}
	
	public static final Connection openConnection(final String url, final String username, final String password) {
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			return connection;
		} catch (final SQLException exception) {
			var userMessage = Messages.UtilSqlMessages.OPEN_CONNECTION_USER_MESSAGE;
			var technicalMessage = Messages.UtilSqlMessages.OPEN_CONNECTION_TECHNICAL_MESSAGE;
			
			throw UconnectCrossCuttingException.create(technicalMessage, userMessage, exception);
		}
	}
	
	public static final void closeConnection(final Connection connection) {
		try {
			if (!connectionIsOpen(connection)) {
				connection.close();
			}
		} catch (final SQLException exception) {
			var userMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION;
			throw UconnectCrossCuttingException.create(technicalMessage, userMessage, exception);
		}
	}
	
	public static boolean connectionIsOpen(final Connection connection) {
		if (UtilObject.isNull(connection)) {
			var userMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
			throw UconnectCrossCuttingException.create(userMessage, technicalMessage);
		}
		
		try {
			return !connection.isClosed();
		} catch (final SQLException exception) {
			var userMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_MESSAGE;
			throw UconnectCrossCuttingException.create(technicalMessage, userMessage, exception);
		} catch (final Exception exeption) {
			var userMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = Messages.UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;
			throw UconnectCrossCuttingException.create(technicalMessage, userMessage, exeption);
		}
	}
	
	  public static void closeResultSet(ResultSet rs) {
		    try {
		      if (rs != null) {
		        rs.close();
		      }
		    } catch (SQLException e) {
		      // manejo de excepción
		    }
		  }
		  
		  public static void closePreparedStatement(PreparedStatement ps) {
		    try {
		      if (ps != null) {
		        ps.close();
		      }
		    } catch (SQLException e) {
		      // manejo de excepción
		    }
		  }
}
