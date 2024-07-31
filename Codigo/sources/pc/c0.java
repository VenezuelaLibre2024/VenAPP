package pc;

import ee.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0<T> implements ee.b<T>, ee.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0227a<Object> f22974c = new a.InterfaceC0227a() { // from class: pc.z
        @Override // ee.a.InterfaceC0227a
        public final void a(ee.b bVar) {
            c0.f(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final ee.b<Object> f22975d = new ee.b() { // from class: pc.a0
        @Override // ee.b
        public final Object get() {
            Object g10;
            g10 = c0.g();
            return g10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private a.InterfaceC0227a<T> f22976a;

    /* renamed from: b, reason: collision with root package name */
    private volatile ee.b<T> f22977b;

    private c0(a.InterfaceC0227a<T> interfaceC0227a, ee.b<T> bVar) {
        this.f22976a = interfaceC0227a;
        this.f22977b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> c0<T> e() {
        return new c0<>(f22974c, f22975d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(ee.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0227a interfaceC0227a, a.InterfaceC0227a interfaceC0227a2, ee.b bVar) {
        interfaceC0227a.a(bVar);
        interfaceC0227a2.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> c0<T> i(ee.b<T> bVar) {
        return new c0<>(null, bVar);
    }

    @Override // ee.a
    public void a(final a.InterfaceC0227a<T> interfaceC0227a) {
        ee.b<T> bVar;
        ee.b<T> bVar2;
        ee.b<T> bVar3 = this.f22977b;
        ee.b<Object> bVar4 = f22975d;
        if (bVar3 != bVar4) {
            interfaceC0227a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f22977b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0227a<T> interfaceC0227a2 = this.f22976a;
                this.f22976a = new a.InterfaceC0227a() { // from class: pc.b0
                    @Override // ee.a.InterfaceC0227a
                    public final void a(ee.b bVar5) {
                        c0.h(a.InterfaceC0227a.this, interfaceC0227a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0227a.a(bVar);
        }
    }

    @Override // ee.b
    public T get() {
        return this.f22977b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ee.b<T> bVar) {
        a.InterfaceC0227a<T> interfaceC0227a;
        if (this.f22977b != f22975d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0227a = this.f22976a;
            this.f22976a = null;
            this.f22977b = bVar;
        }
        interfaceC0227a.a(bVar);
    }
}
