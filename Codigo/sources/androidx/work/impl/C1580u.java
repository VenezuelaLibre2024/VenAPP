package androidx.work.impl;

import android.content.Context;
import androidx.work.C1521a;
import androidx.work.impl.background.systemjob.C1546g;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import p094f2.AbstractC7277j;
import p192k2.C9132u;
import p192k2.InterfaceC9133v;
import p211l2.C9365q;

/* renamed from: androidx.work.impl.u */
/* loaded from: classes.dex */
public class C1580u {

    /* renamed from: a */
    private static final String f6764a = AbstractC7277j.m21769i("Schedulers");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC1579t m8764a(Context context, C1553e0 c1553e0) {
        C1546g c1546g = new C1546g(context, c1553e0);
        C9365q.m27878a(context, SystemJobService.class, true);
        AbstractC7277j.m21767e().mo21770a(f6764a, "Created SystemJobScheduler and enabled SystemJobService");
        return c1546g;
    }

    /* renamed from: b */
    public static void m8765b(C1521a c1521a, WorkDatabase workDatabase, List<InterfaceC1579t> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC9133v mo8560J = workDatabase.mo8560J();
        workDatabase.m32253e();
        try {
            List<C9132u> mo26917p = mo8560J.mo26917p(c1521a.m8513h());
            List<C9132u> mo26913l = mo8560J.mo26913l(200);
            if (mo26917p != null && mo26917p.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<C9132u> it = mo26917p.iterator();
                while (it.hasNext()) {
                    mo8560J.mo26915n(it.next().f22005a, currentTimeMillis);
                }
            }
            workDatabase.m32250B();
            if (mo26917p != null && mo26917p.size() > 0) {
                C9132u[] c9132uArr = (C9132u[]) mo26917p.toArray(new C9132u[mo26917p.size()]);
                for (InterfaceC1579t interfaceC1579t : list) {
                    if (interfaceC1579t.mo8666e()) {
                        interfaceC1579t.mo8664a(c9132uArr);
                    }
                }
            }
            if (mo26913l == null || mo26913l.size() <= 0) {
                return;
            }
            C9132u[] c9132uArr2 = (C9132u[]) mo26913l.toArray(new C9132u[mo26913l.size()]);
            for (InterfaceC1579t interfaceC1579t2 : list) {
                if (!interfaceC1579t2.mo8666e()) {
                    interfaceC1579t2.mo8664a(c9132uArr2);
                }
            }
        } finally {
            workDatabase.m32255i();
        }
    }
}
