package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzavh extends zzavg {
    protected zzavh(Context context, String str, boolean z10) {
        super(context, str, z10);
    }

    public static zzavh zzt(String str, Context context, boolean z10) {
        zzavg.zzr(context, false);
        return new zzavh(context, str, false);
    }

    @Deprecated
    public static zzavh zzu(String str, Context context, boolean z10, int i10) {
        zzavg.zzr(context, z10);
        return new zzavh(context, str, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzavg
    public final List zzp(zzawj zzawjVar, Context context, zzasg zzasgVar, zzarz zzarzVar) {
        if (zzawjVar.zzk() == null || !((zzavg) this).zzu) {
            return super.zzp(zzawjVar, context, zzasgVar, null);
        }
        int zza = zzawjVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzawjVar, context, zzasgVar, null));
        arrayList.add(new zzaxb(zzawjVar, "8UEA9TmdE+sqV3zcsNgnFI5Sf8uIsQHU61W37Ddl8zaNqY23x/FpuoK+mm9MWruA", "qlbJd0rViXaFpU2SvrkcezPlE/VtgXulMFWFUXmIBBg=", zzasgVar, zza, 24));
        return arrayList;
    }
}
