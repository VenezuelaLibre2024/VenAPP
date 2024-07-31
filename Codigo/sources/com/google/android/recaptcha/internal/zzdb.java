package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import dk.r;
import dk.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import xk.p;

/* loaded from: classes2.dex */
public final class zzdb {
    public static final zzdb zza = new zzdb();
    private static final List zzb;

    static {
        List l10;
        l10 = r.l("www.recaptcha.net", "www.gstatic.com/recaptcha");
        zzb = zzc(l10);
    }

    private zzdb() {
    }

    public static final boolean zza(Uri uri) {
        return !TextUtils.isEmpty(uri.toString()) && n.a("https", uri.getScheme()) && !TextUtils.isEmpty(uri.getHost()) && zzb(uri.toString());
    }

    private static final boolean zzb(String str) {
        boolean E;
        List list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E = p.E(str, (String) it.next(), false, 2, null);
            if (E) {
                return true;
            }
        }
        return false;
    }

    private static final List zzc(List list) {
        int r10;
        r10 = s.r(list, 10);
        ArrayList arrayList = new ArrayList(r10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}
