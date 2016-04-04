package org.jnit.restHttpClient;

import java.io.IOException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

public class RestClient {

	public static void main(String args[]) throws HttpException, IOException {
		HttpClient client = new HttpClient();
		String url = "http://localhost:8080/springJaxRsWs/rest/customerService/findCustomer?customerId=23";
		GetMethod getMethod = new GetMethod(url);
		Header reqHeader = new Header();
		reqHeader.setName("content-type");
		reqHeader.setValue("application/x-www-form-urlencoded");
		reqHeader.setName("accept");
		reqHeader.setValue("application/json");
		getMethod.setRequestHeader(reqHeader);
		client.executeMethod(getMethod);
		String output = getMethod.getResponseBodyAsString();
		getMethod.releaseConnection();
		System.out.printf(output);

	}

	public static void postRequestTest() throws HttpException, IOException {
		HttpClient postClient = new HttpClient();
		String url = "http://localhost:8080/springJaxRsWs/rest/customerService/create?cname=Cithia&street=102 halls mill road&city=Whitehouse station&state=NJ&country=USA&zipCode=65846";
		PostMethod postMethod = new PostMethod(url);
		// postMethod.addParameter("customerId", "cust3");
		postMethod.addParameter("cname", "Ret Ted");
		postMethod.addParameter("street", "1st barce street");
		postMethod.addParameter("city", "Barcelona");
		postMethod.addParameter("state", "Ba");
		postMethod.addParameter("country", "Barcelona");
		postMethod.addParameter("zipCode", "11111");
		Header reqHeader = new Header();
		reqHeader.setName("content-type");
		reqHeader.setValue("application/x-www-form-urlencoded");
		reqHeader.setName("accept");
		reqHeader.setValue("application/json");
		postMethod.setRequestHeader(reqHeader);
		postClient.executeMethod(postMethod);
		String output = postMethod.getResponseBodyAsString();
		postMethod.releaseConnection();
		System.out.println(output);

	}

}
