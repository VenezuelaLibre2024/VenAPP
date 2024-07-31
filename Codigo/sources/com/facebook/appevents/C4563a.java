package com.facebook.appevents;

import com.facebook.internal.C4634n0;
import java.io.Serializable;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7787a;
import p152i4.C7799e0;

/* renamed from: com.facebook.appevents.a */
/* loaded from: classes.dex */
public final class C4563a implements Serializable {

    /* renamed from: c */
    public static final a f8565c = new a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final String f8566a;

    /* renamed from: b */
    private final String f8567b;

    /* renamed from: com.facebook.appevents.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: com.facebook.appevents.a$b */
    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: c */
        public static final a f8568c = new a(null);
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a */
        private final String f8569a;

        /* renamed from: b */
        private final String f8570b;

        /* renamed from: com.facebook.appevents.a$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }
        }

        public b(String str, String appId) {
            C9322n.m27781e(appId, "appId");
            this.f8569a = str;
            this.f8570b = appId;
        }

        private final Object readResolve() {
            return new C4563a(this.f8569a, this.f8570b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4563a(C7787a accessToken) {
        this(accessToken.m23770m(), C7799e0.m23861m());
        C9322n.m27781e(accessToken, "accessToken");
    }

    public C4563a(String str, String applicationId) {
        C9322n.m27781e(applicationId, "applicationId");
        this.f8566a = applicationId;
        this.f8567b = C4634n0.m11300d0(str) ? null : str;
    }

    private final Object writeReplace() {
        return new b(this.f8567b, this.f8566a);
    }

    /* renamed from: a */
    public final String m10933a() {
        return this.f8567b;
    }

    /* renamed from: b */
    public final String m10934b() {
        return this.f8566a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4563a)) {
            return false;
        }
        C4634n0 c4634n0 = C4634n0.f8760a;
        C4563a c4563a = (C4563a) obj;
        return C4634n0.m11301e(c4563a.f8567b, this.f8567b) && C4634n0.m11301e(c4563a.f8566a, this.f8566a);
    }

    public int hashCode() {
        String str = this.f8567b;
        return (str == null ? 0 : str.hashCode()) ^ this.f8566a.hashCode();
    }
}
