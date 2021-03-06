package FactoryAndData.B2B;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

import CommonFunction.Common;
import TestData.PropsUtils;
import TestScript.B2B.NA17671Test;

public class NA17671 {

	@DataProvider(name = "17671")
	public static Object[][] Data17671() {
		return Common.getFactoryData(new Object[][] {
				{ "AU"},
				{ "US"},
				{ "JP"}

		},PropsUtils.getTargetStore("NA-17671"));
	}

	@Factory(dataProvider = "17671")
	public Object[] createTest(String store) {

		Object[] tests = new Object[1];

		tests[0] = new NA17671Test(store);

		return tests;
	}

}
