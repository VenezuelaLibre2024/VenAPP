package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzfhf {
    private u4 zza;
    private z4 zzb;
    private String zzc;
    private n4 zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbjb zzh;
    private f5 zzi;
    private a9.a zzj;
    private a9.g zzk;
    private c1 zzl;
    private zzbpp zzn;
    private zzeqe zzq;
    private g1 zzs;
    private int zzm = 1;
    private final zzfgs zzo = new zzfgs();
    private boolean zzp = false;
    private boolean zzr = false;

    public static /* bridge */ /* synthetic */ String zzH(zzfhf zzfhfVar) {
        return zzfhfVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzJ(zzfhf zzfhfVar) {
        return zzfhfVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzK(zzfhf zzfhfVar) {
        return zzfhfVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzL(zzfhf zzfhfVar) {
        return zzfhfVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzM(zzfhf zzfhfVar) {
        return zzfhfVar.zzr;
    }

    public static /* bridge */ /* synthetic */ boolean zzN(zzfhf zzfhfVar) {
        return zzfhfVar.zze;
    }

    public static /* bridge */ /* synthetic */ g1 zzP(zzfhf zzfhfVar) {
        return zzfhfVar.zzs;
    }

    public static /* bridge */ /* synthetic */ int zza(zzfhf zzfhfVar) {
        return zzfhfVar.zzm;
    }

    public static /* bridge */ /* synthetic */ a9.a zzb(zzfhf zzfhfVar) {
        return zzfhfVar.zzj;
    }

    public static /* bridge */ /* synthetic */ a9.g zzc(zzfhf zzfhfVar) {
        return zzfhfVar.zzk;
    }

    public static /* bridge */ /* synthetic */ u4 zzd(zzfhf zzfhfVar) {
        return zzfhfVar.zza;
    }

    public static /* bridge */ /* synthetic */ z4 zzf(zzfhf zzfhfVar) {
        return zzfhfVar.zzb;
    }

    public static /* bridge */ /* synthetic */ f5 zzh(zzfhf zzfhfVar) {
        return zzfhfVar.zzi;
    }

    public static /* bridge */ /* synthetic */ c1 zzi(zzfhf zzfhfVar) {
        return zzfhfVar.zzl;
    }

    public static /* bridge */ /* synthetic */ n4 zzj(zzfhf zzfhfVar) {
        return zzfhfVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbjb zzk(zzfhf zzfhfVar) {
        return zzfhfVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbpp zzl(zzfhf zzfhfVar) {
        return zzfhfVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzeqe zzm(zzfhf zzfhfVar) {
        return zzfhfVar.zzq;
    }

    public static /* bridge */ /* synthetic */ zzfgs zzn(zzfhf zzfhfVar) {
        return zzfhfVar.zzo;
    }

    public final zzfhf zzA(zzbjb zzbjbVar) {
        this.zzh = zzbjbVar;
        return this;
    }

    public final zzfhf zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfhf zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfhf zzD(a9.g gVar) {
        this.zzk = gVar;
        if (gVar != null) {
            this.zze = gVar.zzc();
            this.zzl = gVar.u1();
        }
        return this;
    }

    public final zzfhf zzE(u4 u4Var) {
        this.zza = u4Var;
        return this;
    }

    public final zzfhf zzF(n4 n4Var) {
        this.zzd = n4Var;
        return this;
    }

    public final zzfhh zzG() {
        s.k(this.zzc, "ad unit must not be null");
        s.k(this.zzb, "ad size must not be null");
        s.k(this.zza, "ad request must not be null");
        return new zzfhh(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfhf zzQ(g1 g1Var) {
        this.zzs = g1Var;
        return this;
    }

    public final u4 zze() {
        return this.zza;
    }

    public final z4 zzg() {
        return this.zzb;
    }

    public final zzfgs zzo() {
        return this.zzo;
    }

    public final zzfhf zzp(zzfhh zzfhhVar) {
        this.zzo.zza(zzfhhVar.zzo.zza);
        this.zza = zzfhhVar.zzd;
        this.zzb = zzfhhVar.zze;
        this.zzs = zzfhhVar.zzr;
        this.zzc = zzfhhVar.zzf;
        this.zzd = zzfhhVar.zza;
        this.zzf = zzfhhVar.zzg;
        this.zzg = zzfhhVar.zzh;
        this.zzh = zzfhhVar.zzi;
        this.zzi = zzfhhVar.zzj;
        zzq(zzfhhVar.zzl);
        zzD(zzfhhVar.zzm);
        this.zzp = zzfhhVar.zzp;
        this.zzq = zzfhhVar.zzc;
        this.zzr = zzfhhVar.zzq;
        return this;
    }

    public final zzfhf zzq(a9.a aVar) {
        this.zzj = aVar;
        if (aVar != null) {
            this.zze = aVar.u1();
        }
        return this;
    }

    public final zzfhf zzr(z4 z4Var) {
        this.zzb = z4Var;
        return this;
    }

    public final zzfhf zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfhf zzt(f5 f5Var) {
        this.zzi = f5Var;
        return this;
    }

    public final zzfhf zzu(zzeqe zzeqeVar) {
        this.zzq = zzeqeVar;
        return this;
    }

    public final zzfhf zzv(zzbpp zzbppVar) {
        this.zzn = zzbppVar;
        this.zzd = new n4(false, true, false);
        return this;
    }

    public final zzfhf zzw(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzfhf zzx(boolean z10) {
        this.zzr = true;
        return this;
    }

    public final zzfhf zzy(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzfhf zzz(int i10) {
        this.zzm = i10;
        return this;
    }
}
