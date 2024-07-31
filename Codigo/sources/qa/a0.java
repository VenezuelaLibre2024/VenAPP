package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a0 extends ea.a {
    public static final Parcelable.Creator<a0> CREATOR = new a1();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f23798a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23799b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23800c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23801d;

    public a0(byte[] bArr, String str, String str2, String str3) {
        this.f23798a = (byte[]) com.google.android.gms.common.internal.s.j(bArr);
        this.f23799b = (String) com.google.android.gms.common.internal.s.j(str);
        this.f23800c = str2;
        this.f23801d = (String) com.google.android.gms.common.internal.s.j(str3);
    }

    public String R() {
        return this.f23801d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Arrays.equals(this.f23798a, a0Var.f23798a) && com.google.android.gms.common.internal.q.b(this.f23799b, a0Var.f23799b) && com.google.android.gms.common.internal.q.b(this.f23800c, a0Var.f23800c) && com.google.android.gms.common.internal.q.b(this.f23801d, a0Var.f23801d);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23798a, this.f23799b, this.f23800c, this.f23801d);
    }

    public String u1() {
        return this.f23800c;
    }

    public byte[] v1() {
        return this.f23798a;
    }

    public String w1() {
        return this.f23799b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.l(parcel, 2, v1(), false);
        ea.c.G(parcel, 3, w1(), false);
        ea.c.G(parcel, 4, u1(), false);
        ea.c.G(parcel, 5, R(), false);
        ea.c.b(parcel, a10);
    }
}
