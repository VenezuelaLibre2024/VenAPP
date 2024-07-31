package mk;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
final class d extends ByteArrayOutputStream {
    public d(int i10) {
        super(i10);
    }

    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        n.d(buf, "buf");
        return buf;
    }
}
