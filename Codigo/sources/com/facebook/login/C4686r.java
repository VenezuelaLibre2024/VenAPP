package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C4616e0;
import com.facebook.login.C4689u;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p152i4.EnumC7804h;

/* renamed from: com.facebook.login.r */
/* loaded from: classes.dex */
public final class C4686r extends AbstractC4674k0 {

    /* renamed from: e */
    private final String f8996e;

    /* renamed from: f */
    private final EnumC7804h f8997f;

    /* renamed from: r */
    public static final b f8995r = new b(null);
    public static final Parcelable.Creator<C4686r> CREATOR = new a();

    /* renamed from: com.facebook.login.r$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C4686r> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4686r createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C4686r(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4686r[] newArray(int i10) {
            return new C4686r[i10];
        }
    }

    /* renamed from: com.facebook.login.r$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4686r(Parcel source) {
        super(source);
        C9322n.m27781e(source, "source");
        this.f8996e = "instagram_login";
        this.f8997f = EnumC7804h.INSTAGRAM_APPLICATION_WEB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4686r(C4689u loginClient) {
        super(loginClient);
        C9322n.m27781e(loginClient, "loginClient");
        this.f8996e = "instagram_login";
        this.f8997f = EnumC7804h.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: f */
    public String mo11494f() {
        return this.f8996e;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: o */
    public int mo11498o(C4689u.e request) {
        C9322n.m27781e(request, "request");
        C4689u.c cVar = C4689u.f9000x;
        String m11713a = cVar.m11713a();
        C4616e0 c4616e0 = C4616e0.f8705a;
        Context m11696i = m11555d().m11696i();
        if (m11696i == null) {
            m11696i = C7799e0.m23860l();
        }
        String m11717a = request.m11717a();
        Set<String> m11730n = request.m11730n();
        boolean m11735t = request.m11735t();
        boolean m11732p = request.m11732p();
        EnumC4661e m11723g = request.m11723g();
        if (m11723g == null) {
            m11723g = EnumC4661e.NONE;
        }
        Intent m11164j = C4616e0.m11164j(m11696i, m11717a, m11730n, m11713a, m11735t, m11732p, m11723g, m11554c(request.m11718b()), request.m11719c(), request.m11728l(), request.m11731o(), request.m11733r(), request.m11716A());
        m11552a("e2e", m11713a);
        return m11577B(m11164j, cVar.m11714b()) ? 1 : 0;
    }

    @Override // com.facebook.login.AbstractC4674k0
    /* renamed from: u */
    public EnumC7804h mo11580u() {
        return this.f8997f;
    }

    @Override // com.facebook.login.AbstractC4664f0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        super.writeToParcel(dest, i10);
    }
}
