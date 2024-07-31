package com.facebook.login;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8042d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f8043a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8044b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8045c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Collection<String> collection, String nonce) {
        this(collection, nonce, m0.c());
        kotlin.jvm.internal.n.e(nonce, "nonce");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ v(java.util.Collection r1, java.lang.String r2, int r3, kotlin.jvm.internal.g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L11
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "randomUUID().toString()"
            kotlin.jvm.internal.n.d(r2, r3)
        L11:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.v.<init>(java.util.Collection, java.lang.String, int, kotlin.jvm.internal.g):void");
    }

    public v(Collection<String> collection, String nonce, String codeVerifier) {
        kotlin.jvm.internal.n.e(nonce, "nonce");
        kotlin.jvm.internal.n.e(codeVerifier, "codeVerifier");
        if (!(l0.a(nonce) && m0.d(codeVerifier))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add("openid");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        kotlin.jvm.internal.n.d(unmodifiableSet, "unmodifiableSet(permissions)");
        this.f8043a = unmodifiableSet;
        this.f8044b = nonce;
        this.f8045c = codeVerifier;
    }

    public final String a() {
        return this.f8045c;
    }

    public final String b() {
        return this.f8044b;
    }

    public final Set<String> c() {
        return this.f8043a;
    }
}
