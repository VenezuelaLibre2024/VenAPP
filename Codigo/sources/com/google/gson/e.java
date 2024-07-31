package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Excluder f12781a = Excluder.f12801r;

    /* renamed from: b, reason: collision with root package name */
    private s f12782b = s.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    private d f12783c = c.IDENTITY;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Type, f<?>> f12784d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List<v> f12785e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<v> f12786f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f12787g = false;

    /* renamed from: h, reason: collision with root package name */
    private String f12788h = Gson.f12748y;

    /* renamed from: i, reason: collision with root package name */
    private int f12789i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f12790j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12791k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12792l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12793m = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12794n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12795o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12796p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12797q = true;

    /* renamed from: r, reason: collision with root package name */
    private u f12798r = Gson.A;

    /* renamed from: s, reason: collision with root package name */
    private u f12799s = Gson.B;

    private void a(String str, int i10, int i11, List<v> list) {
        v vVar;
        v vVar2;
        boolean z10 = com.google.gson.internal.sql.a.f13000a;
        v vVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            vVar = DefaultDateTypeAdapter.b.f12831b.b(str);
            if (z10) {
                vVar3 = com.google.gson.internal.sql.a.f13002c.b(str);
                vVar2 = com.google.gson.internal.sql.a.f13001b.b(str);
            }
            vVar2 = null;
        } else {
            if (i10 == 2 || i11 == 2) {
                return;
            }
            v a10 = DefaultDateTypeAdapter.b.f12831b.a(i10, i11);
            if (z10) {
                vVar3 = com.google.gson.internal.sql.a.f13002c.a(i10, i11);
                v a11 = com.google.gson.internal.sql.a.f13001b.a(i10, i11);
                vVar = a10;
                vVar2 = a11;
            } else {
                vVar = a10;
                vVar2 = null;
            }
        }
        list.add(vVar);
        if (z10) {
            list.add(vVar3);
            list.add(vVar2);
        }
    }

    public Gson b() {
        List<v> arrayList = new ArrayList<>(this.f12785e.size() + this.f12786f.size() + 3);
        arrayList.addAll(this.f12785e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f12786f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f12788h, this.f12789i, this.f12790j, arrayList);
        return new Gson(this.f12781a, this.f12783c, this.f12784d, this.f12787g, this.f12791k, this.f12795o, this.f12793m, this.f12794n, this.f12796p, this.f12792l, this.f12797q, this.f12782b, this.f12788h, this.f12789i, this.f12790j, this.f12785e, this.f12786f, arrayList, this.f12798r, this.f12799s);
    }

    public e c(v vVar) {
        this.f12785e.add(vVar);
        return this;
    }
}
