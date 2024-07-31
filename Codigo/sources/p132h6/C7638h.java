package p132h6;

import java.util.Arrays;
import p098f6.C7298b;

/* renamed from: h6.h */
/* loaded from: classes.dex */
public final class C7638h {

    /* renamed from: a */
    private final C7298b f18083a;

    /* renamed from: b */
    private final byte[] f18084b;

    public C7638h(C7298b c7298b, byte[] bArr) {
        if (c7298b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f18083a = c7298b;
        this.f18084b = bArr;
    }

    /* renamed from: a */
    public byte[] m23204a() {
        return this.f18084b;
    }

    /* renamed from: b */
    public C7298b m23205b() {
        return this.f18083a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7638h)) {
            return false;
        }
        C7638h c7638h = (C7638h) obj;
        if (this.f18083a.equals(c7638h.f18083a)) {
            return Arrays.equals(this.f18084b, c7638h.f18084b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18083a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18084b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f18083a + ", bytes=[...]}";
    }
}
