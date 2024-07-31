package p068di;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: di.a */
/* loaded from: classes3.dex */
public class C6972a implements Parcelable {
    public static final Parcelable.Creator<C6972a> CREATOR = new a();

    /* renamed from: a */
    private final String f15538a;

    /* renamed from: b */
    private final float f15539b;

    /* renamed from: c */
    private final float f15540c;

    /* renamed from: di.a$a */
    /* loaded from: classes3.dex */
    static class a implements Parcelable.Creator<C6972a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6972a createFromParcel(Parcel parcel) {
            return new C6972a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6972a[] newArray(int i10) {
            return new C6972a[i10];
        }
    }

    protected C6972a(Parcel parcel) {
        this.f15538a = parcel.readString();
        this.f15539b = parcel.readFloat();
        this.f15540c = parcel.readFloat();
    }

    public C6972a(String str, float f10, float f11) {
        this.f15538a = str;
        this.f15539b = f10;
        this.f15540c = f11;
    }

    /* renamed from: a */
    public String m20172a() {
        return this.f15538a;
    }

    /* renamed from: b */
    public float m20173b() {
        return this.f15539b;
    }

    /* renamed from: c */
    public float m20174c() {
        return this.f15540c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15538a);
        parcel.writeFloat(this.f15539b);
        parcel.writeFloat(this.f15540c);
    }
}
