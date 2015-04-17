package com.herokuapp.potus

import groovyx.net.http.RESTClient

class API {
  static final String ROOT = System.getProperty('API_URL').toString()

  private def doGet(String uri) {
    def http = new RESTClient("$ROOT$uri")
    def res = http.get()
    res.data
  }

  List presidentList() {
    doGet('/presidents')
  }
}
