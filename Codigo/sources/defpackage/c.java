package defpackage;

import android.util.Log;
import dk.r;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> b(Throwable th2) {
        List<Object> l10;
        List<Object> l11;
        if (th2 instanceof a) {
            l11 = r.l(((a) th2).a(), th2.getMessage(), ((a) th2).b());
            return l11;
        }
        l10 = r.l(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return l10;
    }
}
