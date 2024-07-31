package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.b;

/* loaded from: classes.dex */
public enum b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator() { // from class: qa.i0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return b.b(parcel.readString());
            } catch (b.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new b[i10];
        }
    };
    private final String zzb;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    b(String str) {
        this.zzb = str;
    }

    public static b b(String str) {
        for (b bVar : values()) {
            if (str.equals(bVar.zzb)) {
                return bVar;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzb);
    }
}
