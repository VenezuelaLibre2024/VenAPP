package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzcdv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import p438x8.C12387y;

/* renamed from: com.google.android.gms.ads.internal.client.y4 */
/* loaded from: classes.dex */
public final class C4941y4 {

    /* renamed from: a */
    public static final C4941y4 f9901a = new C4941y4();

    protected C4941y4() {
    }

    /* renamed from: a */
    public final C4917u4 m12509a(Context context, C4945z2 c4945z2) {
        Context context2;
        List list;
        String str;
        String m12517h = c4945z2.m12517h();
        Set m12522m = c4945z2.m12522m();
        if (m12522m.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(m12522m));
            context2 = context;
        }
        boolean m12524o = c4945z2.m12524o(context2);
        Bundle m12513d = c4945z2.m12513d(AdMobAdapter.class);
        String m12518i = c4945z2.m12518i();
        c4945z2.m12515f();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C4930x.m12474b();
            str = zzcdv.zzq(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean m12523n = c4945z2.m12523n();
        C12387y m12420e = C4868m3.m12412h().m12420e();
        return new C4917u4(8, -1L, m12513d, -1, list, m12524o, Math.max(c4945z2.m12511b(), m12420e.m40036c()), false, m12518i, null, null, m12517h, c4945z2.m12514e(), c4945z2.m12512c(), Collections.unmodifiableList(new ArrayList(c4945z2.m12521l())), c4945z2.m12519j(), str, m12523n, null, m12420e.m40037d(), (String) Collections.max(Arrays.asList(null, m12420e.m40034a()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.x4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = C12387y.f33234f;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), c4945z2.m12520k(), c4945z2.m12510a(), c4945z2.m12516g(), m12420e.m40035b().m40045b());
    }
}
