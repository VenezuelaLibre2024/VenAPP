package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.v;
import f2.j;
import j2.n;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k2.m;
import k2.u;
import k2.x;
import l2.e0;
import l2.y;

/* loaded from: classes.dex */
public class f implements h2.c, e0.a {

    /* renamed from: x */
    private static final String f5756x = j.i("DelayMetCommandHandler");

    /* renamed from: a */
    private final Context f5757a;

    /* renamed from: b */
    private final int f5758b;

    /* renamed from: c */
    private final m f5759c;

    /* renamed from: d */
    private final g f5760d;

    /* renamed from: e */
    private final h2.e f5761e;

    /* renamed from: f */
    private final Object f5762f;

    /* renamed from: r */
    private int f5763r;

    /* renamed from: s */
    private final Executor f5764s;

    /* renamed from: t */
    private final Executor f5765t;

    /* renamed from: u */
    private PowerManager.WakeLock f5766u;

    /* renamed from: v */
    private boolean f5767v;

    /* renamed from: w */
    private final v f5768w;

    public f(Context context, int i10, g gVar, v vVar) {
        this.f5757a = context;
        this.f5758b = i10;
        this.f5760d = gVar;
        this.f5759c = vVar.a();
        this.f5768w = vVar;
        n q10 = gVar.g().q();
        this.f5764s = gVar.f().b();
        this.f5765t = gVar.f().a();
        this.f5761e = new h2.e(q10, this);
        this.f5767v = false;
        this.f5763r = 0;
        this.f5762f = new Object();
    }

    private void e() {
        synchronized (this.f5762f) {
            this.f5761e.reset();
            this.f5760d.h().b(this.f5759c);
            PowerManager.WakeLock wakeLock = this.f5766u;
            if (wakeLock != null && wakeLock.isHeld()) {
                j.e().a(f5756x, "Releasing wakelock " + this.f5766u + "for WorkSpec " + this.f5759c);
                this.f5766u.release();
            }
        }
    }

    public void i() {
        if (this.f5763r != 0) {
            j.e().a(f5756x, "Already started work for " + this.f5759c);
            return;
        }
        this.f5763r = 1;
        j.e().a(f5756x, "onAllConstraintsMet for " + this.f5759c);
        if (this.f5760d.e().p(this.f5768w)) {
            this.f5760d.h().a(this.f5759c, 600000L, this);
        } else {
            e();
        }
    }

    public void j() {
        j e10;
        String str;
        StringBuilder sb2;
        String b10 = this.f5759c.b();
        if (this.f5763r < 2) {
            this.f5763r = 2;
            j e11 = j.e();
            str = f5756x;
            e11.a(str, "Stopping work for WorkSpec " + b10);
            this.f5765t.execute(new g.b(this.f5760d, b.f(this.f5757a, this.f5759c), this.f5758b));
            if (this.f5760d.e().k(this.f5759c.b())) {
                j.e().a(str, "WorkSpec " + b10 + " needs to be rescheduled");
                this.f5765t.execute(new g.b(this.f5760d, b.e(this.f5757a, this.f5759c), this.f5758b));
                return;
            }
            e10 = j.e();
            sb2 = new StringBuilder();
            sb2.append("Processor does not have WorkSpec ");
            sb2.append(b10);
            b10 = ". No need to reschedule";
        } else {
            e10 = j.e();
            str = f5756x;
            sb2 = new StringBuilder();
            sb2.append("Already stopped work for ");
        }
        sb2.append(b10);
        e10.a(str, sb2.toString());
    }

    @Override // l2.e0.a
    public void a(m mVar) {
        j.e().a(f5756x, "Exceeded time limits on execution for " + mVar);
        this.f5764s.execute(new d(this));
    }

    @Override // h2.c
    public void b(List<u> list) {
        this.f5764s.execute(new d(this));
    }

    @Override // h2.c
    public void f(List<u> list) {
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            if (x.a(it.next()).equals(this.f5759c)) {
                this.f5764s.execute(new Runnable() { // from class: androidx.work.impl.background.systemalarm.e
                    public /* synthetic */ e() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        f.this.i();
                    }
                });
                return;
            }
        }
    }

    public void g() {
        String b10 = this.f5759c.b();
        this.f5766u = y.b(this.f5757a, b10 + " (" + this.f5758b + ")");
        j e10 = j.e();
        String str = f5756x;
        e10.a(str, "Acquiring wakelock " + this.f5766u + "for WorkSpec " + b10);
        this.f5766u.acquire();
        u h10 = this.f5760d.g().r().J().h(b10);
        if (h10 == null) {
            this.f5764s.execute(new d(this));
            return;
        }
        boolean h11 = h10.h();
        this.f5767v = h11;
        if (h11) {
            this.f5761e.a(Collections.singletonList(h10));
            return;
        }
        j.e().a(str, "No constraints for " + b10);
        f(Collections.singletonList(h10));
    }

    public void h(boolean z10) {
        j.e().a(f5756x, "onExecuted " + this.f5759c + ", " + z10);
        e();
        if (z10) {
            this.f5765t.execute(new g.b(this.f5760d, b.e(this.f5757a, this.f5759c), this.f5758b));
        }
        if (this.f5767v) {
            this.f5765t.execute(new g.b(this.f5760d, b.a(this.f5757a), this.f5758b));
        }
    }
}
