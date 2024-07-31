package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzare extends zzaqa {
    private final Object zza;
    private final zzaqf zzb;

    public zzare(int i10, String str, zzaqf zzaqfVar, zzaqe zzaqeVar) {
        super(i10, str, zzaqeVar);
        this.zza = new Object();
        this.zzb = zzaqfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqa
    public final zzaqg zzh(zzapw zzapwVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapwVar.zzb;
            Map map = zzapwVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i10].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapwVar.zzb);
        }
        return zzaqg.zzb(str, zzaqx.zzb(zzapwVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzaqf zzaqfVar;
        synchronized (this.zza) {
            zzaqfVar = this.zzb;
        }
        zzaqfVar.zza(str);
    }
}
