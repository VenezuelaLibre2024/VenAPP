package sc;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import dk.C7031r;
import dk.C7033s;
import dk.C7042z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p442xc.AbstractC12426f0;

/* renamed from: sc.i */
/* loaded from: classes.dex */
public final class C10891i {

    /* renamed from: a */
    public static final C10891i f27594a = new C10891i();

    private C10891i() {
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC12426f0.e.d.a.c m33227c(C10891i c10891i, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return c10891i.m33230b(str, i10, i11, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String m33228f() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = android.os.Process.myProcessName()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            goto L1d
        L10:
            r1 = 28
            java.lang.String r2 = ""
            if (r0 < r1) goto L1c
            java.lang.String r0 = p211l2.C9344a.m27835a()
            if (r0 != 0) goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.C10891i.m33228f():java.lang.String");
    }

    /* renamed from: a */
    public final AbstractC12426f0.e.d.a.c m33229a(String processName, int i10, int i11) {
        C9322n.m27781e(processName, "processName");
        return m33227c(this, processName, i10, i11, false, 8, null);
    }

    /* renamed from: b */
    public final AbstractC12426f0.e.d.a.c m33230b(String processName, int i10, int i11, boolean z10) {
        C9322n.m27781e(processName, "processName");
        AbstractC12426f0.e.d.a.c mo40362a = AbstractC12426f0.e.d.a.c.m40357a().mo40366e(processName).mo40365d(i10).mo40364c(i11).mo40363b(z10).mo40362a();
        C9322n.m27780d(mo40362a, "builder()\n      .setProc…ltProcess)\n      .build()");
        return mo40362a;
    }

    /* renamed from: d */
    public final List<AbstractC12426f0.e.d.a.c> m33231d(Context context) {
        List m20602D;
        int m20590r;
        C9322n.m27781e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = C7031r.m20582j();
        }
        m20602D = C7042z.m20602D(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : m20602D) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        m20590r = C7033s.m20590r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m20590r);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(AbstractC12426f0.e.d.a.c.m40357a().mo40366e(runningAppProcessInfo.processName).mo40365d(runningAppProcessInfo.pid).mo40364c(runningAppProcessInfo.importance).mo40363b(C9322n.m27777a(runningAppProcessInfo.processName, str)).mo40362a());
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final AbstractC12426f0.e.d.a.c m33232e(Context context) {
        Object obj;
        C9322n.m27781e(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = m33231d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC12426f0.e.d.a.c) obj).mo40359c() == myPid) {
                break;
            }
        }
        AbstractC12426f0.e.d.a.c cVar = (AbstractC12426f0.e.d.a.c) obj;
        return cVar == null ? m33227c(this, m33228f(), myPid, 0, false, 12, null) : cVar;
    }
}
