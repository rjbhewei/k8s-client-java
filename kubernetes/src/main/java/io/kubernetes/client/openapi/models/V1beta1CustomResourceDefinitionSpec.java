/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceValidation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomResourceDefinitionSpec describes how a user wants their resource to appear
 */
@ApiModel(description = "CustomResourceDefinitionSpec describes how a user wants their resource to appear")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class V1beta1CustomResourceDefinitionSpec {
  public static final String SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS = "additionalPrinterColumns";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS)
  private List<V1beta1CustomResourceColumnDefinition> additionalPrinterColumns = null;

  public static final String SERIALIZED_NAME_CONVERSION = "conversion";
  @SerializedName(SERIALIZED_NAME_CONVERSION)
  private V1beta1CustomResourceConversion conversion;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private V1beta1CustomResourceDefinitionNames names;

  public static final String SERIALIZED_NAME_PRESERVE_UNKNOWN_FIELDS = "preserveUnknownFields";
  @SerializedName(SERIALIZED_NAME_PRESERVE_UNKNOWN_FIELDS)
  private Boolean preserveUnknownFields;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_SUBRESOURCES = "subresources";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCES)
  private V1beta1CustomResourceSubresources subresources;

  public static final String SERIALIZED_NAME_VALIDATION = "validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private V1beta1CustomResourceValidation validation;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<V1beta1CustomResourceDefinitionVersion> versions = null;


  public V1beta1CustomResourceDefinitionSpec additionalPrinterColumns(List<V1beta1CustomResourceColumnDefinition> additionalPrinterColumns) {
    
    this.additionalPrinterColumns = additionalPrinterColumns;
    return this;
  }

  public V1beta1CustomResourceDefinitionSpec addAdditionalPrinterColumnsItem(V1beta1CustomResourceColumnDefinition additionalPrinterColumnsItem) {
    if (this.additionalPrinterColumns == null) {
      this.additionalPrinterColumns = new ArrayList<V1beta1CustomResourceColumnDefinition>();
    }
    this.additionalPrinterColumns.add(additionalPrinterColumnsItem);
    return this;
  }

   /**
   * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name. Defaults to a created-at column. Optional, the global columns for all versions. Top-level and per-version columns are mutually exclusive.
   * @return additionalPrinterColumns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name. Defaults to a created-at column. Optional, the global columns for all versions. Top-level and per-version columns are mutually exclusive.")

  public List<V1beta1CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
    return additionalPrinterColumns;
  }


  public void setAdditionalPrinterColumns(List<V1beta1CustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
  }


  public V1beta1CustomResourceDefinitionSpec conversion(V1beta1CustomResourceConversion conversion) {
    
    this.conversion = conversion;
    return this;
  }

   /**
   * Get conversion
   * @return conversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1CustomResourceConversion getConversion() {
    return conversion;
  }


  public void setConversion(V1beta1CustomResourceConversion conversion) {
    this.conversion = conversion;
  }


  public V1beta1CustomResourceDefinitionSpec group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Group is the group this resource belongs in
   * @return group
  **/
  @ApiModelProperty(required = true, value = "Group is the group this resource belongs in")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public V1beta1CustomResourceDefinitionSpec names(V1beta1CustomResourceDefinitionNames names) {
    
    this.names = names;
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta1CustomResourceDefinitionNames getNames() {
    return names;
  }


  public void setNames(V1beta1CustomResourceDefinitionNames names) {
    this.names = names;
  }


  public V1beta1CustomResourceDefinitionSpec preserveUnknownFields(Boolean preserveUnknownFields) {
    
    this.preserveUnknownFields = preserveUnknownFields;
    return this;
  }

   /**
   * preserveUnknownFields disables pruning of object fields which are not specified in the OpenAPI schema. apiVersion, kind, metadata and known fields inside metadata are always preserved. Defaults to true in v1beta and will default to false in v1.
   * @return preserveUnknownFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "preserveUnknownFields disables pruning of object fields which are not specified in the OpenAPI schema. apiVersion, kind, metadata and known fields inside metadata are always preserved. Defaults to true in v1beta and will default to false in v1.")

  public Boolean getPreserveUnknownFields() {
    return preserveUnknownFields;
  }


  public void setPreserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields = preserveUnknownFields;
  }


  public V1beta1CustomResourceDefinitionSpec scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Scope indicates whether this resource is cluster or namespace scoped.  Default is namespaced
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "Scope indicates whether this resource is cluster or namespace scoped.  Default is namespaced")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public V1beta1CustomResourceDefinitionSpec subresources(V1beta1CustomResourceSubresources subresources) {
    
    this.subresources = subresources;
    return this;
  }

   /**
   * Get subresources
   * @return subresources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1CustomResourceSubresources getSubresources() {
    return subresources;
  }


  public void setSubresources(V1beta1CustomResourceSubresources subresources) {
    this.subresources = subresources;
  }


  public V1beta1CustomResourceDefinitionSpec validation(V1beta1CustomResourceValidation validation) {
    
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1CustomResourceValidation getValidation() {
    return validation;
  }


  public void setValidation(V1beta1CustomResourceValidation validation) {
    this.validation = validation;
  }


  public V1beta1CustomResourceDefinitionSpec version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version is the version this resource belongs in Should be always first item in Versions field if provided. Optional, but at least one of Version or Versions must be set. Deprecated: Please use &#x60;Versions&#x60;.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version is the version this resource belongs in Should be always first item in Versions field if provided. Optional, but at least one of Version or Versions must be set. Deprecated: Please use `Versions`.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public V1beta1CustomResourceDefinitionSpec versions(List<V1beta1CustomResourceDefinitionVersion> versions) {
    
    this.versions = versions;
    return this;
  }

  public V1beta1CustomResourceDefinitionSpec addVersionsItem(V1beta1CustomResourceDefinitionVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<V1beta1CustomResourceDefinitionVersion>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Versions is the list of all supported versions for this resource. If Version field is provided, this field is optional. Validation: All versions must use the same validation schema for now. i.e., top level Validation field is applied to all of these versions. Order: The version name will be used to compute the order. If the version string is \&quot;kube-like\&quot;, it will sort above non \&quot;kube-like\&quot; version strings, which are ordered lexicographically. \&quot;Kube-like\&quot; versions start with a \&quot;v\&quot;, then are followed by a number (the major version), then optionally the string \&quot;alpha\&quot; or \&quot;beta\&quot; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
   * @return versions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Versions is the list of all supported versions for this resource. If Version field is provided, this field is optional. Validation: All versions must use the same validation schema for now. i.e., top level Validation field is applied to all of these versions. Order: The version name will be used to compute the order. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.")

  public List<V1beta1CustomResourceDefinitionVersion> getVersions() {
    return versions;
  }


  public void setVersions(List<V1beta1CustomResourceDefinitionVersion> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceDefinitionSpec {\n");
    sb.append("    additionalPrinterColumns: ").append(toIndentedString(additionalPrinterColumns)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    preserveUnknownFields: ").append(toIndentedString(preserveUnknownFields)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

