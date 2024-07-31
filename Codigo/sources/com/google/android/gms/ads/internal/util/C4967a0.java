package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4930x;
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

/* renamed from: com.google.android.gms.ads.internal.util.a0 */
/* loaded from: classes.dex */
public final class C4967a0 extends zzaqp {

    /* renamed from: a */
    private final Context f10039a;

    private C4967a0(Context context, zzaqo zzaqoVar) {
        super(zzaqoVar);
        this.f10039a = context;
    }

    /* renamed from: a */
    public static zzaqd m12591a(Context context) {
        zzaqd zzaqdVar = new zzaqd(new zzaqw(new File(context.getCacheDir(), "admob_volley"), 20971520), new C4967a0(context, new zzara()), 4);
        zzaqdVar.zzd();
        return zzaqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqp, com.google.android.gms.internal.ads.zzapt
    public final zzapw zza(zzaqa zzaqaVar) {
        if (zzaqaVar.zza() == 0) {
            if (Pattern.matches((String) C4784a0.m12365c().zza(zzbgc.zzes), zzaqaVar.zzk())) {
                Context context = this.f10039a;
                C4930x.m12474b();
                if (zzcdv.zzs(context, 13400000)) {
                    zzapw zza = new zzbpc(this.f10039a).zza(zzaqaVar);
                    if (zza != null) {
                        C5047u1.m12726a("Got gmscore asset response: ".concat(String.valueOf(zzaqaVar.zzk())));
                        return zza;
                    }
                    C5047u1.m12726a("Failed to get gmscore asset response: ".concat(String.valueOf(zzaqaVar.zzk())));
                }
            }
        }
        return super.zza(zzaqaVar);
    }
}
