/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeClassicLinkInstancesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeClassicLinkInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClassicLinkInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeClassicLinkInstancesRequest> {

    /**
     * <p>
     * One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a VPC security group that's associated with the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is linked to.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     * You cannot specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * <p>
     * Constraint: If the value is greater than 1000, we return only 1000 items.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     * </p>
     * 
     * @return One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassicLinkInstancesRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs. Must be instances linked to a VPC through ClassicLink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassicLinkInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a VPC security group that's associated with the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is linked to.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>group-id</code> - The ID of a VPC security group that's associated with the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *         <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's
     *         value is), and the tag value X (regardless of what the tag's key is). If you want to list only resources
     *         where Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *         <code>tag-key</code> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-id</code> - The ID of the VPC that the instance is linked to.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a VPC security group that's associated with the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is linked to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of a VPC security group that's associated with the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC that the instance is linked to.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a VPC security group that's associated with the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is linked to.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of a VPC security group that's associated with the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC that the instance is linked to.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassicLinkInstancesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a VPC security group that's associated with the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC that the instance is linked to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of a VPC security group that's associated with the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC that the instance is linked to.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassicLinkInstancesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassicLinkInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     * You cannot specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * <p>
     * Constraint: If the value is greater than 1000, we return only 1000 items.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results of the
     *        initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *        This value can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     *        1000 results are returned. You cannot specify this parameter and the instance IDs parameter in the same
     *        request.</p>
     *        <p>
     *        Constraint: If the value is greater than 1000, we return only 1000 items.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     * You cannot specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * <p>
     * Constraint: If the value is greater than 1000, we return only 1000 items.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results of the
     *         initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *         This value can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     *         1000 results are returned. You cannot specify this parameter and the instance IDs parameter in the same
     *         request.</p>
     *         <p>
     *         Constraint: If the value is greater than 1000, we return only 1000 items.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     * You cannot specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * <p>
     * Constraint: If the value is greater than 1000, we return only 1000 items.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results of the
     *        initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *        This value can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     *        1000 results are returned. You cannot specify this parameter and the instance IDs parameter in the same
     *        request.</p>
     *        <p>
     *        Constraint: If the value is greater than 1000, we return only 1000 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassicLinkInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeClassicLinkInstancesRequest> getDryRunRequest() {
        Request<DescribeClassicLinkInstancesRequest> request = new DescribeClassicLinkInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClassicLinkInstancesRequest == false)
            return false;
        DescribeClassicLinkInstancesRequest other = (DescribeClassicLinkInstancesRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClassicLinkInstancesRequest clone() {
        return (DescribeClassicLinkInstancesRequest) super.clone();
    }
}
