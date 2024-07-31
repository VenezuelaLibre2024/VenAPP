package p089el;

import ck.C2017b;
import ck.C2037v;
import kotlin.jvm.internal.AbstractC9323o;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC9998l;
import p494zk.C13072j0;

/* renamed from: el.z */
/* loaded from: classes3.dex */
public final class C7250z {

    /* renamed from: el.z$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9998l<E, C2037v> f16249a;

        /* renamed from: b */
        final /* synthetic */ E f16250b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC7587f f16251c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC9998l<? super E, C2037v> interfaceC9998l, E e10, InterfaceC7587f interfaceC7587f) {
            super(1);
            this.f16249a = interfaceC9998l;
            this.f16250b = e10;
            this.f16251c = interfaceC7587f;
        }

        /* renamed from: a */
        public final void m21691a(Throwable th2) {
            C7250z.m21688b(this.f16249a, this.f16250b, this.f16251c);
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
            m21691a(th2);
            return C2037v.f8089a;
        }
    }

    /* renamed from: a */
    public static final <E> InterfaceC9998l<Throwable, C2037v> m21687a(InterfaceC9998l<? super E, C2037v> interfaceC9998l, E e10, InterfaceC7587f interfaceC7587f) {
        return new a(interfaceC9998l, e10, interfaceC7587f);
    }

    /* renamed from: b */
    public static final <E> void m21688b(InterfaceC9998l<? super E, C2037v> interfaceC9998l, E e10, InterfaceC7587f interfaceC7587f) {
        C7241q0 m21689c = m21689c(interfaceC9998l, e10, null);
        if (m21689c != null) {
            C13072j0.m43220a(interfaceC7587f, m21689c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <E> C7241q0 m21689c(InterfaceC9998l<? super E, C2037v> interfaceC9998l, E e10, C7241q0 c7241q0) {
        try {
            interfaceC9998l.invoke(e10);
        } catch (Throwable th2) {
            if (c7241q0 == null || c7241q0.getCause() == th2) {
                return new C7241q0("Exception in undelivered element handler for " + e10, th2);
            }
            C2017b.m10328a(c7241q0, th2);
        }
        return c7241q0;
    }

    /* renamed from: d */
    public static /* synthetic */ C7241q0 m21690d(InterfaceC9998l interfaceC9998l, Object obj, C7241q0 c7241q0, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            c7241q0 = null;
        }
        return m21689c(interfaceC9998l, obj, c7241q0);
    }
}
