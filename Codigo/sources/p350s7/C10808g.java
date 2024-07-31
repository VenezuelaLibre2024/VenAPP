package p350s7;

import android.os.Parcel;
import android.os.Parcelable;
import p363t8.C11146e0;
import p363t8.C11164n0;

/* renamed from: s7.g */
/* loaded from: classes.dex */
public final class C10808g extends AbstractC10803b {
    public static final Parcelable.Creator<C10808g> CREATOR = new a();

    /* renamed from: a */
    public final long f27302a;

    /* renamed from: b */
    public final long f27303b;

    /* renamed from: s7.g$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10808g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10808g createFromParcel(Parcel parcel) {
            return new C10808g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10808g[] newArray(int i10) {
            return new C10808g[i10];
        }
    }

    private C10808g(long j10, long j11) {
        this.f27302a = j10;
        this.f27303b = j11;
    }

    /* synthetic */ C10808g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10808g m32937a(C11146e0 c11146e0, long j10, C11164n0 c11164n0) {
        long m32938b = m32938b(c11146e0, j10);
        return new C10808g(m32938b, c11164n0.m34825b(m32938b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long m32938b(C11146e0 c11146e0, long j10) {
        long m34664H = c11146e0.m34664H();
        if ((128 & m34664H) != 0) {
            return 8589934591L & ((((m34664H & 1) << 32) | c11146e0.m34666J()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27302a);
        parcel.writeLong(this.f27303b);
    }
}
