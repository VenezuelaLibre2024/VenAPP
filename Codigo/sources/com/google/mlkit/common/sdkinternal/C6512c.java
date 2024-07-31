package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5249j;
import java.util.Locale;
import la.C9471p;

/* renamed from: com.google.mlkit.common.sdkinternal.c */
/* loaded from: classes2.dex */
public class C6512c {

    /* renamed from: a */
    private static final C5249j f14292a = new C5249j("CommonUtils", "");

    /* renamed from: a */
    public static String m18303a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            f14292a.m13286c("CommonUtils", "Exception thrown when trying to get app version ".concat(e10.toString()));
            return "";
        }
    }

    /* renamed from: b */
    public static String m18304b(Locale locale) {
        if (C9471p.m28169f()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
