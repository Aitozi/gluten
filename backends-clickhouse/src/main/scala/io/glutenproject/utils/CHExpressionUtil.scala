/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.glutenproject.utils

import io.glutenproject.expression.ExpressionMappings._

object CHExpressionUtil {

  /**
   * The blacklist for Clickhouse unsupported or mismatched expression / aggregate function with
   * specific input type.
   */
  final val EMPTY_TYPE = ""

  final val CH_EXPR_BLACKLIST: Map[String, Set[String]] = Map(
    COALESCE -> Set(EMPTY_TYPE),
    RLIKE -> Set(EMPTY_TYPE),
    REGEXP_REPLACE -> Set(EMPTY_TYPE),
    REGEXP_EXTRACT -> Set(EMPTY_TYPE),
    REGEXP_EXTRACT_ALL -> Set(EMPTY_TYPE),
    ASCII -> Set(EMPTY_TYPE),
    LOCATE -> Set(EMPTY_TYPE),
    LPAD -> Set(EMPTY_TYPE),
    RPAD -> Set(EMPTY_TYPE),
    REVERSE -> Set(EMPTY_TYPE),
    SPLIT -> Set(EMPTY_TYPE),
    PMOD -> Set(EMPTY_TYPE),
    GET_JSON_OBJECT -> Set(EMPTY_TYPE),
    JSON_ARRAY_LENGTH -> Set(EMPTY_TYPE),
    MURMUR3HASH -> Set(EMPTY_TYPE),
    MD5 -> Set(EMPTY_TYPE),
    SPLIT_PART -> Set(EMPTY_TYPE)
  )

  final val CH_AGGREGATE_FUNC_BLACKLIST: Map[String, Set[String]] = Map(
    STDDEV_SAMP -> Set(EMPTY_TYPE)
  )
}
