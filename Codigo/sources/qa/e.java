package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e extends ea.a {
    public static final Parcelable.Creator<e> CREATOR = new l1();

    /* renamed from: a, reason: collision with root package name */
    private final g0 f23814a;

    /* renamed from: b, reason: collision with root package name */
    private final o1 f23815b;

    /* renamed from: c, reason: collision with root package name */
    private final f f23816c;

    /* renamed from: d, reason: collision with root package name */
    private final q1 f23817d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g0 g0Var, o1 o1Var, f fVar, q1 q1Var) {
        this.f23814a = g0Var;
        this.f23815b = o1Var;
        this.f23816c = fVar;
        this.f23817d = q1Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return com.google.android.gms.common.internal.q.b(this.f23814a, eVar.f23814a) && com.google.android.gms.common.internal.q.b(this.f23815b, eVar.f23815b) && com.google.android.gms.common.internal.q.b(this.f23816c, eVar.f23816c) && com.google.android.gms.common.internal.q.b(this.f23817d, eVar.f23817d);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23814a, this.f23815b, this.f23816c, this.f23817d);
    }

    public f u1() {
        return this.f23816c;
    }

    public g0 v1() {
        return this.f23814a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, v1(), i10, false);
        ea.c.E(parcel, 2, this.f23815b, i10, false);
        ea.c.E(parcel, 3, u1(), i10, false);
        ea.c.E(parcel, 4, this.f23817d, i10, false);
        ea.c.b(parcel, a10);
    }
}
