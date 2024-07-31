package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum h1 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<h1> CREATOR = new Parcelable.Creator() { // from class: qa.f1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return h1.b(parcel.readString());
            } catch (g1 e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new h1[i10];
        }
    };
    private final String zze;

    h1(String str) {
        this.zze = str;
    }

    public static h1 b(String str) {
        for (h1 h1Var : values()) {
            if (str.equals(h1Var.zze)) {
                return h1Var;
            }
        }
        throw new g1(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zze);
    }
}
