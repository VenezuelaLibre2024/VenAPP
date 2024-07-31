package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.z4;

/* loaded from: classes2.dex */
public final class zzerw implements zzexq {
    private final zzexq zza;
    private final zzfhh zzb;
    private final Context zzc;
    private final zzcdl zzd;

    public zzerw(zzetq zzetqVar, zzfhh zzfhhVar, Context context, zzcdl zzcdlVar) {
        this.zza = zzetqVar;
        this.zzb = zzfhhVar;
        this.zzc = context;
        this.zzd = zzcdlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return zzgen.zzm(this.zza.zzb(), new zzfws() { // from class: com.google.android.gms.internal.ads.zzerv
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                return zzerw.this.zzc((zzexv) obj);
            }
        }, zzcep.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzerx zzc(zzexv zzexvVar) {
        String str;
        boolean z10;
        String str2;
        float f10;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        z4 z4Var = this.zzb.zze;
        z4[] z4VarArr = z4Var.f8837r;
        if (z4VarArr != null) {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (z4 z4Var2 : z4VarArr) {
                boolean z13 = z4Var2.f8839t;
                if (!z13 && !z11) {
                    str = z4Var2.f8831a;
                    z11 = true;
                }
                if (z13) {
                    if (z12) {
                        z12 = true;
                    } else {
                        z12 = true;
                        z10 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        } else {
            str = z4Var.f8831a;
            z10 = z4Var.f8839t;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f10 = 0.0f;
            i10 = 0;
            i11 = 0;
        } else {
            zzcdl zzcdlVar = this.zzd;
            f10 = displayMetrics.density;
            i11 = displayMetrics.widthPixels;
            i10 = displayMetrics.heightPixels;
            str2 = zzcdlVar.zzi().zzm();
        }
        StringBuilder sb2 = new StringBuilder();
        z4[] z4VarArr2 = z4Var.f8837r;
        if (z4VarArr2 != null) {
            boolean z14 = false;
            for (z4 z4Var3 : z4VarArr2) {
                if (z4Var3.f8839t) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i13 = z4Var3.f8835e;
                    if (i13 == -1) {
                        i13 = f10 != 0.0f ? (int) (z4Var3.f8836f / f10) : -1;
                    }
                    sb2.append(i13);
                    sb2.append("x");
                    int i14 = z4Var3.f8832b;
                    if (i14 == -2) {
                        i14 = f10 != 0.0f ? (int) (z4Var3.f8833c / f10) : -2;
                    }
                    sb2.append(i14);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new zzerx(z4Var, str, z10, sb2.toString(), f10, i11, i10, str2, this.zzb.zzp);
    }
}
