package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qa.h1 */
/* loaded from: classes.dex */
public enum EnumC10359h1 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<EnumC10359h1> CREATOR = new Parcelable.Creator() { // from class: qa.f1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC10359h1.m31144b(parcel.readString());
            } catch (C10355g1 e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC10359h1[i10];
        }
    };
    private final String zze;

    EnumC10359h1(String str) {
        this.zze = str;
    }

    /* renamed from: b */
    public static EnumC10359h1 m31144b(String str) {
        for (EnumC10359h1 enumC10359h1 : values()) {
            if (str.equals(enumC10359h1.zze)) {
                return enumC10359h1;
            }
        }
        throw new C10355g1(str);
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
