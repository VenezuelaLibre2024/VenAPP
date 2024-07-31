package p319ql;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9322n;
import p388ul.C11590e;
import p406vl.C11980g;

/* renamed from: ql.k */
/* loaded from: classes3.dex */
public final class C10536k {

    /* renamed from: a */
    private final C11980g f26399a;

    public C10536k() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10536k(int i10, long j10, TimeUnit timeUnit) {
        this(new C11980g(C11590e.f30144i, i10, j10, timeUnit));
        C9322n.m27781e(timeUnit, "timeUnit");
    }

    public C10536k(C11980g delegate) {
        C9322n.m27781e(delegate, "delegate");
        this.f26399a = delegate;
    }

    /* renamed from: a */
    public final C11980g m31748a() {
        return this.f26399a;
    }
}
