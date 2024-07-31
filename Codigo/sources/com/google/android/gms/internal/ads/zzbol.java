package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
public final class zzbol {
    private final Context zza;
    private final b9.b zzb;
    private zzboh zzc;

    public zzbol(Context context, b9.b bVar) {
        s.o(true, "Android version must be Lollipop or higher");
        s.j(context);
        s.j(bVar);
        this.zza = context;
        this.zzb = bVar;
        zzbgc.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) a0.c().zza(zzbgc.zzjF)).booleanValue()) {
            return false;
        }
        s.j(str);
        if (str.length() > ((Integer) a0.c().zza(zzbgc.zzjH)).intValue()) {
            zzcec.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = x.a().j(this.zza, new zzbsr(), this.zzb);
    }

    public final void zza() {
        if (((Boolean) a0.c().zza(zzbgc.zzjF)).booleanValue()) {
            zzd();
            zzboh zzbohVar = this.zzc;
            if (zzbohVar != null) {
                try {
                    zzbohVar.zze();
                } catch (RemoteException e10) {
                    zzcec.zzl("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzboh zzbohVar = this.zzc;
        if (zzbohVar == null) {
            return false;
        }
        try {
            zzbohVar.zzf(str);
            return true;
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            return true;
        }
    }
}
