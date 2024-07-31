package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import qa.EnumC10385q;

/* renamed from: qa.q */
/* loaded from: classes.dex */
public enum EnumC10385q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC10385q> CREATOR = new Parcelable.Creator() { // from class: qa.f2
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return EnumC10385q.m31162h(parcel.readInt());
            } catch (EnumC10385q.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EnumC10385q[i10];
        }
    };
    private final int zzb;

    /* renamed from: qa.q$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(int i10) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i10)));
        }
    }

    EnumC10385q(int i10) {
        this.zzb = i10;
    }

    /* renamed from: h */
    public static EnumC10385q m31162h(int i10) {
        for (EnumC10385q enumC10385q : values()) {
            if (i10 == enumC10385q.zzb) {
                return enumC10385q;
            }
        }
        throw new a(i10);
    }

    /* renamed from: b */
    public int m31163b() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb);
    }
}
