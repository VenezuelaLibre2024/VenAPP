package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzal;
import java.util.Arrays;

/* loaded from: classes.dex */
public class e0 extends ea.a {
    public static final Parcelable.Creator<e0> CREATOR = new d1();

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f23818c = new e0(a.SUPPORTED.toString(), null);

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f23819d = new e0(a.NOT_SUPPORTED.toString(), null);

    /* renamed from: a, reason: collision with root package name */
    private final a f23820a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23821b;

    /* loaded from: classes.dex */
    public enum a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<a> CREATOR = new c1();
        private final String zzb;

        a(String str) {
            this.zzb = str;
        }

        public static a b(String str) {
            for (a aVar : values()) {
                if (str.equals(aVar.zzb)) {
                    return aVar;
                }
            }
            throw new b(str);
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

    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(String str, String str2) {
        com.google.android.gms.common.internal.s.j(str);
        try {
            this.f23820a = a.b(str);
            this.f23821b = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return zzal.zza(this.f23820a, e0Var.f23820a) && zzal.zza(this.f23821b, e0Var.f23821b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23820a, this.f23821b});
    }

    public String u1() {
        return this.f23821b;
    }

    public String v1() {
        return this.f23820a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, v1(), false);
        ea.c.G(parcel, 3, u1(), false);
        ea.c.b(parcel, a10);
    }
}
