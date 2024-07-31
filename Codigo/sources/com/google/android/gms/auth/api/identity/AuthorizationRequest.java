package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import ea.c;
import java.util.List;

/* loaded from: classes.dex */
public class AuthorizationRequest extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();

    /* renamed from: a, reason: collision with root package name */
    private final List f9207a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9208b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9209c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9210d;

    /* renamed from: e, reason: collision with root package name */
    private final Account f9211e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9212f;

    /* renamed from: r, reason: collision with root package name */
    private final String f9213r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f9214s;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private List f9215a;

        /* renamed from: b, reason: collision with root package name */
        private String f9216b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9217c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9218d;

        /* renamed from: e, reason: collision with root package name */
        private Account f9219e;

        /* renamed from: f, reason: collision with root package name */
        private String f9220f;

        /* renamed from: g, reason: collision with root package name */
        private String f9221g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f9222h;

        private final String h(String str) {
            s.j(str);
            String str2 = this.f9216b;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            s.b(z10, "two different server client ids provided");
            return str;
        }

        public AuthorizationRequest a() {
            return new AuthorizationRequest(this.f9215a, this.f9216b, this.f9217c, this.f9218d, this.f9219e, this.f9220f, this.f9221g, this.f9222h);
        }

        public a b(String str) {
            this.f9220f = s.f(str);
            return this;
        }

        public a c(String str, boolean z10) {
            h(str);
            this.f9216b = str;
            this.f9217c = true;
            this.f9222h = z10;
            return this;
        }

        public a d(Account account) {
            this.f9219e = (Account) s.j(account);
            return this;
        }

        public a e(List<Scope> list) {
            boolean z10 = false;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            }
            s.b(z10, "requestedScopes cannot be null or empty");
            this.f9215a = list;
            return this;
        }

        public final a f(String str) {
            h(str);
            this.f9216b = str;
            this.f9218d = true;
            return this;
        }

        public final a g(String str) {
            this.f9221g = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthorizationRequest(List list, String str, boolean z10, boolean z11, Account account, String str2, String str3, boolean z12) {
        boolean z13 = false;
        if (list != null && !list.isEmpty()) {
            z13 = true;
        }
        s.b(z13, "requestedScopes cannot be null or empty");
        this.f9207a = list;
        this.f9208b = str;
        this.f9209c = z10;
        this.f9210d = z11;
        this.f9211e = account;
        this.f9212f = str2;
        this.f9213r = str3;
        this.f9214s = z12;
    }

    public static a A1(AuthorizationRequest authorizationRequest) {
        s.j(authorizationRequest);
        a u12 = u1();
        u12.e(authorizationRequest.w1());
        boolean y12 = authorizationRequest.y1();
        String str = authorizationRequest.f9213r;
        String v12 = authorizationRequest.v1();
        Account c12 = authorizationRequest.c1();
        String x12 = authorizationRequest.x1();
        if (str != null) {
            u12.g(str);
        }
        if (v12 != null) {
            u12.b(v12);
        }
        if (c12 != null) {
            u12.d(c12);
        }
        if (authorizationRequest.f9210d && x12 != null) {
            u12.f(x12);
        }
        if (authorizationRequest.z1() && x12 != null) {
            u12.c(x12, y12);
        }
        return u12;
    }

    public static a u1() {
        return new a();
    }

    public Account c1() {
        return this.f9211e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        return this.f9207a.size() == authorizationRequest.f9207a.size() && this.f9207a.containsAll(authorizationRequest.f9207a) && this.f9209c == authorizationRequest.f9209c && this.f9214s == authorizationRequest.f9214s && this.f9210d == authorizationRequest.f9210d && q.b(this.f9208b, authorizationRequest.f9208b) && q.b(this.f9211e, authorizationRequest.f9211e) && q.b(this.f9212f, authorizationRequest.f9212f) && q.b(this.f9213r, authorizationRequest.f9213r);
    }

    public int hashCode() {
        return q.c(this.f9207a, this.f9208b, Boolean.valueOf(this.f9209c), Boolean.valueOf(this.f9214s), Boolean.valueOf(this.f9210d), this.f9211e, this.f9212f, this.f9213r);
    }

    public String v1() {
        return this.f9212f;
    }

    public List<Scope> w1() {
        return this.f9207a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.K(parcel, 1, w1(), false);
        c.G(parcel, 2, x1(), false);
        c.g(parcel, 3, z1());
        c.g(parcel, 4, this.f9210d);
        c.E(parcel, 5, c1(), i10, false);
        c.G(parcel, 6, v1(), false);
        c.G(parcel, 7, this.f9213r, false);
        c.g(parcel, 8, y1());
        c.b(parcel, a10);
    }

    public String x1() {
        return this.f9208b;
    }

    public boolean y1() {
        return this.f9214s;
    }

    public boolean z1() {
        return this.f9209c;
    }
}
