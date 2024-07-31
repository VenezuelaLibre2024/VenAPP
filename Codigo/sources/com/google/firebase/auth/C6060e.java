package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.e */
/* loaded from: classes.dex */
public class C6060e extends AbstractC7138a {
    public static final Parcelable.Creator<C6060e> CREATOR = new C6147z1();

    /* renamed from: a */
    private final String f12869a;

    /* renamed from: b */
    private final String f12870b;

    /* renamed from: c */
    private final String f12871c;

    /* renamed from: d */
    private final String f12872d;

    /* renamed from: e */
    private final boolean f12873e;

    /* renamed from: f */
    private final String f12874f;

    /* renamed from: r */
    private final boolean f12875r;

    /* renamed from: s */
    private String f12876s;

    /* renamed from: t */
    private int f12877t;

    /* renamed from: u */
    private String f12878u;

    /* renamed from: com.google.firebase.auth.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f12879a;

        /* renamed from: b */
        private String f12880b;

        /* renamed from: c */
        private String f12881c;

        /* renamed from: d */
        private boolean f12882d;

        /* renamed from: e */
        private String f12883e;

        /* renamed from: f */
        private boolean f12884f;

        /* renamed from: g */
        private String f12885g;

        private a() {
            this.f12884f = false;
        }

        /* renamed from: a */
        public C6060e m16512a() {
            if (this.f12879a != null) {
                return new C6060e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        /* renamed from: b */
        public a m16513b(String str, boolean z10, String str2) {
            this.f12881c = str;
            this.f12882d = z10;
            this.f12883e = str2;
            return this;
        }

        /* renamed from: c */
        public a m16514c(String str) {
            this.f12885g = str;
            return this;
        }

        /* renamed from: d */
        public a m16515d(boolean z10) {
            this.f12884f = z10;
            return this;
        }

        /* renamed from: e */
        public a m16516e(String str) {
            this.f12880b = str;
            return this;
        }

        /* renamed from: f */
        public a m16517f(String str) {
            this.f12879a = str;
            return this;
        }
    }

    private C6060e(a aVar) {
        this.f12869a = aVar.f12879a;
        this.f12870b = aVar.f12880b;
        this.f12871c = null;
        this.f12872d = aVar.f12881c;
        this.f12873e = aVar.f12882d;
        this.f12874f = aVar.f12883e;
        this.f12875r = aVar.f12884f;
        this.f12878u = aVar.f12885g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6060e(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7) {
        this.f12869a = str;
        this.f12870b = str2;
        this.f12871c = str3;
        this.f12872d = str4;
        this.f12873e = z10;
        this.f12874f = str5;
        this.f12875r = z11;
        this.f12876s = str6;
        this.f12877t = i10;
        this.f12878u = str7;
    }

    /* renamed from: A1 */
    public static a m16495A1() {
        return new a();
    }

    /* renamed from: D1 */
    public static C6060e m16496D1() {
        return new C6060e(new a());
    }

    /* renamed from: B1 */
    public final void m16497B1(int i10) {
        this.f12877t = i10;
    }

    /* renamed from: C1 */
    public final void m16498C1(String str) {
        this.f12876s = str;
    }

    /* renamed from: u1 */
    public boolean m16499u1() {
        return this.f12875r;
    }

    /* renamed from: v1 */
    public boolean m16500v1() {
        return this.f12873e;
    }

    /* renamed from: w1 */
    public String m16501w1() {
        return this.f12874f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, m16504z1(), false);
        C7140c.m21200G(parcel, 2, m16503y1(), false);
        C7140c.m21200G(parcel, 3, this.f12871c, false);
        C7140c.m21200G(parcel, 4, m16502x1(), false);
        C7140c.m21215g(parcel, 5, m16500v1());
        C7140c.m21200G(parcel, 6, m16501w1(), false);
        C7140c.m21215g(parcel, 7, m16499u1());
        C7140c.m21200G(parcel, 8, this.f12876s, false);
        C7140c.m21229u(parcel, 9, this.f12877t);
        C7140c.m21200G(parcel, 10, this.f12878u, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public String m16502x1() {
        return this.f12872d;
    }

    /* renamed from: y1 */
    public String m16503y1() {
        return this.f12870b;
    }

    /* renamed from: z1 */
    public String m16504z1() {
        return this.f12869a;
    }

    public final int zza() {
        return this.f12877t;
    }

    public final String zzc() {
        return this.f12878u;
    }

    public final String zzd() {
        return this.f12871c;
    }

    public final String zze() {
        return this.f12876s;
    }
}
