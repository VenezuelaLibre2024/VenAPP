package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import j3.t;
import j3.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n3.o;
import n3.p;
import n3.q;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final q f7400a;

    /* renamed from: b */
    private final x3.a f7401b;

    /* renamed from: c */
    private final x3.e f7402c;

    /* renamed from: d */
    private final x3.f f7403d;

    /* renamed from: e */
    private final com.bumptech.glide.load.data.f f7404e;

    /* renamed from: f */
    private final v3.f f7405f;

    /* renamed from: g */
    private final x3.b f7406g;

    /* renamed from: h */
    private final x3.d f7407h = new x3.d();

    /* renamed from: i */
    private final x3.c f7408i = new x3.c();

    /* renamed from: j */
    private final androidx.core.util.e<List<Throwable>> f7409j;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m10, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public h() {
        androidx.core.util.e<List<Throwable>> e10 = d4.a.e();
        this.f7409j = e10;
        this.f7400a = new q(e10);
        this.f7401b = new x3.a();
        this.f7402c = new x3.e();
        this.f7403d = new x3.f();
        this.f7404e = new com.bumptech.glide.load.data.f();
        this.f7405f = new v3.f();
        this.f7406g = new x3.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private <Data, TResource, Transcode> List<j3.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f7402c.d(cls, cls2)) {
            for (Class cls5 : this.f7405f.b(cls4, cls3)) {
                arrayList.add(new j3.i(cls, cls4, cls5, this.f7402c.b(cls, cls4), this.f7405f.a(cls4, cls5), this.f7409j));
            }
        }
        return arrayList;
    }

    public <Data> h a(Class<Data> cls, h3.d<Data> dVar) {
        this.f7401b.a(cls, dVar);
        return this;
    }

    public <TResource> h b(Class<TResource> cls, h3.k<TResource> kVar) {
        this.f7403d.a(cls, kVar);
        return this;
    }

    public <Data, TResource> h c(Class<Data> cls, Class<TResource> cls2, h3.j<Data, TResource> jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public <Model, Data> h d(Class<Model> cls, Class<Data> cls2, p<Model, Data> pVar) {
        this.f7400a.a(cls, cls2, pVar);
        return this;
    }

    public <Data, TResource> h e(String str, Class<Data> cls, Class<TResource> cls2, h3.j<Data, TResource> jVar) {
        this.f7402c.a(str, jVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b10 = this.f7406g.b();
        if (b10.isEmpty()) {
            throw new b();
        }
        return b10;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> a10 = this.f7408i.a(cls, cls2, cls3);
        if (this.f7408i.c(a10)) {
            return null;
        }
        if (a10 == null) {
            List<j3.i<Data, TResource, Transcode>> f10 = f(cls, cls2, cls3);
            a10 = f10.isEmpty() ? null : new t<>(cls, cls2, cls3, f10, this.f7409j);
            this.f7408i.d(cls, cls2, cls3, a10);
        }
        return a10;
    }

    public <Model> List<o<Model, ?>> i(Model model) {
        return this.f7400a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a10 = this.f7407h.a(cls, cls2, cls3);
        if (a10 == null) {
            a10 = new ArrayList<>();
            Iterator<Class<?>> it = this.f7400a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f7402c.d(it.next(), cls2)) {
                    if (!this.f7405f.b(cls4, cls3).isEmpty() && !a10.contains(cls4)) {
                        a10.add(cls4);
                    }
                }
            }
            this.f7407h.b(cls, cls2, cls3, Collections.unmodifiableList(a10));
        }
        return a10;
    }

    public <X> h3.k<X> k(v<X> vVar) {
        h3.k<X> b10 = this.f7403d.b(vVar.r());
        if (b10 != null) {
            return b10;
        }
        throw new d(vVar.r());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x10) {
        return this.f7404e.a(x10);
    }

    public <X> h3.d<X> m(X x10) {
        h3.d<X> b10 = this.f7401b.b(x10.getClass());
        if (b10 != null) {
            return b10;
        }
        throw new e(x10.getClass());
    }

    public boolean n(v<?> vVar) {
        return this.f7403d.b(vVar.r()) != null;
    }

    public h o(ImageHeaderParser imageHeaderParser) {
        this.f7406g.a(imageHeaderParser);
        return this;
    }

    public h p(e.a<?> aVar) {
        this.f7404e.b(aVar);
        return this;
    }

    public <TResource, Transcode> h q(Class<TResource> cls, Class<Transcode> cls2, v3.e<TResource, Transcode> eVar) {
        this.f7405f.c(cls, cls2, eVar);
        return this;
    }

    public final h r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f7402c.e(arrayList);
        return this;
    }
}
