package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.l */
/* loaded from: classes2.dex */
public final class C5383l extends AbstractC7138a {
    public static final Parcelable.Creator<C5383l> CREATOR = new C5404v0();

    /* renamed from: a */
    private final long f10958a;

    /* renamed from: b */
    private final int f10959b;

    /* renamed from: c */
    private final boolean f10960c;

    /* renamed from: d */
    private final String f10961d;

    /* renamed from: e */
    private final zzd f10962e;

    /* renamed from: com.google.android.gms.location.l$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private long f10963a = Long.MAX_VALUE;

        /* renamed from: b */
        private int f10964b = 0;

        /* renamed from: c */
        private boolean f10965c = false;

        /* renamed from: d */
        private String f10966d = null;

        /* renamed from: e */
        private zzd f10967e = null;

        /* renamed from: a */
        public C5383l m13529a() {
            return new C5383l(this.f10963a, this.f10964b, this.f10965c, this.f10966d, this.f10967e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5383l(long j10, int i10, boolean z10, String str, zzd zzdVar) {
        this.f10958a = j10;
        this.f10959b = i10;
        this.f10960c = z10;
        this.f10961d = str;
        this.f10962e = zzdVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5383l)) {
            return false;
        }
        C5383l c5383l = (C5383l) obj;
        return this.f10958a == c5383l.f10958a && this.f10959b == c5383l.f10959b && this.f10960c == c5383l.f10960c && C5270q.m13304b(this.f10961d, c5383l.f10961d) && C5270q.m13304b(this.f10962e, c5383l.f10962e);
    }

    public int hashCode() {
        return C5270q.m13305c(Long.valueOf(this.f10958a), Integer.valueOf(this.f10959b), Boolean.valueOf(this.f10960c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f10958a != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            zzdj.zzb(this.f10958a, sb2);
        }
        if (this.f10959b != 0) {
            sb2.append(", ");
            sb2.append(C5390o0.m13533b(this.f10959b));
        }
        if (this.f10960c) {
            sb2.append(", bypass");
        }
        if (this.f10961d != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f10961d);
        }
        if (this.f10962e != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f10962e);
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: u1 */
    public int m13527u1() {
        return this.f10959b;
    }

    /* renamed from: v1 */
    public long m13528v1() {
        return this.f10958a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21234z(parcel, 1, m13528v1());
        C7140c.m21229u(parcel, 2, m13527u1());
        C7140c.m21215g(parcel, 3, this.f10960c);
        C7140c.m21200G(parcel, 4, this.f10961d, false);
        C7140c.m21198E(parcel, 5, this.f10962e, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
