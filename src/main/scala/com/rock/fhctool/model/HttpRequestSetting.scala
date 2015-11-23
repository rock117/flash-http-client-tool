package com.rock.fhctool.model

case class HttpRequestSetting(url: String, data: String, headers: Map[String, String])
object HttpRequestSetting {
  def apply {

  }
}

case class HttpReqMeta(connectNum: Int) {

}

sealed abstract class RequestType(setting: HttpRequestSetting)
case class DownloadRequest(reqMeta:HttpReqMeta, setting: HttpRequestSetting) extends RequestType(setting)
case class HttpInspectRequest(setting: HttpRequestSetting) extends RequestType(setting)