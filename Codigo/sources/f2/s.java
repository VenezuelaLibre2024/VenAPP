package f2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private UUID f14895a;

    /* renamed from: b, reason: collision with root package name */
    private a f14896b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.b f14897c;

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f14898d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.work.b f14899e;

    /* renamed from: f, reason: collision with root package name */
    private int f14900f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14901g;

    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean h() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public s(UUID uuid, a aVar, androidx.work.b bVar, List<String> list, androidx.work.b bVar2, int i10, int i11) {
        this.f14895a = uuid;
        this.f14896b = aVar;
        this.f14897c = bVar;
        this.f14898d = new HashSet(list);
        this.f14899e = bVar2;
        this.f14900f = i10;
        this.f14901g = i11;
    }

    public UUID a() {
        return this.f14895a;
    }

    public androidx.work.b b() {
        return this.f14897c;
    }

    public androidx.work.b c() {
        return this.f14899e;
    }

    public a d() {
        return this.f14896b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14900f == sVar.f14900f && this.f14901g == sVar.f14901g && this.f14895a.equals(sVar.f14895a) && this.f14896b == sVar.f14896b && this.f14897c.equals(sVar.f14897c) && this.f14898d.equals(sVar.f14898d)) {
            return this.f14899e.equals(sVar.f14899e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.f14895a.hashCode() * 31) + this.f14896b.hashCode()) * 31) + this.f14897c.hashCode()) * 31) + this.f14898d.hashCode()) * 31) + this.f14899e.hashCode()) * 31) + this.f14900f) * 31) + this.f14901g;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f14895a + "', mState=" + this.f14896b + ", mOutputData=" + this.f14897c + ", mTags=" + this.f14898d + ", mProgress=" + this.f14899e + '}';
    }
}
