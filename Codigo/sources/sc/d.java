package sc;

import ee.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import xc.f0;
import xc.g0;

/* loaded from: classes.dex */
public final class d implements sc.a {

    /* renamed from: c, reason: collision with root package name */
    private static final h f25463c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final ee.a<sc.a> f25464a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<sc.a> f25465b = new AtomicReference<>(null);

    /* loaded from: classes.dex */
    private static final class b implements h {
        private b() {
        }

        @Override // sc.h
        public File a() {
            return null;
        }

        @Override // sc.h
        public f0.a b() {
            return null;
        }

        @Override // sc.h
        public File c() {
            return null;
        }

        @Override // sc.h
        public File d() {
            return null;
        }

        @Override // sc.h
        public File e() {
            return null;
        }

        @Override // sc.h
        public File f() {
            return null;
        }

        @Override // sc.h
        public File g() {
            return null;
        }
    }

    public d(ee.a<sc.a> aVar) {
        this.f25464a = aVar;
        aVar.a(new a.InterfaceC0227a() { // from class: sc.b
            @Override // ee.a.InterfaceC0227a
            public final void a(ee.b bVar) {
                d.this.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(ee.b bVar) {
        g.f().b("Crashlytics native component now available.");
        this.f25465b.set((sc.a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j10, g0 g0Var, ee.b bVar) {
        ((sc.a) bVar.get()).c(str, str2, j10, g0Var);
    }

    @Override // sc.a
    public h a(String str) {
        sc.a aVar = this.f25465b.get();
        return aVar == null ? f25463c : aVar.a(str);
    }

    @Override // sc.a
    public boolean b() {
        sc.a aVar = this.f25465b.get();
        return aVar != null && aVar.b();
    }

    @Override // sc.a
    public void c(final String str, final String str2, final long j10, final g0 g0Var) {
        g.f().i("Deferring native open session: " + str);
        this.f25464a.a(new a.InterfaceC0227a() { // from class: sc.c
            @Override // ee.a.InterfaceC0227a
            public final void a(ee.b bVar) {
                d.h(str, str2, j10, g0Var, bVar);
            }
        });
    }

    @Override // sc.a
    public boolean d(String str) {
        sc.a aVar = this.f25465b.get();
        return aVar != null && aVar.d(str);
    }
}
