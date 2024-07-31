package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f9532a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9533b;

    /* renamed from: c, reason: collision with root package name */
    private static String f9534c;

    /* renamed from: d, reason: collision with root package name */
    private static int f9535d;

    public static int a(Context context) {
        b(context);
        return f9535d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f9532a) {
            if (f9533b) {
                return;
            }
            f9533b = true;
            try {
                bundle = na.e.a(context).c(context.getPackageName(), RecognitionOptions.ITF).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
            if (bundle == null) {
                return;
            }
            f9534c = bundle.getString("com.google.app.id");
            f9535d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
