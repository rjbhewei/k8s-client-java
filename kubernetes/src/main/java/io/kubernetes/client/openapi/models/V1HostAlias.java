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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod&#39;s hosts file.
 */
@ApiModel(description = "HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class V1HostAlias {
  public static final String SERIALIZED_NAME_HOSTNAMES = "hostnames";
  @SerializedName(SERIALIZED_NAME_HOSTNAMES)
  private List<String> hostnames = null;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;


  public V1HostAlias hostnames(List<String> hostnames) {
    
    this.hostnames = hostnames;
    return this;
  }

  public V1HostAlias addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<String>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Hostnames for the above IP address.
   * @return hostnames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hostnames for the above IP address.")

  public List<String> getHostnames() {
    return hostnames;
  }


  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }


  public V1HostAlias ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * IP address of the host file entry.
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address of the host file entry.")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
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
    sb.append("class V1HostAlias {\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

