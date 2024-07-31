package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.u;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class s extends k0 {

    /* renamed from: e */
    private final String f8004e;

    /* renamed from: f */
    public static final b f8003f = new b(null);
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<s> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public s createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new s(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public s[] newArray(int i10) {
            return new s[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Parcel source) {
        super(source);
        kotlin.jvm.internal.n.e(source, "source");
        this.f8004e = "katana_proxy_auth";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.n.e(loginClient, "loginClient");
        this.f8004e = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.f0
    public String f() {
        return this.f8004e;
    }

    @Override // com.facebook.login.f0
    public boolean n() {
        return true;
    }

    @Override // com.facebook.login.f0
    public int o(u.e request) {
        kotlin.jvm.internal.n.e(request, "request");
        boolean z10 = i4.e0.f16965r && com.facebook.internal.f.a() != null && request.j().h();
        String a10 = u.f8005x.a();
        com.facebook.internal.e0 e0Var = com.facebook.internal.e0.f7730a;
        androidx.fragment.app.e i10 = d().i();
        String a11 = request.a();
        Set<String> n10 = request.n();
        boolean t10 = request.t();
        boolean p10 = request.p();
        e g10 = request.g();
        if (g10 == null) {
            g10 = e.NONE;
        }
        e eVar = g10;
        String c10 = c(request.b());
        String c11 = request.c();
        String l10 = request.l();
        boolean o10 = request.o();
        boolean r10 = request.r();
        boolean A = request.A();
        String m10 = request.m();
        String d10 = request.d();
        com.facebook.login.a e10 = request.e();
        List<Intent> n11 = com.facebook.internal.e0.n(i10, a11, n10, a10, t10, p10, eVar, c10, c11, z10, l10, o10, r10, A, m10, d10, e10 == null ? null : e10.name());
        a("e2e", a10);
        Iterator<Intent> it = n11.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11++;
            if (B(it.next(), u.f8005x.b())) {
                return i11;
            }
        }
        return 0;
    }
}
