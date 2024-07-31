package r1;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final u f24549a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f24550b;

    /* renamed from: c, reason: collision with root package name */
    private final ck.h f24551c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.o implements ok.a<v1.m> {
        a() {
            super(0);
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v1.m invoke() {
            return d0.this.d();
        }
    }

    public d0(u database) {
        ck.h a10;
        kotlin.jvm.internal.n.e(database, "database");
        this.f24549a = database;
        this.f24550b = new AtomicBoolean(false);
        a10 = ck.j.a(new a());
        this.f24551c = a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v1.m d() {
        return this.f24549a.f(e());
    }

    private final v1.m f() {
        return (v1.m) this.f24551c.getValue();
    }

    private final v1.m g(boolean z10) {
        return z10 ? f() : d();
    }

    public v1.m b() {
        c();
        return g(this.f24550b.compareAndSet(false, true));
    }

    protected void c() {
        this.f24549a.c();
    }

    protected abstract String e();

    public void h(v1.m statement) {
        kotlin.jvm.internal.n.e(statement, "statement");
        if (statement == f()) {
            this.f24550b.set(false);
        }
    }
}
