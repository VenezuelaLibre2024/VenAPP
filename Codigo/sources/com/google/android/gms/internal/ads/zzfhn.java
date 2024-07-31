package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.z4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfhn {
    public static z4 zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfgn zzfgnVar = (zzfgn) it.next();
            if (zzfgnVar.zzc) {
                arrayList.add(x8.i.f30685p);
            } else {
                arrayList.add(new x8.i(zzfgnVar.zza, zzfgnVar.zzb));
            }
        }
        return new z4(context, (x8.i[]) arrayList.toArray(new x8.i[arrayList.size()]));
    }

    public static zzfgn zzb(z4 z4Var) {
        return z4Var.f8839t ? new zzfgn(-3, 0, true) : new zzfgn(z4Var.f8835e, z4Var.f8832b, false);
    }
}
