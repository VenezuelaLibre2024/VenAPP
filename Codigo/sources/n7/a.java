package n7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l7.a;
import t6.u1;
import t8.r0;

/* loaded from: classes.dex */
public final class a implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f21828a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21829b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21830c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21831d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f21832e;

    /* renamed from: f, reason: collision with root package name */
    private int f21833f;

    /* renamed from: r, reason: collision with root package name */
    private static final u1 f21826r = new u1.b().g0("application/id3").G();

    /* renamed from: s, reason: collision with root package name */
    private static final u1 f21827s = new u1.b().g0("application/x-scte35").G();
    public static final Parcelable.Creator<a> CREATOR = new C0356a();

    /* renamed from: n7.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0356a implements Parcelable.Creator<a> {
        C0356a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    a(Parcel parcel) {
        this.f21828a = (String) r0.j(parcel.readString());
        this.f21829b = (String) r0.j(parcel.readString());
        this.f21830c = parcel.readLong();
        this.f21831d = parcel.readLong();
        this.f21832e = (byte[]) r0.j(parcel.createByteArray());
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f21828a = str;
        this.f21829b = str2;
        this.f21830c = j10;
        this.f21831d = j11;
        this.f21832e = bArr;
    }

    @Override // l7.a.b
    public u1 H() {
        String str = this.f21828a;
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
                return f21827s;
            case 1:
            case 2:
                return f21826r;
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21830c == aVar.f21830c && this.f21831d == aVar.f21831d && r0.c(this.f21828a, aVar.f21828a) && r0.c(this.f21829b, aVar.f21829b) && Arrays.equals(this.f21832e, aVar.f21832e);
    }

    public int hashCode() {
        if (this.f21833f == 0) {
            String str = this.f21828a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f21829b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f21830c;
            int i10 = (((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f21831d;
            this.f21833f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f21832e);
        }
        return this.f21833f;
    }

    @Override // l7.a.b
    public byte[] q1() {
        if (H() != null) {
            return this.f21832e;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f21828a + ", id=" + this.f21831d + ", durationMs=" + this.f21830c + ", value=" + this.f21829b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21828a);
        parcel.writeString(this.f21829b);
        parcel.writeLong(this.f21830c);
        parcel.writeLong(this.f21831d);
        parcel.writeByteArray(this.f21832e);
    }
}
