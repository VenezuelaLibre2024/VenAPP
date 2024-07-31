package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzami implements zzakr {
    private final zzfp zza = new zzfp();
    private final zzaly zzb = new zzaly();

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzep zzepVar) {
        this.zza.zzI(bArr, i11 + i10);
        this.zza.zzK(i10);
        ArrayList arrayList = new ArrayList();
        try {
            zzfp zzfpVar = this.zza;
            int zzd = zzfpVar.zzd();
            Charset charset = zzfwq.zzc;
            String zzy = zzfpVar.zzy(charset);
            if (zzy == null || !zzy.startsWith("WEBVTT")) {
                zzfpVar.zzK(zzd);
                throw zzcc.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzfpVar.zzy(charset))), null);
            }
            do {
            } while (!TextUtils.isEmpty(this.zza.zzy(zzfwq.zzc)));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzfp zzfpVar2 = this.zza;
                char c10 = 65535;
                int i12 = 0;
                while (c10 == 65535) {
                    i12 = zzfpVar2.zzd();
                    String zzy2 = zzfpVar2.zzy(zzfwq.zzc);
                    c10 = zzy2 == null ? (char) 0 : "STYLE".equals(zzy2) ? (char) 2 : zzy2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzfpVar2.zzK(i12);
                if (c10 == 0) {
                    zzakl.zza(new zzaml(arrayList2), zzakqVar, zzepVar);
                    return;
                }
                if (c10 == 1) {
                    do {
                    } while (!TextUtils.isEmpty(this.zza.zzy(zzfwq.zzc)));
                } else if (c10 != 2) {
                    zzama zzc = zzamh.zzc(this.zza, arrayList);
                    if (zzc != null) {
                        arrayList2.add(zzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.zza.zzy(zzfwq.zzc);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                }
            }
        } catch (zzcc e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
