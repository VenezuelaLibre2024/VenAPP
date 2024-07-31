package s7;

import android.os.Parcel;
import android.os.Parcelable;
import t8.e0;
import t8.n0;

/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f25183a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25184b;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    private g(long j10, long j11) {
        this.f25183a = j10;
        this.f25184b = j11;
    }

    /* synthetic */ g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(e0 e0Var, long j10, n0 n0Var) {
        long b10 = b(e0Var, j10);
        return new g(b10, n0Var.b(b10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(e0 e0Var, long j10) {
        long H = e0Var.H();
        if ((128 & H) != 0) {
            return 8589934591L & ((((H & 1) << 32) | e0Var.J()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f25183a);
        parcel.writeLong(this.f25184b);
    }
}
