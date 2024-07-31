package j3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class x implements h3.f {

    /* renamed from: j, reason: collision with root package name */
    private static final c4.h<Class<?>, byte[]> f19719j = new c4.h<>(50);

    /* renamed from: b, reason: collision with root package name */
    private final k3.b f19720b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.f f19721c;

    /* renamed from: d, reason: collision with root package name */
    private final h3.f f19722d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19723e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19724f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f19725g;

    /* renamed from: h, reason: collision with root package name */
    private final h3.h f19726h;

    /* renamed from: i, reason: collision with root package name */
    private final h3.l<?> f19727i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(k3.b bVar, h3.f fVar, h3.f fVar2, int i10, int i11, h3.l<?> lVar, Class<?> cls, h3.h hVar) {
        this.f19720b = bVar;
        this.f19721c = fVar;
        this.f19722d = fVar2;
        this.f19723e = i10;
        this.f19724f = i11;
        this.f19727i = lVar;
        this.f19725g = cls;
        this.f19726h = hVar;
    }

    private byte[] c() {
        c4.h<Class<?>, byte[]> hVar = f19719j;
        byte[] g10 = hVar.g(this.f19725g);
        if (g10 != null) {
            return g10;
        }
        byte[] bytes = this.f19725g.getName().getBytes(h3.f.f16369a);
        hVar.k(this.f19725g, bytes);
        return bytes;
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f19720b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f19723e).putInt(this.f19724f).array();
        this.f19722d.b(messageDigest);
        this.f19721c.b(messageDigest);
        messageDigest.update(bArr);
        h3.l<?> lVar = this.f19727i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f19726h.b(messageDigest);
        messageDigest.update(c());
        this.f19720b.put(bArr);
    }

    @Override // h3.f
    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f19724f == xVar.f19724f && this.f19723e == xVar.f19723e && c4.l.d(this.f19727i, xVar.f19727i) && this.f19725g.equals(xVar.f19725g) && this.f19721c.equals(xVar.f19721c) && this.f19722d.equals(xVar.f19722d) && this.f19726h.equals(xVar.f19726h);
    }

    @Override // h3.f
    public int hashCode() {
        int hashCode = (((((this.f19721c.hashCode() * 31) + this.f19722d.hashCode()) * 31) + this.f19723e) * 31) + this.f19724f;
        h3.l<?> lVar = this.f19727i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f19725g.hashCode()) * 31) + this.f19726h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f19721c + ", signature=" + this.f19722d + ", width=" + this.f19723e + ", height=" + this.f19724f + ", decodedResourceClass=" + this.f19725g + ", transformation='" + this.f19727i + "', options=" + this.f19726h + '}';
    }
}
