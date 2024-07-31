package b4;

import c4.k;
import h3.f;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f6145b;

    public d(Object obj) {
        this.f6145b = k.d(obj);
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f6145b.toString().getBytes(f.f16369a));
    }

    @Override // h3.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f6145b.equals(((d) obj).f6145b);
        }
        return false;
    }

    @Override // h3.f
    public int hashCode() {
        return this.f6145b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f6145b + '}';
    }
}
