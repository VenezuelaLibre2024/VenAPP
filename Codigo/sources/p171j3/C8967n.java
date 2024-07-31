package p171j3;

import java.security.MessageDigest;
import java.util.Map;
import p036c4.C1870k;
import p129h3.C7624h;
import p129h3.InterfaceC7622f;
import p129h3.InterfaceC7628l;

/* renamed from: j3.n */
/* loaded from: classes.dex */
class C8967n implements InterfaceC7622f {

    /* renamed from: b */
    private final Object f21452b;

    /* renamed from: c */
    private final int f21453c;

    /* renamed from: d */
    private final int f21454d;

    /* renamed from: e */
    private final Class<?> f21455e;

    /* renamed from: f */
    private final Class<?> f21456f;

    /* renamed from: g */
    private final InterfaceC7622f f21457g;

    /* renamed from: h */
    private final Map<Class<?>, InterfaceC7628l<?>> f21458h;

    /* renamed from: i */
    private final C7624h f21459i;

    /* renamed from: j */
    private int f21460j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8967n(Object obj, InterfaceC7622f interfaceC7622f, int i10, int i11, Map<Class<?>, InterfaceC7628l<?>> map, Class<?> cls, Class<?> cls2, C7624h c7624h) {
        this.f21452b = C1870k.m9950d(obj);
        this.f21457g = (InterfaceC7622f) C1870k.m9951e(interfaceC7622f, "Signature must not be null");
        this.f21453c = i10;
        this.f21454d = i11;
        this.f21458h = (Map) C1870k.m9950d(map);
        this.f21455e = (Class) C1870k.m9951e(cls, "Resource class must not be null");
        this.f21456f = (Class) C1870k.m9951e(cls2, "Transcode class must not be null");
        this.f21459i = (C7624h) C1870k.m9950d(c7624h);
    }

    @Override // p129h3.InterfaceC7622f
    /* renamed from: b */
    public void mo9110b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p129h3.InterfaceC7622f
    public boolean equals(Object obj) {
        if (!(obj instanceof C8967n)) {
            return false;
        }
        C8967n c8967n = (C8967n) obj;
        return this.f21452b.equals(c8967n.f21452b) && this.f21457g.equals(c8967n.f21457g) && this.f21454d == c8967n.f21454d && this.f21453c == c8967n.f21453c && this.f21458h.equals(c8967n.f21458h) && this.f21455e.equals(c8967n.f21455e) && this.f21456f.equals(c8967n.f21456f) && this.f21459i.equals(c8967n.f21459i);
    }

    @Override // p129h3.InterfaceC7622f
    public int hashCode() {
        if (this.f21460j == 0) {
            int hashCode = this.f21452b.hashCode();
            this.f21460j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f21457g.hashCode()) * 31) + this.f21453c) * 31) + this.f21454d;
            this.f21460j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f21458h.hashCode();
            this.f21460j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f21455e.hashCode();
            this.f21460j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f21456f.hashCode();
            this.f21460j = hashCode5;
            this.f21460j = (hashCode5 * 31) + this.f21459i.hashCode();
        }
        return this.f21460j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f21452b + ", width=" + this.f21453c + ", height=" + this.f21454d + ", resourceClass=" + this.f21455e + ", transcodeClass=" + this.f21456f + ", signature=" + this.f21457g + ", hashCode=" + this.f21460j + ", transformations=" + this.f21458h + ", options=" + this.f21459i + '}';
    }
}
