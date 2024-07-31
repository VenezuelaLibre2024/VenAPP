package p331ra;

import android.os.Parcel;
import android.os.Parcelable;
import p331ra.EnumC10659c;

@Deprecated
/* renamed from: ra.c */
/* loaded from: classes.dex */
public enum EnumC10659c implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final Parcelable.Creator<EnumC10659c> CREATOR = new Parcelable.Creator() { // from class: ra.i
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC10659c.m32451b(parcel.readString());
            } catch (EnumC10659c.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC10659c[i10];
        }
    };
    private final String zzb;

    /* renamed from: ra.c$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Protocol version %s not supported", str));
        }
    }

    EnumC10659c(String str) {
        this.zzb = str;
    }

    /* renamed from: b */
    public static EnumC10659c m32451b(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (EnumC10659c enumC10659c : values()) {
            if (str.equals(enumC10659c.zzb)) {
                return enumC10659c;
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
