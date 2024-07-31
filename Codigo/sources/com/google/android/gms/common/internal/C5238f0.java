package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0738h;
import androidx.core.os.C0945d;
import ca.C1910j;
import ca.C1916m;
import java.util.Locale;
import la.C9465j;
import na.C9696e;
import p012aa.C0081b;

/* renamed from: com.google.android.gms.common.internal.f0 */
/* loaded from: classes.dex */
public final class C5238f0 {

    /* renamed from: a */
    private static final C0738h f10672a = new C0738h();

    /* renamed from: b */
    private static Locale f10673b;

    /* renamed from: a */
    public static String m13253a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C9696e.m29080a(context).m29075d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m13254b(Context context) {
        return context.getResources().getString(C0081b.f329g);
    }

    /* renamed from: c */
    public static String m13255c(Context context, int i10) {
        return context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? R.string.ok : C0081b.f323a : C0081b.f332j : C0081b.f326d);
    }

    /* renamed from: d */
    public static String m13256d(Context context, int i10) {
        Resources resources = context.getResources();
        String m13253a = m13253a(context);
        if (i10 == 1) {
            return resources.getString(C0081b.f327e, m13253a);
        }
        if (i10 == 2) {
            return C9465j.m28149g(context) ? resources.getString(C0081b.f336n) : resources.getString(C0081b.f333k, m13253a);
        }
        if (i10 == 3) {
            return resources.getString(C0081b.f324b, m13253a);
        }
        if (i10 == 5) {
            return m13260h(context, "common_google_play_services_invalid_account_text", m13253a);
        }
        if (i10 == 7) {
            return m13260h(context, "common_google_play_services_network_error_text", m13253a);
        }
        if (i10 == 9) {
            return resources.getString(C0081b.f331i, m13253a);
        }
        if (i10 == 20) {
            return m13260h(context, "common_google_play_services_restricted_profile_text", m13253a);
        }
        switch (i10) {
            case 16:
                return m13260h(context, "common_google_play_services_api_unavailable_text", m13253a);
            case 17:
                return m13260h(context, "common_google_play_services_sign_in_failed_text", m13253a);
            case 18:
                return resources.getString(C0081b.f335m, m13253a);
            default:
                return resources.getString(C1916m.f7941a, m13253a);
        }
    }

    /* renamed from: e */
    public static String m13257e(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? m13260h(context, "common_google_play_services_resolution_required_text", m13253a(context)) : m13256d(context, i10);
    }

    /* renamed from: f */
    public static String m13258f(Context context, int i10) {
        String m13261i = i10 == 6 ? m13261i(context, "common_google_play_services_resolution_required_title") : m13259g(context, i10);
        return m13261i == null ? context.getResources().getString(C0081b.f330h) : m13261i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* renamed from: g */
    public static String m13259g(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(C0081b.f328f);
            case 2:
                return resources.getString(C0081b.f334l);
            case 3:
                return resources.getString(C0081b.f325c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m13261i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m13261i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 11:
                str = "The application is not licensed to the user.";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                str = "Unexpected error code " + i10;
                Log.e("GoogleApiAvailability", str);
                return null;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m13261i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m13261i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    private static String m13260h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m13261i = m13261i(context, str);
        if (m13261i == null) {
            m13261i = resources.getString(C1916m.f7941a);
        }
        return String.format(resources.getConfiguration().locale, m13261i, str2);
    }

    /* renamed from: i */
    private static String m13261i(Context context, String str) {
        C0738h c0738h = f10672a;
        synchronized (c0738h) {
            Locale m4721c = C0945d.m4708a(context.getResources().getConfiguration()).m4721c(0);
            if (!m4721c.equals(f10673b)) {
                c0738h.clear();
                f10673b = m4721c;
            }
            String str2 = (String) c0738h.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources m10093e = C1910j.m10093e(context);
            if (m10093e == null) {
                return null;
            }
            int identifier = m10093e.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = m10093e.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                c0738h.put(str, string);
                return string;
            }
            Log.w("GoogleApiAvailability", "Got empty resource: " + str);
            return null;
        }
    }
}
