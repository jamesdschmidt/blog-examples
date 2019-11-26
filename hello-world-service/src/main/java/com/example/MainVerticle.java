package com.example;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer()
        .requestHandler(request -> request.response().end("hello world\n"))
        .listen(8080);
  }
}

