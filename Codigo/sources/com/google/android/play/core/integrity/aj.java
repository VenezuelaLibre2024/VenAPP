package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    private static s f10918a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized s a(Context context) {
        s sVar;
        synchronized (aj.class) {
            if (f10918a == null) {
                q qVar = new q(null);
                qVar.a(com.google.android.play.integrity.internal.f.a(context));
                f10918a = qVar.b();
            }
            sVar = f10918a;
        }
        return sVar;
    }
}
