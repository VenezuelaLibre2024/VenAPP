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

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a */
    private final String f8816a;

    /* renamed from: b */
    private final List f8817b;

    /* renamed from: c */
    private final Set f8818c;

    /* renamed from: d */
    private final Bundle f8819d;

    /* renamed from: e */
    private final Map f8820e;

    /* renamed from: f */
    private final String f8821f;

    /* renamed from: g */
    private final String f8822g;

    /* renamed from: h */
    private final int f8823h;

    /* renamed from: i */
    private final Set f8824i;

    /* renamed from: j */
    private final Bundle f8825j;

    /* renamed from: k */
    private final Set f8826k;

    /* renamed from: l */
    private final boolean f8827l;

    /* renamed from: m */
    private final String f8828m;

    /* renamed from: n */
    private final int f8829n;

    public z2(y2 y2Var, p9.a aVar) {
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
        str = y2Var.f8805g;
        this.f8816a = str;
        list = y2Var.f8806h;
        this.f8817b = list;
        hashSet = y2Var.f8799a;
        this.f8818c = Collections.unmodifiableSet(hashSet);
        bundle = y2Var.f8800b;
        this.f8819d = bundle;
        hashMap = y2Var.f8801c;
        this.f8820e = Collections.unmodifiableMap(hashMap);
        str2 = y2Var.f8807i;
        this.f8821f = str2;
        str3 = y2Var.f8808j;
        this.f8822g = str3;
        i10 = y2Var.f8809k;
        this.f8823h = i10;
        hashSet2 = y2Var.f8802d;
        this.f8824i = Collections.unmodifiableSet(hashSet2);
        bundle2 = y2Var.f8803e;
        this.f8825j = bundle2;
        hashSet3 = y2Var.f8804f;
        this.f8826k = Collections.unmodifiableSet(hashSet3);
        z10 = y2Var.f8810l;
        this.f8827l = z10;
        str4 = y2Var.f8811m;
        this.f8828m = str4;
        i11 = y2Var.f8812n;
        this.f8829n = i11;
    }

    public final int a() {
        return this.f8829n;
    }

    public final int b() {
        return this.f8823h;
    }

    public final Bundle c() {
        return this.f8825j;
    }

    public final Bundle d(Class cls) {
        return this.f8819d.getBundle(cls.getName());
    }

    public final Bundle e() {
        return this.f8819d;
    }

    public final p9.a f() {
        return null;
    }

    public final String g() {
        return this.f8828m;
    }

    public final String h() {
        return this.f8816a;
    }

    public final String i() {
        return this.f8821f;
    }

    public final String j() {
        return this.f8822g;
    }

    public final List k() {
        return new ArrayList(this.f8817b);
    }

    public final Set l() {
        return this.f8826k;
    }

    public final Set m() {
        return this.f8818c;
    }

    @Deprecated
    public final boolean n() {
        return this.f8827l;
    }

    public final boolean o(Context context) {
        x8.y e10 = m3.h().e();
        x.b();
        Set set = this.f8824i;
        String zzy = zzcdv.zzy(context);
        return set.contains(zzy) || e10.e().contains(zzy);
    }
}
