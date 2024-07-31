package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbvy extends b.a {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbvy(zzbjf zzbjfVar) {
        try {
            this.zzb = zzbjfVar.zzg();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbjfVar.zzh()) {
                zzbjm zzg = obj instanceof IBinder ? zzbjl.zzg((IBinder) obj) : null;
                if (zzg != null) {
                    this.zza.add(new zzbwa(zzg));
                }
            }
        } catch (RemoteException e11) {
            zzcec.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b.a
    public final List<b.AbstractC0145b> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.b.a
    public final CharSequence getText() {
        return this.zzb;
    }
}
