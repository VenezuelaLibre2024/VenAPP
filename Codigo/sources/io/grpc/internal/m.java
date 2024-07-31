package io.grpc.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    static final b f18981f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final k2 f18982a;

    /* renamed from: b, reason: collision with root package name */
    private final d1 f18983b = e1.a();

    /* renamed from: c, reason: collision with root package name */
    private final d1 f18984c = e1.a();

    /* renamed from: d, reason: collision with root package name */
    private final d1 f18985d = e1.a();

    /* renamed from: e, reason: collision with root package name */
    private volatile long f18986e;

    /* loaded from: classes3.dex */
    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.m.b
        public m a() {
            return new m(k2.f18945a);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        m a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(k2 k2Var) {
        this.f18982a = k2Var;
    }

    public void a(boolean z10) {
        (z10 ? this.f18984c : this.f18985d).add(1L);
    }

    public void b() {
        this.f18983b.add(1L);
        this.f18986e = this.f18982a.a();
    }
}
