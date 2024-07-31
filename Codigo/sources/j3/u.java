package j3;

import d4.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u<Z> implements v<Z>, a.f {

    /* renamed from: e, reason: collision with root package name */
    private static final androidx.core.util.e<u<?>> f19704e = d4.a.d(20, new a());

    /* renamed from: a, reason: collision with root package name */
    private final d4.c f19705a = d4.c.a();

    /* renamed from: b, reason: collision with root package name */
    private v<Z> f19706b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19707c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19708d;

    /* loaded from: classes.dex */
    class a implements a.d<u<?>> {
        a() {
        }

        @Override // d4.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u<?> a() {
            return new u<>();
        }
    }

    u() {
    }

    private void a(v<Z> vVar) {
        this.f19708d = false;
        this.f19707c = true;
        this.f19706b = vVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Z> u<Z> b(v<Z> vVar) {
        u<Z> uVar = (u) c4.k.d(f19704e.b());
        uVar.a(vVar);
        return uVar;
    }

    private void c() {
        this.f19706b = null;
        f19704e.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d() {
        this.f19705a.c();
        if (!this.f19707c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f19707c = false;
        if (this.f19708d) {
            q();
        }
    }

    @Override // j3.v
    public Z get() {
        return this.f19706b.get();
    }

    @Override // d4.a.f
    public d4.c h() {
        return this.f19705a;
    }

    @Override // j3.v
    public int p() {
        return this.f19706b.p();
    }

    @Override // j3.v
    public synchronized void q() {
        this.f19705a.c();
        this.f19708d = true;
        if (!this.f19707c) {
            this.f19706b.q();
            c();
        }
    }

    @Override // j3.v
    public Class<Z> r() {
        return this.f19706b.r();
    }
}
