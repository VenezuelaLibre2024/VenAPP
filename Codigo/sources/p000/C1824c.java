package p000;

import android.util.Log;
import dk.C7031r;
import java.util.List;

/* renamed from: c */
/* loaded from: classes2.dex */
public final class C1824c {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final List<Object> m9823b(Throwable th2) {
        List<Object> m20584l;
        List<Object> m20584l2;
        if (th2 instanceof C0000a) {
            m20584l2 = C7031r.m20584l(((C0000a) th2).m0a(), th2.getMessage(), ((C0000a) th2).m1b());
            return m20584l2;
        }
        m20584l = C7031r.m20584l(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return m20584l;
    }
}
