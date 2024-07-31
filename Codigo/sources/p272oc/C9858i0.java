package p272oc;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzafr;
import com.google.android.gms.internal.p498firebaseauthapi.zzagr;
import com.google.firebase.auth.AbstractC6084j0;
import com.google.firebase.auth.C6124t0;
import com.google.firebase.auth.C6143y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: oc.i0 */
/* loaded from: classes.dex */
public final class C9858i0 {
    /* renamed from: a */
    public static AbstractC6084j0 m29541a(zzafr zzafrVar) {
        if (zzafrVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafrVar.zze())) {
            return new C6124t0(zzafrVar.zzd(), zzafrVar.zzc(), zzafrVar.zza(), C5276s.m13320f(zzafrVar.zze()));
        }
        if (zzafrVar.zzb() != null) {
            return new C6143y0(zzafrVar.zzd(), zzafrVar.zzc(), zzafrVar.zza(), (zzagr) C5276s.m13325k(zzafrVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    /* renamed from: b */
    public static List<AbstractC6084j0> m29542b(List<zzafr> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzafr> it = list.iterator();
        while (it.hasNext()) {
            AbstractC6084j0 m29541a = m29541a(it.next());
            if (m29541a != null) {
                arrayList.add(m29541a);
            }
        }
        return arrayList;
    }
}
