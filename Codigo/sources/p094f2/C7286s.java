package p094f2;

import androidx.work.C1522b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: f2.s */
/* loaded from: classes.dex */
public final class C7286s {

    /* renamed from: a */
    private UUID f16318a;

    /* renamed from: b */
    private a f16319b;

    /* renamed from: c */
    private C1522b f16320c;

    /* renamed from: d */
    private Set<String> f16321d;

    /* renamed from: e */
    private C1522b f16322e;

    /* renamed from: f */
    private int f16323f;

    /* renamed from: g */
    private final int f16324g;

    /* renamed from: f2.s$a */
    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* renamed from: h */
        public boolean m21794h() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public C7286s(UUID uuid, a aVar, C1522b c1522b, List<String> list, C1522b c1522b2, int i10, int i11) {
        this.f16318a = uuid;
        this.f16319b = aVar;
        this.f16320c = c1522b;
        this.f16321d = new HashSet(list);
        this.f16322e = c1522b2;
        this.f16323f = i10;
        this.f16324g = i11;
    }

    /* renamed from: a */
    public UUID m21789a() {
        return this.f16318a;
    }

    /* renamed from: b */
    public C1522b m21790b() {
        return this.f16320c;
    }

    /* renamed from: c */
    public C1522b m21791c() {
        return this.f16322e;
    }

    /* renamed from: d */
    public a m21792d() {
        return this.f16319b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7286s.class != obj.getClass()) {
            return false;
        }
        C7286s c7286s = (C7286s) obj;
        if (this.f16323f == c7286s.f16323f && this.f16324g == c7286s.f16324g && this.f16318a.equals(c7286s.f16318a) && this.f16319b == c7286s.f16319b && this.f16320c.equals(c7286s.f16320c) && this.f16321d.equals(c7286s.f16321d)) {
            return this.f16322e.equals(c7286s.f16322e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.f16318a.hashCode() * 31) + this.f16319b.hashCode()) * 31) + this.f16320c.hashCode()) * 31) + this.f16321d.hashCode()) * 31) + this.f16322e.hashCode()) * 31) + this.f16323f) * 31) + this.f16324g;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f16318a + "', mState=" + this.f16319b + ", mOutputData=" + this.f16320c + ", mTags=" + this.f16321d + ", mProgress=" + this.f16322e + '}';
    }
}
