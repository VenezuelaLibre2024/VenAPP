package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzavh;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.o */
/* loaded from: classes.dex */
public final class CallableC4959o implements Callable {

    /* renamed from: a */
    final /* synthetic */ BinderC4964s f9966a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC4959o(BinderC4964s binderC4964s) {
        this.f9966a = binderC4964s;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzcei zzceiVar;
        Context context;
        BinderC4964s binderC4964s = this.f9966a;
        zzceiVar = binderC4964s.f9999a;
        String str = zzceiVar.zza;
        context = binderC4964s.f10002d;
        return new zzavi(zzavh.zzt(str, context, false));
    }
}
