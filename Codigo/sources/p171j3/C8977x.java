package p171j3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p036c4.C1867h;
import p036c4.C1871l;
import p129h3.C7624h;
import p129h3.InterfaceC7622f;
import p129h3.InterfaceC7628l;
import p193k3.InterfaceC9139b;

/* renamed from: j3.x */
/* loaded from: classes.dex */
final class C8977x implements InterfaceC7622f {

    /* renamed from: j */
    private static final C1867h<Class<?>, byte[]> f21498j = new C1867h<>(50);

    /* renamed from: b */
    private final InterfaceC9139b f21499b;

    /* renamed from: c */
    private final InterfaceC7622f f21500c;

    /* renamed from: d */
    private final InterfaceC7622f f21501d;

    /* renamed from: e */
    private final int f21502e;

    /* renamed from: f */
    private final int f21503f;

    /* renamed from: g */
    private final Class<?> f21504g;

    /* renamed from: h */
    private final C7624h f21505h;

    /* renamed from: i */
    private final InterfaceC7628l<?> f21506i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8977x(InterfaceC9139b interfaceC9139b, InterfaceC7622f interfaceC7622f, InterfaceC7622f interfaceC7622f2, int i10, int i11, InterfaceC7628l<?> interfaceC7628l, Class<?> cls, C7624h c7624h) {
        this.f21499b = interfaceC9139b;
        this.f21500c = interfaceC7622f;
        this.f21501d = interfaceC7622f2;
        this.f21502e = i10;
        this.f21503f = i11;
        this.f21506i = interfaceC7628l;
        this.f21504g = cls;
        this.f21505h = c7624h;
    }

    /* renamed from: c */
    private byte[] m26336c() {
        C1867h<Class<?>, byte[]> c1867h = f21498j;
        byte[] m9937g = c1867h.m9937g(this.f21504g);
        if (m9937g != null) {
            return m9937g;
        }
        byte[] bytes = this.f21504g.getName().getBytes(InterfaceC7622f.f18006a);
        c1867h.m9941k(this.f21504g, bytes);
        return bytes;
    }

    @Override // p129h3.InterfaceC7622f
    /* renamed from: b */
    public void mo9110b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f21499b.mo26944d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f21502e).putInt(this.f21503f).array();
        this.f21501d.mo9110b(messageDigest);
        this.f21500c.mo9110b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC7628l<?> interfaceC7628l = this.f21506i;
        if (interfaceC7628l != null) {
            interfaceC7628l.mo9110b(messageDigest);
        }
        this.f21505h.mo9110b(messageDigest);
        messageDigest.update(m26336c());
        this.f21499b.put(bArr);
    }

    @Override // p129h3.InterfaceC7622f
    public boolean equals(Object obj) {
        if (!(obj instanceof C8977x)) {
            return false;
        }
        C8977x c8977x = (C8977x) obj;
        return this.f21503f == c8977x.f21503f && this.f21502e == c8977x.f21502e && C1871l.m9955d(this.f21506i, c8977x.f21506i) && this.f21504g.equals(c8977x.f21504g) && this.f21500c.equals(c8977x.f21500c) && this.f21501d.equals(c8977x.f21501d) && this.f21505h.equals(c8977x.f21505h);
    }

    @Override // p129h3.InterfaceC7622f
    public int hashCode() {
        int hashCode = (((((this.f21500c.hashCode() * 31) + this.f21501d.hashCode()) * 31) + this.f21502e) * 31) + this.f21503f;
        InterfaceC7628l<?> interfaceC7628l = this.f21506i;
        if (interfaceC7628l != null) {
            hashCode = (hashCode * 31) + interfaceC7628l.hashCode();
        }
        return (((hashCode * 31) + this.f21504g.hashCode()) * 31) + this.f21505h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f21500c + ", signature=" + this.f21501d + ", width=" + this.f21502e + ", height=" + this.f21503f + ", decodedResourceClass=" + this.f21504g + ", transformation='" + this.f21506i + "', options=" + this.f21505h + '}';
    }
}
