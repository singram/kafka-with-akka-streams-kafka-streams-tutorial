/**
  * Created by boris on 7/14/17.
  */
import sbt._
import Versions._

object Dependencies {
  val kafka         = "org.apache.kafka"                % "kafka_2.11"                    % kafkaVersion
  val kafkaclients  = "org.apache.kafka"                % "kafka-clients"                 % kafkaVersion
  val kafkastreams  = "org.apache.kafka"                % "kafka-streams"                 % kafkaVersion

  val gson          = "com.google.code.gson"            % "gson"                          % gsonVersion
  val jersey        = "org.glassfish.jersey.containers" % "jersey-container-servlet-core" % jerseyVersion
  val jerseymedia   = "org.glassfish.jersey.media"      % "jersey-media-json-jackson"     % jerseyVersion
  val jettyserver   = "org.eclipse.jetty"               % "jetty-server"                  % jettyVersion
  val jettyservlet  = "org.eclipse.jetty"               % "jetty-servlet"                 % jettyVersion
  val wsrs          = "javax.ws.rs"                     % "javax.ws.rs-api"               % wsrsVersion

  val tensorflow    = "org.tensorflow"                  % "tensorflow"                    % tensorflowVersion

  val jpmml         = "org.jpmml"                       % "pmml-evaluator"                % PMMLVersion
  val jpmmlextras   = "org.jpmml"                       % "pmml-evaluator-extension"      % PMMLVersion

  val modelsDependencies    = Seq(jpmml, jpmmlextras, tensorflow)
  val kafkabaseDependencies = Seq(kafka, kafkaclients)
  val kafkaDependencies     = Seq(kafka, kafkaclients, kafkastreams)
  val webDependencies       = Seq(gson, jersey, jerseymedia, jettyserver, jettyservlet, wsrs)

}
