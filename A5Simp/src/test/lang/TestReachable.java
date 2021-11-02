package lang;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lang.ast.FunctionDecl;
import lang.ast.Program;

/**
 * This is a parameterized test: one test case is generated for each input
 * file found in TEST_DIRECTORY. Input files should have the ".in" extension.
 */
@RunWith(Parameterized.class)
public class TestReachable {
	/** Directory where the test input files are stored. */
	private static final File TEST_DIRECTORY = new File("testfiles/reachable");

	private final String filename;
	public TestReachable(String testFile) {
		filename = testFile;
	}

	@Test public void runTest() throws Exception {
		Program program = (Program) Util.parse(new File(TEST_DIRECTORY, filename));
		StringBuilder sb = new StringBuilder();
		for (FunctionDecl f1 : program.functionCalls()) {
			sb.append(f1).append(": ");
            for(FunctionDecl f2 : f1.reachable()) {
				sb.append(f2).append(", ");
			}
			sb.append("\n");
		}

		
		String actual = sb.toString();
		Util.compareOutput(actual,
				new File(TEST_DIRECTORY, Util.changeExtension(filename, ".out")),
				new File(TEST_DIRECTORY, Util.changeExtension(filename, ".expected")));
	}

	@Parameters(name = "{0}")
	public static Iterable<Object[]> getTests() {
		return Util.getTestParameters(TEST_DIRECTORY, ".in");
	}
}
