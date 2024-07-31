package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.fido.zzal;
import java.util.Arrays;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.e0 */
/* loaded from: classes.dex */
public class C10346e0 extends AbstractC7138a {
    public static final Parcelable.Creator<C10346e0> CREATOR = new C10343d1();

    /* renamed from: c */
    public static final C10346e0 f25860c = new C10346e0(a.SUPPORTED.toString(), null);

    /* renamed from: d */
    public static final C10346e0 f25861d = new C10346e0(a.NOT_SUPPORTED.toString(), null);

    /* renamed from: a */
    private final a f25862a;

    /* renamed from: b */
    private final String f25863b;

    /* renamed from: qa.e0$a */
    /* loaded from: classes.dex */
    public enum a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<a> CREATOR = new C10339c1();
        private final String zzb;

        a(String str) {
            this.zzb = str;
        }

        /* renamed from: b */
        public static a m31128b(String str) {
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

    /* renamed from: qa.e0$b */
    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10346e0(String str, String str2) {
        C5276s.m13324j(str);
        try {
            this.f25862a = a.m31128b(str);
            this.f25863b = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10346e0)) {
            return false;
        }
        C10346e0 c10346e0 = (C10346e0) obj;
        return zzal.zza(this.f25862a, c10346e0.f25862a) && zzal.zza(this.f25863b, c10346e0.f25863b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25862a, this.f25863b});
    }

    /* renamed from: u1 */
    public String m31126u1() {
        return this.f25863b;
    }

    /* renamed from: v1 */
    public String m31127v1() {
        return this.f25862a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, m31127v1(), false);
        C7140c.m21200G(parcel, 3, m31126u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
