package p397v7;

import android.os.Handler;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10834m0;
import p361t6.AbstractC11018d4;
import p361t6.C11010c2;
import p376u6.C11391m3;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12332x;

/* renamed from: v7.a0 */
/* loaded from: classes.dex */
public interface InterfaceC11684a0 {

    /* renamed from: v7.a0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        InterfaceC11684a0 mo11846a(C11010c2 c11010c2);

        /* renamed from: b */
        a mo11847b(InterfaceC12332x interfaceC12332x);

        /* renamed from: c */
        a mo11848c(InterfaceC10816d0 interfaceC10816d0);
    }

    /* renamed from: v7.a0$b */
    /* loaded from: classes.dex */
    public static final class b extends C11741z {
        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(C11741z c11741z) {
            super(c11741z);
        }

        /* renamed from: c */
        public b m36820c(Object obj) {
            return new b(super.m37105a(obj));
        }
    }

    /* renamed from: v7.a0$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo34304a(InterfaceC11684a0 interfaceC11684a0, AbstractC11018d4 abstractC11018d4);
    }

    /* renamed from: a */
    void mo36803a(c cVar, InterfaceC10834m0 interfaceC10834m0, C11391m3 c11391m3);

    /* renamed from: b */
    void mo36804b(c cVar);

    /* renamed from: c */
    void mo36805c(c cVar);

    /* renamed from: d */
    C11010c2 mo11842d();

    /* renamed from: e */
    InterfaceC11739y mo11843e(b bVar, InterfaceC10811b interfaceC10811b, long j10);

    /* renamed from: f */
    void mo36806f(c cVar);

    /* renamed from: g */
    void mo36807g(InterfaceC11705h0 interfaceC11705h0);

    /* renamed from: j */
    void mo36808j(Handler handler, InterfaceC11705h0 interfaceC11705h0);

    /* renamed from: l */
    void mo11844l(InterfaceC11739y interfaceC11739y);

    /* renamed from: n */
    void mo11845n();

    /* renamed from: o */
    default boolean mo36818o() {
        return true;
    }

    /* renamed from: p */
    default AbstractC11018d4 mo36819p() {
        return null;
    }

    /* renamed from: q */
    void mo36809q(InterfaceC12329u interfaceC12329u);

    /* renamed from: s */
    void mo36810s(Handler handler, InterfaceC12329u interfaceC12329u);
}
