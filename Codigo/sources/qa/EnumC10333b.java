package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.EnumC10333b;

/* renamed from: qa.b */
/* loaded from: classes.dex */
public enum EnumC10333b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<EnumC10333b> CREATOR = new Parcelable.Creator() { // from class: qa.i0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC10333b.m31119b(parcel.readString());
            } catch (EnumC10333b.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC10333b[i10];
        }
    };
    private final String zzb;

    /* renamed from: qa.b$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    EnumC10333b(String str) {
        this.zzb = str;
    }

    /* renamed from: b */
    public static EnumC10333b m31119b(String str) {
        for (EnumC10333b enumC10333b : values()) {
            if (str.equals(enumC10333b.zzb)) {
                return enumC10333b;
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
