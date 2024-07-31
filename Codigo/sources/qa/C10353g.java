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

/* renamed from: qa.g */
/* loaded from: classes.dex */
public class C10353g extends AbstractC10364j {
    public static final Parcelable.Creator<C10353g> CREATOR = new C10393s1();

    /* renamed from: a */
    private final byte[] f25866a;

    /* renamed from: b */
    private final byte[] f25867b;

    /* renamed from: c */
    private final byte[] f25868c;

    /* renamed from: d */
    private final byte[] f25869d;

    /* renamed from: e */
    private final byte[] f25870e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10353g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f25866a = (byte[]) C5276s.m13324j(bArr);
        this.f25867b = (byte[]) C5276s.m13324j(bArr2);
        this.f25868c = (byte[]) C5276s.m13324j(bArr3);
        this.f25869d = (byte[]) C5276s.m13324j(bArr4);
        this.f25870e = bArr5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10353g)) {
            return false;
        }
        C10353g c10353g = (C10353g) obj;
        return Arrays.equals(this.f25866a, c10353g.f25866a) && Arrays.equals(this.f25867b, c10353g.f25867b) && Arrays.equals(this.f25868c, c10353g.f25868c) && Arrays.equals(this.f25869d, c10353g.f25869d) && Arrays.equals(this.f25870e, c10353g.f25870e);
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(Arrays.hashCode(this.f25866a)), Integer.valueOf(Arrays.hashCode(this.f25867b)), Integer.valueOf(Arrays.hashCode(this.f25868c)), Integer.valueOf(Arrays.hashCode(this.f25869d)), Integer.valueOf(Arrays.hashCode(this.f25870e)));
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zzbf zzd = zzbf.zzd();
        byte[] bArr = this.f25866a;
        zza.zzb("keyHandle", zzd.zze(bArr, 0, bArr.length));
        zzbf zzd2 = zzbf.zzd();
        byte[] bArr2 = this.f25867b;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzd3 = zzbf.zzd();
        byte[] bArr3 = this.f25868c;
        zza.zzb("authenticatorData", zzd3.zze(bArr3, 0, bArr3.length));
        zzbf zzd4 = zzbf.zzd();
        byte[] bArr4 = this.f25869d;
        zza.zzb("signature", zzd4.zze(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f25870e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzbf.zzd().zze(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    /* renamed from: u1 */
    public byte[] m31131u1() {
        return this.f25868c;
    }

    /* renamed from: v1 */
    public byte[] m31132v1() {
        return this.f25867b;
    }

    @Deprecated
    /* renamed from: w1 */
    public byte[] m31133w1() {
        return this.f25866a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21220l(parcel, 2, m31133w1(), false);
        C7140c.m21220l(parcel, 3, m31132v1(), false);
        C7140c.m21220l(parcel, 4, m31131u1(), false);
        C7140c.m21220l(parcel, 5, m31134x1(), false);
        C7140c.m21220l(parcel, 6, m31135y1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public byte[] m31134x1() {
        return this.f25869d;
    }

    /* renamed from: y1 */
    public byte[] m31135y1() {
        return this.f25870e;
    }
}
