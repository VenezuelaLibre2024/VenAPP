package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k2.j;
import k2.o;
import k2.u;
import k2.v;
import k2.z;
import kotlin.jvm.internal.n;
import n2.d;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        n.e(context, "context");
        n.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        String str;
        String str2;
        String d10;
        String str3;
        String str4;
        String d11;
        String str5;
        String str6;
        String d12;
        e0 m10 = e0.m(getApplicationContext());
        n.d(m10, "getInstance(applicationContext)");
        WorkDatabase r10 = m10.r();
        n.d(r10, "workManager.workDatabase");
        v J = r10.J();
        o H = r10.H();
        z K = r10.K();
        j G = r10.G();
        List<u> d13 = J.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<u> r11 = J.r();
        List<u> l10 = J.l(200);
        if (!d13.isEmpty()) {
            f2.j e10 = f2.j.e();
            str5 = d.f21687a;
            e10.f(str5, "Recently completed work:\n\n");
            f2.j e11 = f2.j.e();
            str6 = d.f21687a;
            d12 = d.d(H, K, G, d13);
            e11.f(str6, d12);
        }
        if (!r11.isEmpty()) {
            f2.j e12 = f2.j.e();
            str3 = d.f21687a;
            e12.f(str3, "Running work:\n\n");
            f2.j e13 = f2.j.e();
            str4 = d.f21687a;
            d11 = d.d(H, K, G, r11);
            e13.f(str4, d11);
        }
        if (!l10.isEmpty()) {
            f2.j e14 = f2.j.e();
            str = d.f21687a;
            e14.f(str, "Enqueued work:\n\n");
            f2.j e15 = f2.j.e();
            str2 = d.f21687a;
            d10 = d.d(H, K, G, l10);
            e15.f(str2, d10);
        }
        c.a d14 = c.a.d();
        n.d(d14, "success()");
        return d14;
    }
}
