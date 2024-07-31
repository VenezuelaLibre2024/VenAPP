package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import qa.q;

/* loaded from: classes.dex */
public class i extends j {
    public static final Parcelable.Creator<i> CREATOR = new u1();

    /* renamed from: a, reason: collision with root package name */
    private final q f23838a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23839b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23840c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i10, String str, int i11) {
        try {
            this.f23838a = q.h(i10);
            this.f23839b = str;
            this.f23840c = i11;
        } catch (q.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.google.android.gms.common.internal.q.b(this.f23838a, iVar.f23838a) && com.google.android.gms.common.internal.q.b(this.f23839b, iVar.f23839b) && com.google.android.gms.common.internal.q.b(Integer.valueOf(this.f23840c), Integer.valueOf(iVar.f23840c));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23838a, this.f23839b, Integer.valueOf(this.f23840c));
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zza.zza("errorCode", this.f23838a.b());
        String str = this.f23839b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    public int u1() {
        return this.f23838a.b();
    }

    public String v1() {
        return this.f23839b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 2, u1());
        ea.c.G(parcel, 3, v1(), false);
        ea.c.u(parcel, 4, this.f23840c);
        ea.c.b(parcel, a10);
    }
}
