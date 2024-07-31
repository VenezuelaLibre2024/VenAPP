package p287p4;

import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: p4.a */
/* loaded from: classes.dex */
public final class C10054a {

    /* renamed from: b */
    private static boolean f24691b;

    /* renamed from: a */
    public static final C10054a f24690a = new C10054a();

    /* renamed from: c */
    private static Set<String> f24692c = new HashSet();

    private C10054a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x0009, B:8:0x0015, B:13:0x0021), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m29973a() {
        /*
            java.lang.Class<p4.a> r0 = p287p4.C10054a.class
            boolean r1 = p007a5.C0033a.m107d(r0)
            if (r1 == 0) goto L9
            return
        L9:
            p4.a r1 = p287p4.C10054a.f24690a     // Catch: java.lang.Throwable -> L24
            r1.m29975c()     // Catch: java.lang.Throwable -> L24
            java.util.Set<java.lang.String> r1 = p287p4.C10054a.f24692c     // Catch: java.lang.Throwable -> L24
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L24
            r2 = 1
            if (r1 == 0) goto L1e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L1c
            goto L1e
        L1c:
            r1 = 0
            goto L1f
        L1e:
            r1 = r2
        L1f:
            if (r1 != 0) goto L23
            p287p4.C10054a.f24691b = r2     // Catch: java.lang.Throwable -> L24
        L23:
            return
        L24:
            r1 = move-exception
            p007a5.C0033a.m105b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p287p4.C10054a.m29973a():void");
    }

    /* renamed from: b */
    public static final boolean m29974b(String eventName) {
        if (C0033a.m107d(C10054a.class)) {
            return false;
        }
        try {
            C9322n.m27781e(eventName, "eventName");
            if (f24691b) {
                return f24692c.contains(eventName);
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10054a.class);
            return false;
        }
    }

    /* renamed from: c */
    private final void m29975c() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4648v c4648v = C4648v.f8854a;
            C4641r m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
            if (m11457q == null) {
                return;
            }
            C4634n0 c4634n0 = C4634n0.f8760a;
            HashSet<String> m11317m = C4634n0.m11317m(m11457q.m11376b());
            if (m11317m == null) {
                return;
            }
            f24692c = m11317m;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
