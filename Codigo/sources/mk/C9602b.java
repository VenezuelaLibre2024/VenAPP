package mk;

import ck.C2017b;
import java.io.Closeable;

/* renamed from: mk.b */
/* loaded from: classes3.dex */
public final class C9602b {
    /* renamed from: a */
    public static final void m28593a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                C2017b.m10328a(th2, th3);
            }
        }
    }
}
