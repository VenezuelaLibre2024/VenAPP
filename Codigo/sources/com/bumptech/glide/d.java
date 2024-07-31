package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import c4.f;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k */
    static final l<?, ?> f7387k = new a();

    /* renamed from: a */
    private final k3.b f7388a;

    /* renamed from: b */
    private final f.b<h> f7389b;

    /* renamed from: c */
    private final z3.b f7390c;

    /* renamed from: d */
    private final b.a f7391d;

    /* renamed from: e */
    private final List<y3.h<Object>> f7392e;

    /* renamed from: f */
    private final Map<Class<?>, l<?, ?>> f7393f;

    /* renamed from: g */
    private final j3.k f7394g;

    /* renamed from: h */
    private final e f7395h;

    /* renamed from: i */
    private final int f7396i;

    /* renamed from: j */
    private y3.i f7397j;

    public d(Context context, k3.b bVar, f.b<h> bVar2, z3.b bVar3, b.a aVar, Map<Class<?>, l<?, ?>> map, List<y3.h<Object>> list, j3.k kVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f7388a = bVar;
        this.f7390c = bVar3;
        this.f7391d = aVar;
        this.f7392e = list;
        this.f7393f = map;
        this.f7394g = kVar;
        this.f7395h = eVar;
        this.f7396i = i10;
        this.f7389b = c4.f.a(bVar2);
    }

    public k3.b a() {
        return this.f7388a;
    }

    public List<y3.h<Object>> b() {
        return this.f7392e;
    }

    public synchronized y3.i c() {
        if (this.f7397j == null) {
            this.f7397j = this.f7391d.build().M();
        }
        return this.f7397j;
    }

    public <T> l<?, T> d(Class<T> cls) {
        l<?, T> lVar = (l) this.f7393f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f7393f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) f7387k : lVar;
    }

    public j3.k e() {
        return this.f7394g;
    }

    public e f() {
        return this.f7395h;
    }

    public int g() {
        return this.f7396i;
    }

    public h h() {
        return this.f7389b.get();
    }
}
