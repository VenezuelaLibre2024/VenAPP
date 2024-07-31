package com.google.android.gms.internal.p498firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.C6059d2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzafc {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzafv zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private C6059d2 zzl;
    private List<zzafr> zzm;
    private zzap<zzafq> zzn;

    public zzafc() {
        this.zzf = new zzafv();
        this.zzn = zzap.zzh();
    }

    public zzafc(String str, String str2, boolean z10, String str3, String str4, zzafv zzafvVar, String str5, String str6, long j10, long j11, boolean z11, C6059d2 c6059d2, List<zzafr> list, zzap<zzafq> zzapVar) {
        zzafv zzafvVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        if (zzafvVar == null) {
            zzafvVar2 = new zzafv();
        } else {
            List<zzafs> zza = zzafvVar.zza();
            zzafv zzafvVar3 = new zzafv();
            if (zza != null) {
                zzafvVar3.zza().addAll(zza);
            }
            zzafvVar2 = zzafvVar3;
        }
        this.zzf = zzafvVar2;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j10;
        this.zzj = j11;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list == null ? new ArrayList<>() : list;
        this.zzn = zzapVar;
    }

    public final long zza() {
        return this.zzi;
    }

    public final zzafc zza(C6059d2 c6059d2) {
        this.zzl = c6059d2;
        return this;
    }

    public final zzafc zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzafc zza(List<zzafs> list) {
        C5276s.m13324j(list);
        zzafv zzafvVar = new zzafv();
        this.zzf = zzafvVar;
        zzafvVar.zza().addAll(list);
        return this;
    }

    public final zzafc zza(boolean z10) {
        this.zzk = z10;
        return this;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final zzafc zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzafc zzc(String str) {
        C5276s.m13320f(str);
        this.zzg = str;
        return this;
    }

    public final zzafc zzd(String str) {
        this.zze = str;
        return this;
    }

    public final zzap<zzafq> zzd() {
        return this.zzn;
    }

    public final C6059d2 zze() {
        return this.zzl;
    }

    public final zzafv zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final List<zzafr> zzk() {
        return this.zzm;
    }

    public final List<zzafs> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzk;
    }
}
