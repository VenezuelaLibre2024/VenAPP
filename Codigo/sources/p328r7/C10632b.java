package p328r7;

import android.os.Parcel;
import android.os.Parcelable;
import p137hb.C7692g;
import p216l7.C9400a;

/* renamed from: r7.b */
/* loaded from: classes.dex */
public final class C10632b implements C9400a.b {
    public static final Parcelable.Creator<C10632b> CREATOR = new a();

    /* renamed from: a */
    public final long f26863a;

    /* renamed from: b */
    public final long f26864b;

    /* renamed from: c */
    public final long f26865c;

    /* renamed from: d */
    public final long f26866d;

    /* renamed from: e */
    public final long f26867e;

    /* renamed from: r7.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10632b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10632b createFromParcel(Parcel parcel) {
            return new C10632b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10632b[] newArray(int i10) {
            return new C10632b[i10];
        }
    }

    public C10632b(long j10, long j11, long j12, long j13, long j14) {
        this.f26863a = j10;
        this.f26864b = j11;
        this.f26865c = j12;
        this.f26866d = j13;
        this.f26867e = j14;
    }

    private C10632b(Parcel parcel) {
        this.f26863a = parcel.readLong();
        this.f26864b = parcel.readLong();
        this.f26865c = parcel.readLong();
        this.f26866d = parcel.readLong();
        this.f26867e = parcel.readLong();
    }

    /* synthetic */ C10632b(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10632b.class != obj.getClass()) {
            return false;
        }
        C10632b c10632b = (C10632b) obj;
        return this.f26863a == c10632b.f26863a && this.f26864b == c10632b.f26864b && this.f26865c == c10632b.f26865c && this.f26866d == c10632b.f26866d && this.f26867e == c10632b.f26867e;
    }

    public int hashCode() {
        return ((((((((527 + C7692g.m23426b(this.f26863a)) * 31) + C7692g.m23426b(this.f26864b)) * 31) + C7692g.m23426b(this.f26865c)) * 31) + C7692g.m23426b(this.f26866d)) * 31) + C7692g.m23426b(this.f26867e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f26863a + ", photoSize=" + this.f26864b + ", photoPresentationTimestampUs=" + this.f26865c + ", videoStartPosition=" + this.f26866d + ", videoSize=" + this.f26867e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f26863a);
        parcel.writeLong(this.f26864b);
        parcel.writeLong(this.f26865c);
        parcel.writeLong(this.f26866d);
        parcel.writeLong(this.f26867e);
    }
}
