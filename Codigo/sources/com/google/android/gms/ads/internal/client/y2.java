package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: g, reason: collision with root package name */
    private String f8805g;

    /* renamed from: i, reason: collision with root package name */
    private String f8807i;

    /* renamed from: j, reason: collision with root package name */
    private String f8808j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8810l;

    /* renamed from: m, reason: collision with root package name */
    private String f8811m;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f8799a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f8800b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f8801c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f8802d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f8803e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f8804f = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final List f8806h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f8809k = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f8812n = 60000;

    public final void a(String str) {
        this.f8807i = str;
    }

    public final void b(String str) {
        this.f8808j = str;
    }

    @Deprecated
    public final void c(boolean z10) {
        this.f8809k = z10 ? 1 : 0;
    }

    public final void r(String str, String str2) {
        this.f8803e.putString(str, str2);
    }

    public final void s(String str) {
        this.f8799a.add(str);
    }

    public final void t(Class cls, Bundle bundle) {
        this.f8800b.putBundle(cls.getName(), bundle);
    }

    public final void u(String str) {
        this.f8802d.add(str);
    }

    public final void v(String str) {
        this.f8802d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void w(String str) {
        this.f8805g = str;
    }

    public final void x(int i10) {
        this.f8812n = i10;
    }

    @Deprecated
    public final void y(boolean z10) {
        this.f8810l = z10;
    }

    public final void z(List list) {
        this.f8806h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                zzcec.zzj("neighboring content URL should not be null or empty");
            } else {
                this.f8806h.add(str);
            }
        }
    }
}
