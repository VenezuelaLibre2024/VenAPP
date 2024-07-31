package ck;

import ck.n;

/* loaded from: classes3.dex */
public final class o {
    public static final Object a(Throwable exception) {
        kotlin.jvm.internal.n.e(exception, "exception");
        return new n.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof n.b) {
            throw ((n.b) obj).f7128a;
        }
    }
}
