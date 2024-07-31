package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import androidx.core.content.f;

/* loaded from: classes2.dex */
final class zze extends zzs {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_common.zzs
    public final int zza(Context context, zzr zzrVar, boolean z10) {
        return (zzrVar.zza.getAuthority().lastIndexOf(64) < 0 || f.b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
