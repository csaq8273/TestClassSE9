

import java.util.Random;
import java.util.concurrent.TimeUnit;
 
import com.google.common.base.Stopwatch; // -> siehe builod.gradle
//<a href="http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/base/Stopwatch.html">Guava Stopwatch</a>


public final class GradleTest {
 
public final static void main(final String[] args) {

final Stopwatch stopwatch = Stopwatch.createStarted();
 
//Sleep for few random milliseconds.
try {
    Thread.sleep(new Random().nextInt(1000));
} catch (final InterruptedException interruptedException) {
    interruptedException.printStackTrace();
}
 
stopwatch.stop(); //optional
 
System.out.println("Elapsed time ==> " + stopwatch);
System.out.println("Elapsed time in Nanoseconds ==> " + stopwatch.elapsed(TimeUnit.NANOSECONDS));
System.out.println("Elapsed time in Microseconds ==> " + stopwatch.elapsed(TimeUnit.MICROSECONDS));
System.out.println("Elapsed time in Milliseconds ==> " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
//System.out.println("Elapsed time in Seconds ==> " + stopwatch.elapsed(TimeUnit.SECONDS));
//System.out.println("Elapsed time in Minutes ==> " + stopwatch.elapsed(TimeUnit.MINUTES));
}
} 
