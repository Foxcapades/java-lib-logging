module io.vulpine.lib.logging {
  requires static slf4j.api;
  requires static java.logging;
  requires static org.apache.logging.log4j;

  exports io.vulpine.logging;
}