package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p319ql.C10546u;
import re.C10696a;

/* renamed from: com.google.firebase.perf.util.o */
/* loaded from: classes.dex */
public class C6341o {

    /* renamed from: a */
    private static Boolean f13616a;

    /* renamed from: a */
    public static void m17540a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static boolean m17541b(Context context) {
        Boolean bool = f13616a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f13616a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            C10696a.m32565e().m32566a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public static int m17542c(long j10) {
        if (j10 > 2147483647L) {
            return C5101a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    /* renamed from: d */
    public static String m17543d(String str) {
        C10546u m31867l = C10546u.m31867l(str);
        return m31867l != null ? m31867l.m31876j().m31896F("").m31910q("").m31912u(null).m31899d(null).toString() : str;
    }

    /* renamed from: e */
    public static String m17544e(String str, int i10) {
        C10546u m31867l;
        int lastIndexOf;
        if (str.length() <= i10) {
            return str;
        }
        if (str.charAt(i10) != '/' && (m31867l = C10546u.m31867l(str)) != null) {
            return (m31867l.m31870d().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, i10 + (-1))) < 0) ? str.substring(0, i10) : str.substring(0, lastIndexOf);
        }
        return str.substring(0, i10);
    }
}
