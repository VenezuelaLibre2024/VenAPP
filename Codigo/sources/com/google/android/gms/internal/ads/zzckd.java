package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzckd implements zzbng {
    final /* synthetic */ zzckf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckd(zzckf zzckfVar) {
        this.zza = zzckfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i10;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzckf zzckfVar = this.zza;
                    i10 = zzckfVar.zzH;
                    if (i10 != parseInt) {
                        zzckfVar.zzH = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e10) {
                zzcec.zzk("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
