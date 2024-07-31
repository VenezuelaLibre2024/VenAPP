package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbvp implements View.OnClickListener {
    final /* synthetic */ zzbvq zza;

    public zzbvp(zzbvq zzbvqVar) {
        this.zza = zzbvqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
