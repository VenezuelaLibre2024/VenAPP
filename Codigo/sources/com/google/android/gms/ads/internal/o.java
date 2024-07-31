package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzavh;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f8879a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(s sVar) {
        this.f8879a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzcei zzceiVar;
        Context context;
        s sVar = this.f8879a;
        zzceiVar = sVar.f8904a;
        String str = zzceiVar.zza;
        context = sVar.f8907d;
        return new zzavi(zzavh.zzt(str, context, false));
    }
}
