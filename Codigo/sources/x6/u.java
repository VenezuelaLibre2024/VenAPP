package x6;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t8.r0;
import v7.a0;
import x6.u;

/* loaded from: classes.dex */
public interface u {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f30566a;

        /* renamed from: b */
        public final a0.b f30567b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0500a> f30568c;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x6.u$a$a */
        /* loaded from: classes.dex */
        public static final class C0500a {

            /* renamed from: a */
            public Handler f30569a;

            /* renamed from: b */
            public u f30570b;

            public C0500a(Handler handler, u uVar) {
                this.f30569a = handler;
                this.f30570b = uVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0500a> copyOnWriteArrayList, int i10, a0.b bVar) {
            this.f30568c = copyOnWriteArrayList;
            this.f30566a = i10;
            this.f30567b = bVar;
        }

        public /* synthetic */ void n(u uVar) {
            uVar.u(this.f30566a, this.f30567b);
        }

        public /* synthetic */ void o(u uVar) {
            uVar.B(this.f30566a, this.f30567b);
        }

        public /* synthetic */ void p(u uVar) {
            uVar.C(this.f30566a, this.f30567b);
        }

        public /* synthetic */ void q(u uVar, int i10) {
            uVar.A(this.f30566a, this.f30567b);
            uVar.J(this.f30566a, this.f30567b, i10);
        }

        public /* synthetic */ void r(u uVar, Exception exc) {
            uVar.I(this.f30566a, this.f30567b, exc);
        }

        public /* synthetic */ void s(u uVar) {
            uVar.y(this.f30566a, this.f30567b);
        }

        public void g(Handler handler, u uVar) {
            t8.a.e(handler);
            t8.a.e(uVar);
            this.f30568c.add(new C0500a(handler, uVar));
        }

        public void h() {
            Iterator<C0500a> it = this.f30568c.iterator();
            while (it.hasNext()) {
                C0500a next = it.next();
                r0.L0(next.f30569a, new Runnable() { // from class: x6.s

                    /* renamed from: b */
                    public final /* synthetic */ u f30563b;

                    public /* synthetic */ s(u uVar) {
                        r2 = uVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.n(r2);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0500a> it = this.f30568c.iterator();
            while (it.hasNext()) {
                C0500a next = it.next();
                r0.L0(next.f30569a, new Runnable() { // from class: x6.r

                    /* renamed from: b */
                    public final /* synthetic */ u f30561b;

                    public /* synthetic */ r(u uVar) {
                        r2 = uVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.o(r2);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0500a> it = this.f30568c.iterator();
            while (it.hasNext()) {
                C0500a next = it.next();
                r0.L0(next.f30569a, new Runnable() { // from class: x6.t

                    /* renamed from: b */
                    public final /* synthetic */ u f30565b;

                    public /* synthetic */ t(u uVar) {
                        r2 = uVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.p(r2);
                    }
                });
            }
        }

        public void k(int i10) {
            Iterator<C0500a> it = this.f30568c.iterator();
            while (it.hasNext()) {
                C0500a next = it.next();
                r0.L0(next.f30569a, new Runnable() { // from class: x6.q

                    /* renamed from: b */
                    public final /* synthetic */ u f30558b;

                    /* renamed from: c */
                    public final /* synthetic */ int f30559c;

                    public /* synthetic */ q(u uVar, int i102) {
                        r2 = uVar;
                        r3 = i102;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.q(r2, r3);
                    }
                });
            }
        }

        public void l(Exception exc) {
            Iterator<C0500a> it = this.f30568c.iterator();
            while (it.hasNext()) {
                C0500a next = it.next();
                r0.L0(next.f30569a, new Runnable() { // from class: x6.p

                    /* renamed from: b */
                    public final /* synthetic */ u f30555b;

                    /* renamed from: c */
                    public final /* synthetic */ Exception f30556c;

                    public /* synthetic */ p(u uVar, Exception exc2) {
                        r2 = uVar;
                        r3 = exc2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.r(r2, r3);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0500a> it = this.f30568c.iterator();
            while (it.hasNext()) {
                C0500a next = it.next();
                r0.L0(next.f30569a, new Runnable() { // from class: x6.o

                    /* renamed from: b */
                    public final /* synthetic */ u f30553b;

                    public /* synthetic */ o(u uVar) {
                        r2 = uVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.s(r2);
                    }
                });
            }
        }

        public void t(u uVar) {
            Iterator<C0500a> it = this.f30568c.iterator();
            while (it.hasNext()) {
                C0500a next = it.next();
                if (next.f30570b == uVar) {
                    this.f30568c.remove(next);
                }
            }
        }

        public a u(int i10, a0.b bVar) {
            return new a(this.f30568c, i10, bVar);
        }
    }

    @Deprecated
    default void A(int i10, a0.b bVar) {
    }

    default void B(int i10, a0.b bVar) {
    }

    default void C(int i10, a0.b bVar) {
    }

    default void I(int i10, a0.b bVar, Exception exc) {
    }

    default void J(int i10, a0.b bVar, int i11) {
    }

    default void u(int i10, a0.b bVar) {
    }

    default void y(int i10, a0.b bVar) {
    }
}
