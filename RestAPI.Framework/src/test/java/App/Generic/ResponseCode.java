package App.Generic;

import org.testng.Assert;

public class ResponseCode {

	public int SuccessResponseCode = 200;
	public int ServerResponseCode = 500;

	public void SuccessCode(int Code) {

		Assert.assertEquals(SuccessResponseCode, Code);
	}

	public void ServerErrorCode(int Code) {

		Assert.assertEquals(ServerResponseCode, Code);
	}

}
