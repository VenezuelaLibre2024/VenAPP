package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C0208a implements Parcelable {
    public static final Parcelable.Creator<C0208a> CREATOR = new a();

    /* renamed from: a */
    private final int f742a;

    /* renamed from: b */
    private final Intent f743b;

    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C0208a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0208a createFromParcel(Parcel parcel) {
            return new C0208a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0208a[] newArray(int i10) {
            return new C0208a[i10];
        }
    }

    public C0208a(int i10, Intent intent) {
        this.f742a = i10;
        this.f743b = intent;
    }

    C0208a(Parcel parcel) {
        this.f742a = parcel.readInt();
        this.f743b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static String m830c(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m831a() {
        return this.f743b;
    }

    /* renamed from: b */
    public int m832b() {
        return this.f742a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m830c(this.f742a) + ", data=" + this.f743b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f742a);
        parcel.writeInt(this.f743b == null ? 0 : 1);
        Intent intent = this.f743b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
