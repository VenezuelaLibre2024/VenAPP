package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.common.internal.C5276s;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: classes.dex */
public class C5155l {
    /* renamed from: a */
    public static <L> C5151k<L> m13090a(L l10, Looper looper, String str) {
        C5276s.m13325k(l10, "Listener must not be null");
        C5276s.m13325k(looper, "Looper must not be null");
        C5276s.m13325k(str, "Listener type must not be null");
        return new C5151k<>(looper, l10, str);
    }

    /* renamed from: b */
    public static <L> C5151k<L> m13091b(L l10, Executor executor, String str) {
        C5276s.m13325k(l10, "Listener must not be null");
        C5276s.m13325k(executor, "Executor must not be null");
        C5276s.m13325k(str, "Listener type must not be null");
        return new C5151k<>(executor, l10, str);
    }

    /* renamed from: c */
    public static <L> C5151k.a<L> m13092c(L l10, String str) {
        C5276s.m13325k(l10, "Listener must not be null");
        C5276s.m13325k(str, "Listener type must not be null");
        C5276s.m13321g(str, "Listener type must not be empty");
        return new C5151k.a<>(l10, str);
    }
}
