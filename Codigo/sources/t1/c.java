package t1;

import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class c {
    public static final void a(ReadableByteChannel input, FileChannel output) {
        n.e(input, "input");
        n.e(output, "output");
        try {
            output.transferFrom(input, 0L, Long.MAX_VALUE);
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}
