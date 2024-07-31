package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import java.util.List;
import java.util.Map;
import p036c4.C1865f;
import p171j3.C8964k;
import p193k3.InterfaceC9139b;
import p456y3.C12594i;
import p456y3.InterfaceC12593h;
import p478z3.C12796b;

/* renamed from: com.bumptech.glide.d */
/* loaded from: classes.dex */
public class C2118d extends ContextWrapper {

    /* renamed from: k */
    static final AbstractC2126l<?, ?> f8339k = new C2115a();

    /* renamed from: a */
    private final InterfaceC9139b f8340a;

    /* renamed from: b */
    private final C1865f.b<C2122h> f8341b;

    /* renamed from: c */
    private final C12796b f8342c;

    /* renamed from: d */
    private final ComponentCallbacks2C2116b.a f8343d;

    /* renamed from: e */
    private final List<InterfaceC12593h<Object>> f8344e;

    /* renamed from: f */
    private final Map<Class<?>, AbstractC2126l<?, ?>> f8345f;

    /* renamed from: g */
    private final C8964k f8346g;

    /* renamed from: h */
    private final C2119e f8347h;

    /* renamed from: i */
    private final int f8348i;

    /* renamed from: j */
    private C12594i f8349j;

    public C2118d(Context context, InterfaceC9139b interfaceC9139b, C1865f.b<C2122h> bVar, C12796b c12796b, ComponentCallbacks2C2116b.a aVar, Map<Class<?>, AbstractC2126l<?, ?>> map, List<InterfaceC12593h<Object>> list, C8964k c8964k, C2119e c2119e, int i10) {
        super(context.getApplicationContext());
        this.f8340a = interfaceC9139b;
        this.f8342c = c12796b;
        this.f8343d = aVar;
        this.f8344e = list;
        this.f8345f = map;
        this.f8346g = c8964k;
        this.f8347h = c2119e;
        this.f8348i = i10;
        this.f8341b = C1865f.m9932a(bVar);
    }

    /* renamed from: a */
    public InterfaceC9139b m10663a() {
        return this.f8340a;
    }

    /* renamed from: b */
    public List<InterfaceC12593h<Object>> m10664b() {
        return this.f8344e;
    }

    /* renamed from: c */
    public synchronized C12594i m10665c() {
        if (this.f8349j == null) {
            this.f8349j = this.f8343d.build().m41342M();
        }
        return this.f8349j;
    }

    /* renamed from: d */
    public <T> AbstractC2126l<?, T> m10666d(Class<T> cls) {
        AbstractC2126l<?, T> abstractC2126l = (AbstractC2126l) this.f8345f.get(cls);
        if (abstractC2126l == null) {
            for (Map.Entry<Class<?>, AbstractC2126l<?, ?>> entry : this.f8345f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC2126l = (AbstractC2126l) entry.getValue();
                }
            }
        }
        return abstractC2126l == null ? (AbstractC2126l<?, T>) f8339k : abstractC2126l;
    }

    /* renamed from: e */
    public C8964k m10667e() {
        return this.f8346g;
    }

    /* renamed from: f */
    public C2119e m10668f() {
        return this.f8347h;
    }

    /* renamed from: g */
    public int m10669g() {
        return this.f8348i;
    }

    /* renamed from: h */
    public C2122h m10670h() {
        return this.f8341b.get();
    }
}
