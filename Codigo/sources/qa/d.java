package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class d extends ea.a {
    public static final Parcelable.Creator<d> CREATOR = new m1();

    /* renamed from: a, reason: collision with root package name */
    private final r f23803a;

    /* renamed from: b, reason: collision with root package name */
    private final b2 f23804b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f23805c;

    /* renamed from: d, reason: collision with root package name */
    private final h2 f23806d;

    /* renamed from: e, reason: collision with root package name */
    private final k0 f23807e;

    /* renamed from: f, reason: collision with root package name */
    private final m0 f23808f;

    /* renamed from: r, reason: collision with root package name */
    private final d2 f23809r;

    /* renamed from: s, reason: collision with root package name */
    private final p0 f23810s;

    /* renamed from: t, reason: collision with root package name */
    private final s f23811t;

    /* renamed from: u, reason: collision with root package name */
    private final r0 f23812u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(r rVar, b2 b2Var, f0 f0Var, h2 h2Var, k0 k0Var, m0 m0Var, d2 d2Var, p0 p0Var, s sVar, r0 r0Var) {
        this.f23803a = rVar;
        this.f23805c = f0Var;
        this.f23804b = b2Var;
        this.f23806d = h2Var;
        this.f23807e = k0Var;
        this.f23808f = m0Var;
        this.f23809r = d2Var;
        this.f23810s = p0Var;
        this.f23811t = sVar;
        this.f23812u = r0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return com.google.android.gms.common.internal.q.b(this.f23803a, dVar.f23803a) && com.google.android.gms.common.internal.q.b(this.f23804b, dVar.f23804b) && com.google.android.gms.common.internal.q.b(this.f23805c, dVar.f23805c) && com.google.android.gms.common.internal.q.b(this.f23806d, dVar.f23806d) && com.google.android.gms.common.internal.q.b(this.f23807e, dVar.f23807e) && com.google.android.gms.common.internal.q.b(this.f23808f, dVar.f23808f) && com.google.android.gms.common.internal.q.b(this.f23809r, dVar.f23809r) && com.google.android.gms.common.internal.q.b(this.f23810s, dVar.f23810s) && com.google.android.gms.common.internal.q.b(this.f23811t, dVar.f23811t) && com.google.android.gms.common.internal.q.b(this.f23812u, dVar.f23812u);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23803a, this.f23804b, this.f23805c, this.f23806d, this.f23807e, this.f23808f, this.f23809r, this.f23810s, this.f23811t, this.f23812u);
    }

    public r u1() {
        return this.f23803a;
    }

    public f0 v1() {
        return this.f23805c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 2, u1(), i10, false);
        ea.c.E(parcel, 3, this.f23804b, i10, false);
        ea.c.E(parcel, 4, v1(), i10, false);
        ea.c.E(parcel, 5, this.f23806d, i10, false);
        ea.c.E(parcel, 6, this.f23807e, i10, false);
        ea.c.E(parcel, 7, this.f23808f, i10, false);
        ea.c.E(parcel, 8, this.f23809r, i10, false);
        ea.c.E(parcel, 9, this.f23810s, i10, false);
        ea.c.E(parcel, 10, this.f23811t, i10, false);
        ea.c.E(parcel, 11, this.f23812u, i10, false);
        ea.c.b(parcel, a10);
    }
}
