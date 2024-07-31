package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.z;

/* loaded from: classes.dex */
public enum z implements Parcelable {
    PUBLIC_KEY("public-key");

    public static final Parcelable.Creator<z> CREATOR = new Parcelable.Creator() { // from class: qa.z0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return z.b(parcel.readString());
            } catch (z.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new z[i10];
        }
    };
    private final String zzb = "public-key";

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    z(String str) {
    }

    public static z b(String str) {
        for (z zVar : values()) {
            if (str.equals(zVar.zzb)) {
                return zVar;
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
