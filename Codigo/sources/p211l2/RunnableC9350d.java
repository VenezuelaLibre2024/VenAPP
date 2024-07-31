package p211l2;

import android.text.TextUtils;
import androidx.work.impl.C1553e0;
import androidx.work.impl.C1574o;
import androidx.work.impl.C1580u;
import androidx.work.impl.C1586x;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.List;
import p094f2.AbstractC7277j;
import p094f2.InterfaceC7280m;

/* renamed from: l2.d */
/* loaded from: classes.dex */
public class RunnableC9350d implements Runnable {

    /* renamed from: c */
    private static final String f22655c = AbstractC7277j.m21769i("EnqueueRunnable");

    /* renamed from: a */
    private final C1586x f22656a;

    /* renamed from: b */
    private final C1574o f22657b;

    public RunnableC9350d(C1586x c1586x) {
        this(c1586x, new C1574o());
    }

    public RunnableC9350d(C1586x c1586x, C1574o c1574o) {
        this.f22656a = c1586x;
        this.f22657b = c1574o;
    }

    /* renamed from: b */
    private static boolean m27848b(C1586x c1586x) {
        boolean m27849c = m27849c(c1586x.m8821g(), c1586x.m8820f(), (String[]) C1586x.m8814l(c1586x).toArray(new String[0]), c1586x.m8818d(), c1586x.m8816b());
        c1586x.m8824k();
        return m27849c;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m27849c(androidx.work.impl.C1553e0 r18, java.util.List<? extends p094f2.AbstractC7288u> r19, java.lang.String[] r20, java.lang.String r21, p094f2.EnumC7271d r22) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p211l2.RunnableC9350d.m27849c(androidx.work.impl.e0, java.util.List, java.lang.String[], java.lang.String, f2.d):boolean");
    }

    /* renamed from: e */
    private static boolean m27850e(C1586x c1586x) {
        List<C1586x> m8819e = c1586x.m8819e();
        boolean z10 = false;
        if (m8819e != null) {
            for (C1586x c1586x2 : m8819e) {
                if (c1586x2.m8823j()) {
                    AbstractC7277j.m21767e().mo21777k(f22655c, "Already enqueued work ids (" + TextUtils.join(", ", c1586x2.m8817c()) + ")");
                } else {
                    z10 |= m27850e(c1586x2);
                }
            }
        }
        return m27848b(c1586x) | z10;
    }

    /* renamed from: a */
    public boolean m27851a() {
        WorkDatabase m8692r = this.f22656a.m8821g().m8692r();
        m8692r.m32253e();
        try {
            boolean m27850e = m27850e(this.f22656a);
            m8692r.m32250B();
            return m27850e;
        } finally {
            m8692r.m32255i();
        }
    }

    /* renamed from: d */
    public InterfaceC7280m m27852d() {
        return this.f22657b;
    }

    /* renamed from: f */
    public void m27853f() {
        C1553e0 m8821g = this.f22656a.m8821g();
        C1580u.m8765b(m8821g.m8687k(), m8821g.m8692r(), m8821g.m8690p());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f22656a.m8822h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f22656a + ")");
            }
            if (m27851a()) {
                C9365q.m27878a(this.f22656a.m8821g().m8686j(), RescheduleReceiver.class, true);
                m27853f();
            }
            this.f22657b.m8746a(InterfaceC7280m.f16314a);
        } catch (Throwable th2) {
            this.f22657b.m8746a(new InterfaceC7280m.b.a(th2));
        }
    }
}
