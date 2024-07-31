package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import cc.InterfaceC1940a;
import com.google.android.gms.common.internal.C5276s;
import com.google.common.collect.AbstractC5855a0;
import com.google.common.collect.AbstractC5907w;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p418wa.C12098c0;
import p418wa.C12119q;
import p418wa.C12120r;
import p418wa.C12121s;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
/* loaded from: classes.dex */
public final class C6033b {

    /* renamed from: a */
    private static final AbstractC5855a0<String> f12803a = AbstractC5855a0.m14706A("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b */
    private static final AbstractC5907w<String> f12804b = AbstractC5907w.m15073A("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    private static final AbstractC5907w<String> f12805c = AbstractC5907w.m15084y("auto", "app", "am");

    /* renamed from: d */
    private static final AbstractC5907w<String> f12806d = AbstractC5907w.m15083x("_r", "_dbg");

    /* renamed from: e */
    private static final AbstractC5907w<String> f12807e = new AbstractC5907w.a().m15092i(C12121s.f32214a).m15092i(C12121s.f32215b).m15094k();

    /* renamed from: f */
    private static final AbstractC5907w<String> f12808f = AbstractC5907w.m15083x("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static Bundle m16315a(InterfaceC1940a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f7972a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f7973b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f7974c;
        if (obj != null) {
            C12119q.m38855b(bundle, obj);
        }
        String str3 = cVar.f7975d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f7976e);
        String str4 = cVar.f7977f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.f7978g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.f7979h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.f7980i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f7981j);
        String str6 = cVar.f7982k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.f7983l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f7984m);
        bundle.putBoolean("active", cVar.f7985n);
        bundle.putLong("triggered_timestamp", cVar.f7986o);
        return bundle;
    }

    /* renamed from: b */
    public static InterfaceC1940a.c m16316b(Bundle bundle) {
        C5276s.m13324j(bundle);
        InterfaceC1940a.c cVar = new InterfaceC1940a.c();
        cVar.f7972a = (String) C5276s.m13324j((String) C12119q.m38854a(bundle, "origin", String.class, null));
        cVar.f7973b = (String) C5276s.m13324j((String) C12119q.m38854a(bundle, "name", String.class, null));
        cVar.f7974c = C12119q.m38854a(bundle, "value", Object.class, null);
        cVar.f7975d = (String) C12119q.m38854a(bundle, "trigger_event_name", String.class, null);
        cVar.f7976e = ((Long) C12119q.m38854a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f7977f = (String) C12119q.m38854a(bundle, "timed_out_event_name", String.class, null);
        cVar.f7978g = (Bundle) C12119q.m38854a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.f7979h = (String) C12119q.m38854a(bundle, "triggered_event_name", String.class, null);
        cVar.f7980i = (Bundle) C12119q.m38854a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.f7981j = ((Long) C12119q.m38854a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.f7982k = (String) C12119q.m38854a(bundle, "expired_event_name", String.class, null);
        cVar.f7983l = (Bundle) C12119q.m38854a(bundle, "expired_event_params", Bundle.class, null);
        cVar.f7985n = ((Boolean) C12119q.m38854a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f7984m = ((Long) C12119q.m38854a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.f7986o = ((Long) C12119q.m38854a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    /* renamed from: c */
    public static String m16317c(String str) {
        String m38856a = C12120r.m38856a(str);
        return m38856a != null ? m38856a : str;
    }

    /* renamed from: d */
    public static void m16318d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    /* renamed from: e */
    public static boolean m16319e(String str, Bundle bundle) {
        if (f12804b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC5907w<String> abstractC5907w = f12806d;
        int size = abstractC5907w.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = abstractC5907w.get(i10);
            i10++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m16320f(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f12807e.contains(str2)) {
            return false;
        }
        AbstractC5907w<String> abstractC5907w = f12808f;
        int size = abstractC5907w.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = abstractC5907w.get(i10);
            i10++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static String m16321g(String str) {
        String m38857b = C12120r.m38857b(str);
        return m38857b != null ? m38857b : str;
    }

    /* renamed from: h */
    public static boolean m16322h(InterfaceC1940a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f7972a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f7974c;
        if ((obj != null && C12098c0.m38845a(obj) == null) || !m16327m(str) || !m16320f(str, cVar.f7973b)) {
            return false;
        }
        String str2 = cVar.f7982k;
        if (str2 != null && (!m16319e(str2, cVar.f7983l) || !m16323i(str, cVar.f7982k, cVar.f7983l))) {
            return false;
        }
        String str3 = cVar.f7979h;
        if (str3 != null && (!m16319e(str3, cVar.f7980i) || !m16323i(str, cVar.f7979h, cVar.f7980i))) {
            return false;
        }
        String str4 = cVar.f7977f;
        if (str4 != null) {
            return m16319e(str4, cVar.f7978g) && m16323i(str, cVar.f7977f, cVar.f7978g);
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m16323i(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m16327m(str) || bundle == null) {
            return false;
        }
        AbstractC5907w<String> abstractC5907w = f12806d;
        int size = abstractC5907w.size();
        int i10 = 0;
        while (i10 < size) {
            String str4 = abstractC5907w.get(i10);
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

    /* renamed from: j */
    public static boolean m16324j(String str) {
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

    /* renamed from: k */
    public static boolean m16325k(String str) {
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

    /* renamed from: l */
    public static boolean m16326l(String str) {
        return !f12803a.contains(str);
    }

    /* renamed from: m */
    public static boolean m16327m(String str) {
        return !f12805c.contains(str);
    }
}
