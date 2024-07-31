package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    private static final androidx.collection.h f9558a = new androidx.collection.h();

    /* renamed from: b */
    private static Locale f9559b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return na.e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(aa.b.f278g);
    }

    public static String c(Context context, int i10) {
        return context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? R.string.ok : aa.b.f272a : aa.b.f281j : aa.b.f275d);
    }

    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(aa.b.f276e, a10);
        }
        if (i10 == 2) {
            return la.j.g(context) ? resources.getString(aa.b.f285n) : resources.getString(aa.b.f282k, a10);
        }
        if (i10 == 3) {
            return resources.getString(aa.b.f273b, a10);
        }
        if (i10 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", a10);
        }
        if (i10 == 7) {
            return h(context, "common_google_play_services_network_error_text", a10);
        }
        if (i10 == 9) {
            return resources.getString(aa.b.f280i, a10);
        }
        if (i10 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", a10);
        }
        switch (i10) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", a10);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", a10);
            case 18:
                return resources.getString(aa.b.f284m, a10);
            default:
                return resources.getString(ca.m.f6992a, a10);
        }
    }

    public static String e(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i10);
    }

    public static String f(Context context, int i10) {
        String i11 = i10 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i10);
        return i11 == null ? context.getResources().getString(aa.b.f279h) : i11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static String g(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(aa.b.f277f);
            case 2:
                return resources.getString(aa.b.f283l);
            case 3:
                return resources.getString(aa.b.f274c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
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
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i10 = i(context, str);
        if (i10 == null) {
            i10 = resources.getString(ca.m.f6992a);
        }
        return String.format(resources.getConfiguration().locale, i10, str2);
    }

    private static String i(Context context, String str) {
        androidx.collection.h hVar = f9558a;
        synchronized (hVar) {
            Locale c10 = androidx.core.os.d.a(context.getResources().getConfiguration()).c(0);
            if (!c10.equals(f9559b)) {
                hVar.clear();
                f9559b = c10;
            }
            String str2 = (String) hVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources e10 = ca.j.e(context);
            if (e10 == null) {
                return null;
            }
            int identifier = e10.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = e10.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                hVar.put(str, string);
                return string;
            }
            Log.w("GoogleApiAvailability", "Got empty resource: " + str);
            return null;
        }
    }
}
