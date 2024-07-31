package p065df;

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

/* renamed from: df.u */
/* loaded from: classes2.dex */
public final class C6934u {

    /* renamed from: a */
    public static final C6934u f15438a = new C6934u();

    private C6934u() {
    }

    /* renamed from: a */
    private final C6933t m20048a(String str, int i10, int i11, boolean z10) {
        return new C6933t(str, i10, i11, z10);
    }

    /* renamed from: b */
    static /* synthetic */ C6933t m20049b(C6934u c6934u, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return c6934u.m20048a(str, i10, i11, z10);
    }

    /* renamed from: c */
    public final List<C6933t> m20050c(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            C9322n.m27780d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new C6933t(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, C9322n.m27777a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    /* renamed from: d */
    public final C6933t m20051d(Context context) {
        Object obj;
        C9322n.m27781e(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = m20050c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C6933t) obj).m20045b() == myPid) {
                break;
            }
        }
        C6933t c6933t = (C6933t) obj;
        return c6933t == null ? m20049b(this, m20052e(), myPid, 0, false, 12, null) : c6933t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        r0 = android.app.Application.getProcessName();
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m20052e() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = android.os.Process.myProcessName()
            java.lang.String r1 = "myProcessName()"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            return r0
        L10:
            r1 = 28
            if (r0 < r1) goto L1b
            java.lang.String r0 = p211l2.C9344a.m27835a()
            if (r0 == 0) goto L1b
            return r0
        L1b:
            java.lang.String r0 = la.C9473r.m28177a()
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p065df.C6934u.m20052e():java.lang.String");
    }
}
