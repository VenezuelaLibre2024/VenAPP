package p397v7;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11705h0;

/* renamed from: v7.h0 */
/* loaded from: classes.dex */
public interface InterfaceC11705h0 {

    /* renamed from: v7.h0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f30711a;

        /* renamed from: b */
        public final InterfaceC11684a0.b f30712b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C13258a> f30713c;

        /* renamed from: d */
        private final long f30714d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v7.h0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13258a {

            /* renamed from: a */
            public Handler f30715a;

            /* renamed from: b */
            public InterfaceC11705h0 f30716b;

            public C13258a(Handler handler, InterfaceC11705h0 interfaceC11705h0) {
                this.f30715a = handler;
                this.f30716b = interfaceC11705h0;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C13258a> copyOnWriteArrayList, int i10, InterfaceC11684a0.b bVar, long j10) {
            this.f30713c = copyOnWriteArrayList;
            this.f30711a = i10;
            this.f30712b = bVar;
            this.f30714d = j10;
        }

        /* renamed from: h */
        private long m36874h(long j10) {
            long m34910a1 = C11172r0.m34910a1(j10);
            if (m34910a1 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f30714d + m34910a1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m36875k(InterfaceC11705h0 interfaceC11705h0, C11737x c11737x) {
            interfaceC11705h0.mo33704v(this.f30711a, this.f30712b, c11737x);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m36876l(InterfaceC11705h0 interfaceC11705h0, C11731u c11731u, C11737x c11737x) {
            interfaceC11705h0.mo33698D(this.f30711a, this.f30712b, c11731u, c11737x);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m36877m(InterfaceC11705h0 interfaceC11705h0, C11731u c11731u, C11737x c11737x) {
            interfaceC11705h0.mo33706x(this.f30711a, this.f30712b, c11731u, c11737x);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m36878n(InterfaceC11705h0 interfaceC11705h0, C11731u c11731u, C11737x c11737x, IOException iOException, boolean z10) {
            interfaceC11705h0.mo33699F(this.f30711a, this.f30712b, c11731u, c11737x, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m36879o(InterfaceC11705h0 interfaceC11705h0, C11731u c11731u, C11737x c11737x) {
            interfaceC11705h0.mo33700G(this.f30711a, this.f30712b, c11731u, c11737x);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m36880p(InterfaceC11705h0 interfaceC11705h0, InterfaceC11684a0.b bVar, C11737x c11737x) {
            interfaceC11705h0.mo33705w(this.f30711a, bVar, c11737x);
        }

        /* renamed from: A */
        public void m36881A(C11731u c11731u, int i10, int i11, C11108u1 c11108u1, int i12, Object obj, long j10, long j11) {
            m36882B(c11731u, new C11737x(i10, i11, c11108u1, i12, obj, m36874h(j10), m36874h(j11)));
        }

        /* renamed from: B */
        public void m36882B(final C11731u c11731u, final C11737x c11737x) {
            Iterator<C13258a> it = this.f30713c.iterator();
            while (it.hasNext()) {
                C13258a next = it.next();
                final InterfaceC11705h0 interfaceC11705h0 = next.f30716b;
                C11172r0.m34879L0(next.f30715a, new Runnable() { // from class: v7.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11705h0.a.this.m36879o(interfaceC11705h0, c11731u, c11737x);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m36883C(InterfaceC11705h0 interfaceC11705h0) {
            Iterator<C13258a> it = this.f30713c.iterator();
            while (it.hasNext()) {
                C13258a next = it.next();
                if (next.f30716b == interfaceC11705h0) {
                    this.f30713c.remove(next);
                }
            }
        }

        /* renamed from: D */
        public void m36884D(int i10, long j10, long j11) {
            m36885E(new C11737x(1, i10, null, 3, null, m36874h(j10), m36874h(j11)));
        }

        /* renamed from: E */
        public void m36885E(final C11737x c11737x) {
            final InterfaceC11684a0.b bVar = (InterfaceC11684a0.b) C11137a.m34603e(this.f30712b);
            Iterator<C13258a> it = this.f30713c.iterator();
            while (it.hasNext()) {
                C13258a next = it.next();
                final InterfaceC11705h0 interfaceC11705h0 = next.f30716b;
                C11172r0.m34879L0(next.f30715a, new Runnable() { // from class: v7.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11705h0.a.this.m36880p(interfaceC11705h0, bVar, c11737x);
                    }
                });
            }
        }

        /* renamed from: F */
        public a m36886F(int i10, InterfaceC11684a0.b bVar, long j10) {
            return new a(this.f30713c, i10, bVar, j10);
        }

        /* renamed from: g */
        public void m36887g(Handler handler, InterfaceC11705h0 interfaceC11705h0) {
            C11137a.m34603e(handler);
            C11137a.m34603e(interfaceC11705h0);
            this.f30713c.add(new C13258a(handler, interfaceC11705h0));
        }

        /* renamed from: i */
        public void m36888i(int i10, C11108u1 c11108u1, int i11, Object obj, long j10) {
            m36889j(new C11737x(1, i10, c11108u1, i11, obj, m36874h(j10), -9223372036854775807L));
        }

        /* renamed from: j */
        public void m36889j(final C11737x c11737x) {
            Iterator<C13258a> it = this.f30713c.iterator();
            while (it.hasNext()) {
                C13258a next = it.next();
                final InterfaceC11705h0 interfaceC11705h0 = next.f30716b;
                C11172r0.m34879L0(next.f30715a, new Runnable() { // from class: v7.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11705h0.a.this.m36875k(interfaceC11705h0, c11737x);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m36890q(C11731u c11731u, int i10) {
            m36891r(c11731u, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: r */
        public void m36891r(C11731u c11731u, int i10, int i11, C11108u1 c11108u1, int i12, Object obj, long j10, long j11) {
            m36892s(c11731u, new C11737x(i10, i11, c11108u1, i12, obj, m36874h(j10), m36874h(j11)));
        }

        /* renamed from: s */
        public void m36892s(final C11731u c11731u, final C11737x c11737x) {
            Iterator<C13258a> it = this.f30713c.iterator();
            while (it.hasNext()) {
                C13258a next = it.next();
                final InterfaceC11705h0 interfaceC11705h0 = next.f30716b;
                C11172r0.m34879L0(next.f30715a, new Runnable() { // from class: v7.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11705h0.a.this.m36876l(interfaceC11705h0, c11731u, c11737x);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m36893t(C11731u c11731u, int i10) {
            m36894u(c11731u, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: u */
        public void m36894u(C11731u c11731u, int i10, int i11, C11108u1 c11108u1, int i12, Object obj, long j10, long j11) {
            m36895v(c11731u, new C11737x(i10, i11, c11108u1, i12, obj, m36874h(j10), m36874h(j11)));
        }

        /* renamed from: v */
        public void m36895v(final C11731u c11731u, final C11737x c11737x) {
            Iterator<C13258a> it = this.f30713c.iterator();
            while (it.hasNext()) {
                C13258a next = it.next();
                final InterfaceC11705h0 interfaceC11705h0 = next.f30716b;
                C11172r0.m34879L0(next.f30715a, new Runnable() { // from class: v7.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11705h0.a.this.m36877m(interfaceC11705h0, c11731u, c11737x);
                    }
                });
            }
        }

        /* renamed from: w */
        public void m36896w(C11731u c11731u, int i10, int i11, C11108u1 c11108u1, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            m36898y(c11731u, new C11737x(i10, i11, c11108u1, i12, obj, m36874h(j10), m36874h(j11)), iOException, z10);
        }

        /* renamed from: x */
        public void m36897x(C11731u c11731u, int i10, IOException iOException, boolean z10) {
            m36896w(c11731u, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        /* renamed from: y */
        public void m36898y(final C11731u c11731u, final C11737x c11737x, final IOException iOException, final boolean z10) {
            Iterator<C13258a> it = this.f30713c.iterator();
            while (it.hasNext()) {
                C13258a next = it.next();
                final InterfaceC11705h0 interfaceC11705h0 = next.f30716b;
                C11172r0.m34879L0(next.f30715a, new Runnable() { // from class: v7.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11705h0.a.this.m36878n(interfaceC11705h0, c11731u, c11737x, iOException, z10);
                    }
                });
            }
        }

        /* renamed from: z */
        public void m36899z(C11731u c11731u, int i10) {
            m36881A(c11731u, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    /* renamed from: D */
    default void mo33698D(int i10, InterfaceC11684a0.b bVar, C11731u c11731u, C11737x c11737x) {
    }

    /* renamed from: F */
    default void mo33699F(int i10, InterfaceC11684a0.b bVar, C11731u c11731u, C11737x c11737x, IOException iOException, boolean z10) {
    }

    /* renamed from: G */
    default void mo33700G(int i10, InterfaceC11684a0.b bVar, C11731u c11731u, C11737x c11737x) {
    }

    /* renamed from: v */
    default void mo33704v(int i10, InterfaceC11684a0.b bVar, C11737x c11737x) {
    }

    /* renamed from: w */
    default void mo33705w(int i10, InterfaceC11684a0.b bVar, C11737x c11737x) {
    }

    /* renamed from: x */
    default void mo33706x(int i10, InterfaceC11684a0.b bVar, C11731u c11731u, C11737x c11737x) {
    }
}
