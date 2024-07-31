package com.google.android.recaptcha.internal;

import android.content.Context;
import dk.z;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.g;
import zk.j;
import zk.k0;

/* loaded from: classes2.dex */
public final class zzao implements zzaj {
    public static final zzak zza = new zzak(null);
    private static Timer zzb;
    private final zzap zzc;
    private final k0 zzd;
    private final zzad zze;

    public /* synthetic */ zzao(Context context, zzap zzapVar, k0 k0Var, int i10, g gVar) {
        zzad zzadVar;
        k0 zza2 = zzp.zza();
        this.zzc = zzapVar;
        this.zzd = zza2;
        zzadVar = zzad.zzb;
        zzadVar = zzadVar == null ? new zzad(context, null) : zzadVar;
        zzad.zzb = zzadVar;
        this.zze = zzadVar;
        zzh();
    }

    public final void zzg() {
        List<List> k02;
        k02 = z.k0(this.zze.zzd(), 20, 20, true);
        for (List list : k02) {
            zzkz zzf = zzla.zzf();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzf.zzd(zzkx.zzG(zzeb.zzg().zzj(((zzae) it.next()).zzc())));
            }
            if (this.zzc.zza(((zzla) zzf.zzj()).zzd())) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    this.zze.zzf((zzae) it2.next());
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzal(this), 120000L, 120000L);
        }
    }

    public final void zzf(zzkx zzkxVar) {
        j.d(this.zzd, null, null, new zzan(zzkxVar, this, null), 3, null);
        zzh();
    }
}
