package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.EnumC10342d0;

/* renamed from: qa.d0 */
/* loaded from: classes.dex */
public enum EnumC10342d0 implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<EnumC10342d0> CREATOR = new Parcelable.Creator() { // from class: qa.b1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            try {
                return EnumC10342d0.m31123b(readString);
            } catch (EnumC10342d0.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC10342d0[i10];
        }
    };
    private final String zzb;

    /* renamed from: qa.d0$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    EnumC10342d0(String str) {
        this.zzb = str;
    }

    /* renamed from: b */
    public static EnumC10342d0 m31123b(String str) {
        for (EnumC10342d0 enumC10342d0 : values()) {
            if (str.equals(enumC10342d0.zzb)) {
                return enumC10342d0;
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
