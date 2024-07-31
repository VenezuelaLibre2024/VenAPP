package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaxn extends zzaxx {
    private List zzi;
    private final Context zzj;

    public zzaxn(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, Context context) {
        super(zzawjVar, "0gWjYXznHW/Eye6gdpKNKYjX/XLpx1vdgxUIuTN4hh6FwE+EupqjErYFsUwwKenZ", "tk45mDotIpTZidmNYxxiIBsjVftw/e0h3Unlwpf2Me4=", zzasgVar, i10, 31);
        this.zzi = null;
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        this.zze.zzW(-1L);
        this.zze.zzS(-1L);
        Context context = this.zzj;
        if (context == null) {
            context = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, context);
        }
        List list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzW(((Long) this.zzi.get(0)).longValue());
            this.zze.zzS(((Long) this.zzi.get(1)).longValue());
        }
    }
}
