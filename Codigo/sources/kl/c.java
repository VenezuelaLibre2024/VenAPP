package kl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ll.d;
import ll.e;
import ll.f;
import ll.g;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final List<Class<? extends a>> f20722a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Boolean f20723b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f20724c;

    /* renamed from: d, reason: collision with root package name */
    private static a f20725d;

    /* renamed from: e, reason: collision with root package name */
    private static ComponentName f20726e;

    static {
        LinkedList linkedList = new LinkedList();
        f20722a = linkedList;
        f20724c = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(ll.a.class);
        linkedList.add(ll.c.class);
        linkedList.add(d.class);
        linkedList.add(me.leolin.shortcutbadger.impl.a.class);
        linkedList.add(g.class);
        linkedList.add(e.class);
        linkedList.add(f.class);
        linkedList.add(ll.b.class);
    }

    public static boolean a(Context context, int i10) {
        try {
            b(context, i10);
            return true;
        } catch (b e10) {
            if (!Log.isLoggable("ShortcutBadger", 3)) {
                return false;
            }
            Log.d("ShortcutBadger", "Unable to execute badge", e10);
            return false;
        }
    }

    public static void b(Context context, int i10) {
        if (f20725d == null && !c(context)) {
            throw new b("No default launcher available");
        }
        try {
            f20725d.b(context, f20726e, i10);
        } catch (Exception e10) {
            throw new b("Unable to execute badge", e10);
        }
    }

    private static boolean c(Context context) {
        a aVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f20726e = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator<Class<? extends a>> it2 = f20722a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                try {
                    aVar = it2.next().newInstance();
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar != null && aVar.a().contains(str)) {
                    f20725d = aVar;
                    break;
                }
            }
            if (f20725d != null) {
                break;
            }
        }
        if (f20725d != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        f20725d = str2.equalsIgnoreCase("ZUK") ? new g() : str2.equalsIgnoreCase("OPPO") ? new d() : str2.equalsIgnoreCase("VIVO") ? new e() : str2.equalsIgnoreCase("ZTE") ? new f() : new DefaultBadger();
        return true;
    }

    public static boolean d(Context context) {
        if (f20723b == null) {
            synchronized (f20724c) {
                if (f20723b == null) {
                    String str = null;
                    for (int i10 = 0; i10 < 3; i10++) {
                        try {
                            Log.i("ShortcutBadger", "Checking if platform supports badge counters, attempt " + String.format("%d/%d.", Integer.valueOf(i10 + 1), 3));
                        } catch (Exception e10) {
                            str = e10.getMessage();
                        }
                        if (c(context)) {
                            f20725d.b(context, f20726e, 0);
                            f20723b = Boolean.TRUE;
                            Log.i("ShortcutBadger", "Badge counter is supported in this platform.");
                            break;
                        }
                        str = "Failed to initialize the badge counter.";
                    }
                    if (f20723b == null) {
                        Log.w("ShortcutBadger", "Badge counter seems not supported for this platform: " + str);
                        f20723b = Boolean.FALSE;
                    }
                }
            }
        }
        return f20723b.booleanValue();
    }

    public static boolean e(Context context) {
        return a(context, 0);
    }
}
