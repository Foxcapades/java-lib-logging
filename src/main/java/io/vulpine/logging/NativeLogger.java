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
package io.vulpine.logging;

class NativeLogger extends AbstractLogger
{
  private final java.util.logging.Logger logger;

  NativeLogger( final String name )
  {
    logger = java.util.logging.Logger.getLogger(name);
  }

  @Override
  public Logger trace( final String message )
  {
    logger.finest(message);
    return this;
  }

  @Override
  public Logger trace( final String message, final Object argument )
  {
    logger.finest(String.format(message.replaceAll("\\{\\}", "%s"), argument));
    return this;
  }

  @Override
  public Logger trace( final String message, final Object argument1, final Object argument2 )
  {
    logger.finest(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
    return this;
  }

  @Override
  public Logger trace( final String message, final Object... arguments )
  {
    logger.finest(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
    return this;
  }

  @Override
  public Logger trace( final String message, final Throwable throwable )
  {
    logger.finest(message);
    logger.finest(throwable.toString());
    return this;
  }


  @Override
  public Logger debug( final String message )
  {
    logger.finer(message);
    return this;
  }

  @Override
  public Logger debug( final String message, final Object argument )
  {
    logger.finer(String.format(message.replaceAll("\\{\\}", "%s"), argument));
    return this;
  }

  @Override
  public Logger debug( final String message, final Object argument1, final Object argument2 )
  {
    logger.finer(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
    return this;
  }

  @Override
  public Logger debug( final String message, final Object... arguments )
  {
    logger.finer(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
    return this;
  }

  @Override
  public Logger debug( final String message, final Throwable throwable )
  {
    logger.finer(message);
    logger.finer(throwable.toString());
    return this;
  }

  @Override
  public Logger info( final String message )
  {
    logger.info(message);
    return this;
  }

  @Override
  public Logger info( final String message, final Object argument )
  {
    logger.info(String.format(message.replaceAll("\\{\\}", "%s"), argument));
    return this;
  }

  @Override
  public Logger info( final String message, final Object argument1, final Object argument2 )
  {
    logger.info(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
    return this;
  }

  @Override
  public Logger info( final String message, final Object... arguments )
  {
    logger.info(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
    return this;
  }

  @Override
  public Logger info( final String message, final Throwable throwable )
  {
    logger.info(message);
    logger.info(throwable.toString());
    return this;
  }

  @Override
  public Logger notice( final String message )
  {
    logger.warning(message);
    return this;
  }

  @Override
  public Logger notice( final String message, final Object argument )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), argument));
    return this;
  }

  @Override
  public Logger notice( final String message, final Object argument1, final Object argument2 )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
    return this;
  }

  @Override
  public Logger notice( final String message, final Object... arguments )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
    return this;
  }

  @Override
  public Logger notice( final String message, final Throwable throwable )
  {
    logger.warning(message);
    logger.warning(throwable.toString());
    return this;
  }

  @Override
  public Logger warn( final String message )
  {
    logger.warning(message);
    return this;
  }

  @Override
  public Logger warn( final String message, final Object argument )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), argument));
    return this;
  }

  @Override
  public Logger warn( final String message, final Object argument1, final Object argument2 )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
    return this;
  }

  @Override
  public Logger warn( final String message, final Object... arguments )
  {
    logger.warning(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
    return this;
  }

  @Override
  public Logger warn( final String message, final Throwable throwable )
  {
    logger.warning(message);
    logger.warning(throwable.toString());
    return this;
  }

  @Override
  public Logger error( final String message )
  {
    logger.severe(message);
    return this;
  }

  @Override
  public Logger error( final String message, final Object argument )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), argument));
    return this;
  }

  @Override
  public Logger error( final String message, final Object argument1, final Object argument2 )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
    return this;
  }

  @Override
  public Logger error( final String message, final Object... arguments )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
    return this;
  }

  @Override
  public Logger error( final String message, final Throwable throwable )
  {
    logger.severe(message);
    logger.severe(throwable.toString());
    return this;
  }

  @Override
  public Logger fatal( final String message )
  {
    logger.severe(message);
    return this;
  }

  @Override
  public Logger fatal( final String message, final Object argument )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), argument));
    return this;
  }

  @Override
  public Logger fatal( final String message, final Object argument1, final Object argument2 )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), argument1, argument2));
    return this;
  }

  @Override
  public Logger fatal( final String message, final Object... arguments )
  {
    logger.severe(String.format(message.replaceAll("\\{\\}", "%s"), arguments));
    return this;
  }

  @Override
  public Logger fatal( final String message, final Throwable throwable )
  {
    logger.severe(message);
    logger.severe(throwable.toString());
    return this;
  }
}
