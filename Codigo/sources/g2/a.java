package g2;

import f2.j;
import f2.q;
import java.util.HashMap;
import java.util.Map;
import k2.u;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d */
    static final String f15701d = j.i("DelayedWorkTracker");

    /* renamed from: a */
    final b f15702a;

    /* renamed from: b */
    private final q f15703b;

    /* renamed from: c */
    private final Map<String, Runnable> f15704c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0255a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ u f15705a;

        RunnableC0255a(u uVar) {
            this.f15705a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.e().a(a.f15701d, "Scheduling work " + this.f15705a.f20223a);
            a.this.f15702a.a(this.f15705a);
        }
    }

    public a(b bVar, q qVar) {
        this.f15702a = bVar;
        this.f15703b = qVar;
    }

    public void a(u uVar) {
        Runnable remove = this.f15704c.remove(uVar.f20223a);
        if (remove != null) {
            this.f15703b.a(remove);
        }
        RunnableC0255a runnableC0255a = new RunnableC0255a(uVar);
        this.f15704c.put(uVar.f20223a, runnableC0255a);
        this.f15703b.b(uVar.c() - System.currentTimeMillis(), runnableC0255a);
    }

    public void b(String str) {
        Runnable remove = this.f15704c.remove(str);
        if (remove != null) {
            this.f15703b.a(remove);
        }
    }
}
