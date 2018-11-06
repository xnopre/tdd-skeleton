package xnopre.tdd.skeleton;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class MyProviderTest {

	@Test
	public void test() {

		final MyProvider provider = new MyProvider();

		// Assertion JUnit
		assertTrue(provider.getTrue());
		// Fest-Asset
		assertThat(provider.getFalse()).isFalse();

		// Mockito
		MiscUtils miscUtils = mock(MiscUtils.class);
		when(miscUtils.getVersion()).thenReturn(3);
		assertThat(miscUtils.getVersion()).isEqualTo(3);
	}
}
