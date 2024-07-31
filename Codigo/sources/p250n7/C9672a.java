package p250n7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p216l7.C9400a;
import p361t6.C11108u1;
import p363t8.C11172r0;

/* renamed from: n7.a */
/* loaded from: classes.dex */
public final class C9672a implements C9400a.b {

    /* renamed from: a */
    public final String f23761a;

    /* renamed from: b */
    public final String f23762b;

    /* renamed from: c */
    public final long f23763c;

    /* renamed from: d */
    public final long f23764d;

    /* renamed from: e */
    public final byte[] f23765e;

    /* renamed from: f */
    private int f23766f;

    /* renamed from: r */
    private static final C11108u1 f23759r = new C11108u1.b().m34552g0("application/id3").m34526G();

    /* renamed from: s */
    private static final C11108u1 f23760s = new C11108u1.b().m34552g0("application/x-scte35").m34526G();
    public static final Parcelable.Creator<C9672a> CREATOR = new a();

    /* renamed from: n7.a$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C9672a> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9672a createFromParcel(Parcel parcel) {
            return new C9672a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9672a[] newArray(int i10) {
            return new C9672a[i10];
        }
    }

    C9672a(Parcel parcel) {
        this.f23761a = (String) C11172r0.m34928j(parcel.readString());
        this.f23762b = (String) C11172r0.m34928j(parcel.readString());
        this.f23763c = parcel.readLong();
        this.f23764d = parcel.readLong();
        this.f23765e = (byte[]) C11172r0.m34928j(parcel.createByteArray());
    }

    public C9672a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f23761a = str;
        this.f23762b = str2;
        this.f23763c = j10;
        this.f23764d = j11;
        this.f23765e = bArr;
    }

    @Override // p216l7.C9400a.b
    /* renamed from: H */
    public C11108u1 mo28002H() {
        String str = this.f23761a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f23760s;
            case 1:
            case 2:
                return f23759r;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9672a.class != obj.getClass()) {
            return false;
        }
        C9672a c9672a = (C9672a) obj;
        return this.f23763c == c9672a.f23763c && this.f23764d == c9672a.f23764d && C11172r0.m34914c(this.f23761a, c9672a.f23761a) && C11172r0.m34914c(this.f23762b, c9672a.f23762b) && Arrays.equals(this.f23765e, c9672a.f23765e);
    }

    public int hashCode() {
        if (this.f23766f == 0) {
            String str = this.f23761a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f23762b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f23763c;
            int i10 = (((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f23764d;
            this.f23766f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f23765e);
        }
        return this.f23766f;
    }

    @Override // p216l7.C9400a.b
    /* renamed from: q1 */
    public byte[] mo28004q1() {
        if (mo28002H() != null) {
            return this.f23765e;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f23761a + ", id=" + this.f23764d + ", durationMs=" + this.f23763c + ", value=" + this.f23762b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23761a);
        parcel.writeString(this.f23762b);
        parcel.writeLong(this.f23763c);
        parcel.writeLong(this.f23764d);
        parcel.writeByteArray(this.f23765e);
    }
}
