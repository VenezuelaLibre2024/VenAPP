package oc;

import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzafr;
import com.google.android.gms.internal.p002firebaseauthapi.zzagr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 {
    public static com.google.firebase.auth.j0 a(zzafr zzafrVar) {
        if (zzafrVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafrVar.zze())) {
            return new com.google.firebase.auth.t0(zzafrVar.zzd(), zzafrVar.zzc(), zzafrVar.zza(), com.google.android.gms.common.internal.s.f(zzafrVar.zze()));
        }
        if (zzafrVar.zzb() != null) {
            return new com.google.firebase.auth.y0(zzafrVar.zzd(), zzafrVar.zzc(), zzafrVar.zza(), (zzagr) com.google.android.gms.common.internal.s.k(zzafrVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List<com.google.firebase.auth.j0> b(List<zzafr> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzafr> it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.j0 a10 = a(it.next());
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }
}
