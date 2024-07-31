package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbvl implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbvn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvl(zzbvn zzbvnVar) {
        this.zza = zzbvnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Context context;
        zzbvn zzbvnVar = this.zza;
        Intent zzb = zzbvnVar.zzb();
        t.r();
        context = zzbvnVar.zzb;
        j2.s(context, zzb);
    }
}
