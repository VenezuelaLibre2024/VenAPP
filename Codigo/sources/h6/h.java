package h6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final f6.b f16446a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16447b;

    public h(f6.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f16446a = bVar;
        this.f16447b = bArr;
    }

    public byte[] a() {
        return this.f16447b;
    }

    public f6.b b() {
        return this.f16446a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f16446a.equals(hVar.f16446a)) {
            return Arrays.equals(this.f16447b, hVar.f16447b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16446a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16447b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f16446a + ", bytes=[...]}";
    }
}
