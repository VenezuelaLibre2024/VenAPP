package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import la.C9477v;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.e */
/* loaded from: classes2.dex */
public final class C5369e extends AbstractC7138a {
    public static final Parcelable.Creator<C5369e> CREATOR = new C5384l0();

    /* renamed from: a */
    private final long f10920a;

    /* renamed from: b */
    private final int f10921b;

    /* renamed from: c */
    private final int f10922c;

    /* renamed from: d */
    private final long f10923d;

    /* renamed from: e */
    private final boolean f10924e;

    /* renamed from: f */
    private final int f10925f;

    /* renamed from: r */
    private final String f10926r;

    /* renamed from: s */
    private final WorkSource f10927s;

    /* renamed from: t */
    private final zzd f10928t;

    /* renamed from: com.google.android.gms.location.e$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private long f10929a = 60000;

        /* renamed from: b */
        private int f10930b = 0;

        /* renamed from: c */
        private int f10931c = 102;

        /* renamed from: d */
        private long f10932d = Long.MAX_VALUE;

        /* renamed from: e */
        private boolean f10933e = false;

        /* renamed from: f */
        private int f10934f = 0;

        /* renamed from: g */
        private String f10935g = null;

        /* renamed from: h */
        private WorkSource f10936h = null;

        /* renamed from: i */
        private zzd f10937i = null;

        /* renamed from: a */
        public C5369e m13517a() {
            return new C5369e(this.f10929a, this.f10930b, this.f10931c, this.f10932d, this.f10933e, this.f10934f, this.f10935g, new WorkSource(this.f10936h), this.f10937i);
        }

        /* renamed from: b */
        public a m13518b(int i10) {
            C5364b0.m13506a(i10);
            this.f10931c = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5369e(long j10, int i10, int i11, long j11, boolean z10, int i12, String str, WorkSource workSource, zzd zzdVar) {
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z11 = false;
        }
        C5276s.m13315a(z11);
        this.f10920a = j10;
        this.f10921b = i10;
        this.f10922c = i11;
        this.f10923d = j11;
        this.f10924e = z10;
        this.f10925f = i12;
        this.f10926r = str;
        this.f10927s = workSource;
        this.f10928t = zzdVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5369e)) {
            return false;
        }
        C5369e c5369e = (C5369e) obj;
        return this.f10920a == c5369e.f10920a && this.f10921b == c5369e.f10921b && this.f10922c == c5369e.f10922c && this.f10923d == c5369e.f10923d && this.f10924e == c5369e.f10924e && this.f10925f == c5369e.f10925f && C5270q.m13304b(this.f10926r, c5369e.f10926r) && C5270q.m13304b(this.f10927s, c5369e.f10927s) && C5270q.m13304b(this.f10928t, c5369e.f10928t);
    }

    public int hashCode() {
        return C5270q.m13305c(Long.valueOf(this.f10920a), Integer.valueOf(this.f10921b), Integer.valueOf(this.f10922c), Long.valueOf(this.f10923d));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(C5364b0.m13507b(this.f10922c));
        if (this.f10920a != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            zzdj.zzb(this.f10920a, sb2);
        }
        if (this.f10923d != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.f10923d);
            sb2.append("ms");
        }
        if (this.f10921b != 0) {
            sb2.append(", ");
            sb2.append(C5390o0.m13533b(this.f10921b));
        }
        if (this.f10924e) {
            sb2.append(", bypass");
        }
        if (this.f10925f != 0) {
            sb2.append(", ");
            sb2.append(C5368d0.m13511a(this.f10925f));
        }
        if (this.f10926r != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f10926r);
        }
        if (!C9477v.m28186d(this.f10927s)) {
            sb2.append(", workSource=");
            sb2.append(this.f10927s);
        }
        if (this.f10928t != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f10928t);
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: u1 */
    public long m13512u1() {
        return this.f10923d;
    }

    /* renamed from: v1 */
    public int m13513v1() {
        return this.f10921b;
    }

    /* renamed from: w1 */
    public long m13514w1() {
        return this.f10920a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21234z(parcel, 1, m13514w1());
        C7140c.m21229u(parcel, 2, m13513v1());
        C7140c.m21229u(parcel, 3, m13515x1());
        C7140c.m21234z(parcel, 4, m13512u1());
        C7140c.m21215g(parcel, 5, this.f10924e);
        C7140c.m21198E(parcel, 6, this.f10927s, i10, false);
        C7140c.m21229u(parcel, 7, this.f10925f);
        C7140c.m21200G(parcel, 8, this.f10926r, false);
        C7140c.m21198E(parcel, 9, this.f10928t, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public int m13515x1() {
        return this.f10922c;
    }

    /* renamed from: y1 */
    public final WorkSource m13516y1() {
        return this.f10927s;
    }

    public final int zza() {
        return this.f10925f;
    }

    @Deprecated
    public final String zzd() {
        return this.f10926r;
    }

    public final boolean zze() {
        return this.f10924e;
    }
}
