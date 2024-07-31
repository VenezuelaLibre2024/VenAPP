package com.google.android.gms.internal.safetynet;

import android.text.TextUtils;
import com.google.android.gms.common.api.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzi extends zzr {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(f fVar, byte[] bArr, String str) {
        super(fVar);
        this.zza = bArr;
        this.zzb = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(zzaf zzafVar) {
        zzaf zzafVar2 = zzafVar;
        zzg zzgVar = this.zzc;
        byte[] bArr = this.zza;
        String str = this.zzb;
        if (TextUtils.isEmpty(str)) {
            str = zzafVar2.zzp("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((zzh) zzafVar2.getService()).zzc(zzgVar, bArr, str);
    }
}
