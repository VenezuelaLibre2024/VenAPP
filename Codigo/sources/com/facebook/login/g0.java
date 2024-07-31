package com.facebook.login;

import java.util.Set;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final i4.a f7935a;

    /* renamed from: b, reason: collision with root package name */
    private final i4.i f7936b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f7937c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<String> f7938d;

    public g0(i4.a accessToken, i4.i iVar, Set<String> recentlyGrantedPermissions, Set<String> recentlyDeniedPermissions) {
        kotlin.jvm.internal.n.e(accessToken, "accessToken");
        kotlin.jvm.internal.n.e(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        kotlin.jvm.internal.n.e(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.f7935a = accessToken;
        this.f7936b = iVar;
        this.f7937c = recentlyGrantedPermissions;
        this.f7938d = recentlyDeniedPermissions;
    }

    public final i4.a a() {
        return this.f7935a;
    }

    public final Set<String> b() {
        return this.f7937c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.n.a(this.f7935a, g0Var.f7935a) && kotlin.jvm.internal.n.a(this.f7936b, g0Var.f7936b) && kotlin.jvm.internal.n.a(this.f7937c, g0Var.f7937c) && kotlin.jvm.internal.n.a(this.f7938d, g0Var.f7938d);
    }

    public int hashCode() {
        int hashCode = this.f7935a.hashCode() * 31;
        i4.i iVar = this.f7936b;
        return ((((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.f7937c.hashCode()) * 31) + this.f7938d.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.f7935a + ", authenticationToken=" + this.f7936b + ", recentlyGrantedPermissions=" + this.f7937c + ", recentlyDeniedPermissions=" + this.f7938d + ')';
    }
}
