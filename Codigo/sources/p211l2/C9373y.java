package p211l2;

import android.content.Context;
import android.os.PowerManager;
import ck.C2037v;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;

/* renamed from: l2.y */
/* loaded from: classes.dex */
public final class C9373y {

    /* renamed from: a */
    private static final String f22702a;

    static {
        String m21769i = AbstractC7277j.m21769i("WakeLocks");
        C9322n.m27780d(m21769i, "tagWithPrefix(\"WakeLocks\")");
        f22702a = m21769i;
    }

    /* renamed from: a */
    public static final void m27889a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C9374z c9374z = C9374z.f22703a;
        synchronized (c9374z) {
            linkedHashMap.putAll(c9374z.m27891a());
            C2037v c2037v = C2037v.f8089a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            boolean z10 = false;
            if (wakeLock != null && wakeLock.isHeld()) {
                z10 = true;
            }
            if (z10) {
                AbstractC7277j.m21767e().mo21777k(f22702a, "WakeLock held for " + str);
            }
        }
    }

    /* renamed from: b */
    public static final PowerManager.WakeLock m27890b(Context context, String tag) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        C9322n.m27779c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        C9374z c9374z = C9374z.f22703a;
        synchronized (c9374z) {
            c9374z.m27891a().put(wakeLock, str);
        }
        C9322n.m27780d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
