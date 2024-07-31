package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.mlkit.common.sdkinternal.u */
/* loaded from: classes2.dex */
public enum EnumC6539u implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler;
        handler = C6520g.m18307a().f14300a;
        handler.post(runnable);
    }
}
