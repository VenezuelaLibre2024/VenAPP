package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;

/* loaded from: classes.dex */
public class g extends j {
    public static final Parcelable.Creator<g> CREATOR = new s1();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f23824a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f23825b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f23826c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f23827d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f23828e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f23824a = (byte[]) com.google.android.gms.common.internal.s.j(bArr);
        this.f23825b = (byte[]) com.google.android.gms.common.internal.s.j(bArr2);
        this.f23826c = (byte[]) com.google.android.gms.common.internal.s.j(bArr3);
        this.f23827d = (byte[]) com.google.android.gms.common.internal.s.j(bArr4);
        this.f23828e = bArr5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Arrays.equals(this.f23824a, gVar.f23824a) && Arrays.equals(this.f23825b, gVar.f23825b) && Arrays.equals(this.f23826c, gVar.f23826c) && Arrays.equals(this.f23827d, gVar.f23827d) && Arrays.equals(this.f23828e, gVar.f23828e);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(Arrays.hashCode(this.f23824a)), Integer.valueOf(Arrays.hashCode(this.f23825b)), Integer.valueOf(Arrays.hashCode(this.f23826c)), Integer.valueOf(Arrays.hashCode(this.f23827d)), Integer.valueOf(Arrays.hashCode(this.f23828e)));
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zzbf zzd = zzbf.zzd();
        byte[] bArr = this.f23824a;
        zza.zzb("keyHandle", zzd.zze(bArr, 0, bArr.length));
        zzbf zzd2 = zzbf.zzd();
        byte[] bArr2 = this.f23825b;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzd3 = zzbf.zzd();
        byte[] bArr3 = this.f23826c;
        zza.zzb("authenticatorData", zzd3.zze(bArr3, 0, bArr3.length));
        zzbf zzd4 = zzbf.zzd();
        byte[] bArr4 = this.f23827d;
        zza.zzb("signature", zzd4.zze(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f23828e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzbf.zzd().zze(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    public byte[] u1() {
        return this.f23826c;
    }

    public byte[] v1() {
        return this.f23825b;
    }

    @Deprecated
    public byte[] w1() {
        return this.f23824a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.l(parcel, 2, w1(), false);
        ea.c.l(parcel, 3, v1(), false);
        ea.c.l(parcel, 4, u1(), false);
        ea.c.l(parcel, 5, x1(), false);
        ea.c.l(parcel, 6, y1(), false);
        ea.c.b(parcel, a10);
    }

    public byte[] x1() {
        return this.f23827d;
    }

    public byte[] y1() {
        return this.f23828e;
    }
}
