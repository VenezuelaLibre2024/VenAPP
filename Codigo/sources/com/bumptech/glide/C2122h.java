package com.bumptech.glide;

import androidx.core.util.InterfaceC0981e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2135f;
import com.bumptech.glide.load.data.InterfaceC2134e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p055d4.C6842a;
import p129h3.InterfaceC7620d;
import p129h3.InterfaceC7626j;
import p129h3.InterfaceC7627k;
import p171j3.C8962i;
import p171j3.C8973t;
import p171j3.InterfaceC8975v;
import p246n3.C9651q;
import p246n3.InterfaceC9649o;
import p246n3.InterfaceC9650p;
import p393v3.C11624f;
import p393v3.InterfaceC11623e;
import p433x3.C12268a;
import p433x3.C12269b;
import p433x3.C12270c;
import p433x3.C12271d;
import p433x3.C12272e;
import p433x3.C12273f;

/* renamed from: com.bumptech.glide.h */
/* loaded from: classes.dex */
public class C2122h {

    /* renamed from: a */
    private final C9651q f8352a;

    /* renamed from: b */
    private final C12268a f8353b;

    /* renamed from: c */
    private final C12272e f8354c;

    /* renamed from: d */
    private final C12273f f8355d;

    /* renamed from: e */
    private final C2135f f8356e;

    /* renamed from: f */
    private final C11624f f8357f;

    /* renamed from: g */
    private final C12269b f8358g;

    /* renamed from: h */
    private final C12271d f8359h = new C12271d();

    /* renamed from: i */
    private final C12270c f8360i = new C12270c();

    /* renamed from: j */
    private final InterfaceC0981e<List<Throwable>> f8361j;

    /* renamed from: com.bumptech.glide.h$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.h$b */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.h$c */
    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m10, List<InterfaceC9649o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }
    }

    /* renamed from: com.bumptech.glide.h$d */
    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: com.bumptech.glide.h$e */
    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C2122h() {
        InterfaceC0981e<List<Throwable>> m19767e = C6842a.m19767e();
        this.f8361j = m19767e;
        this.f8352a = new C9651q(m19767e);
        this.f8353b = new C12268a();
        this.f8354c = new C12272e();
        this.f8355d = new C12273f();
        this.f8356e = new C2135f();
        this.f8357f = new C11624f();
        this.f8358g = new C12269b();
        m10691r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<C8962i<Data, TResource, Transcode>> m10674f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f8354c.m39513d(cls, cls2)) {
            for (Class cls5 : this.f8357f.m36417b(cls4, cls3)) {
                arrayList.add(new C8962i(cls, cls4, cls5, this.f8354c.m39512b(cls, cls4), this.f8357f.m36416a(cls4, cls5), this.f8361j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> C2122h m10675a(Class<Data> cls, InterfaceC7620d<Data> interfaceC7620d) {
        this.f8353b.m39499a(cls, interfaceC7620d);
        return this;
    }

    /* renamed from: b */
    public <TResource> C2122h m10676b(Class<TResource> cls, InterfaceC7627k<TResource> interfaceC7627k) {
        this.f8355d.m39516a(cls, interfaceC7627k);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> C2122h m10677c(Class<Data> cls, Class<TResource> cls2, InterfaceC7626j<Data, TResource> interfaceC7626j) {
        m10679e("legacy_append", cls, cls2, interfaceC7626j);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> C2122h m10678d(Class<Model> cls, Class<Data> cls2, InterfaceC9650p<Model, Data> interfaceC9650p) {
        this.f8352a.m28918a(cls, cls2, interfaceC9650p);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> C2122h m10679e(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC7626j<Data, TResource> interfaceC7626j) {
        this.f8354c.m39511a(str, interfaceC7626j, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> m10680g() {
        List<ImageHeaderParser> m39503b = this.f8358g.m39503b();
        if (m39503b.isEmpty()) {
            throw new b();
        }
        return m39503b;
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C8973t<Data, TResource, Transcode> m10681h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C8973t<Data, TResource, Transcode> m39505a = this.f8360i.m39505a(cls, cls2, cls3);
        if (this.f8360i.m39506c(m39505a)) {
            return null;
        }
        if (m39505a == null) {
            List<C8962i<Data, TResource, Transcode>> m10674f = m10674f(cls, cls2, cls3);
            m39505a = m10674f.isEmpty() ? null : new C8973t<>(cls, cls2, cls3, m10674f, this.f8361j);
            this.f8360i.m39507d(cls, cls2, cls3, m39505a);
        }
        return m39505a;
    }

    /* renamed from: i */
    public <Model> List<InterfaceC9649o<Model, ?>> m10682i(Model model) {
        return this.f8352a.m28920d(model);
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> m10683j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> m39508a = this.f8359h.m39508a(cls, cls2, cls3);
        if (m39508a == null) {
            m39508a = new ArrayList<>();
            Iterator<Class<?>> it = this.f8352a.m28919c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f8354c.m39513d(it.next(), cls2)) {
                    if (!this.f8357f.m36417b(cls4, cls3).isEmpty() && !m39508a.contains(cls4)) {
                        m39508a.add(cls4);
                    }
                }
            }
            this.f8359h.m39509b(cls, cls2, cls3, Collections.unmodifiableList(m39508a));
        }
        return m39508a;
    }

    /* renamed from: k */
    public <X> InterfaceC7627k<X> m10684k(InterfaceC8975v<X> interfaceC8975v) {
        InterfaceC7627k<X> m39517b = this.f8355d.m39517b(interfaceC8975v.mo26311r());
        if (m39517b != null) {
            return m39517b;
        }
        throw new d(interfaceC8975v.mo26311r());
    }

    /* renamed from: l */
    public <X> InterfaceC2134e<X> m10685l(X x10) {
        return this.f8356e.m10775a(x10);
    }

    /* renamed from: m */
    public <X> InterfaceC7620d<X> m10686m(X x10) {
        InterfaceC7620d<X> m39500b = this.f8353b.m39500b(x10.getClass());
        if (m39500b != null) {
            return m39500b;
        }
        throw new e(x10.getClass());
    }

    /* renamed from: n */
    public boolean m10687n(InterfaceC8975v<?> interfaceC8975v) {
        return this.f8355d.m39517b(interfaceC8975v.mo26311r()) != null;
    }

    /* renamed from: o */
    public C2122h m10688o(ImageHeaderParser imageHeaderParser) {
        this.f8358g.m39502a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public C2122h m10689p(InterfaceC2134e.a<?> aVar) {
        this.f8356e.m10776b(aVar);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> C2122h m10690q(Class<TResource> cls, Class<Transcode> cls2, InterfaceC11623e<TResource, Transcode> interfaceC11623e) {
        this.f8357f.m36418c(cls, cls2, interfaceC11623e);
        return this;
    }

    /* renamed from: r */
    public final C2122h m10691r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f8354c.m39514e(arrayList);
        return this;
    }
}
