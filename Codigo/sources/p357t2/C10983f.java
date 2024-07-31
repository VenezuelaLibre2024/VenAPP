package p357t2;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: t2.f */
/* loaded from: classes.dex */
public class C10983f {

    /* renamed from: a */
    private final String f27917a;

    /* renamed from: b */
    private final C10983f f27918b;

    /* renamed from: c */
    private final String f27919c;

    /* renamed from: d */
    private final C10983f[] f27920d;

    /* renamed from: e */
    private final C10982e[] f27921e;

    public C10983f(Throwable th2) {
        this(th2, Collections.newSetFromMap(new IdentityHashMap()));
    }

    public C10983f(Throwable th2, Set<Throwable> set) {
        set.add(th2);
        this.f27917a = th2.getMessage();
        this.f27918b = (th2.getCause() == null || set.contains(th2.getCause())) ? null : new C10983f(th2.getCause(), set);
        this.f27919c = th2.getClass().getName();
        Throwable[] suppressed = th2.getSuppressed();
        LinkedList linkedList = new LinkedList();
        int length = suppressed.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!set.contains(suppressed[i10])) {
                linkedList.add(new C10983f(suppressed[i10], set));
            }
        }
        this.f27920d = (C10983f[]) linkedList.toArray(new C10983f[0]);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        this.f27921e = new C10982e[stackTrace.length];
        int length2 = stackTrace.length;
        for (int i11 = 0; i11 < length2; i11++) {
            this.f27921e[i11] = new C10982e(stackTrace[i11]);
        }
    }

    /* renamed from: a */
    public C10983f m33531a() {
        return this.f27918b;
    }

    /* renamed from: b */
    public String m33532b() {
        return this.f27919c;
    }

    /* renamed from: c */
    public String m33533c() {
        return this.f27917a;
    }

    /* renamed from: d */
    public C10982e[] m33534d() {
        return this.f27921e;
    }

    /* renamed from: e */
    public C10983f[] m33535e() {
        return this.f27920d;
    }
}
