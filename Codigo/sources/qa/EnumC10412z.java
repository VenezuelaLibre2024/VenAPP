package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.EnumC10412z;

/* renamed from: qa.z */
/* loaded from: classes.dex */
public enum EnumC10412z implements Parcelable {
    PUBLIC_KEY("public-key");

    public static final Parcelable.Creator<EnumC10412z> CREATOR = new Parcelable.Creator() { // from class: qa.z0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC10412z.m31197b(parcel.readString());
            } catch (EnumC10412z.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC10412z[i10];
        }
    };
    private final String zzb = "public-key";

    /* renamed from: qa.z$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    EnumC10412z(String str) {
    }

    /* renamed from: b */
    public static EnumC10412z m31197b(String str) {
        for (EnumC10412z enumC10412z : values()) {
            if (str.equals(enumC10412z.zzb)) {
                return enumC10412z;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", str));
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
