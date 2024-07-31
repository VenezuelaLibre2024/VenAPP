package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.k;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class l {
    public static <L> k<L> a(L l10, Looper looper, String str) {
        com.google.android.gms.common.internal.s.k(l10, "Listener must not be null");
        com.google.android.gms.common.internal.s.k(looper, "Looper must not be null");
        com.google.android.gms.common.internal.s.k(str, "Listener type must not be null");
        return new k<>(looper, l10, str);
    }

    public static <L> k<L> b(L l10, Executor executor, String str) {
        com.google.android.gms.common.internal.s.k(l10, "Listener must not be null");
        com.google.android.gms.common.internal.s.k(executor, "Executor must not be null");
        com.google.android.gms.common.internal.s.k(str, "Listener type must not be null");
        return new k<>(executor, l10, str);
    }

    public static <L> k.a<L> c(L l10, String str) {
        com.google.android.gms.common.internal.s.k(l10, "Listener must not be null");
        com.google.android.gms.common.internal.s.k(str, "Listener type must not be null");
        com.google.android.gms.common.internal.s.g(str, "Listener type must not be empty");
        return new k.a<>(l10, str);
    }
}
