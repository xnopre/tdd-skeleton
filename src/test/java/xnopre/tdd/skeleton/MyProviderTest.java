package xnopre.tdd.skeleton;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyProviderTest {

	@Test
	public void test() {

		final MyProvider provider = new MyProvider();

		assertTrue(provider.getTrue());

		assertThat(provider.getFalse()).isFalse();
	}
}
