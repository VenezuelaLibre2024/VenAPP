package p263o3;

import java.io.InputStream;
import java.net.URL;
import p129h3.C7624h;
import p246n3.C9642h;
import p246n3.C9653s;
import p246n3.InterfaceC9649o;
import p246n3.InterfaceC9650p;

/* renamed from: o3.f */
/* loaded from: classes.dex */
public class C9778f implements InterfaceC9649o<URL, InputStream> {

    /* renamed from: a */
    private final InterfaceC9649o<C9642h, InputStream> f24111a;

    /* renamed from: o3.f$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC9650p<URL, InputStream> {
        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<URL, InputStream> mo28852d(C9653s c9653s) {
            return new C9778f(c9653s.m28930d(C9642h.class, InputStream.class));
        }
    }

    public C9778f(InterfaceC9649o<C9642h, InputStream> interfaceC9649o) {
        this.f24111a = interfaceC9649o;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<InputStream> mo28848b(URL url, int i10, int i11, C7624h c7624h) {
        return this.f24111a.mo28848b(new C9642h(url), i10, i11, c7624h);
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(URL url) {
        return true;
    }
}
