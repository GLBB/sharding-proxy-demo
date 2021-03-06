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

package cn.gl.shardingproxydemo2.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    
    private static final long serialVersionUID = 661434701950670670L;
    
    private long orderId;
    
    private int userId;
    
    private long addressId;
    
    private String status;

    public Order() {
    }

    public Order(int userId, long addressId, String status) {
        this.userId = userId;
        this.addressId = addressId;
        this.status = status;
    }

    public Order(long orderId, int userId, long addressId, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.addressId = addressId;
        this.status = status;
    }
}
