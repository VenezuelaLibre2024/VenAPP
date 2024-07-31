package t2;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f25773a;

    /* renamed from: b, reason: collision with root package name */
    private final f f25774b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25775c;

    /* renamed from: d, reason: collision with root package name */
    private final f[] f25776d;

    /* renamed from: e, reason: collision with root package name */
    private final e[] f25777e;

    public f(Throwable th2) {
        this(th2, Collections.newSetFromMap(new IdentityHashMap()));
    }

    public f(Throwable th2, Set<Throwable> set) {
        set.add(th2);
        this.f25773a = th2.getMessage();
        this.f25774b = (th2.getCause() == null || set.contains(th2.getCause())) ? null : new f(th2.getCause(), set);
        this.f25775c = th2.getClass().getName();
        Throwable[] suppressed = th2.getSuppressed();
        LinkedList linkedList = new LinkedList();
        int length = suppressed.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!set.contains(suppressed[i10])) {
                linkedList.add(new f(suppressed[i10], set));
            }
        }
        this.f25776d = (f[]) linkedList.toArray(new f[0]);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        this.f25777e = new e[stackTrace.length];
        int length2 = stackTrace.length;
        for (int i11 = 0; i11 < length2; i11++) {
            this.f25777e[i11] = new e(stackTrace[i11]);
        }
    }

    public f a() {
        return this.f25774b;
    }

    public String b() {
        return this.f25775c;
    }

    public String c() {
        return this.f25773a;
    }

    public e[] d() {
        return this.f25777e;
    }

    public f[] e() {
        return this.f25776d;
    }
}
