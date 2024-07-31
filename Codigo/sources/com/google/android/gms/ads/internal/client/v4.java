package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import x8.y;

/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f8772a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private List f8773b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f8774c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f8775d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f8776e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f8777f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private final List f8778g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f8779h = -1;

    /* renamed from: i, reason: collision with root package name */
    private String f8780i = null;

    /* renamed from: j, reason: collision with root package name */
    private final List f8781j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f8782k = 60000;

    /* renamed from: l, reason: collision with root package name */
    private final int f8783l = y.b.DEFAULT.b();

    public final u4 a() {
        Bundle bundle = this.f8776e;
        Bundle bundle2 = this.f8772a;
        Bundle bundle3 = this.f8777f;
        return new u4(8, -1L, bundle2, -1, this.f8773b, this.f8774c, this.f8775d, false, null, null, null, null, bundle, bundle3, this.f8778g, null, null, false, null, this.f8779h, this.f8780i, this.f8781j, this.f8782k, null, this.f8783l);
    }

    public final v4 b(Bundle bundle) {
        this.f8772a = bundle;
        return this;
    }

    public final v4 c(int i10) {
        this.f8782k = i10;
        return this;
    }

    public final v4 d(boolean z10) {
        this.f8774c = z10;
        return this;
    }

    public final v4 e(List list) {
        this.f8773b = list;
        return this;
    }

    public final v4 f(String str) {
        this.f8780i = str;
        return this;
    }

    public final v4 g(int i10) {
        this.f8775d = i10;
        return this;
    }

    public final v4 h(int i10) {
        this.f8779h = i10;
        return this;
    }
}
