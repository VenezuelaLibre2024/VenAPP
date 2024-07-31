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

/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public static final y4 f8814a = new y4();

    protected y4() {
    }

    public final u4 a(Context context, z2 z2Var) {
        Context context2;
        List list;
        String str;
        String h10 = z2Var.h();
        Set m10 = z2Var.m();
        if (m10.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(m10));
            context2 = context;
        }
        boolean o10 = z2Var.o(context2);
        Bundle d10 = z2Var.d(AdMobAdapter.class);
        String i10 = z2Var.i();
        z2Var.f();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            x.b();
            str = zzcdv.zzq(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean n10 = z2Var.n();
        x8.y e10 = m3.h().e();
        return new u4(8, -1L, d10, -1, list, o10, Math.max(z2Var.b(), e10.c()), false, i10, null, null, h10, z2Var.e(), z2Var.c(), Collections.unmodifiableList(new ArrayList(z2Var.l())), z2Var.j(), str, n10, null, e10.d(), (String) Collections.max(Arrays.asList(null, e10.a()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.x4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = x8.y.f30714f;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), z2Var.k(), z2Var.a(), z2Var.g(), e10.b().b());
    }
}
