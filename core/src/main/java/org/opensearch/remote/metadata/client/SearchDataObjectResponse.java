/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */
package org.opensearch.remote.metadata.client;

import org.opensearch.core.xcontent.XContentParser;

/**
 * A class abstracting an OpenSearch SearchResponse
 */
public class SearchDataObjectResponse {
    private final XContentParser parser;

    /**
     * Instantiate this request with a parser used to recreate the response.
     * @param parser an XContentParser that can be used to create the response.
     */
    public SearchDataObjectResponse(XContentParser parser) {
        this.parser = parser;
    }

    /**
     * Returns the parser
     * @return the parser
     */
    public XContentParser parser() {
        return this.parser;
    }

    /**
     * Instantiate a builder for this object
     * @return a builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Class for constructing a Builder for this Response Object
     */
    public static class Builder {
        private XContentParser parser = null;

        /**
         * Empty Constructor for the Builder object
         */
        private Builder() {}

        /**
         * Add aparser to this builder
         * @param parser a parser
         * @return the updated builder
         */
        public Builder parser(XContentParser parser) {
            this.parser = parser;
            return this;
        }

        /**
         * Builds the response
         * @return A {@link SearchDataObjectResponse}
         */
        public SearchDataObjectResponse build() {
            return new SearchDataObjectResponse(this.parser);
        }
    }
}
