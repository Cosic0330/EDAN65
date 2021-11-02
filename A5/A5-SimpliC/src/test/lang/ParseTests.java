package lang;

import java.io.File;

import org.junit.Test;

public class ParseTests {
	/** Directory where the test input files are stored. */
	private static final File TEST_DIRECTORY = new File("testfiles/parser");

@Test public void ifStatement() {
		Util.testValidSyntax(TEST_DIRECTORY, "If.in");
}
	
@Test public void Returnstmt() {
		Util.testValidSyntax(TEST_DIRECTORY, "ReturnStatements.in");
}

@Test public void comparision() {
		Util.testValidSyntax(TEST_DIRECTORY, "Comparison.in");
}

@Test public void leftAssociativity() {
		Util.testValidSyntax(TEST_DIRECTORY, "LeftAssociativity.in");
}

@Test public void priorityAddSubMulDivMod() {
		Util.testValidSyntax(TEST_DIRECTORY, "PriorityAddSubMulDivMod.in");
}

@Test public void piorityParam() {
		Util.testValidSyntax(TEST_DIRECTORY, "PriorityParanthesis.in");
}

@Test public void exampleProgram32() {
		Util.testValidSyntax(TEST_DIRECTORY, "ExampleProgram32.in");
}

@Test public void empty() {
		Util.testValidSyntax(TEST_DIRECTORY, "EmptyProgram.in");
}

@Test public void ErrorIncompleteParam() {
		Util.testSyntaxError(TEST_DIRECTORY, "ErrorIncompleteParam.in");
}

@Test public void UnaryMinus() {
		Util.testValidSyntax(TEST_DIRECTORY, "UnaryMinus.in");
}

@Test public void UnaryExpression() {
		Util.testValidSyntax(TEST_DIRECTORY, "UnaryExpression.in");
}

@Test public void repetedUnary() {
	Util.testValidSyntax(TEST_DIRECTORY, "RepetedUnary.in");
}

@Test public void error4() {
	Util.testSyntaxError(TEST_DIRECTORY, "error4.in");
}
}
