package l2;

import androidx.work.impl.WorkDatabase;
import f2.m;
import f2.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: a */
    private final androidx.work.impl.o f20816a = new androidx.work.impl.o();

    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: b */
        final /* synthetic */ androidx.work.impl.e0 f20817b;

        /* renamed from: c */
        final /* synthetic */ UUID f20818c;

        a(androidx.work.impl.e0 e0Var, UUID uuid) {
            this.f20817b = e0Var;
            this.f20818c = uuid;
        }

        @Override // l2.c
        void h() {
            WorkDatabase r10 = this.f20817b.r();
            r10.e();
            try {
                a(this.f20817b, this.f20818c.toString());
                r10.B();
                r10.i();
                g(this.f20817b);
            } catch (Throwable th2) {
                r10.i();
                throw th2;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends c {

        /* renamed from: b */
        final /* synthetic */ androidx.work.impl.e0 f20819b;

        /* renamed from: c */
        final /* synthetic */ String f20820c;

        b(androidx.work.impl.e0 e0Var, String str) {
            this.f20819b = e0Var;
            this.f20820c = str;
        }

        @Override // l2.c
        void h() {
            WorkDatabase r10 = this.f20819b.r();
            r10.e();
            try {
                Iterator<String> it = r10.J().j(this.f20820c).iterator();
                while (it.hasNext()) {
                    a(this.f20819b, it.next());
                }
                r10.B();
                r10.i();
                g(this.f20819b);
            } catch (Throwable th2) {
                r10.i();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l2.c$c */
    /* loaded from: classes.dex */
    public class C0325c extends c {

        /* renamed from: b */
        final /* synthetic */ androidx.work.impl.e0 f20821b;

        /* renamed from: c */
        final /* synthetic */ String f20822c;

        /* renamed from: d */
        final /* synthetic */ boolean f20823d;

        C0325c(androidx.work.impl.e0 e0Var, String str, boolean z10) {
            this.f20821b = e0Var;
            this.f20822c = str;
            this.f20823d = z10;
        }

        @Override // l2.c
        void h() {
            WorkDatabase r10 = this.f20821b.r();
            r10.e();
            try {
                Iterator<String> it = r10.J().f(this.f20822c).iterator();
                while (it.hasNext()) {
                    a(this.f20821b, it.next());
                }
                r10.B();
                r10.i();
                if (this.f20823d) {
                    g(this.f20821b);
                }
            } catch (Throwable th2) {
                r10.i();
                throw th2;
            }
        }
    }

    public static c b(UUID uuid, androidx.work.impl.e0 e0Var) {
        return new a(e0Var, uuid);
    }

    public static c c(String str, androidx.work.impl.e0 e0Var, boolean z10) {
        return new C0325c(e0Var, str, z10);
    }

    public static c d(String str, androidx.work.impl.e0 e0Var) {
        return new b(e0Var, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        k2.v J = workDatabase.J();
        k2.b E = workDatabase.E();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s.a g10 = J.g(str2);
            if (g10 != s.a.SUCCEEDED && g10 != s.a.FAILED) {
                J.w(s.a.CANCELLED, str2);
            }
            linkedList.addAll(E.a(str2));
        }
    }

    void a(androidx.work.impl.e0 e0Var, String str) {
        f(e0Var.r(), str);
        e0Var.o().r(str);
        Iterator<androidx.work.impl.t> it = e0Var.p().iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    public f2.m e() {
        return this.f20816a;
    }

    void g(androidx.work.impl.e0 e0Var) {
        androidx.work.impl.u.b(e0Var.k(), e0Var.r(), e0Var.p());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f20816a.a(f2.m.f14891a);
        } catch (Throwable th2) {
            this.f20816a.a(new m.b.a(th2));
        }
    }
}
