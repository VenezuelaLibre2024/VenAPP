package p211l2;

import androidx.work.impl.C1553e0;
import androidx.work.impl.C1584v;
import p094f2.AbstractC7277j;

/* renamed from: l2.w */
/* loaded from: classes.dex */
public class RunnableC9371w implements Runnable {

    /* renamed from: d */
    private static final String f22698d = AbstractC7277j.m21769i("StopWorkRunnable");

    /* renamed from: a */
    private final C1553e0 f22699a;

    /* renamed from: b */
    private final C1584v f22700b;

    /* renamed from: c */
    private final boolean f22701c;

    public RunnableC9371w(C1553e0 c1553e0, C1584v c1584v, boolean z10) {
        this.f22699a = c1553e0;
        this.f22700b = c1584v;
        this.f22701c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m8762t = this.f22701c ? this.f22699a.m8689o().m8762t(this.f22700b) : this.f22699a.m8689o().m8763u(this.f22700b);
        AbstractC7277j.m21767e().mo21770a(f22698d, "StopWorkRunnable for " + this.f22700b.m8802a().m26876b() + "; Processor.stopWork = " + m8762t);
    }
}
