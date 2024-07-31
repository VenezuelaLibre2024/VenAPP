package com.bumptech.glide;

import android.content.Context;
import androidx.collection.C0731a;
import com.bumptech.glide.C2119e;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import com.bumptech.glide.manager.C2149f;
import com.bumptech.glide.manager.C2160q;
import com.bumptech.glide.manager.InterfaceC2147d;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p171j3.C8964k;
import p193k3.C9142e;
import p193k3.C9146i;
import p193k3.C9148k;
import p193k3.InterfaceC9139b;
import p193k3.InterfaceC9141d;
import p212l3.C9380f;
import p212l3.C9381g;
import p212l3.C9383i;
import p212l3.InterfaceC9375a;
import p212l3.InterfaceC9382h;
import p231m3.ExecutorServiceC9538a;
import p411w3.AbstractC12064a;
import p411w3.InterfaceC12065b;
import p456y3.C12594i;
import p456y3.InterfaceC12593h;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes.dex */
public final class C2117c {

    /* renamed from: c */
    private C8964k f8323c;

    /* renamed from: d */
    private InterfaceC9141d f8324d;

    /* renamed from: e */
    private InterfaceC9139b f8325e;

    /* renamed from: f */
    private InterfaceC9382h f8326f;

    /* renamed from: g */
    private ExecutorServiceC9538a f8327g;

    /* renamed from: h */
    private ExecutorServiceC9538a f8328h;

    /* renamed from: i */
    private InterfaceC9375a.a f8329i;

    /* renamed from: j */
    private C9383i f8330j;

    /* renamed from: k */
    private InterfaceC2147d f8331k;

    /* renamed from: n */
    private C2160q.b f8334n;

    /* renamed from: o */
    private ExecutorServiceC9538a f8335o;

    /* renamed from: p */
    private boolean f8336p;

    /* renamed from: q */
    private List<InterfaceC12593h<Object>> f8337q;

    /* renamed from: a */
    private final Map<Class<?>, AbstractC2126l<?, ?>> f8321a = new C0731a();

    /* renamed from: b */
    private final C2119e.a f8322b = new C2119e.a();

    /* renamed from: l */
    private int f8332l = 4;

    /* renamed from: m */
    private ComponentCallbacks2C2116b.a f8333m = new a();

    /* renamed from: com.bumptech.glide.c$a */
    /* loaded from: classes.dex */
    class a implements ComponentCallbacks2C2116b.a {
        a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C2116b.a
        public C12594i build() {
            return new C12594i();
        }
    }

    /* renamed from: com.bumptech.glide.c$b */
    /* loaded from: classes.dex */
    static final class b {
        b() {
        }
    }

    /* renamed from: com.bumptech.glide.c$c */
    /* loaded from: classes.dex */
    public static final class c {
    }

    /* renamed from: com.bumptech.glide.c$d */
    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ComponentCallbacks2C2116b m10661a(Context context, List<InterfaceC12065b> list, AbstractC12064a abstractC12064a) {
        if (this.f8327g == null) {
            this.f8327g = ExecutorServiceC9538a.m28374h();
        }
        if (this.f8328h == null) {
            this.f8328h = ExecutorServiceC9538a.m28372f();
        }
        if (this.f8335o == null) {
            this.f8335o = ExecutorServiceC9538a.m28370d();
        }
        if (this.f8330j == null) {
            this.f8330j = new C9383i.a(context).m27915a();
        }
        if (this.f8331k == null) {
            this.f8331k = new C2149f();
        }
        if (this.f8324d == null) {
            int m27913b = this.f8330j.m27913b();
            if (m27913b > 0) {
                this.f8324d = new C9148k(m27913b);
            } else {
                this.f8324d = new C9142e();
            }
        }
        if (this.f8325e == null) {
            this.f8325e = new C9146i(this.f8330j.m27912a());
        }
        if (this.f8326f == null) {
            this.f8326f = new C9381g(this.f8330j.m27914d());
        }
        if (this.f8329i == null) {
            this.f8329i = new C9380f(context);
        }
        if (this.f8323c == null) {
            this.f8323c = new C8964k(this.f8326f, this.f8329i, this.f8328h, this.f8327g, ExecutorServiceC9538a.m28375i(), this.f8335o, this.f8336p);
        }
        List<InterfaceC12593h<Object>> list2 = this.f8337q;
        this.f8337q = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        C2119e m10673b = this.f8322b.m10673b();
        return new ComponentCallbacks2C2116b(context, this.f8323c, this.f8326f, this.f8324d, this.f8325e, new C2160q(this.f8334n, m10673b), this.f8331k, this.f8332l, this.f8333m, this.f8321a, this.f8337q, list, abstractC12064a, m10673b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10662b(C2160q.b bVar) {
        this.f8334n = bVar;
    }
}
