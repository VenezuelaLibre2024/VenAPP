package p211l2;

import android.app.Application;
import kotlin.jvm.internal.C9322n;

/* renamed from: l2.b */
/* loaded from: classes.dex */
final class C9346b {

    /* renamed from: a */
    public static final C9346b f22628a = new C9346b();

    private C9346b() {
    }

    /* renamed from: a */
    public final String m27836a() {
        String processName;
        processName = Application.getProcessName();
        C9322n.m27780d(processName, "getProcessName()");
        return processName;
    }
}
