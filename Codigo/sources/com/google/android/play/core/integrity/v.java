package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private static o f10987a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized o a(Context context) {
        o oVar;
        synchronized (v.class) {
            if (f10987a == null) {
                m mVar = new m(null);
                mVar.a(com.google.android.play.integrity.internal.f.a(context));
                f10987a = mVar.b();
            }
            oVar = f10987a;
        }
        return oVar;
    }
}
