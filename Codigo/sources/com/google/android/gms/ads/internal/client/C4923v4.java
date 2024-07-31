package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p438x8.C12387y;

/* renamed from: com.google.android.gms.ads.internal.client.v4 */
/* loaded from: classes.dex */
public final class C4923v4 {

    /* renamed from: a */
    private Bundle f9859a = new Bundle();

    /* renamed from: b */
    private List f9860b = new ArrayList();

    /* renamed from: c */
    private boolean f9861c = false;

    /* renamed from: d */
    private int f9862d = -1;

    /* renamed from: e */
    private final Bundle f9863e = new Bundle();

    /* renamed from: f */
    private final Bundle f9864f = new Bundle();

    /* renamed from: g */
    private final List f9865g = new ArrayList();

    /* renamed from: h */
    private int f9866h = -1;

    /* renamed from: i */
    private String f9867i = null;

    /* renamed from: j */
    private final List f9868j = new ArrayList();

    /* renamed from: k */
    private int f9869k = 60000;

    /* renamed from: l */
    private final int f9870l = C12387y.b.DEFAULT.m40045b();

    /* renamed from: a */
    public final C4917u4 m12461a() {
        Bundle bundle = this.f9863e;
        Bundle bundle2 = this.f9859a;
        Bundle bundle3 = this.f9864f;
        return new C4917u4(8, -1L, bundle2, -1, this.f9860b, this.f9861c, this.f9862d, false, null, null, null, null, bundle, bundle3, this.f9865g, null, null, false, null, this.f9866h, this.f9867i, this.f9868j, this.f9869k, null, this.f9870l);
    }

    /* renamed from: b */
    public final C4923v4 m12462b(Bundle bundle) {
        this.f9859a = bundle;
        return this;
    }

    /* renamed from: c */
    public final C4923v4 m12463c(int i10) {
        this.f9869k = i10;
        return this;
    }

    /* renamed from: d */
    public final C4923v4 m12464d(boolean z10) {
        this.f9861c = z10;
        return this;
    }

    /* renamed from: e */
    public final C4923v4 m12465e(List list) {
        this.f9860b = list;
        return this;
    }

    /* renamed from: f */
    public final C4923v4 m12466f(String str) {
        this.f9867i = str;
        return this;
    }

    /* renamed from: g */
    public final C4923v4 m12467g(int i10) {
        this.f9862d = i10;
        return this;
    }

    /* renamed from: h */
    public final C4923v4 m12468h(int i10) {
        this.f9866h = i10;
        return this;
    }
}
