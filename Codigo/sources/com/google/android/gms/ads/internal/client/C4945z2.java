package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzcdv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p292p9.C10122a;
import p438x8.C12387y;

/* renamed from: com.google.android.gms.ads.internal.client.z2 */
/* loaded from: classes.dex */
public final class C4945z2 {

    /* renamed from: a */
    private final String f9903a;

    /* renamed from: b */
    private final List f9904b;

    /* renamed from: c */
    private final Set f9905c;

    /* renamed from: d */
    private final Bundle f9906d;

    /* renamed from: e */
    private final Map f9907e;

    /* renamed from: f */
    private final String f9908f;

    /* renamed from: g */
    private final String f9909g;

    /* renamed from: h */
    private final int f9910h;

    /* renamed from: i */
    private final Set f9911i;

    /* renamed from: j */
    private final Bundle f9912j;

    /* renamed from: k */
    private final Set f9913k;

    /* renamed from: l */
    private final boolean f9914l;

    /* renamed from: m */
    private final String f9915m;

    /* renamed from: n */
    private final int f9916n;

    public C4945z2(C4939y2 c4939y2, C10122a c10122a) {
        String str;
        List list;
        HashSet hashSet;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i10;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z10;
        String str4;
        int i11;
        str = c4939y2.f9892g;
        this.f9903a = str;
        list = c4939y2.f9893h;
        this.f9904b = list;
        hashSet = c4939y2.f9886a;
        this.f9905c = Collections.unmodifiableSet(hashSet);
        bundle = c4939y2.f9887b;
        this.f9906d = bundle;
        hashMap = c4939y2.f9888c;
        this.f9907e = Collections.unmodifiableMap(hashMap);
        str2 = c4939y2.f9894i;
        this.f9908f = str2;
        str3 = c4939y2.f9895j;
        this.f9909g = str3;
        i10 = c4939y2.f9896k;
        this.f9910h = i10;
        hashSet2 = c4939y2.f9889d;
        this.f9911i = Collections.unmodifiableSet(hashSet2);
        bundle2 = c4939y2.f9890e;
        this.f9912j = bundle2;
        hashSet3 = c4939y2.f9891f;
        this.f9913k = Collections.unmodifiableSet(hashSet3);
        z10 = c4939y2.f9897l;
        this.f9914l = z10;
        str4 = c4939y2.f9898m;
        this.f9915m = str4;
        i11 = c4939y2.f9899n;
        this.f9916n = i11;
    }

    /* renamed from: a */
    public final int m12510a() {
        return this.f9916n;
    }

    /* renamed from: b */
    public final int m12511b() {
        return this.f9910h;
    }

    /* renamed from: c */
    public final Bundle m12512c() {
        return this.f9912j;
    }

    /* renamed from: d */
    public final Bundle m12513d(Class cls) {
        return this.f9906d.getBundle(cls.getName());
    }

    /* renamed from: e */
    public final Bundle m12514e() {
        return this.f9906d;
    }

    /* renamed from: f */
    public final C10122a m12515f() {
        return null;
    }

    /* renamed from: g */
    public final String m12516g() {
        return this.f9915m;
    }

    /* renamed from: h */
    public final String m12517h() {
        return this.f9903a;
    }

    /* renamed from: i */
    public final String m12518i() {
        return this.f9908f;
    }

    /* renamed from: j */
    public final String m12519j() {
        return this.f9909g;
    }

    /* renamed from: k */
    public final List m12520k() {
        return new ArrayList(this.f9904b);
    }

    /* renamed from: l */
    public final Set m12521l() {
        return this.f9913k;
    }

    /* renamed from: m */
    public final Set m12522m() {
        return this.f9905c;
    }

    @Deprecated
    /* renamed from: n */
    public final boolean m12523n() {
        return this.f9914l;
    }

    /* renamed from: o */
    public final boolean m12524o(Context context) {
        C12387y m12420e = C4868m3.m12412h().m12420e();
        C4930x.m12474b();
        Set set = this.f9911i;
        String zzy = zzcdv.zzy(context);
        return set.contains(zzy) || m12420e.m40038e().contains(zzy);
    }
}
