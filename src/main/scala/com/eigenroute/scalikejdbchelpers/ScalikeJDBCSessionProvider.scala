package com.eigenroute.scalikejdbchelpers

import scalikejdbc.DBSession


trait ScalikeJDBCSessionProvider {

  def provideReadOnlySession: DBSession

  def provideAutoSession: DBSession
  
}
