package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.EnumC10337c;

/* renamed from: qa.c */
/* loaded from: classes.dex */
public enum EnumC10337c implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC10337c> CREATOR = new Parcelable.Creator() { // from class: qa.j1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC10337c.m31120b(parcel.readString());
            } catch (EnumC10337c.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC10337c[i10];
        }
    };
    private final String zzb;

    /* renamed from: qa.c$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    EnumC10337c(String str) {
        this.zzb = str;
    }

    /* renamed from: b */
    public static EnumC10337c m31120b(String str) {
        for (EnumC10337c enumC10337c : values()) {
            if (str.equals(enumC10337c.zzb)) {
                return enumC10337c;
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
