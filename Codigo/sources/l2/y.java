package l2;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20880a;

    static {
        String i10 = f2.j.i("WakeLocks");
        kotlin.jvm.internal.n.d(i10, "tagWithPrefix(\"WakeLocks\")");
        f20880a = i10;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        z zVar = z.f20881a;
        synchronized (zVar) {
            linkedHashMap.putAll(zVar.a());
            ck.v vVar = ck.v.f7137a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            boolean z10 = false;
            if (wakeLock != null && wakeLock.isHeld()) {
                z10 = true;
            }
            if (z10) {
                f2.j.e().k(f20880a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String tag) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.n.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        z zVar = z.f20881a;
        synchronized (zVar) {
            zVar.a().put(wakeLock, str);
        }
        kotlin.jvm.internal.n.d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
