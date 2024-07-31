package sc;

import ee.InterfaceC7182a;
import ee.InterfaceC7183b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p442xc.AbstractC12426f0;
import p442xc.AbstractC12428g0;

/* renamed from: sc.d */
/* loaded from: classes.dex */
public final class C10886d implements InterfaceC10883a {

    /* renamed from: c */
    private static final InterfaceC10890h f27582c = new b();

    /* renamed from: a */
    private final InterfaceC7182a<InterfaceC10883a> f27583a;

    /* renamed from: b */
    private final AtomicReference<InterfaceC10883a> f27584b = new AtomicReference<>(null);

    /* renamed from: sc.d$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC10890h {
        private b() {
        }

        @Override // sc.InterfaceC10890h
        /* renamed from: a */
        public File mo33200a() {
            return null;
        }

        @Override // sc.InterfaceC10890h
        /* renamed from: b */
        public AbstractC12426f0.a mo33201b() {
            return null;
        }

        @Override // sc.InterfaceC10890h
        /* renamed from: c */
        public File mo33202c() {
            return null;
        }

        @Override // sc.InterfaceC10890h
        /* renamed from: d */
        public File mo33203d() {
            return null;
        }

        @Override // sc.InterfaceC10890h
        /* renamed from: e */
        public File mo33204e() {
            return null;
        }

        @Override // sc.InterfaceC10890h
        /* renamed from: f */
        public File mo33205f() {
            return null;
        }

        @Override // sc.InterfaceC10890h
        /* renamed from: g */
        public File mo33206g() {
            return null;
        }
    }

    public C10886d(InterfaceC7182a<InterfaceC10883a> interfaceC7182a) {
        this.f27583a = interfaceC7182a;
        interfaceC7182a.mo21379a(new InterfaceC7182a.a() { // from class: sc.b
            @Override // ee.InterfaceC7182a.a
            /* renamed from: a */
            public final void mo21380a(InterfaceC7183b interfaceC7183b) {
                C10886d.this.m33198g(interfaceC7183b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m33198g(InterfaceC7183b interfaceC7183b) {
        C10889g.m33216f().m33217b("Crashlytics native component now available.");
        this.f27584b.set((InterfaceC10883a) interfaceC7183b.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m33199h(String str, String str2, long j10, AbstractC12428g0 abstractC12428g0, InterfaceC7183b interfaceC7183b) {
        ((InterfaceC10883a) interfaceC7183b.get()).mo33194c(str, str2, j10, abstractC12428g0);
    }

    @Override // sc.InterfaceC10883a
    /* renamed from: a */
    public InterfaceC10890h mo33192a(String str) {
        InterfaceC10883a interfaceC10883a = this.f27584b.get();
        return interfaceC10883a == null ? f27582c : interfaceC10883a.mo33192a(str);
    }

    @Override // sc.InterfaceC10883a
    /* renamed from: b */
    public boolean mo33193b() {
        InterfaceC10883a interfaceC10883a = this.f27584b.get();
        return interfaceC10883a != null && interfaceC10883a.mo33193b();
    }

    @Override // sc.InterfaceC10883a
    /* renamed from: c */
    public void mo33194c(final String str, final String str2, final long j10, final AbstractC12428g0 abstractC12428g0) {
        C10889g.m33216f().m33223i("Deferring native open session: " + str);
        this.f27583a.mo21379a(new InterfaceC7182a.a() { // from class: sc.c
            @Override // ee.InterfaceC7182a.a
            /* renamed from: a */
            public final void mo21380a(InterfaceC7183b interfaceC7183b) {
                C10886d.m33199h(str, str2, j10, abstractC12428g0, interfaceC7183b);
            }
        });
    }

    @Override // sc.InterfaceC10883a
    /* renamed from: d */
    public boolean mo33195d(String str) {
        InterfaceC10883a interfaceC10883a = this.f27584b.get();
        return interfaceC10883a != null && interfaceC10883a.mo33195d(str);
    }
}
