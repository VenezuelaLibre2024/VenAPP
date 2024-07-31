package com.google.android.recaptcha.internal;

import dk.m;
import dk.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class zzcd implements zzby {
    public static final zzcd zza = new zzcd();

    private zzcd() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        List q10;
        int r10;
        if (objArr.length < 2) {
            throw new zzt(4, 3, null);
        }
        Class<?> cls = objArr[0];
        if (true != (cls instanceof Object)) {
            cls = null;
        }
        if (cls == null) {
            throw new zzt(4, 5, null);
        }
        Class<?> cls2 = cls instanceof Class ? cls : cls.getClass();
        Object obj = objArr[1];
        if (true != (obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        String zza2 = zzbx.zza(this, str, zzblVar.zza());
        if (n.a(zza2, "forName")) {
            throw new zzt(6, 48, null);
        }
        q10 = m.q(objArr, 2);
        r10 = s.r(q10, 10);
        ArrayList arrayList = new ArrayList(r10);
        Iterator it = q10.iterator();
        while (it.hasNext()) {
            arrayList.add(zzbk.zza(it.next()));
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            zzblVar.zzc().zzf(i10, cls2.getMethod(zza2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)));
        } catch (Exception e10) {
            throw new zzt(6, 13, e10);
        }
    }
}
