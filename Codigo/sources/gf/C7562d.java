package gf;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: gf.d */
/* loaded from: classes2.dex */
public class C7562d {
    /* renamed from: a */
    public static String m22961a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb2.length() > 0) {
                    sb2.append("/");
                }
                sb2.append(str2);
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m22962b(String str) {
        return TextUtils.isEmpty(str) ? "" : m22963c(Uri.encode(str));
    }

    /* renamed from: c */
    public static String m22963c(String str) {
        C5276s.m13324j(str);
        return str.replace("%2F", "/");
    }
}
