/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sql.parser.integrate.jaxb.statement.ddl;

import lombok.Getter;
import org.apache.shardingsphere.sql.parser.integrate.jaxb.segment.impl.definition.ExpectedColumnDefinition;
import org.apache.shardingsphere.sql.parser.integrate.jaxb.segment.impl.index.ExpectedIndex;
import org.apache.shardingsphere.sql.parser.integrate.jaxb.segment.impl.table.ExpectedTable;
import org.apache.shardingsphere.sql.parser.integrate.jaxb.statement.SQLParserTestCase;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.LinkedList;
import java.util.List;

/**
 * Create table statement test case.
 * 
 * @author zhangliang 
 */
@Getter
public final class CreateTableStatementTestCase extends SQLParserTestCase {
    
    @XmlElementWrapper
    @XmlElement(name = "table")
    private final List<ExpectedTable> tables = new LinkedList<>();
    
    @XmlElement(name = "column-definition")
    private final List<ExpectedColumnDefinition> columnDefinitions = new LinkedList<>();
    
    @XmlElement(name = "index")
    private final List<ExpectedIndex> indexes = new LinkedList<>();
}
