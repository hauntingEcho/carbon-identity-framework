/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.framework.message;


import org.wso2.carbon.identity.framework.builder.IdentityRequestBuilder;

import java.io.Serializable;


/**
 * Immutable request message.
 */
public class IdentityRequest<T extends IdentityRequestBuilder> extends IdentityMessage implements Serializable {

    private static final long serialVersionUID = 2187881873309155315L;

    public IdentityRequest(T builder) {
        this.headers = builder.getHeaders();
        this.properties = builder.getProperties();
        this.method = builder.getMethod();
        this.pathInfo = builder.getPathInfo();
        this.pathTranslated = builder.getPathTranslated();
        this.queryString = builder.getQueryString();
        this.requestURI = builder.getRequestURI();
        this.requestURL = builder.getRequestURL();
        this.contentType = builder.getContentType();
    }

}
