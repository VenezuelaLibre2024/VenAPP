package r1;

import v1.j;

/* loaded from: classes.dex */
public final class e implements j.c {

    /* renamed from: a, reason: collision with root package name */
    private final j.c f24553a;

    /* renamed from: b, reason: collision with root package name */
    private final c f24554b;

    public e(j.c delegate, c autoCloser) {
        kotlin.jvm.internal.n.e(delegate, "delegate");
        kotlin.jvm.internal.n.e(autoCloser, "autoCloser");
        this.f24553a = delegate;
        this.f24554b = autoCloser;
    }

    @Override // v1.j.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(j.b configuration) {
        kotlin.jvm.internal.n.e(configuration, "configuration");
        return new d(this.f24553a.a(configuration), this.f24554b);
    }
}
