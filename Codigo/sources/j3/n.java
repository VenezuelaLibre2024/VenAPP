package j3;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
class n implements h3.f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f19673b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19674c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19675d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f19676e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f19677f;

    /* renamed from: g, reason: collision with root package name */
    private final h3.f f19678g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<?>, h3.l<?>> f19679h;

    /* renamed from: i, reason: collision with root package name */
    private final h3.h f19680i;

    /* renamed from: j, reason: collision with root package name */
    private int f19681j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Object obj, h3.f fVar, int i10, int i11, Map<Class<?>, h3.l<?>> map, Class<?> cls, Class<?> cls2, h3.h hVar) {
        this.f19673b = c4.k.d(obj);
        this.f19678g = (h3.f) c4.k.e(fVar, "Signature must not be null");
        this.f19674c = i10;
        this.f19675d = i11;
        this.f19679h = (Map) c4.k.d(map);
        this.f19676e = (Class) c4.k.e(cls, "Resource class must not be null");
        this.f19677f = (Class) c4.k.e(cls2, "Transcode class must not be null");
        this.f19680i = (h3.h) c4.k.d(hVar);
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // h3.f
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f19673b.equals(nVar.f19673b) && this.f19678g.equals(nVar.f19678g) && this.f19675d == nVar.f19675d && this.f19674c == nVar.f19674c && this.f19679h.equals(nVar.f19679h) && this.f19676e.equals(nVar.f19676e) && this.f19677f.equals(nVar.f19677f) && this.f19680i.equals(nVar.f19680i);
    }

    @Override // h3.f
    public int hashCode() {
        if (this.f19681j == 0) {
            int hashCode = this.f19673b.hashCode();
            this.f19681j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f19678g.hashCode()) * 31) + this.f19674c) * 31) + this.f19675d;
            this.f19681j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f19679h.hashCode();
            this.f19681j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f19676e.hashCode();
            this.f19681j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f19677f.hashCode();
            this.f19681j = hashCode5;
            this.f19681j = (hashCode5 * 31) + this.f19680i.hashCode();
        }
        return this.f19681j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f19673b + ", width=" + this.f19674c + ", height=" + this.f19675d + ", resourceClass=" + this.f19676e + ", transcodeClass=" + this.f19677f + ", signature=" + this.f19678g + ", hashCode=" + this.f19681j + ", transformations=" + this.f19679h + ", options=" + this.f19680i + '}';
    }
}
