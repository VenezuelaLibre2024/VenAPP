package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import p081ea.C7140c;
import qa.EnumC10385q;

/* renamed from: qa.i */
/* loaded from: classes.dex */
public class C10361i extends AbstractC10364j {
    public static final Parcelable.Creator<C10361i> CREATOR = new C10399u1();

    /* renamed from: a */
    private final EnumC10385q f25880a;

    /* renamed from: b */
    private final String f25881b;

    /* renamed from: c */
    private final int f25882c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10361i(int i10, String str, int i11) {
        try {
            this.f25880a = EnumC10385q.m31162h(i10);
            this.f25881b = str;
            this.f25882c = i11;
        } catch (EnumC10385q.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10361i)) {
            return false;
        }
        C10361i c10361i = (C10361i) obj;
        return C5270q.m13304b(this.f25880a, c10361i.f25880a) && C5270q.m13304b(this.f25881b, c10361i.f25881b) && C5270q.m13304b(Integer.valueOf(this.f25882c), Integer.valueOf(c10361i.f25882c));
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25880a, this.f25881b, Integer.valueOf(this.f25882c));
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zza.zza("errorCode", this.f25880a.m31163b());
        String str = this.f25881b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    /* renamed from: u1 */
    public int m31145u1() {
        return this.f25880a.m31163b();
    }

    /* renamed from: v1 */
    public String m31146v1() {
        return this.f25881b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 2, m31145u1());
        C7140c.m21200G(parcel, 3, m31146v1(), false);
        C7140c.m21229u(parcel, 4, this.f25882c);
        C7140c.m21210b(parcel, m21209a);
    }
}
