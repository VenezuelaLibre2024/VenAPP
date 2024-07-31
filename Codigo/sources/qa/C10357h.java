package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;
import p081ea.C7140c;

/* renamed from: qa.h */
/* loaded from: classes.dex */
public class C10357h extends AbstractC10364j {
    public static final Parcelable.Creator<C10357h> CREATOR = new C10396t1();

    /* renamed from: a */
    private final byte[] f25872a;

    /* renamed from: b */
    private final byte[] f25873b;

    /* renamed from: c */
    private final byte[] f25874c;

    /* renamed from: d */
    private final String[] f25875d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10357h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f25872a = (byte[]) C5276s.m13324j(bArr);
        this.f25873b = (byte[]) C5276s.m13324j(bArr2);
        this.f25874c = (byte[]) C5276s.m13324j(bArr3);
        this.f25875d = (String[]) C5276s.m13324j(strArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10357h)) {
            return false;
        }
        C10357h c10357h = (C10357h) obj;
        return Arrays.equals(this.f25872a, c10357h.f25872a) && Arrays.equals(this.f25873b, c10357h.f25873b) && Arrays.equals(this.f25874c, c10357h.f25874c);
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(Arrays.hashCode(this.f25872a)), Integer.valueOf(Arrays.hashCode(this.f25873b)), Integer.valueOf(Arrays.hashCode(this.f25874c)));
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zzbf zzd = zzbf.zzd();
        byte[] bArr = this.f25872a;
        zza.zzb("keyHandle", zzd.zze(bArr, 0, bArr.length));
        zzbf zzd2 = zzbf.zzd();
        byte[] bArr2 = this.f25873b;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzd3 = zzbf.zzd();
        byte[] bArr3 = this.f25874c;
        zza.zzb("attestationObject", zzd3.zze(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f25875d));
        return zza.toString();
    }

    /* renamed from: u1 */
    public byte[] m31137u1() {
        return this.f25874c;
    }

    /* renamed from: v1 */
    public byte[] m31138v1() {
        return this.f25873b;
    }

    @Deprecated
    /* renamed from: w1 */
    public byte[] m31139w1() {
        return this.f25872a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21220l(parcel, 2, m31139w1(), false);
        C7140c.m21220l(parcel, 3, m31138v1(), false);
        C7140c.m21220l(parcel, 4, m31137u1(), false);
        C7140c.m21201H(parcel, 5, m31140x1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public String[] m31140x1() {
        return this.f25875d;
    }
}
