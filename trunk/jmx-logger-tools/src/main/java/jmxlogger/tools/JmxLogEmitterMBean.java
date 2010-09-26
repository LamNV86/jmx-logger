/**
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jmxlogger.tools;

/**
 * Mangement interface for the emitter MBean.
 * @author vladimir.vivien
 */
public interface JmxLogEmitterMBean {
    public void start();
    public void stop();
    public boolean isStarted();
    public String getStartDate();
    public long getLogCount();
    
    // configuration
    public long getStats(String key);
    public void setLevel(String level);
    public String getLevel();
    public String getFilterExpression();
    public void setFilterExpression(String exp);
    public String getFilterScriptFile();
    public void setFilterScriptFile(String file);
}
