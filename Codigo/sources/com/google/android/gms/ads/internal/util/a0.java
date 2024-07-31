package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzaqp;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzcdv;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a0 extends zzaqp {

    /* renamed from: a */
    private final Context f8940a;

    private a0(Context context, zzaqo zzaqoVar) {
        super(zzaqoVar);
        this.f8940a = context;
    }

    public static zzaqd a(Context context) {
        zzaqd zzaqdVar = new zzaqd(new zzaqw(new File(context.getCacheDir(), "admob_volley"), 20971520), new a0(context, new zzara()), 4);
        zzaqdVar.zzd();
        return zzaqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqp, com.google.android.gms.internal.ads.zzapt
    public final zzapw zza(zzaqa zzaqaVar) {
        if (zzaqaVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzes), zzaqaVar.zzk())) {
                Context context = this.f8940a;
                com.google.android.gms.ads.internal.client.x.b();
                if (zzcdv.zzs(context, 13400000)) {
                    zzapw zza = new zzbpc(this.f8940a).zza(zzaqaVar);
                    if (zza != null) {
                        u1.a("Got gmscore asset response: ".concat(String.valueOf(zzaqaVar.zzk())));
                        return zza;
                    }
                    u1.a("Failed to get gmscore asset response: ".concat(String.valueOf(zzaqaVar.zzk())));
                }
            }
        }
        return super.zza(zzaqaVar);
    }
}
