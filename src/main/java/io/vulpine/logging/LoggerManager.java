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

import java.util.HashMap;
import java.util.Map;

public class LoggerManager
{
  private final static Map< String, Logger > loggers = new HashMap < String, Logger >();

  public static Logger getLogger( final String name )
  {
    if (!loggers.containsKey(name)) {
      loggers.put(name, fetchImplementation(name));
    }

    return loggers.get(name);
  }

  private static Logger fetchImplementation( final String name )
  {
    try { return tryLog4j2(name); } catch ( ClassNotFoundException ignored ) {}
    try { return trySlf4j(name); } catch ( ClassNotFoundException ignored ) {}

    return new NativeLogger(name).debug("Logging using Java Logger");
  }

  private static Logger trySlf4j( final String name ) throws ClassNotFoundException
  {
    Class.forName("org.slf4j.Logger");
    return new Slf4jLogger(name).debug("Logging using SLF4J");
  }

  private static Logger tryLog4j2( final String name ) throws ClassNotFoundException
  {
    Class.forName("org.apache.logging.log4j.Logger");
    return new Log4j2Logger(name).debug("Logging using Log4J v2");
  }
}
