package io.grpc.internal;

/* loaded from: classes3.dex */
public final class n2 {

    /* renamed from: l, reason: collision with root package name */
    private static final b f19004l = new b(k2.f18945a);

    /* renamed from: a, reason: collision with root package name */
    private final k2 f19005a;

    /* renamed from: b, reason: collision with root package name */
    private long f19006b;

    /* renamed from: c, reason: collision with root package name */
    private long f19007c;

    /* renamed from: d, reason: collision with root package name */
    private long f19008d;

    /* renamed from: e, reason: collision with root package name */
    private long f19009e;

    /* renamed from: f, reason: collision with root package name */
    private long f19010f;

    /* renamed from: g, reason: collision with root package name */
    private c f19011g;

    /* renamed from: h, reason: collision with root package name */
    private long f19012h;

    /* renamed from: i, reason: collision with root package name */
    private long f19013i;

    /* renamed from: j, reason: collision with root package name */
    private final d1 f19014j;

    /* renamed from: k, reason: collision with root package name */
    private volatile long f19015k;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final k2 f19016a;

        public b(k2 k2Var) {
            this.f19016a = k2Var;
        }

        public n2 a() {
            return new n2(this.f19016a);
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
    }

    public n2() {
        this.f19014j = e1.a();
        this.f19005a = k2.f18945a;
    }

    private n2(k2 k2Var) {
        this.f19014j = e1.a();
        this.f19005a = k2Var;
    }

    public static b a() {
        return f19004l;
    }

    public void b() {
        this.f19010f++;
    }

    public void c() {
        this.f19006b++;
        this.f19007c = this.f19005a.a();
    }

    public void d() {
        this.f19014j.add(1L);
        this.f19015k = this.f19005a.a();
    }

    public void e(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f19012h += i10;
        this.f19013i = this.f19005a.a();
    }

    public void f(boolean z10) {
        if (z10) {
            this.f19008d++;
        } else {
            this.f19009e++;
        }
    }

    public void g(c cVar) {
        this.f19011g = (c) eb.o.o(cVar);
    }
}
