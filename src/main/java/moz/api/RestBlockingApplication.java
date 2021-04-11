package moz.api;

import io.smallrye.common.annotation.Blocking;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/v1")
@Blocking
public class RestBlockingApplication extends Application {
}