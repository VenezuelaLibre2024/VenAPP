package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
import re.C10696a;

/* renamed from: com.google.firebase.perf.util.m */
/* loaded from: classes.dex */
public class C6339m {

    /* renamed from: a */
    private static String[] f13614a;

    /* renamed from: a */
    public static boolean m17538a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C10696a.m32565e().m32566a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f13614a == null) {
            f13614a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f13614a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
