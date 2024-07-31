package p294pc;

import ee.InterfaceC7182a;
import ee.InterfaceC7183b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pc.c0 */
/* loaded from: classes.dex */
public class C10133c0<T> implements InterfaceC7183b<T>, InterfaceC7182a<T> {

    /* renamed from: c */
    private static final InterfaceC7182a.a<Object> f24907c = new InterfaceC7182a.a() { // from class: pc.z
        @Override // ee.InterfaceC7182a.a
        /* renamed from: a */
        public final void mo21380a(InterfaceC7183b interfaceC7183b) {
            C10133c0.m30289f(interfaceC7183b);
        }
    };

    /* renamed from: d */
    private static final InterfaceC7183b<Object> f24908d = new InterfaceC7183b() { // from class: pc.a0
        @Override // ee.InterfaceC7183b
        public final Object get() {
            Object m30290g;
            m30290g = C10133c0.m30290g();
            return m30290g;
        }
    };

    /* renamed from: a */
    private InterfaceC7182a.a<T> f24909a;

    /* renamed from: b */
    private volatile InterfaceC7183b<T> f24910b;

    private C10133c0(InterfaceC7182a.a<T> aVar, InterfaceC7183b<T> interfaceC7183b) {
        this.f24909a = aVar;
        this.f24910b = interfaceC7183b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <T> C10133c0<T> m30288e() {
        return new C10133c0<>(f24907c, f24908d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m30289f(InterfaceC7183b interfaceC7183b) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m30290g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m30291h(InterfaceC7182a.a aVar, InterfaceC7182a.a aVar2, InterfaceC7183b interfaceC7183b) {
        aVar.mo21380a(interfaceC7183b);
        aVar2.mo21380a(interfaceC7183b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static <T> C10133c0<T> m30292i(InterfaceC7183b<T> interfaceC7183b) {
        return new C10133c0<>(null, interfaceC7183b);
    }

    @Override // ee.InterfaceC7182a
    /* renamed from: a */
    public void mo21379a(final InterfaceC7182a.a<T> aVar) {
        InterfaceC7183b<T> interfaceC7183b;
        InterfaceC7183b<T> interfaceC7183b2;
        InterfaceC7183b<T> interfaceC7183b3 = this.f24910b;
        InterfaceC7183b<Object> interfaceC7183b4 = f24908d;
        if (interfaceC7183b3 != interfaceC7183b4) {
            aVar.mo21380a(interfaceC7183b3);
            return;
        }
        synchronized (this) {
            interfaceC7183b = this.f24910b;
            if (interfaceC7183b != interfaceC7183b4) {
                interfaceC7183b2 = interfaceC7183b;
            } else {
                final InterfaceC7182a.a<T> aVar2 = this.f24909a;
                this.f24909a = new InterfaceC7182a.a() { // from class: pc.b0
                    @Override // ee.InterfaceC7182a.a
                    /* renamed from: a */
                    public final void mo21380a(InterfaceC7183b interfaceC7183b5) {
                        C10133c0.m30291h(InterfaceC7182a.a.this, aVar, interfaceC7183b5);
                    }
                };
                interfaceC7183b2 = null;
            }
        }
        if (interfaceC7183b2 != null) {
            aVar.mo21380a(interfaceC7183b);
        }
    }

    @Override // ee.InterfaceC7183b
    public T get() {
        return this.f24910b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m30293j(InterfaceC7183b<T> interfaceC7183b) {
        InterfaceC7182a.a<T> aVar;
        if (this.f24910b != f24908d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f24909a;
            this.f24909a = null;
            this.f24910b = interfaceC7183b;
        }
        aVar.mo21380a(interfaceC7183b);
    }
}
