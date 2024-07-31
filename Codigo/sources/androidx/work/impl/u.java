package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a */
    private static final String f5909a = f2.j.i("Schedulers");

    public static t a(Context context, e0 e0Var) {
        androidx.work.impl.background.systemjob.g gVar = new androidx.work.impl.background.systemjob.g(context, e0Var);
        l2.q.a(context, SystemJobService.class, true);
        f2.j.e().a(f5909a, "Created SystemJobScheduler and enabled SystemJobService");
        return gVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<t> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        k2.v J = workDatabase.J();
        workDatabase.e();
        try {
            List<k2.u> p10 = J.p(aVar.h());
            List<k2.u> l10 = J.l(200);
            if (p10 != null && p10.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<k2.u> it = p10.iterator();
                while (it.hasNext()) {
                    J.n(it.next().f20223a, currentTimeMillis);
                }
            }
            workDatabase.B();
            if (p10 != null && p10.size() > 0) {
                k2.u[] uVarArr = (k2.u[]) p10.toArray(new k2.u[p10.size()]);
                for (t tVar : list) {
                    if (tVar.e()) {
                        tVar.a(uVarArr);
                    }
                }
            }
            if (l10 == null || l10.size() <= 0) {
                return;
            }
            k2.u[] uVarArr2 = (k2.u[]) l10.toArray(new k2.u[l10.size()]);
            for (t tVar2 : list) {
                if (!tVar2.e()) {
                    tVar2.a(uVarArr2);
                }
            }
        } finally {
            workDatabase.i();
        }
    }
}
