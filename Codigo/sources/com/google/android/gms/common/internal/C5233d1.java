package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import na.C9696e;

/* renamed from: com.google.android.gms.common.internal.d1 */
/* loaded from: classes.dex */
public final class C5233d1 {

    /* renamed from: a */
    private static final Object f10646a = new Object();

    /* renamed from: b */
    private static boolean f10647b;

    /* renamed from: c */
    private static String f10648c;

    /* renamed from: d */
    private static int f10649d;

    /* renamed from: a */
    public static int m13229a(Context context) {
        m13230b(context);
        return f10649d;
    }

    /* renamed from: b */
    private static void m13230b(Context context) {
        Bundle bundle;
        synchronized (f10646a) {
            if (f10647b) {
                return;
            }
            f10647b = true;
            try {
                bundle = C9696e.m29080a(context).m29074c(context.getPackageName(), RecognitionOptions.ITF).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
            if (bundle == null) {
                return;
            }
            f10648c = bundle.getString("com.google.app.id");
            f10649d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
