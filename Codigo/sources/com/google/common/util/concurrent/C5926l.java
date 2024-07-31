package com.google.common.util.concurrent;

import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.l */
/* loaded from: classes2.dex */
public final class C5926l {
    /* renamed from: a */
    public static <V> V m15188a(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }
}
