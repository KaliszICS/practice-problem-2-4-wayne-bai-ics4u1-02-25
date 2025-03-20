import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void selectionSortAgesTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("selectionSortAge", cArg);
  // Enter code here
  String[] names = {"julie", "james", "juliet", "Alan", "Judy"};
  int[] ages = {15, 2, 3, 4, 5};
    method.invoke(null, names, ages);
  assertArrayEquals(ages, new int[]{2, 3, 4, 5, 15});
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void selectionSortNamesTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("selectionSortName", cArg);
  // Enter code here
  String[] names = {"greg", "alice", "George", "cindy", "Nick", "Kevin"};
  int[] ages = {10, 5, 2, 3, 4, 15};
    method.invoke(null, names, ages);
  assertArrayEquals(ages, new int[]{5, 3, 2, 10, 15, 4});
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void selectionSortAgesTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("selectionSortAge", cArg);
  // Enter code here
  String[] names = {"julie", "james", "juliet", "Alan", "Judy"};
  int[] ages = {15, 2, 3, 4, 5};
    method.invoke(null, names, ages);
  assertArrayEquals(names, new String[]{"james", "juliet", "Alan", "Judy", "julie"});
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void selectionSortAgeTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("selectionSortAge", cArg);
  // Enter code here
  String[] names = {"Gordon"};
  int[] ages = {3};
    method.invoke(null, names, ages);
  assertArrayEquals(names, new String[]{"Gordon"});
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void selectionSortAgesTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("selectionSortAge", cArg);
  // Enter code here
  String[] names = {};
  int[] ages = {};
    method.invoke(null, names, ages);
  assertArrayEquals(names, new String[]{});
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void selectionSortNameTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("selectionSortAge", cArg);
  // Enter code here
  String[] names = {"greg"};
  int[] ages = {10};
    method.invoke(null, names, ages);
  assertArrayEquals(names, new String[]{"greg"});
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void selectionSortNameTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("selectionSortName", cArg);
  // Enter code here
  String[] names = {};
  int[] ages = {};
    method.invoke(null, names, ages);
  assertArrayEquals(names, new String[]{});
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void selectionSortNameTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("selectionSortName", cArg);
  // Enter code here
  String[] names = {"greg", "alice", "George", "cindy", "Nick", "Kevin"};
  int[] ages = {10, 5, 2, 3, 4, 15};
    method.invoke(null, names, ages);
  assertArrayEquals(names, new String[]{"alice", "cindy", "George", "greg", "Kevin", "Nick"});
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
