package el;

import ck.n;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f14768a = new a.a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f14769b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f14770c;

    static {
        Object b10;
        Object b11;
        try {
            n.a aVar = ck.n.f7126b;
            b10 = ck.n.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th2) {
            n.a aVar2 = ck.n.f7126b;
            b10 = ck.n.b(ck.o.a(th2));
        }
        if (ck.n.d(b10) != null) {
            b10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f14769b = (String) b10;
        try {
            b11 = ck.n.b(g0.class.getCanonicalName());
        } catch (Throwable th3) {
            n.a aVar3 = ck.n.f7126b;
            b11 = ck.n.b(ck.o.a(th3));
        }
        if (ck.n.d(b11) != null) {
            b11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f14770c = (String) b11;
    }

    public static final <E extends Throwable> E a(E e10) {
        return e10;
    }
}
