package com.facebook.login;

import java.util.Set;
import kotlin.jvm.internal.C9322n;
import p152i4.C7787a;
import p152i4.C7806i;

/* renamed from: com.facebook.login.g0 */
/* loaded from: classes.dex */
public final class C4666g0 {

    /* renamed from: a */
    private final C7787a f8915a;

    /* renamed from: b */
    private final C7806i f8916b;

    /* renamed from: c */
    private final Set<String> f8917c;

    /* renamed from: d */
    private final Set<String> f8918d;

    public C4666g0(C7787a accessToken, C7806i c7806i, Set<String> recentlyGrantedPermissions, Set<String> recentlyDeniedPermissions) {
        C9322n.m27781e(accessToken, "accessToken");
        C9322n.m27781e(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        C9322n.m27781e(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.f8915a = accessToken;
        this.f8916b = c7806i;
        this.f8917c = recentlyGrantedPermissions;
        this.f8918d = recentlyDeniedPermissions;
    }

    /* renamed from: a */
    public final C7787a m11567a() {
        return this.f8915a;
    }

    /* renamed from: b */
    public final Set<String> m11568b() {
        return this.f8917c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4666g0)) {
            return false;
        }
        C4666g0 c4666g0 = (C4666g0) obj;
        return C9322n.m27777a(this.f8915a, c4666g0.f8915a) && C9322n.m27777a(this.f8916b, c4666g0.f8916b) && C9322n.m27777a(this.f8917c, c4666g0.f8917c) && C9322n.m27777a(this.f8918d, c4666g0.f8918d);
    }

    public int hashCode() {
        int hashCode = this.f8915a.hashCode() * 31;
        C7806i c7806i = this.f8916b;
        return ((((hashCode + (c7806i == null ? 0 : c7806i.hashCode())) * 31) + this.f8917c.hashCode()) * 31) + this.f8918d.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.f8915a + ", authenticationToken=" + this.f8916b + ", recentlyGrantedPermissions=" + this.f8917c + ", recentlyDeniedPermissions=" + this.f8918d + ')';
    }
}
