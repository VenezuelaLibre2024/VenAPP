package p4;

import com.facebook.internal.n0;
import com.facebook.internal.r;
import com.facebook.internal.v;
import i4.e0;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f22758b;

    /* renamed from: a, reason: collision with root package name */
    public static final a f22757a = new a();

    /* renamed from: c, reason: collision with root package name */
    private static Set<String> f22759c = new HashSet();

    private a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x0009, B:8:0x0015, B:13:0x0021), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a() {
        /*
            java.lang.Class<p4.a> r0 = p4.a.class
            boolean r1 = a5.a.d(r0)
            if (r1 == 0) goto L9
            return
        L9:
            p4.a r1 = p4.a.f22757a     // Catch: java.lang.Throwable -> L24
            r1.c()     // Catch: java.lang.Throwable -> L24
            java.util.Set<java.lang.String> r1 = p4.a.f22759c     // Catch: java.lang.Throwable -> L24
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
            p4.a.f22758b = r2     // Catch: java.lang.Throwable -> L24
        L23:
            return
        L24:
            r1 = move-exception
            a5.a.b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.a():void");
    }

    public static final boolean b(String eventName) {
        if (a5.a.d(a.class)) {
            return false;
        }
        try {
            n.e(eventName, "eventName");
            if (f22758b) {
                return f22759c.contains(eventName);
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
            return false;
        }
    }

    private final void c() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f7874a;
            r q10 = v.q(e0.m(), false);
            if (q10 == null) {
                return;
            }
            n0 n0Var = n0.f7780a;
            HashSet<String> m10 = n0.m(q10.b());
            if (m10 == null) {
                return;
            }
            f22759c = m10;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
