package p356t1;

import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.C9322n;

/* renamed from: t1.c */
/* loaded from: classes.dex */
public final class C10974c {
    /* renamed from: a */
    public static final void m33490a(ReadableByteChannel input, FileChannel output) {
        C9322n.m27781e(input, "input");
        C9322n.m27781e(output, "output");
        try {
            output.transferFrom(input, 0L, Long.MAX_VALUE);
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}
