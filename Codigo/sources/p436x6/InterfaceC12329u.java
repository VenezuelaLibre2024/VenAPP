package p436x6;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.InterfaceC11684a0;
import p436x6.InterfaceC12329u;

/* renamed from: x6.u */
/* loaded from: classes.dex */
public interface InterfaceC12329u {

    /* renamed from: x6.u$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f33078a;

        /* renamed from: b */
        public final InterfaceC11684a0.b f33079b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C13270a> f33080c;

        /* renamed from: x6.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static final class C13270a {

            /* renamed from: a */
            public Handler f33081a;

            /* renamed from: b */
            public InterfaceC12329u f33082b;

            public C13270a(Handler handler, InterfaceC12329u interfaceC12329u) {
                this.f33081a = handler;
                this.f33082b = interfaceC12329u;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C13270a> copyOnWriteArrayList, int i10, InterfaceC11684a0.b bVar) {
            this.f33080c = copyOnWriteArrayList;
            this.f33078a = i10;
            this.f33079b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m39860n(InterfaceC12329u interfaceC12329u) {
            interfaceC12329u.mo33703u(this.f33078a, this.f33079b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m39861o(InterfaceC12329u interfaceC12329u) {
            interfaceC12329u.mo33696B(this.f33078a, this.f33079b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m39862p(InterfaceC12329u interfaceC12329u) {
            interfaceC12329u.mo33697C(this.f33078a, this.f33079b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m39863q(InterfaceC12329u interfaceC12329u, int i10) {
            interfaceC12329u.m39853A(this.f33078a, this.f33079b);
            interfaceC12329u.mo33702J(this.f33078a, this.f33079b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m39864r(InterfaceC12329u interfaceC12329u, Exception exc) {
            interfaceC12329u.mo33701I(this.f33078a, this.f33079b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m39865s(InterfaceC12329u interfaceC12329u) {
            interfaceC12329u.mo33707y(this.f33078a, this.f33079b);
        }

        /* renamed from: g */
        public void m39866g(Handler handler, InterfaceC12329u interfaceC12329u) {
            C11137a.m34603e(handler);
            C11137a.m34603e(interfaceC12329u);
            this.f33080c.add(new C13270a(handler, interfaceC12329u));
        }

        /* renamed from: h */
        public void m39867h() {
            Iterator<C13270a> it = this.f33080c.iterator();
            while (it.hasNext()) {
                C13270a next = it.next();
                final InterfaceC12329u interfaceC12329u = next.f33082b;
                C11172r0.m34879L0(next.f33081a, new Runnable() { // from class: x6.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC12329u.a.this.m39860n(interfaceC12329u);
                    }
                });
            }
        }

        /* renamed from: i */
        public void m39868i() {
            Iterator<C13270a> it = this.f33080c.iterator();
            while (it.hasNext()) {
                C13270a next = it.next();
                final InterfaceC12329u interfaceC12329u = next.f33082b;
                C11172r0.m34879L0(next.f33081a, new Runnable() { // from class: x6.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC12329u.a.this.m39861o(interfaceC12329u);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m39869j() {
            Iterator<C13270a> it = this.f33080c.iterator();
            while (it.hasNext()) {
                C13270a next = it.next();
                final InterfaceC12329u interfaceC12329u = next.f33082b;
                C11172r0.m34879L0(next.f33081a, new Runnable() { // from class: x6.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC12329u.a.this.m39862p(interfaceC12329u);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m39870k(final int i10) {
            Iterator<C13270a> it = this.f33080c.iterator();
            while (it.hasNext()) {
                C13270a next = it.next();
                final InterfaceC12329u interfaceC12329u = next.f33082b;
                C11172r0.m34879L0(next.f33081a, new Runnable() { // from class: x6.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC12329u.a.this.m39863q(interfaceC12329u, i10);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m39871l(final Exception exc) {
            Iterator<C13270a> it = this.f33080c.iterator();
            while (it.hasNext()) {
                C13270a next = it.next();
                final InterfaceC12329u interfaceC12329u = next.f33082b;
                C11172r0.m34879L0(next.f33081a, new Runnable() { // from class: x6.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC12329u.a.this.m39864r(interfaceC12329u, exc);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m39872m() {
            Iterator<C13270a> it = this.f33080c.iterator();
            while (it.hasNext()) {
                C13270a next = it.next();
                final InterfaceC12329u interfaceC12329u = next.f33082b;
                C11172r0.m34879L0(next.f33081a, new Runnable() { // from class: x6.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC12329u.a.this.m39865s(interfaceC12329u);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m39873t(InterfaceC12329u interfaceC12329u) {
            Iterator<C13270a> it = this.f33080c.iterator();
            while (it.hasNext()) {
                C13270a next = it.next();
                if (next.f33082b == interfaceC12329u) {
                    this.f33080c.remove(next);
                }
            }
        }

        /* renamed from: u */
        public a m39874u(int i10, InterfaceC11684a0.b bVar) {
            return new a(this.f33080c, i10, bVar);
        }
    }

    @Deprecated
    /* renamed from: A */
    default void m39853A(int i10, InterfaceC11684a0.b bVar) {
    }

    /* renamed from: B */
    default void mo33696B(int i10, InterfaceC11684a0.b bVar) {
    }

    /* renamed from: C */
    default void mo33697C(int i10, InterfaceC11684a0.b bVar) {
    }

    /* renamed from: I */
    default void mo33701I(int i10, InterfaceC11684a0.b bVar, Exception exc) {
    }

    /* renamed from: J */
    default void mo33702J(int i10, InterfaceC11684a0.b bVar, int i11) {
    }

    /* renamed from: u */
    default void mo33703u(int i10, InterfaceC11684a0.b bVar) {
    }

    /* renamed from: y */
    default void mo33707y(int i10, InterfaceC11684a0.b bVar) {
    }
}
