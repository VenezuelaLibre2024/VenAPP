package com.facebook.appevents;

import com.facebook.internal.n0;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0131a f7590c = new C0131a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    private final String f7591a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7592b;

    /* renamed from: com.facebook.appevents.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0131a {
        private C0131a() {
        }

        public /* synthetic */ C0131a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final C0132a f7593c = new C0132a(null);
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a, reason: collision with root package name */
        private final String f7594a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7595b;

        /* renamed from: com.facebook.appevents.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0132a {
            private C0132a() {
            }

            public /* synthetic */ C0132a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(String str, String appId) {
            kotlin.jvm.internal.n.e(appId, "appId");
            this.f7594a = str;
            this.f7595b = appId;
        }

        private final Object readResolve() {
            return new a(this.f7594a, this.f7595b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(i4.a accessToken) {
        this(accessToken.m(), i4.e0.m());
        kotlin.jvm.internal.n.e(accessToken, "accessToken");
    }

    public a(String str, String applicationId) {
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        this.f7591a = applicationId;
        this.f7592b = n0.d0(str) ? null : str;
    }

    private final Object writeReplace() {
        return new b(this.f7592b, this.f7591a);
    }

    public final String a() {
        return this.f7592b;
    }

    public final String b() {
        return this.f7591a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        n0 n0Var = n0.f7780a;
        a aVar = (a) obj;
        return n0.e(aVar.f7592b, this.f7592b) && n0.e(aVar.f7591a, this.f7591a);
    }

    public int hashCode() {
        String str = this.f7592b;
        return (str == null ? 0 : str.hashCode()) ^ this.f7591a.hashCode();
    }
}
