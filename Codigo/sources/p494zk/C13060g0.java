package p494zk;

import kotlin.coroutines.jvm.internal.InterfaceC9299e;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9332x;
import p124gk.C7588g;
import p124gk.Continuation;
import p124gk.InterfaceC7585d;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* renamed from: zk.g0 */
/* loaded from: classes3.dex */
public final class C13060g0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zk.g0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9323o implements InterfaceC10002p<InterfaceC7587f, InterfaceC7587f.b, InterfaceC7587f> {

        /* renamed from: a */
        public static final a f35436a = new a();

        a() {
            super(2);
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7587f invoke(InterfaceC7587f interfaceC7587f, InterfaceC7587f.b bVar) {
            return bVar instanceof InterfaceC13056f0 ? interfaceC7587f.mo20646U(((InterfaceC13056f0) bVar).m43161q()) : interfaceC7587f.mo20646U(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zk.g0$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC9323o implements InterfaceC10002p<InterfaceC7587f, InterfaceC7587f.b, InterfaceC7587f> {

        /* renamed from: a */
        final /* synthetic */ C9332x<InterfaceC7587f> f35437a;

        /* renamed from: b */
        final /* synthetic */ boolean f35438b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C9332x<InterfaceC7587f> c9332x, boolean z10) {
            super(2);
            this.f35437a = c9332x;
            this.f35438b = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, gk.f] */
        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7587f invoke(InterfaceC7587f interfaceC7587f, InterfaceC7587f.b bVar) {
            if (!(bVar instanceof InterfaceC13056f0)) {
                return interfaceC7587f.mo20646U(bVar);
            }
            InterfaceC7587f.b mo20647b = this.f35437a.f22581a.mo20647b(bVar.getKey());
            if (mo20647b != null) {
                C9332x<InterfaceC7587f> c9332x = this.f35437a;
                c9332x.f22581a = c9332x.f22581a.mo20645Q(bVar.getKey());
                return interfaceC7587f.mo20646U(((InterfaceC13056f0) bVar).m43160f(mo20647b));
            }
            InterfaceC13056f0 interfaceC13056f0 = (InterfaceC13056f0) bVar;
            if (this.f35438b) {
                interfaceC13056f0 = interfaceC13056f0.m43161q();
            }
            return interfaceC7587f.mo20646U(interfaceC13056f0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zk.g0$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC9323o implements InterfaceC10002p<Boolean, InterfaceC7587f.b, Boolean> {

        /* renamed from: a */
        public static final c f35439a = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m43172a(boolean z10, InterfaceC7587f.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof InterfaceC13056f0));
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, InterfaceC7587f.b bVar) {
            return m43172a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: a */
    private static final InterfaceC7587f m43163a(InterfaceC7587f interfaceC7587f, InterfaceC7587f interfaceC7587f2, boolean z10) {
        boolean m43165c = m43165c(interfaceC7587f);
        boolean m43165c2 = m43165c(interfaceC7587f2);
        if (!m43165c && !m43165c2) {
            return interfaceC7587f.mo20646U(interfaceC7587f2);
        }
        C9332x c9332x = new C9332x();
        c9332x.f22581a = interfaceC7587f2;
        C7588g c7588g = C7588g.f17931a;
        InterfaceC7587f interfaceC7587f3 = (InterfaceC7587f) interfaceC7587f.mo20648z0(c7588g, new b(c9332x, z10));
        if (m43165c2) {
            c9332x.f22581a = ((InterfaceC7587f) c9332x.f22581a).mo20648z0(c7588g, a.f35436a);
        }
        return interfaceC7587f3.mo20646U((InterfaceC7587f) c9332x.f22581a);
    }

    /* renamed from: b */
    public static final String m43164b(InterfaceC7587f interfaceC7587f) {
        return null;
    }

    /* renamed from: c */
    private static final boolean m43165c(InterfaceC7587f interfaceC7587f) {
        return ((Boolean) interfaceC7587f.mo20648z0(Boolean.FALSE, c.f35439a)).booleanValue();
    }

    /* renamed from: d */
    public static final InterfaceC7587f m43166d(InterfaceC7587f interfaceC7587f, InterfaceC7587f interfaceC7587f2) {
        return !m43165c(interfaceC7587f2) ? interfaceC7587f.mo20646U(interfaceC7587f2) : m43163a(interfaceC7587f, interfaceC7587f2, false);
    }

    /* renamed from: e */
    public static final InterfaceC7587f m43167e(InterfaceC13076k0 interfaceC13076k0, InterfaceC7587f interfaceC7587f) {
        InterfaceC7587f m43163a = m43163a(interfaceC13076k0.mo7278h(), interfaceC7587f, true);
        return (m43163a == C13034a1.m43039a() || m43163a.mo20647b(InterfaceC7585d.f17928n) != null) ? m43163a : m43163a.mo20646U(C13034a1.m43039a());
    }

    /* renamed from: f */
    public static final C13138z2<?> m43168f(InterfaceC9299e interfaceC9299e) {
        while (!(interfaceC9299e instanceof C13124w0) && (interfaceC9299e = interfaceC9299e.getCallerFrame()) != null) {
            if (interfaceC9299e instanceof C13138z2) {
                return (C13138z2) interfaceC9299e;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C13138z2<?> m43169g(Continuation<?> continuation, InterfaceC7587f interfaceC7587f, Object obj) {
        if (!(continuation instanceof InterfaceC9299e)) {
            return null;
        }
        if (!(interfaceC7587f.mo20647b(C13036a3.f35393a) != null)) {
            return null;
        }
        C13138z2<?> m43168f = m43168f((InterfaceC9299e) continuation);
        if (m43168f != null) {
            m43168f.m43336S0(interfaceC7587f, obj);
        }
        return m43168f;
    }
}
