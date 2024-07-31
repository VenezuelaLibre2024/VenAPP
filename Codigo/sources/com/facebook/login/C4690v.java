package com.facebook.login;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: com.facebook.login.v */
/* loaded from: classes.dex */
public final class C4690v {

    /* renamed from: d */
    public static final a f9041d = new a(null);

    /* renamed from: a */
    private final Set<String> f9042a;

    /* renamed from: b */
    private final String f9043b;

    /* renamed from: c */
    private final String f9044c;

    /* renamed from: com.facebook.login.v$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4690v(Collection<String> collection, String nonce) {
        this(collection, nonce, C4678m0.m11632c());
        C9322n.m27781e(nonce, "nonce");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4690v(java.util.Collection r1, java.lang.String r2, int r3, kotlin.jvm.internal.C9315g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L11
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "randomUUID().toString()"
            kotlin.jvm.internal.C9322n.m27780d(r2, r3)
        L11:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C4690v.<init>(java.util.Collection, java.lang.String, int, kotlin.jvm.internal.g):void");
    }

    public C4690v(Collection<String> collection, String nonce, String codeVerifier) {
        C9322n.m27781e(nonce, "nonce");
        C9322n.m27781e(codeVerifier, "codeVerifier");
        if (!(C4676l0.m11584a(nonce) && C4678m0.m11633d(codeVerifier))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add("openid");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        C9322n.m27780d(unmodifiableSet, "unmodifiableSet(permissions)");
        this.f9042a = unmodifiableSet;
        this.f9043b = nonce;
        this.f9044c = codeVerifier;
    }

    /* renamed from: a */
    public final String m11753a() {
        return this.f9044c;
    }

    /* renamed from: b */
    public final String m11754b() {
        return this.f9043b;
    }

    /* renamed from: c */
    public final Set<String> m11755c() {
        return this.f9042a;
    }
}
