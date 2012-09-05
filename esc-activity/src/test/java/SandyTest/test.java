package SandyTest;

import static org.junit.Assert.assertEquals;

import java.util.*;

import net.sf.taverna.t2.workflowmodel.processor.activity.ActivityConfigurationException;

import org.junit.Test;

public class test {


	@Test
	public void invalidConfiguration() {
/*		EscActivityConfigurationBean invalidBean = new EscActivityConfigurationBean();
		invalidBean.setExampleString("invalidExample");
		// Should throw ActivityConfigurationException
		activity.configure(invalidBean);*/
		List l = new ArrayList();
		l.add(1);
		assertEquals(2, l.size());
	}

}
