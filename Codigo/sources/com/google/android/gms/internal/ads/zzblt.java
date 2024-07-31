package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.p4;
import com.google.android.gms.ads.internal.client.u0;

/* loaded from: classes2.dex */
public final class zzblt extends zzbkw {
    private final a9.f zza;

    public zzblt(a9.f fVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ a9.f zzc(zzblt zzbltVar) {
        zzbltVar.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkx
    public final void zze(u0 u0Var, com.google.android.gms.dynamic.b bVar) {
        if (u0Var == null || bVar == null) {
            return;
        }
        y8.b bVar2 = new y8.b((Context) com.google.android.gms.dynamic.d.g2(bVar));
        try {
            if (u0Var.zzi() instanceof p4) {
                p4 p4Var = (p4) u0Var.zzi();
                bVar2.setAdListener(p4Var != null ? p4Var.f2() : null);
            }
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
        try {
            if (u0Var.zzj() instanceof zzaze) {
                zzaze zzazeVar = (zzaze) u0Var.zzj();
                bVar2.setAppEventListener(zzazeVar != null ? zzazeVar.zzb() : null);
            }
        } catch (RemoteException e11) {
            zzcec.zzh("", e11);
        }
        zzcdv.zza.post(new zzbls(this, bVar2, u0Var));
    }
}
