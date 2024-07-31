package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import cc.a;
import com.google.common.collect.a0;
import com.google.common.collect.w;
import io.flutter.plugins.firebase.crashlytics.Constants;
import wa.c0;
import wa.q;
import wa.r;
import wa.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final a0<String> f11588a = a0.A("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    private static final w<String> f11589b = w.A("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final w<String> f11590c = w.y("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    private static final w<String> f11591d = w.x("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final w<String> f11592e = new w.a().i(s.f29749a).i(s.f29750b).k();

    /* renamed from: f, reason: collision with root package name */
    private static final w<String> f11593f = w.x("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f7020a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f7021b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f7022c;
        if (obj != null) {
            q.b(bundle, obj);
        }
        String str3 = cVar.f7023d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f7024e);
        String str4 = cVar.f7025f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.f7026g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.f7027h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.f7028i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f7029j);
        String str6 = cVar.f7030k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.f7031l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f7032m);
        bundle.putBoolean("active", cVar.f7033n);
        bundle.putLong("triggered_timestamp", cVar.f7034o);
        return bundle;
    }

    public static a.c b(Bundle bundle) {
        com.google.android.gms.common.internal.s.j(bundle);
        a.c cVar = new a.c();
        cVar.f7020a = (String) com.google.android.gms.common.internal.s.j((String) q.a(bundle, "origin", String.class, null));
        cVar.f7021b = (String) com.google.android.gms.common.internal.s.j((String) q.a(bundle, "name", String.class, null));
        cVar.f7022c = q.a(bundle, "value", Object.class, null);
        cVar.f7023d = (String) q.a(bundle, "trigger_event_name", String.class, null);
        cVar.f7024e = ((Long) q.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f7025f = (String) q.a(bundle, "timed_out_event_name", String.class, null);
        cVar.f7026g = (Bundle) q.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.f7027h = (String) q.a(bundle, "triggered_event_name", String.class, null);
        cVar.f7028i = (Bundle) q.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.f7029j = ((Long) q.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.f7030k = (String) q.a(bundle, "expired_event_name", String.class, null);
        cVar.f7031l = (Bundle) q.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.f7033n = ((Boolean) q.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f7032m = ((Long) q.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.f7034o = ((Long) q.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    public static String c(String str) {
        String a10 = r.a(str);
        return a10 != null ? a10 : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, Bundle bundle) {
        if (f11589b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        w<String> wVar = f11591d;
        int size = wVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = wVar.get(i10);
            i10++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f11592e.contains(str2)) {
            return false;
        }
        w<String> wVar = f11593f;
        int size = wVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = wVar.get(i10);
            i10++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    public static String g(String str) {
        String b10 = r.b(str);
        return b10 != null ? b10 : str;
    }

    public static boolean h(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f7020a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f7022c;
        if ((obj != null && c0.a(obj) == null) || !m(str) || !f(str, cVar.f7021b)) {
            return false;
        }
        String str2 = cVar.f7030k;
        if (str2 != null && (!e(str2, cVar.f7031l) || !i(str, cVar.f7030k, cVar.f7031l))) {
            return false;
        }
        String str3 = cVar.f7027h;
        if (str3 != null && (!e(str3, cVar.f7028i) || !i(str, cVar.f7027h, cVar.f7028i))) {
            return false;
        }
        String str4 = cVar.f7025f;
        if (str4 != null) {
            return e(str4, cVar.f7026g) && i(str, cVar.f7025f, cVar.f7026g);
        }
        return true;
    }

    public static boolean i(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m(str) || bundle == null) {
            return false;
        }
        w<String> wVar = f11591d;
        int size = wVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str4 = wVar.get(i10);
            i10++;
            if (bundle.containsKey(str4)) {
                return false;
            }
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c10 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                str3 = "fcm_integration";
                break;
            case 1:
                str3 = "fdl_integration";
                break;
            case 2:
                str3 = "fiam_integration";
                break;
            default:
                return false;
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static boolean j(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean k(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int codePointAt = str.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            return false;
        }
        int length = str.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean l(String str) {
        return !f11588a.contains(str);
    }

    public static boolean m(String str) {
        return !f11590c.contains(str);
    }
}
