package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h extends j {
    public static final Parcelable.Creator<h> CREATOR = new t1();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f23830a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f23831b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f23832c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f23833d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f23830a = (byte[]) com.google.android.gms.common.internal.s.j(bArr);
        this.f23831b = (byte[]) com.google.android.gms.common.internal.s.j(bArr2);
        this.f23832c = (byte[]) com.google.android.gms.common.internal.s.j(bArr3);
        this.f23833d = (String[]) com.google.android.gms.common.internal.s.j(strArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Arrays.equals(this.f23830a, hVar.f23830a) && Arrays.equals(this.f23831b, hVar.f23831b) && Arrays.equals(this.f23832c, hVar.f23832c);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(Arrays.hashCode(this.f23830a)), Integer.valueOf(Arrays.hashCode(this.f23831b)), Integer.valueOf(Arrays.hashCode(this.f23832c)));
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zzbf zzd = zzbf.zzd();
        byte[] bArr = this.f23830a;
        zza.zzb("keyHandle", zzd.zze(bArr, 0, bArr.length));
        zzbf zzd2 = zzbf.zzd();
        byte[] bArr2 = this.f23831b;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzd3 = zzbf.zzd();
        byte[] bArr3 = this.f23832c;
        zza.zzb("attestationObject", zzd3.zze(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f23833d));
        return zza.toString();
    }

    public byte[] u1() {
        return this.f23832c;
    }

    public byte[] v1() {
        return this.f23831b;
    }

    @Deprecated
    public byte[] w1() {
        return this.f23830a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.l(parcel, 2, w1(), false);
        ea.c.l(parcel, 3, v1(), false);
        ea.c.l(parcel, 4, u1(), false);
        ea.c.H(parcel, 5, x1(), false);
        ea.c.b(parcel, a10);
    }

    public String[] x1() {
        return this.f23833d;
    }
}
