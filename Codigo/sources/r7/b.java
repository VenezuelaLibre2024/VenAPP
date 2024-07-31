package r7;

import android.os.Parcel;
import android.os.Parcelable;
import hb.g;
import l7.a;

/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f24749a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24750b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24751c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24752d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24753e;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f24749a = j10;
        this.f24750b = j11;
        this.f24751c = j12;
        this.f24752d = j13;
        this.f24753e = j14;
    }

    private b(Parcel parcel) {
        this.f24749a = parcel.readLong();
        this.f24750b = parcel.readLong();
        this.f24751c = parcel.readLong();
        this.f24752d = parcel.readLong();
        this.f24753e = parcel.readLong();
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24749a == bVar.f24749a && this.f24750b == bVar.f24750b && this.f24751c == bVar.f24751c && this.f24752d == bVar.f24752d && this.f24753e == bVar.f24753e;
    }

    public int hashCode() {
        return ((((((((527 + g.b(this.f24749a)) * 31) + g.b(this.f24750b)) * 31) + g.b(this.f24751c)) * 31) + g.b(this.f24752d)) * 31) + g.b(this.f24753e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f24749a + ", photoSize=" + this.f24750b + ", photoPresentationTimestampUs=" + this.f24751c + ", videoStartPosition=" + this.f24752d + ", videoSize=" + this.f24753e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24749a);
        parcel.writeLong(this.f24750b);
        parcel.writeLong(this.f24751c);
        parcel.writeLong(this.f24752d);
        parcel.writeLong(this.f24753e);
    }
}
