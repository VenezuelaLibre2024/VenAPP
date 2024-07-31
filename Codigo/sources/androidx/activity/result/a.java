package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0016a();

    /* renamed from: a, reason: collision with root package name */
    private final int f677a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f678b;

    /* renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0016a implements Parcelable.Creator<a> {
        C0016a() {
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

    public a(int i10, Intent intent) {
        this.f677a = i10;
        this.f678b = intent;
    }

    a(Parcel parcel) {
        this.f677a = parcel.readInt();
        this.f678b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String c(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f678b;
    }

    public int b() {
        return this.f677a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f677a) + ", data=" + this.f678b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f677a);
        parcel.writeInt(this.f678b == null ? 0 : 1);
        Intent intent = this.f678b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
