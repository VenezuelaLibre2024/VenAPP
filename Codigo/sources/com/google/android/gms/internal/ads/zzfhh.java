package com.google.android.gms.internal.ads;

import a9.e;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.a1;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.k4;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.util.j2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfhh {
    public final n4 zza;
    public final zzbpp zzb;
    public final zzeqe zzc;
    public final u4 zzd;
    public final z4 zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbjb zzi;
    public final f5 zzj;
    public final int zzk;
    public final a9.a zzl;
    public final a9.g zzm;
    public final c1 zzn;
    public final zzfgu zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final g1 zzr;

    public /* synthetic */ zzfhh(zzfhf zzfhfVar, zzfhg zzfhgVar) {
        z4 z4Var;
        String str;
        g1 g1Var;
        u4 u4Var;
        u4 u4Var2;
        u4 u4Var3;
        u4 u4Var4;
        u4 u4Var5;
        u4 u4Var6;
        u4 u4Var7;
        u4 u4Var8;
        u4 u4Var9;
        u4 u4Var10;
        u4 u4Var11;
        u4 u4Var12;
        u4 u4Var13;
        u4 u4Var14;
        u4 u4Var15;
        u4 u4Var16;
        u4 u4Var17;
        u4 u4Var18;
        u4 u4Var19;
        u4 u4Var20;
        u4 u4Var21;
        u4 u4Var22;
        u4 u4Var23;
        u4 u4Var24;
        u4 u4Var25;
        n4 n4Var;
        zzbjb zzbjbVar;
        n4 n4Var2;
        zzbjb zzbjbVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        zzbjb zzbjbVar3;
        zzbjb zzbjbVar4;
        f5 f5Var;
        int i10;
        a9.a aVar;
        a9.g gVar;
        c1 c1Var;
        zzbpp zzbppVar;
        zzfgs zzfgsVar;
        boolean z10;
        zzeqe zzeqeVar;
        boolean z11;
        boolean z12;
        z4Var = zzfhfVar.zzb;
        this.zze = z4Var;
        str = zzfhfVar.zzc;
        this.zzf = str;
        g1Var = zzfhfVar.zzs;
        this.zzr = g1Var;
        u4Var = zzfhfVar.zza;
        int i11 = u4Var.f8749a;
        u4Var2 = zzfhfVar.zza;
        long j10 = u4Var2.f8750b;
        u4Var3 = zzfhfVar.zza;
        Bundle bundle = u4Var3.f8751c;
        u4Var4 = zzfhfVar.zza;
        int i12 = u4Var4.f8752d;
        u4Var5 = zzfhfVar.zza;
        List list = u4Var5.f8753e;
        u4Var6 = zzfhfVar.zza;
        boolean z13 = u4Var6.f8754f;
        u4Var7 = zzfhfVar.zza;
        int i13 = u4Var7.f8755r;
        u4Var8 = zzfhfVar.zza;
        boolean z14 = true;
        if (!u4Var8.f8756s) {
            z12 = zzfhfVar.zze;
            if (!z12) {
                z14 = false;
            }
        }
        u4Var9 = zzfhfVar.zza;
        String str2 = u4Var9.f8757t;
        u4Var10 = zzfhfVar.zza;
        k4 k4Var = u4Var10.f8758u;
        u4Var11 = zzfhfVar.zza;
        Location location = u4Var11.f8759v;
        u4Var12 = zzfhfVar.zza;
        String str3 = u4Var12.f8760w;
        u4Var13 = zzfhfVar.zza;
        Bundle bundle2 = u4Var13.f8761x;
        u4Var14 = zzfhfVar.zza;
        Bundle bundle3 = u4Var14.f8762y;
        u4Var15 = zzfhfVar.zza;
        List list2 = u4Var15.f8763z;
        u4Var16 = zzfhfVar.zza;
        String str4 = u4Var16.A;
        u4Var17 = zzfhfVar.zza;
        String str5 = u4Var17.B;
        u4Var18 = zzfhfVar.zza;
        boolean z15 = u4Var18.C;
        u4Var19 = zzfhfVar.zza;
        a1 a1Var = u4Var19.D;
        u4Var20 = zzfhfVar.zza;
        int i14 = u4Var20.E;
        u4Var21 = zzfhfVar.zza;
        String str6 = u4Var21.F;
        u4Var22 = zzfhfVar.zza;
        List list3 = u4Var22.G;
        u4Var23 = zzfhfVar.zza;
        int A = j2.A(u4Var23.H);
        u4Var24 = zzfhfVar.zza;
        String str7 = u4Var24.I;
        u4Var25 = zzfhfVar.zza;
        this.zzd = new u4(i11, j10, bundle, i12, list, z13, i13, z14, str2, k4Var, location, str3, bundle2, bundle3, list2, str4, str5, z15, a1Var, i14, str6, list3, A, str7, u4Var25.J);
        n4Var = zzfhfVar.zzd;
        if (n4Var != null) {
            n4Var2 = zzfhfVar.zzd;
        } else {
            zzbjbVar = zzfhfVar.zzh;
            if (zzbjbVar != null) {
                zzbjbVar2 = zzfhfVar.zzh;
                n4Var2 = zzbjbVar2.zzf;
            } else {
                n4Var2 = null;
            }
        }
        this.zza = n4Var2;
        arrayList = zzfhfVar.zzf;
        this.zzg = arrayList;
        arrayList2 = zzfhfVar.zzg;
        this.zzh = arrayList2;
        arrayList3 = zzfhfVar.zzf;
        if (arrayList3 == null) {
            zzbjbVar4 = null;
        } else {
            zzbjbVar3 = zzfhfVar.zzh;
            zzbjbVar4 = zzbjbVar3 == null ? new zzbjb(new e.a().a()) : zzfhfVar.zzh;
        }
        this.zzi = zzbjbVar4;
        f5Var = zzfhfVar.zzi;
        this.zzj = f5Var;
        i10 = zzfhfVar.zzm;
        this.zzk = i10;
        aVar = zzfhfVar.zzj;
        this.zzl = aVar;
        gVar = zzfhfVar.zzk;
        this.zzm = gVar;
        c1Var = zzfhfVar.zzl;
        this.zzn = c1Var;
        zzbppVar = zzfhfVar.zzn;
        this.zzb = zzbppVar;
        zzfgsVar = zzfhfVar.zzo;
        this.zzo = new zzfgu(zzfgsVar, null);
        z10 = zzfhfVar.zzp;
        this.zzp = z10;
        zzeqeVar = zzfhfVar.zzq;
        this.zzc = zzeqeVar;
        z11 = zzfhfVar.zzr;
        this.zzq = z11;
    }

    public final zzbld zza() {
        a9.g gVar = this.zzm;
        if (gVar == null && this.zzl == null) {
            return null;
        }
        return gVar != null ? gVar.v1() : this.zzl.v1();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) a0.c().zza(zzbgc.zzcW));
    }
}
