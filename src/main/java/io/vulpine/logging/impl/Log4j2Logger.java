package io.vulpine.logging.impl;

import io.vulpine.logging.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4j2Logger extends AbstractLogger
{
  private final org.apache.logging.log4j.Logger logger;

  public Log4j2Logger( final String name )
  {
    logger = LogManager.getLogger(name);
  }

  @Override
  public Logger trace(String message )
  {
    logger.trace(message);

    return this;
  }

  @Override
  public Logger trace( String message, Object argument )
  {
    logger.trace(message, argument);

    return this;
  }

  @Override
  public Logger trace( String message, Object argument1, Object argument2 )
  {
    logger.trace(message, argument1, argument2);

    return this;
  }

  @Override
  public Logger trace( String message, Object... arguments )
  {
    logger.trace(message, arguments);

    return this;
  }

  @Override
  public Logger trace( String message, Throwable throwable )
  {
    logger.trace(message, throwable);

    return this;
  }

  @Override
  public Logger debug( String message )
  {
    logger.debug(message);

    return this;
  }

  @Override
  public Logger debug( String message, Object argument )
  {
    logger.debug(message, argument);

    return this;
  }

  @Override
  public Logger debug( String message, Object argument1, Object argument2 )
  {
    logger.debug(message, argument1, argument2);

    return this;
  }

  @Override
  public Logger debug( String message, Object... arguments )
  {
    logger.debug(message, arguments);

    return this;
  }

  @Override
  public Logger debug( String message, Throwable throwable )
  {
    logger.debug(message, throwable);

    return this;
  }

  @Override
  public Logger info( String message )
  {
    logger.info(message);

    return this;
  }

  @Override
  public Logger info( String message, Object argument )
  {
    logger.info(message, argument);

    return this;
  }

  @Override
  public Logger info( String message, Object argument1, Object argument2 )
  {
    logger.info(message, argument1, argument2);

    return this;
  }

  @Override
  public Logger info( String message, Object... arguments )
  {
    logger.info(message, arguments);

    return this;
  }

  @Override
  public Logger info( String message, Throwable throwable )
  {
    logger.info(message, throwable);

    return this;
  }

  @Override
  public Logger notice( String message )
  {
    logger.warn(message);

    return this;
  }

  @Override
  public Logger notice( String message, Object argument )
  {
    logger.warn(message, argument);

    return this;
  }

  @Override
  public Logger notice( String message, Object argument1, Object argument2 )
  {
    logger.warn(message, argument1, argument2);

    return this;
  }

  @Override
  public Logger notice( String message, Object... arguments )
  {
    logger.warn(message, arguments);

    return this;
  }

  @Override
  public Logger notice( String message, Throwable throwable )
  {
    logger.warn(message, throwable);

    return this;
  }

  @Override
  public Logger warn( String message )
  {
    logger.warn(message);

    return this;
  }

  @Override
  public Logger warn( String message, Object argument )
  {
    logger.warn(message, argument);

    return this;
  }

  @Override
  public Logger warn( String message, Object argument1, Object argument2 )
  {
    logger.warn(message, argument1, argument2);

    return this;
  }

  @Override
  public Logger warn( String message, Object... arguments )
  {
    logger.warn(message, arguments);

    return this;
  }

  @Override
  public Logger warn( String message, Throwable throwable )
  {
    logger.warn(message, throwable);

    return this;
  }

  @Override
  public Logger error( String message )
  {
    logger.error(message);

    return this;
  }

  @Override
  public Logger error( String message, Object argument )
  {
    logger.error(message, argument);

    return this;
  }

  @Override
  public Logger error( String message, Object argument1, Object argument2 )
  {
    logger.error(message, argument1, argument2);

    return this;
  }

  @Override
  public Logger error( String message, Object... arguments )
  {
    logger.error(message, arguments);

    return this;
  }

  @Override
  public Logger error( String message, Throwable throwable )
  {
    logger.error(message, throwable);

    return this;
  }

  @Override
  public Logger fatal( String message )
  {
    logger.fatal(message);

    return this;
  }

  @Override
  public Logger fatal( String message, Object argument )
  {
    logger.fatal(message, argument);

    return this;
  }

  @Override
  public Logger fatal( String message, Object argument1, Object argument2 )
  {
    logger.fatal(message, argument1, argument2);

    return this;
  }

  @Override
  public Logger fatal( String message, Object... arguments )
  {
    logger.fatal(message, arguments);

    return this;
  }

  @Override
  public Logger fatal( String message, Throwable throwable )
  {
    logger.fatal(message, throwable);

    return this;
  }
}
