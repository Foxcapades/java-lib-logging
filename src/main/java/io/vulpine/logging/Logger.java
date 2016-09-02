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

public interface Logger
{
  Logger trace( final String message );
  Logger trace( final String message, final Object argument );
  Logger trace( final String message, final Object argument1, final Object argument2 );
  Logger trace( final String message, final Object... arguments );
  Logger trace( final String message, final Throwable throwable );
  Logger trace( final Class clazz, final Object... arguments );

  Logger debug( final String message );
  Logger debug( final String message, final Object argument );
  Logger debug( final String message, final Object argument1, final Object argument2 );
  Logger debug( final String message, final Object... arguments );
  Logger debug( final String message, final Throwable throwable );

  Logger info( final String message );
  Logger info( final String message, final Object argument );
  Logger info( final String message, final Object argument1, final Object argument2 );
  Logger info( final String message, final Object... arguments );
  Logger info( final String message, final Throwable throwable );

  Logger notice( final String message );
  Logger notice( final String message, final Object argument );
  Logger notice( final String message, final Object argument1, final Object argument2 );
  Logger notice( final String message, final Object... arguments );
  Logger notice( final String message, final Throwable throwable );

  Logger warn( final String message );
  Logger warn( final String message, final Object argument );
  Logger warn( final String message, final Object argument1, final Object argument2 );
  Logger warn( final String message, final Object... arguments );
  Logger warn( final String message, final Throwable throwable );

  Logger error( final String message );
  Logger error( final String message, final Object argument );
  Logger error( final String message, final Object argument1, final Object argument2 );
  Logger error( final String message, final Object... arguments );
  Logger error( final String message, final Throwable throwable );

  Logger fatal( final String message );
  Logger fatal( final String message, final Object argument );
  Logger fatal( final String message, final Object argument1, final Object argument2 );
  Logger fatal( final String message, final Object... arguments );
  Logger fatal( final String message, final Throwable throwable );
}
