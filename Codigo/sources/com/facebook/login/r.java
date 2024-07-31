package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.u;
import java.util.Set;

/* loaded from: classes.dex */
public final class r extends k0 {

    /* renamed from: e */
    private final String f8001e;

    /* renamed from: f */
    private final i4.h f8002f;

    /* renamed from: r */
    public static final b f8000r = new b(null);
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<r> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public r createFromParcel(Parcel source) {
            kotlin.jvm.internal.n.e(source, "source");
            return new r(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public r[] newArray(int i10) {
            return new r[i10];
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
    public r(Parcel source) {
        super(source);
        kotlin.jvm.internal.n.e(source, "source");
        this.f8001e = "instagram_login";
        this.f8002f = i4.h.INSTAGRAM_APPLICATION_WEB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.n.e(loginClient, "loginClient");
        this.f8001e = "instagram_login";
        this.f8002f = i4.h.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.f0
    public String f() {
        return this.f8001e;
    }

    @Override // com.facebook.login.f0
    public int o(u.e request) {
        kotlin.jvm.internal.n.e(request, "request");
        u.c cVar = u.f8005x;
        String a10 = cVar.a();
        com.facebook.internal.e0 e0Var = com.facebook.internal.e0.f7730a;
        Context i10 = d().i();
        if (i10 == null) {
            i10 = i4.e0.l();
        }
        String a11 = request.a();
        Set<String> n10 = request.n();
        boolean t10 = request.t();
        boolean p10 = request.p();
        e g10 = request.g();
        if (g10 == null) {
            g10 = e.NONE;
        }
        Intent j10 = com.facebook.internal.e0.j(i10, a11, n10, a10, t10, p10, g10, c(request.b()), request.c(), request.l(), request.o(), request.r(), request.A());
        a("e2e", a10);
        return B(j10, cVar.b()) ? 1 : 0;
    }

    @Override // com.facebook.login.k0
    public i4.h u() {
        return this.f8002f;
    }

    @Override // com.facebook.login.f0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.e(dest, "dest");
        super.writeToParcel(dest, i10);
    }
}
