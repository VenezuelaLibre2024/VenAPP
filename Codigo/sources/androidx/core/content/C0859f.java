package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0794g;
import androidx.core.util.C0979c;

/* renamed from: androidx.core.content.f */
/* loaded from: classes.dex */
public final class C0859f {
    /* renamed from: a */
    public static int m4383a(Context context, String str, int i10, int i11, String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String m4026c = C0794g.m4026c(str);
        if (m4026c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i11 && C0979c.m4812a(context.getPackageName(), str2) ? C0794g.m4024a(context, i11, m4026c, str2) : C0794g.m4025b(context, m4026c, str2)) == 0 ? 0 : -2;
    }

    /* renamed from: b */
    public static int m4384b(Context context, String str) {
        return m4383a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
