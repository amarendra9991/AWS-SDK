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
package com.amazonaws.services.dynamodbv2;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing DynamoDB asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>Amazon DynamoDB</fullname>
 * <p>
 * Amazon DynamoDB is a fully managed NoSQL database service that provides fast and predictable performance with
 * seamless scalability. DynamoDB lets you offload the administrative burdens of operating and scaling a distributed
 * database, so that you don't have to worry about hardware provisioning, setup and configuration, replication, software
 * patching, or cluster scaling.
 * </p>
 * <p>
 * With DynamoDB, you can create database tables that can store and retrieve any amount of data, and serve any level of
 * request traffic. You can scale up or scale down your tables' throughput capacity without downtime or performance
 * degradation, and use the AWS Management Console to monitor resource utilization and performance metrics.
 * </p>
 * <p>
 * DynamoDB automatically spreads the data and traffic for your tables over a sufficient number of servers to handle
 * your throughput and storage requirements, while maintaining consistent and fast performance. All of your data is
 * stored on solid state disks (SSDs) and automatically replicated across multiple Availability Zones in an AWS region,
 * providing built-in high availability and data durability.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDynamoDBAsyncClient extends AmazonDynamoDBClient implements AmazonDynamoDBAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonDynamoDBAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonDynamoDBAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to DynamoDB (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonDynamoDBAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDynamoDBAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonDynamoDBAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonDynamoDBAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonDynamoDBAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDynamoDBAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonDynamoDBAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonDynamoDBAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDynamoDBAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonDynamoDBAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonDynamoDBAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonDynamoDBAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonDynamoDBAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDynamoDBAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonDynamoDBAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDynamoDBAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonDynamoDBAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDynamoDBAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonDynamoDBAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonDynamoDBAsyncClientBuilder asyncBuilder() {
        return AmazonDynamoDBAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on DynamoDB using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonDynamoDBAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(BatchGetItemRequest request) {

        return batchGetItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(final BatchGetItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchGetItemResult>() {
            @Override
            public BatchGetItemResult call() throws Exception {
                BatchGetItemResult result;

                try {
                    result = batchGetItem(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the BatchGetItem operation.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems,
            String returnConsumedCapacity) {

        return batchGetItemAsync(new BatchGetItemRequest().withRequestItems(requestItems).withReturnConsumedCapacity(returnConsumedCapacity));
    }

    /**
     * Simplified method form for invoking the BatchGetItem operation with an AsyncHandler.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems,
            String returnConsumedCapacity, com.amazonaws.handlers.AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler) {

        return batchGetItemAsync(new BatchGetItemRequest().withRequestItems(requestItems).withReturnConsumedCapacity(returnConsumedCapacity), asyncHandler);
    }

    /**
     * Simplified method form for invoking the BatchGetItem operation.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems) {

        return batchGetItemAsync(new BatchGetItemRequest().withRequestItems(requestItems));
    }

    /**
     * Simplified method form for invoking the BatchGetItem operation with an AsyncHandler.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems,
            com.amazonaws.handlers.AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler) {

        return batchGetItemAsync(new BatchGetItemRequest().withRequestItems(requestItems), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(BatchWriteItemRequest request) {

        return batchWriteItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(final BatchWriteItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchWriteItemRequest, BatchWriteItemResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchWriteItemResult>() {
            @Override
            public BatchWriteItemResult call() throws Exception {
                BatchWriteItemResult result;

                try {
                    result = batchWriteItem(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the BatchWriteItem operation.
     *
     * @see #batchWriteItemAsync(BatchWriteItemRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(java.util.Map<String, java.util.List<WriteRequest>> requestItems) {

        return batchWriteItemAsync(new BatchWriteItemRequest().withRequestItems(requestItems));
    }

    /**
     * Simplified method form for invoking the BatchWriteItem operation with an AsyncHandler.
     *
     * @see #batchWriteItemAsync(BatchWriteItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(java.util.Map<String, java.util.List<WriteRequest>> requestItems,
            com.amazonaws.handlers.AsyncHandler<BatchWriteItemRequest, BatchWriteItemResult> asyncHandler) {

        return batchWriteItemAsync(new BatchWriteItemRequest().withRequestItems(requestItems), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest request) {

        return createTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(final CreateTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTableResult>() {
            @Override
            public CreateTableResult call() throws Exception {
                CreateTableResult result;

                try {
                    result = createTable(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the CreateTable operation.
     *
     * @see #createTableAsync(CreateTableRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(java.util.List<AttributeDefinition> attributeDefinitions, String tableName,
            java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput) {

        return createTableAsync(new CreateTableRequest().withAttributeDefinitions(attributeDefinitions).withTableName(tableName).withKeySchema(keySchema)
                .withProvisionedThroughput(provisionedThroughput));
    }

    /**
     * Simplified method form for invoking the CreateTable operation with an AsyncHandler.
     *
     * @see #createTableAsync(CreateTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(java.util.List<AttributeDefinition> attributeDefinitions, String tableName,
            java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler) {

        return createTableAsync(new CreateTableRequest().withAttributeDefinitions(attributeDefinitions).withTableName(tableName).withKeySchema(keySchema)
                .withProvisionedThroughput(provisionedThroughput), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(DeleteItemRequest request) {

        return deleteItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(final DeleteItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteItemResult>() {
            @Override
            public DeleteItemResult call() throws Exception {
                DeleteItemResult result;

                try {
                    result = deleteItem(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the DeleteItem operation.
     *
     * @see #deleteItemAsync(DeleteItemRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key) {

        return deleteItemAsync(new DeleteItemRequest().withTableName(tableName).withKey(key));
    }

    /**
     * Simplified method form for invoking the DeleteItem operation with an AsyncHandler.
     *
     * @see #deleteItemAsync(DeleteItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            com.amazonaws.handlers.AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler) {

        return deleteItemAsync(new DeleteItemRequest().withTableName(tableName).withKey(key), asyncHandler);
    }

    /**
     * Simplified method form for invoking the DeleteItem operation.
     *
     * @see #deleteItemAsync(DeleteItemRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key, String returnValues) {

        return deleteItemAsync(new DeleteItemRequest().withTableName(tableName).withKey(key).withReturnValues(returnValues));
    }

    /**
     * Simplified method form for invoking the DeleteItem operation with an AsyncHandler.
     *
     * @see #deleteItemAsync(DeleteItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key, String returnValues,
            com.amazonaws.handlers.AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler) {

        return deleteItemAsync(new DeleteItemRequest().withTableName(tableName).withKey(key).withReturnValues(returnValues), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest request) {

        return deleteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(final DeleteTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteTableResult>() {
            @Override
            public DeleteTableResult call() throws Exception {
                DeleteTableResult result;

                try {
                    result = deleteTable(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the DeleteTable operation.
     *
     * @see #deleteTableAsync(DeleteTableRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(String tableName) {

        return deleteTableAsync(new DeleteTableRequest().withTableName(tableName));
    }

    /**
     * Simplified method form for invoking the DeleteTable operation with an AsyncHandler.
     *
     * @see #deleteTableAsync(DeleteTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(String tableName,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler) {

        return deleteTableAsync(new DeleteTableRequest().withTableName(tableName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest request) {

        return describeLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(final DescribeLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLimitsRequest, DescribeLimitsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeLimitsResult>() {
            @Override
            public DescribeLimitsResult call() throws Exception {
                DescribeLimitsResult result;

                try {
                    result = describeLimits(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest request) {

        return describeTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(final DescribeTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTableResult>() {
            @Override
            public DescribeTableResult call() throws Exception {
                DescribeTableResult result;

                try {
                    result = describeTable(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the DescribeTable operation.
     *
     * @see #describeTableAsync(DescribeTableRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(String tableName) {

        return describeTableAsync(new DescribeTableRequest().withTableName(tableName));
    }

    /**
     * Simplified method form for invoking the DescribeTable operation with an AsyncHandler.
     *
     * @see #describeTableAsync(DescribeTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(String tableName,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler) {

        return describeTableAsync(new DescribeTableRequest().withTableName(tableName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(DescribeTimeToLiveRequest request) {

        return describeTimeToLiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(final DescribeTimeToLiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTimeToLiveRequest, DescribeTimeToLiveResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTimeToLiveResult>() {
            @Override
            public DescribeTimeToLiveResult call() throws Exception {
                DescribeTimeToLiveResult result;

                try {
                    result = describeTimeToLive(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(GetItemRequest request) {

        return getItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(final GetItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetItemRequest, GetItemResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetItemResult>() {
            @Override
            public GetItemResult call() throws Exception {
                GetItemResult result;

                try {
                    result = getItem(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the GetItem operation.
     *
     * @see #getItemAsync(GetItemRequest)
     */
    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key) {

        return getItemAsync(new GetItemRequest().withTableName(tableName).withKey(key));
    }

    /**
     * Simplified method form for invoking the GetItem operation with an AsyncHandler.
     *
     * @see #getItemAsync(GetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            com.amazonaws.handlers.AsyncHandler<GetItemRequest, GetItemResult> asyncHandler) {

        return getItemAsync(new GetItemRequest().withTableName(tableName).withKey(key), asyncHandler);
    }

    /**
     * Simplified method form for invoking the GetItem operation.
     *
     * @see #getItemAsync(GetItemRequest)
     */
    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key, Boolean consistentRead) {

        return getItemAsync(new GetItemRequest().withTableName(tableName).withKey(key).withConsistentRead(consistentRead));
    }

    /**
     * Simplified method form for invoking the GetItem operation with an AsyncHandler.
     *
     * @see #getItemAsync(GetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key, Boolean consistentRead,
            com.amazonaws.handlers.AsyncHandler<GetItemRequest, GetItemResult> asyncHandler) {

        return getItemAsync(new GetItemRequest().withTableName(tableName).withKey(key).withConsistentRead(consistentRead), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request) {

        return listTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(final ListTablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTablesResult>() {
            @Override
            public ListTablesResult call() throws Exception {
                ListTablesResult result;

                try {
                    result = listTables(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync() {

        return listTablesAsync(new ListTablesRequest());
    }

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        return listTablesAsync(new ListTablesRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName) {

        return listTablesAsync(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName));
    }

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        return listTablesAsync(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName, Integer limit) {

        return listTablesAsync(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName).withLimit(limit));
    }

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName, Integer limit,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        return listTablesAsync(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName).withLimit(limit), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(Integer limit) {

        return listTablesAsync(new ListTablesRequest().withLimit(limit));
    }

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(Integer limit,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        return listTablesAsync(new ListTablesRequest().withLimit(limit), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsOfResourceResult> listTagsOfResourceAsync(ListTagsOfResourceRequest request) {

        return listTagsOfResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsOfResourceResult> listTagsOfResourceAsync(final ListTagsOfResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsOfResourceRequest, ListTagsOfResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTagsOfResourceResult>() {
            @Override
            public ListTagsOfResourceResult call() throws Exception {
                ListTagsOfResourceResult result;

                try {
                    result = listTagsOfResource(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(PutItemRequest request) {

        return putItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(final PutItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutItemRequest, PutItemResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutItemResult>() {
            @Override
            public PutItemResult call() throws Exception {
                PutItemResult result;

                try {
                    result = putItem(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the PutItem operation.
     *
     * @see #putItemAsync(PutItemRequest)
     */
    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item) {

        return putItemAsync(new PutItemRequest().withTableName(tableName).withItem(item));
    }

    /**
     * Simplified method form for invoking the PutItem operation with an AsyncHandler.
     *
     * @see #putItemAsync(PutItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item,
            com.amazonaws.handlers.AsyncHandler<PutItemRequest, PutItemResult> asyncHandler) {

        return putItemAsync(new PutItemRequest().withTableName(tableName).withItem(item), asyncHandler);
    }

    /**
     * Simplified method form for invoking the PutItem operation.
     *
     * @see #putItemAsync(PutItemRequest)
     */
    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item, String returnValues) {

        return putItemAsync(new PutItemRequest().withTableName(tableName).withItem(item).withReturnValues(returnValues));
    }

    /**
     * Simplified method form for invoking the PutItem operation with an AsyncHandler.
     *
     * @see #putItemAsync(PutItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item, String returnValues,
            com.amazonaws.handlers.AsyncHandler<PutItemRequest, PutItemResult> asyncHandler) {

        return putItemAsync(new PutItemRequest().withTableName(tableName).withItem(item).withReturnValues(returnValues), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request) {

        return queryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(final QueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<QueryRequest, QueryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<QueryResult>() {
            @Override
            public QueryResult call() throws Exception {
                QueryResult result;

                try {
                    result = query(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(ScanRequest request) {

        return scanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(final ScanRequest request,
            final com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ScanResult>() {
            @Override
            public ScanResult call() throws Exception {
                ScanResult result;

                try {
                    result = scan(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scanAsync(ScanRequest)
     */
    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet) {

        return scanAsync(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet));
    }

    /**
     * Simplified method form for invoking the Scan operation with an AsyncHandler.
     *
     * @see #scanAsync(ScanRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet,
            com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler) {

        return scanAsync(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet), asyncHandler);
    }

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scanAsync(ScanRequest)
     */
    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.Map<String, Condition> scanFilter) {

        return scanAsync(new ScanRequest().withTableName(tableName).withScanFilter(scanFilter));
    }

    /**
     * Simplified method form for invoking the Scan operation with an AsyncHandler.
     *
     * @see #scanAsync(ScanRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.Map<String, Condition> scanFilter,
            com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler) {

        return scanAsync(new ScanRequest().withTableName(tableName).withScanFilter(scanFilter), asyncHandler);
    }

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scanAsync(ScanRequest)
     */
    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet,
            java.util.Map<String, Condition> scanFilter) {

        return scanAsync(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet).withScanFilter(scanFilter));
    }

    /**
     * Simplified method form for invoking the Scan operation with an AsyncHandler.
     *
     * @see #scanAsync(ScanRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet,
            java.util.Map<String, Condition> scanFilter, com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler) {

        return scanAsync(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet).withScanFilter(scanFilter), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result;

                try {
                    result = tagResource(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result;

                try {
                    result = untagResource(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(UpdateItemRequest request) {

        return updateItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(final UpdateItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateItemResult>() {
            @Override
            public UpdateItemResult call() throws Exception {
                UpdateItemResult result;

                try {
                    result = updateItem(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the UpdateItem operation.
     *
     * @see #updateItemAsync(UpdateItemRequest)
     */
    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates) {

        return updateItemAsync(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates));
    }

    /**
     * Simplified method form for invoking the UpdateItem operation with an AsyncHandler.
     *
     * @see #updateItemAsync(UpdateItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, com.amazonaws.handlers.AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler) {

        return updateItemAsync(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates), asyncHandler);
    }

    /**
     * Simplified method form for invoking the UpdateItem operation.
     *
     * @see #updateItemAsync(UpdateItemRequest)
     */
    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, String returnValues) {

        return updateItemAsync(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates)
                .withReturnValues(returnValues));
    }

    /**
     * Simplified method form for invoking the UpdateItem operation with an AsyncHandler.
     *
     * @see #updateItemAsync(UpdateItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, String returnValues,
            com.amazonaws.handlers.AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler) {

        return updateItemAsync(
                new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates).withReturnValues(returnValues),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest request) {

        return updateTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(final UpdateTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateTableResult>() {
            @Override
            public UpdateTableResult call() throws Exception {
                UpdateTableResult result;

                try {
                    result = updateTable(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Simplified method form for invoking the UpdateTable operation.
     *
     * @see #updateTableAsync(UpdateTableRequest)
     */
    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(String tableName, ProvisionedThroughput provisionedThroughput) {

        return updateTableAsync(new UpdateTableRequest().withTableName(tableName).withProvisionedThroughput(provisionedThroughput));
    }

    /**
     * Simplified method form for invoking the UpdateTable operation with an AsyncHandler.
     *
     * @see #updateTableAsync(UpdateTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(String tableName, ProvisionedThroughput provisionedThroughput,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler) {

        return updateTableAsync(new UpdateTableRequest().withTableName(tableName).withProvisionedThroughput(provisionedThroughput), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(UpdateTimeToLiveRequest request) {

        return updateTimeToLiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(final UpdateTimeToLiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTimeToLiveRequest, UpdateTimeToLiveResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateTimeToLiveResult>() {
            @Override
            public UpdateTimeToLiveResult call() throws Exception {
                UpdateTimeToLiveResult result;

                try {
                    result = updateTimeToLive(request);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(request, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
