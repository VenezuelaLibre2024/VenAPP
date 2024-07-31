package ql;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final vl.g f24305a;

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new vl.g(ul.e.f27821i, i10, j10, timeUnit));
        kotlin.jvm.internal.n.e(timeUnit, "timeUnit");
    }

    public k(vl.g delegate) {
        kotlin.jvm.internal.n.e(delegate, "delegate");
        this.f24305a = delegate;
    }

    public final vl.g a() {
        return this.f24305a;
    }
}
