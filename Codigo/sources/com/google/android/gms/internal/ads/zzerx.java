package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzerx implements zzexp {
    public final z4 zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzerx(z4 z4Var, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        s.k(z4Var, "the adSize must not be null");
        this.zza = z4Var;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = z11;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfhv.zzf(bundle, "smart_w", "full", this.zza.f8835e == -1);
        zzfhv.zzf(bundle, "smart_h", "auto", this.zza.f8832b == -2);
        zzfhv.zzg(bundle, "ene", true, this.zza.f8840u);
        zzfhv.zzf(bundle, "rafmt", "102", this.zza.f8843x);
        zzfhv.zzf(bundle, "rafmt", "103", this.zza.f8844y);
        zzfhv.zzf(bundle, "rafmt", "105", this.zza.f8845z);
        zzfhv.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfhv.zzg(bundle, "interscroller_slot", true, this.zza.f8845z);
        zzfhv.zzc(bundle, "format", this.zzb);
        zzfhv.zzf(bundle, "fluid", "height", this.zzc);
        zzfhv.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzfhv.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        z4[] z4VarArr = this.zza.f8837r;
        if (z4VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.f8832b);
            bundle2.putInt("width", this.zza.f8835e);
            bundle2.putBoolean("is_fluid_height", this.zza.f8839t);
            arrayList.add(bundle2);
        } else {
            for (z4 z4Var : z4VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", z4Var.f8839t);
                bundle3.putInt("height", z4Var.f8832b);
                bundle3.putInt("width", z4Var.f8835e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
