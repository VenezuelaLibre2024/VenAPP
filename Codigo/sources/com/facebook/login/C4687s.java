package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC1263e;
import com.facebook.internal.C4616e0;
import com.facebook.internal.C4617f;
import com.facebook.login.C4689u;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;

/* renamed from: com.facebook.login.s */
/* loaded from: classes.dex */
public final class C4687s extends AbstractC4674k0 {

    /* renamed from: e */
    private final String f8999e;

    /* renamed from: f */
    public static final b f8998f = new b(null);
    public static final Parcelable.Creator<C4687s> CREATOR = new a();

    /* renamed from: com.facebook.login.s$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<C4687s> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4687s createFromParcel(Parcel source) {
            C9322n.m27781e(source, "source");
            return new C4687s(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4687s[] newArray(int i10) {
            return new C4687s[i10];
        }
    }

    /* renamed from: com.facebook.login.s$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4687s(Parcel source) {
        super(source);
        C9322n.m27781e(source, "source");
        this.f8999e = "katana_proxy_auth";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4687s(C4689u loginClient) {
        super(loginClient);
        C9322n.m27781e(loginClient, "loginClient");
        this.f8999e = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: f */
    public String mo11494f() {
        return this.f8999e;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: n */
    public boolean mo11561n() {
        return true;
    }

    @Override // com.facebook.login.AbstractC4664f0
    /* renamed from: o */
    public int mo11498o(C4689u.e request) {
        C9322n.m27781e(request, "request");
        boolean z10 = C7799e0.f18618r && C4617f.m11195a() != null && request.m11726j().m11675h();
        String m11713a = C4689u.f9000x.m11713a();
        C4616e0 c4616e0 = C4616e0.f8705a;
        ActivityC1263e m11696i = m11555d().m11696i();
        String m11717a = request.m11717a();
        Set<String> m11730n = request.m11730n();
        boolean m11735t = request.m11735t();
        boolean m11732p = request.m11732p();
        EnumC4661e m11723g = request.m11723g();
        if (m11723g == null) {
            m11723g = EnumC4661e.NONE;
        }
        EnumC4661e enumC4661e = m11723g;
        String m11554c = m11554c(request.m11718b());
        String m11719c = request.m11719c();
        String m11728l = request.m11728l();
        boolean m11731o = request.m11731o();
        boolean m11733r = request.m11733r();
        boolean m11716A = request.m11716A();
        String m11729m = request.m11729m();
        String m11720d = request.m11720d();
        EnumC4653a m11721e = request.m11721e();
        List<Intent> m11168n = C4616e0.m11168n(m11696i, m11717a, m11730n, m11713a, m11735t, m11732p, enumC4661e, m11554c, m11719c, z10, m11728l, m11731o, m11733r, m11716A, m11729m, m11720d, m11721e == null ? null : m11721e.name());
        m11552a("e2e", m11713a);
        Iterator<Intent> it = m11168n.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            if (m11577B(it.next(), C4689u.f9000x.m11714b())) {
                return i10;
            }
        }
        return 0;
    }
}
