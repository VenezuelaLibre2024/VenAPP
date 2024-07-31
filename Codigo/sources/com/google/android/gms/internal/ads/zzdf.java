package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class zzdf {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzgaa zzh;
    private final zzgaa zzi;
    private final int zzj;
    private final int zzk;
    private final zzgaa zzl;
    private final zzde zzm;
    private zzgaa zzn;
    private int zzo;
    private final HashMap zzp;
    private final HashSet zzq;

    @Deprecated
    public zzdf() {
        this.zza = a.e.API_PRIORITY_OTHER;
        this.zzb = a.e.API_PRIORITY_OTHER;
        this.zzc = a.e.API_PRIORITY_OTHER;
        this.zzd = a.e.API_PRIORITY_OTHER;
        this.zze = a.e.API_PRIORITY_OTHER;
        this.zzf = a.e.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = zzgaa.zzl();
        this.zzi = zzgaa.zzl();
        this.zzj = a.e.API_PRIORITY_OTHER;
        this.zzk = a.e.API_PRIORITY_OTHER;
        this.zzl = zzgaa.zzl();
        this.zzm = zzde.zza;
        this.zzn = zzgaa.zzl();
        this.zzo = 0;
        this.zzp = new HashMap();
        this.zzq = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdf(zzdg zzdgVar) {
        this.zza = a.e.API_PRIORITY_OTHER;
        this.zzb = a.e.API_PRIORITY_OTHER;
        this.zzc = a.e.API_PRIORITY_OTHER;
        this.zzd = a.e.API_PRIORITY_OTHER;
        this.zze = zzdgVar.zzl;
        this.zzf = zzdgVar.zzm;
        this.zzg = zzdgVar.zzn;
        this.zzh = zzdgVar.zzo;
        this.zzi = zzdgVar.zzq;
        this.zzj = a.e.API_PRIORITY_OTHER;
        this.zzk = a.e.API_PRIORITY_OTHER;
        this.zzl = zzdgVar.zzu;
        this.zzm = zzdgVar.zzv;
        this.zzn = zzdgVar.zzw;
        this.zzo = zzdgVar.zzx;
        this.zzq = new HashSet(zzdgVar.zzE);
        this.zzp = new HashMap(zzdgVar.zzD);
    }

    public final zzdf zze(Context context) {
        CaptioningManager captioningManager;
        if ((zzfy.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzo = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzn = zzgaa.zzm(locale.toLanguageTag());
            }
        }
        return this;
    }

    public zzdf zzf(int i10, int i11, boolean z10) {
        this.zze = i10;
        this.zzf = i11;
        this.zzg = true;
        return this;
    }
}
