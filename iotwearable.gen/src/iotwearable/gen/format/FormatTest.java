package iotwearable.gen.format;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormatTest {

	@Test
	public void methodLevel0() {
		String src = "void name(){\nHello;\n}";
		String expected = "void name(){\n\tHello;\n}";
		assertEquals(expected, Format.format(src));
	}

}
