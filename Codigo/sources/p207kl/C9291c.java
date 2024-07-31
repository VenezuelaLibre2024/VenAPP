package p207kl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.C9578a;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import p225ll.C9515a;
import p225ll.C9516b;
import p225ll.C9517c;
import p225ll.C9518d;
import p225ll.C9519e;
import p225ll.C9520f;
import p225ll.C9521g;

/* renamed from: kl.c */
/* loaded from: classes3.dex */
public final class C9291c {

    /* renamed from: a */
    private static final List<Class<? extends InterfaceC9289a>> f22544a;

    /* renamed from: b */
    private static volatile Boolean f22545b;

    /* renamed from: c */
    private static final Object f22546c;

    /* renamed from: d */
    private static InterfaceC9289a f22547d;

    /* renamed from: e */
    private static ComponentName f22548e;

    static {
        LinkedList linkedList = new LinkedList();
        f22544a = linkedList;
        f22546c = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(C9515a.class);
        linkedList.add(C9517c.class);
        linkedList.add(C9518d.class);
        linkedList.add(C9578a.class);
        linkedList.add(C9521g.class);
        linkedList.add(C9519e.class);
        linkedList.add(C9520f.class);
        linkedList.add(C9516b.class);
    }

    /* renamed from: a */
    public static boolean m27713a(Context context, int i10) {
        try {
            m27714b(context, i10);
            return true;
        } catch (C9290b e10) {
            if (!Log.isLoggable("ShortcutBadger", 3)) {
                return false;
            }
            Log.d("ShortcutBadger", "Unable to execute badge", e10);
            return false;
        }
    }

    /* renamed from: b */
    public static void m27714b(Context context, int i10) {
        if (f22547d == null && !m27715c(context)) {
            throw new C9290b("No default launcher available");
        }
        try {
            f22547d.mo27712b(context, f22548e, i10);
        } catch (Exception e10) {
            throw new C9290b("Unable to execute badge", e10);
        }
    }

    /* renamed from: c */
    private static boolean m27715c(Context context) {
        InterfaceC9289a interfaceC9289a;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f22548e = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator<Class<? extends InterfaceC9289a>> it2 = f22544a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                try {
                    interfaceC9289a = it2.next().newInstance();
                } catch (Exception unused) {
                    interfaceC9289a = null;
                }
                if (interfaceC9289a != null && interfaceC9289a.mo27711a().contains(str)) {
                    f22547d = interfaceC9289a;
                    break;
                }
            }
            if (f22547d != null) {
                break;
            }
        }
        if (f22547d != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        f22547d = str2.equalsIgnoreCase("ZUK") ? new C9521g() : str2.equalsIgnoreCase("OPPO") ? new C9518d() : str2.equalsIgnoreCase("VIVO") ? new C9519e() : str2.equalsIgnoreCase("ZTE") ? new C9520f() : new DefaultBadger();
        return true;
    }

    /* renamed from: d */
    public static boolean m27716d(Context context) {
        if (f22545b == null) {
            synchronized (f22546c) {
                if (f22545b == null) {
                    String str = null;
                    for (int i10 = 0; i10 < 3; i10++) {
                        try {
                            Log.i("ShortcutBadger", "Checking if platform supports badge counters, attempt " + String.format("%d/%d.", Integer.valueOf(i10 + 1), 3));
                        } catch (Exception e10) {
                            str = e10.getMessage();
                        }
                        if (m27715c(context)) {
                            f22547d.mo27712b(context, f22548e, 0);
                            f22545b = Boolean.TRUE;
                            Log.i("ShortcutBadger", "Badge counter is supported in this platform.");
                            break;
                        }
                        str = "Failed to initialize the badge counter.";
                    }
                    if (f22545b == null) {
                        Log.w("ShortcutBadger", "Badge counter seems not supported for this platform: " + str);
                        f22545b = Boolean.FALSE;
                    }
                }
            }
        }
        return f22545b.booleanValue();
    }

    /* renamed from: e */
    public static boolean m27717e(Context context) {
        return m27713a(context, 0);
    }
}
