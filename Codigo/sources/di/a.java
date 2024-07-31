package di;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0214a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14180a;

    /* renamed from: b, reason: collision with root package name */
    private final float f14181b;

    /* renamed from: c, reason: collision with root package name */
    private final float f14182c;

    /* renamed from: di.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0214a implements Parcelable.Creator<a> {
        C0214a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    protected a(Parcel parcel) {
        this.f14180a = parcel.readString();
        this.f14181b = parcel.readFloat();
        this.f14182c = parcel.readFloat();
    }

    public a(String str, float f10, float f11) {
        this.f14180a = str;
        this.f14181b = f10;
        this.f14182c = f11;
    }

    public String a() {
        return this.f14180a;
    }

    public float b() {
        return this.f14181b;
    }

    public float c() {
        return this.f14182c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14180a);
        parcel.writeFloat(this.f14181b);
        parcel.writeFloat(this.f14182c);
    }
}
