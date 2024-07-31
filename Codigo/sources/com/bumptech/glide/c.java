package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.manager.q;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l3.a;
import l3.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c */
    private j3.k f7371c;

    /* renamed from: d */
    private k3.d f7372d;

    /* renamed from: e */
    private k3.b f7373e;

    /* renamed from: f */
    private l3.h f7374f;

    /* renamed from: g */
    private m3.a f7375g;

    /* renamed from: h */
    private m3.a f7376h;

    /* renamed from: i */
    private a.InterfaceC0327a f7377i;

    /* renamed from: j */
    private l3.i f7378j;

    /* renamed from: k */
    private com.bumptech.glide.manager.d f7379k;

    /* renamed from: n */
    private q.b f7382n;

    /* renamed from: o */
    private m3.a f7383o;

    /* renamed from: p */
    private boolean f7384p;

    /* renamed from: q */
    private List<y3.h<Object>> f7385q;

    /* renamed from: a */
    private final Map<Class<?>, l<?, ?>> f7369a = new androidx.collection.a();

    /* renamed from: b */
    private final e.a f7370b = new e.a();

    /* renamed from: l */
    private int f7380l = 4;

    /* renamed from: m */
    private b.a f7381m = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public y3.i build() {
            return new y3.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {
        b() {
        }
    }

    /* renamed from: com.bumptech.glide.c$c */
    /* loaded from: classes.dex */
    public static final class C0128c {
    }

    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }
    }

    public com.bumptech.glide.b a(Context context, List<w3.b> list, w3.a aVar) {
        if (this.f7375g == null) {
            this.f7375g = m3.a.h();
        }
        if (this.f7376h == null) {
            this.f7376h = m3.a.f();
        }
        if (this.f7383o == null) {
            this.f7383o = m3.a.d();
        }
        if (this.f7378j == null) {
            this.f7378j = new i.a(context).a();
        }
        if (this.f7379k == null) {
            this.f7379k = new com.bumptech.glide.manager.f();
        }
        if (this.f7372d == null) {
            int b10 = this.f7378j.b();
            if (b10 > 0) {
                this.f7372d = new k3.k(b10);
            } else {
                this.f7372d = new k3.e();
            }
        }
        if (this.f7373e == null) {
            this.f7373e = new k3.i(this.f7378j.a());
        }
        if (this.f7374f == null) {
            this.f7374f = new l3.g(this.f7378j.d());
        }
        if (this.f7377i == null) {
            this.f7377i = new l3.f(context);
        }
        if (this.f7371c == null) {
            this.f7371c = new j3.k(this.f7374f, this.f7377i, this.f7376h, this.f7375g, m3.a.i(), this.f7383o, this.f7384p);
        }
        List<y3.h<Object>> list2 = this.f7385q;
        this.f7385q = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        e b11 = this.f7370b.b();
        return new com.bumptech.glide.b(context, this.f7371c, this.f7374f, this.f7372d, this.f7373e, new q(this.f7382n, b11), this.f7379k, this.f7380l, this.f7381m, this.f7369a, this.f7385q, list, aVar, b11);
    }

    public void b(q.b bVar) {
        this.f7382n = bVar;
    }
}
