package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5825f;

/* renamed from: com.google.android.play.core.integrity.v */
/* loaded from: classes2.dex */
final class C5810v {

    /* renamed from: a */
    private static C5803o f12202a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C5803o m14650a(Context context) {
        C5803o c5803o;
        synchronized (C5810v.class) {
            if (f12202a == null) {
                C5799m c5799m = new C5799m(null);
                c5799m.m14643a(C5825f.m14685a(context));
                f12202a = c5799m.mo14644b();
            }
            c5803o = f12202a;
        }
        return c5803o;
    }
}
