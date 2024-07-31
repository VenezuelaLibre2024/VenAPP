package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.d0;

/* loaded from: classes.dex */
public enum d0 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<d0> CREATOR = new Parcelable.Creator() { // from class: qa.b1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            try {
                return d0.b(readString);
            } catch (d0.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new d0[i10];
        }
    };
    private final String zzb;

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    d0(String str) {
        this.zzb = str;
    }

    public static d0 b(String str) {
        for (d0 d0Var : values()) {
            if (str.equals(d0Var.zzb)) {
                return d0Var;
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
