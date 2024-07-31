package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.d;

/* loaded from: classes2.dex */
public final class zzbvz implements d.a {
    private final zzbkg zza;

    public zzbvz(zzbkg zzbkgVar) {
        this.zza = zzbkgVar;
        try {
            zzbkgVar.zzm();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzp(com.google.android.gms.dynamic.d.h2(view));
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return false;
        }
    }
}
