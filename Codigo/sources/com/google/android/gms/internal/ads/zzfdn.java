package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfdn implements zzgej {
    public zzfdn(zzfdp zzfdpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        u1.a("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        u1.a("Notification of cache hit successful.");
    }
}
