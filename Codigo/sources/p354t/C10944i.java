package p354t;

import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0668t1;
import java.util.Iterator;
import java.util.List;
import p342s.C10731b0;
import p342s.C10741g0;
import p342s.C10746j;
import p407w.C12029o0;

/* renamed from: t.i */
/* loaded from: classes.dex */
public class C10944i {

    /* renamed from: a */
    private final boolean f27840a;

    /* renamed from: b */
    private final boolean f27841b;

    /* renamed from: c */
    private final boolean f27842c;

    public C10944i(C0668t1 c0668t1, C0668t1 c0668t12) {
        this.f27840a = c0668t12.m3237a(C10741g0.class);
        this.f27841b = c0668t1.m3237a(C10731b0.class);
        this.f27842c = c0668t1.m3237a(C10746j.class);
    }

    /* renamed from: a */
    public void m33420a(List<AbstractC0661r0> list) {
        if (!m33421b() || list == null) {
            return;
        }
        Iterator<AbstractC0661r0> it = list.iterator();
        while (it.hasNext()) {
            it.next().m3223d();
        }
        C12029o0.m38638a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    /* renamed from: b */
    public boolean m33421b() {
        return this.f27840a || this.f27841b || this.f27842c;
    }
}
