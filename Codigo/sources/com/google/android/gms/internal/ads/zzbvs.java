package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbvs implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbvt zza;

    public zzbvs(zzbvt zzbvtVar) {
        this.zza = zzbvtVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzh("User canceled the download.");
    }
}
