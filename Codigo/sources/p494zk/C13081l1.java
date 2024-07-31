package p494zk;

import java.util.concurrent.CancellationException;

/* renamed from: zk.l1 */
/* loaded from: classes3.dex */
public final class C13081l1 {
    /* renamed from: a */
    public static final CancellationException m43234a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}
