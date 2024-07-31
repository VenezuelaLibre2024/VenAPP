package r7;

import android.os.Parcel;
import android.os.Parcelable;
import l7.a;

/* loaded from: classes.dex */
public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final float f24759a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24760b;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(float f10, int i10) {
        this.f24759a = f10;
        this.f24760b = i10;
    }

    private e(Parcel parcel) {
        this.f24759a = parcel.readFloat();
        this.f24760b = parcel.readInt();
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
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
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f24759a == eVar.f24759a && this.f24760b == eVar.f24760b;
    }

    public int hashCode() {
        return ((527 + hb.c.a(this.f24759a)) * 31) + this.f24760b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f24759a + ", svcTemporalLayerCount=" + this.f24760b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f24759a);
        parcel.writeInt(this.f24760b);
    }
}
