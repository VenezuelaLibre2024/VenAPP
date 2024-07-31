package l2;

import android.app.Application;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20806a = new b();

    private b() {
    }

    public final String a() {
        String processName;
        processName = Application.getProcessName();
        kotlin.jvm.internal.n.d(processName, "getProcessName()");
        return processName;
    }
}
