package z7;

import android.net.Uri;
import t8.p0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f32404a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32405b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32406c;

    /* renamed from: d, reason: collision with root package name */
    private int f32407d;

    public i(String str, long j10, long j11) {
        this.f32406c = str == null ? "" : str;
        this.f32404a = j10;
        this.f32405b = j11;
    }

    public i a(i iVar, String str) {
        String c10 = c(str);
        if (iVar != null && c10.equals(iVar.c(str))) {
            long j10 = this.f32405b;
            if (j10 != -1) {
                long j11 = this.f32404a;
                if (j11 + j10 == iVar.f32404a) {
                    long j12 = iVar.f32405b;
                    return new i(c10, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f32405b;
            if (j13 != -1) {
                long j14 = iVar.f32404a;
                if (j14 + j13 == this.f32404a) {
                    return new i(c10, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return p0.e(str, this.f32406c);
    }

    public String c(String str) {
        return p0.d(str, this.f32406c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f32404a == iVar.f32404a && this.f32405b == iVar.f32405b && this.f32406c.equals(iVar.f32406c);
    }

    public int hashCode() {
        if (this.f32407d == 0) {
            this.f32407d = ((((527 + ((int) this.f32404a)) * 31) + ((int) this.f32405b)) * 31) + this.f32406c.hashCode();
        }
        return this.f32407d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f32406c + ", start=" + this.f32404a + ", length=" + this.f32405b + ")";
    }
}
