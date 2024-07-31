package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzafd implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzafc
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzafd()};
        }
    };
    private zzacx zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzafb zzp;
    private zzafh zzq;
    private final zzfp zzb = new zzfp(4);
    private final zzfp zzc = new zzfp(9);
    private final zzfp zzd = new zzfp(11);
    private final zzfp zze = new zzfp();
    private final zzafe zzf = new zzafe();
    private int zzh = 1;

    private final zzfp zza(zzacv zzacvVar) {
        if (this.zzm > this.zze.zzc()) {
            zzfp zzfpVar = this.zze;
            int zzc = zzfpVar.zzc();
            zzfpVar.zzI(new byte[Math.max(zzc + zzc, this.zzm)], 0);
        } else {
            this.zze.zzK(0);
        }
        this.zze.zzJ(this.zzm);
        ((zzack) zzacvVar).zzn(this.zze.zzM(), 0, this.zzm, false);
        return this.zze;
    }

    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzO(new zzadt(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacv r17, com.google.android.gms.internal.ads.zzadr r18) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafd.zzb(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzadr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzg = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        if (j10 == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        zzack zzackVar = (zzack) zzacvVar;
        zzackVar.zzm(this.zzb.zzM(), 0, 3, false);
        this.zzb.zzK(0);
        if (this.zzb.zzo() != 4607062) {
            return false;
        }
        zzackVar.zzm(this.zzb.zzM(), 0, 2, false);
        this.zzb.zzK(0);
        if ((this.zzb.zzq() & 250) != 0) {
            return false;
        }
        zzackVar.zzm(this.zzb.zzM(), 0, 4, false);
        this.zzb.zzK(0);
        int zzg = this.zzb.zzg();
        zzacvVar.zzj();
        zzack zzackVar2 = (zzack) zzacvVar;
        zzackVar2.zzl(zzg, false);
        zzackVar2.zzm(this.zzb.zzM(), 0, 4, false);
        this.zzb.zzK(0);
        return this.zzb.zzg() == 0;
    }
}
