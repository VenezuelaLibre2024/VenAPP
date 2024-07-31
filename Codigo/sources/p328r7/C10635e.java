package p328r7;

import android.os.Parcel;
import android.os.Parcelable;
import p137hb.C7688c;
import p216l7.C9400a;

/* renamed from: r7.e */
/* loaded from: classes.dex */
public final class C10635e implements C9400a.b {
    public static final Parcelable.Creator<C10635e> CREATOR = new a();

    /* renamed from: a */
    public final float f26873a;

    /* renamed from: b */
    public final int f26874b;

    /* renamed from: r7.e$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C10635e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10635e createFromParcel(Parcel parcel) {
            return new C10635e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10635e[] newArray(int i10) {
            return new C10635e[i10];
        }
    }

    public C10635e(float f10, int i10) {
        this.f26873a = f10;
        this.f26874b = i10;
    }

    private C10635e(Parcel parcel) {
        this.f26873a = parcel.readFloat();
        this.f26874b = parcel.readInt();
    }

    /* synthetic */ C10635e(Parcel parcel, a aVar) {
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
        if (obj == null || C10635e.class != obj.getClass()) {
            return false;
        }
        C10635e c10635e = (C10635e) obj;
        return this.f26873a == c10635e.f26873a && this.f26874b == c10635e.f26874b;
    }

    public int hashCode() {
        return ((527 + C7688c.m23409a(this.f26873a)) * 31) + this.f26874b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f26873a + ", svcTemporalLayerCount=" + this.f26874b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f26873a);
        parcel.writeInt(this.f26874b);
    }
}
