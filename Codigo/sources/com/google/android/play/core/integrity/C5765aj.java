package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5825f;

/* renamed from: com.google.android.play.core.integrity.aj */
/* loaded from: classes2.dex */
final class C5765aj {

    /* renamed from: a */
    private static C5807s f12133a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C5807s m14624a(Context context) {
        C5807s c5807s;
        synchronized (C5765aj.class) {
            if (f12133a == null) {
                C5805q c5805q = new C5805q(null);
                c5805q.m14648a(C5825f.m14685a(context));
                f12133a = c5805q.mo14623b();
            }
            c5807s = f12133a;
        }
        return c5807s;
    }
}
