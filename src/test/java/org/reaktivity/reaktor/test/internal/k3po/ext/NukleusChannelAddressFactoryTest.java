/**
 * Copyright 2016-2019 The Reaktivity Project
 *
 * The Reaktivity Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.reaktivity.reaktor.test.internal.k3po.ext;

import static org.junit.Assert.assertNotNull;
import static org.kaazing.k3po.driver.internal.netty.channel.ChannelAddressFactory.newChannelAddressFactory;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;
import org.kaazing.k3po.driver.internal.netty.channel.ChannelAddress;
import org.kaazing.k3po.driver.internal.netty.channel.ChannelAddressFactory;

public class NukleusChannelAddressFactoryTest
{
    @Test
    public void shouldCreateChannelAddress() throws Exception
    {
        Map<String, Object> options = new LinkedHashMap<>();
        options.put("route", 1234L);
        options.put("window", 8192);

        ChannelAddressFactory factory = newChannelAddressFactory();
        ChannelAddress address = factory.newChannelAddress(URI.create("nukleus://streams/server#0"), options);

        assertNotNull(address);
    }
}