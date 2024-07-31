package ua;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class y extends ea.a {
    public static final Parcelable.Creator<y> CREATOR = new g0();

    /* renamed from: a, reason: collision with root package name */
    private final float f27576a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27577b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27578c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f27579d;

    /* renamed from: e, reason: collision with root package name */
    private final x f27580e;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private float f27581a;

        /* renamed from: b, reason: collision with root package name */
        private int f27582b;

        /* renamed from: c, reason: collision with root package name */
        private int f27583c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27584d;

        /* renamed from: e, reason: collision with root package name */
        private x f27585e;

        public a(y yVar) {
            this.f27581a = yVar.w1();
            Pair x12 = yVar.x1();
            this.f27582b = ((Integer) x12.first).intValue();
            this.f27583c = ((Integer) x12.second).intValue();
            this.f27584d = yVar.v1();
            this.f27585e = yVar.u1();
        }

        public y a() {
            return new y(this.f27581a, this.f27582b, this.f27583c, this.f27584d, this.f27585e);
        }

        public final a b(boolean z10) {
            this.f27584d = z10;
            return this;
        }

        public final a c(float f10) {
            this.f27581a = f10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(float f10, int i10, int i11, boolean z10, x xVar) {
        this.f27576a = f10;
        this.f27577b = i10;
        this.f27578c = i11;
        this.f27579d = z10;
        this.f27580e = xVar;
    }

    public x u1() {
        return this.f27580e;
    }

    public boolean v1() {
        return this.f27579d;
    }

    public final float w1() {
        return this.f27576a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.q(parcel, 2, this.f27576a);
        ea.c.u(parcel, 3, this.f27577b);
        ea.c.u(parcel, 4, this.f27578c);
        ea.c.g(parcel, 5, v1());
        ea.c.E(parcel, 6, u1(), i10, false);
        ea.c.b(parcel, a10);
    }

    public final Pair x1() {
        return new Pair(Integer.valueOf(this.f27577b), Integer.valueOf(this.f27578c));
    }
}
