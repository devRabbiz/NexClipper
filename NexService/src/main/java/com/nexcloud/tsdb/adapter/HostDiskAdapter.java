/*
* Copyright 2019 NexCloud Co.,Ltd.
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
package com.nexcloud.tsdb.adapter;
public interface HostDiskAdapter {
	public String getDiskFreeByte (String hostIp, String mountName, String startTime, String time, int limit);
	
	public String getDiskUsagePercent (String hostIp, String mountName, String startTime, String time, int limit);
	
	public String getDiskReadbyte (String hostIp, String mountName, String startTime, String time, int limit);
	
	public String getDiskWritebyte (String hostIp, String mountName, String startTime, String time, int limit);
	
	public String getDiskTotal (String hostIp, String mountName, String startTime, String time, int limit);
	
	public String getDiskUsedbyte (String hostIp, String mountName, String startTime, String time, int limit);
	
	public String getDiskReads (String hostIp, String mountName, String startTime, String time, int limit);
	
	public String getDiskWrites (String hostIp, String mountName, String startTime, String time, int limit);
}
