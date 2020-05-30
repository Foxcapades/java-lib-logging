/*
 * Copyright 2016 Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vulpine.logging.impl;

import io.vulpine.logging.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogger extends AbstractLogger
{
  private final org.slf4j.Logger logger;

  public Slf4jLogger( final String name )
  {
    logger = LoggerFactory.getLogger(name);
  }

  @Override
  public Logger trace(final String message )
  {
    logger.trace(message);

    return this;
  }

  @Override
  public Logger trace( final String message, final Object argument )
  {
    logger.trace( message, argument );

    return this;
  }

  @Override
  public Logger trace( final String message, final Object argument1, final Object argument2 )
  {
    logger.trace( message, argument1, argument2 );

    return this;
  }

  @Override
  public Logger trace( final String message, final Object... arguments )
  {
    logger.trace( message, arguments );

    return this;
  }

  @Override
  public Logger trace( final String message, final Throwable throwable )
  {
    logger.trace( message, throwable );

    return this;
  }

  @Override
  public Logger debug( final String message )
  {
    logger.debug( message );

    return this;
  }

  @Override
  public Logger debug( final String message, final Object argument )
  {
    logger.debug( message, argument );

    return this;
  }

  @Override
  public Logger debug( final String message, final Object argument1, final Object argument2 )
  {
    logger.debug( message, argument1, argument2 );

    return this;
  }

  @Override
  public Logger debug( final String message, final Object... arguments )
  {
    logger.debug( message, arguments );

    return this;
  }

  @Override
  public Logger debug( final String message, final Throwable throwable )
  {
    logger.debug( message, throwable );

    return this;
  }

  @Override
  public Logger info( final String message )
  {
    logger.info( message );

    return this;
  }

  @Override
  public Logger info( final String message, final Object argument )
  {
    logger.info( message, argument );

    return this;
  }

  @Override
  public Logger info( final String message, final Object argument1, final Object argument2 )
  {
    logger.info( message, argument1, argument2 );

    return this;
  }

  @Override
  public Logger info( final String message, final Object... arguments )
  {
    logger.info( message, arguments );

    return this;
  }

  @Override
  public Logger info( final String message, final Throwable throwable )
  {
    logger.info( message, throwable );

    return this;
  }

  @Override
  public Logger notice( final String message )
  {
    logger.warn( message );

    return this;
  }

  @Override
  public Logger notice( final String message, final Object argument )
  {
    logger.warn( message, argument );

    return this;
  }

  @Override
  public Logger notice( final String message, final Object argument1, final Object argument2 )
  {
    logger.warn( message, argument1, argument2 );

    return this;
  }

  @Override
  public Logger notice( final String message, final Object... arguments )
  {
    logger.warn( message, arguments );

    return this;
  }

  @Override
  public Logger notice( final String message, final Throwable throwable )
  {
    logger.warn( message, throwable );

    return this;
  }

  @Override
  public Logger warn( final String message )
  {
    logger.warn( message );

    return this;
  }

  @Override
  public Logger warn( final String message, final Object argument )
  {
    logger.warn( message, argument );

    return this;
  }

  @Override
  public Logger warn( final String message, final Object argument1, final Object argument2 )
  {
    logger.warn( message, argument1, argument2 );

    return this;
  }

  @Override
  public Logger warn( final String message, final Object... arguments )
  {
    logger.warn( message, arguments );

    return this;
  }

  @Override
  public Logger warn( final String message, final Throwable throwable )
  {
    logger.warn( message, throwable );

    return this;
  }

  @Override
  public Logger error( final String message )
  {
    logger.error( message );

    return this;
  }

  @Override
  public Logger error( final String message, final Object argument )
  {
    logger.error( message, argument );

    return this;
  }

  @Override
  public Logger error( final String message, final Object argument1, final Object argument2 )
  {
    logger.error( message, argument1, argument2 );

    return this;
  }

  @Override
  public Logger error( final String message, final Object... arguments )
  {
    logger.error( message, arguments );

    return this;
  }

  @Override
  public Logger error( final String message, final Throwable throwable )
  {
    logger.error( message, throwable );

    return this;
  }

  @Override
  public Logger fatal( final String message )
  {
    logger.error( message );

    return this;
  }

  @Override
  public Logger fatal( final String message, final Object argument )
  {
    logger.error( message, argument );

    return this;
  }

  @Override
  public Logger fatal( final String message, final Object argument1, final Object argument2 )
  {
    logger.error( message, argument1, argument2 );

    return this;
  }

  @Override
  public Logger fatal( final String message, final Object... arguments )
  {
    logger.error( message, arguments );

    return this;
  }

  @Override
  public Logger fatal( final String message, final Throwable throwable )
  {
    logger.error( message, throwable );

    return this;
  }
}
