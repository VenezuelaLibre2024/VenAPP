package com.google.firebase.installations;

import com.google.firebase.installations.AbstractC6200g;

/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes.dex */
final class C6194a extends AbstractC6200g {

    /* renamed from: a */
    private final String f13177a;

    /* renamed from: b */
    private final long f13178b;

    /* renamed from: c */
    private final long f13179c;

    /* renamed from: com.google.firebase.installations.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC6200g.a {

        /* renamed from: a */
        private String f13180a;

        /* renamed from: b */
        private Long f13181b;

        /* renamed from: c */
        private Long f13182c;

        @Override // com.google.firebase.installations.AbstractC6200g.a
        /* renamed from: a */
        public AbstractC6200g mo16817a() {
            String str = "";
            if (this.f13180a == null) {
                str = " token";
            }
            if (this.f13181b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f13182c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6194a(this.f13180a, this.f13181b.longValue(), this.f13182c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.AbstractC6200g.a
        /* renamed from: b */
        public AbstractC6200g.a mo16818b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f13180a = str;
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC6200g.a
        /* renamed from: c */
        public AbstractC6200g.a mo16819c(long j10) {
            this.f13182c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC6200g.a
        /* renamed from: d */
        public AbstractC6200g.a mo16820d(long j10) {
            this.f13181b = Long.valueOf(j10);
            return this;
        }
    }

    private C6194a(String str, long j10, long j11) {
        this.f13177a = str;
        this.f13178b = j10;
        this.f13179c = j11;
    }

    @Override // com.google.firebase.installations.AbstractC6200g
    /* renamed from: b */
    public String mo16814b() {
        return this.f13177a;
    }

    @Override // com.google.firebase.installations.AbstractC6200g
    /* renamed from: c */
    public long mo16815c() {
        return this.f13179c;
    }

    @Override // com.google.firebase.installations.AbstractC6200g
    /* renamed from: d */
    public long mo16816d() {
        return this.f13178b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6200g)) {
            return false;
        }
        AbstractC6200g abstractC6200g = (AbstractC6200g) obj;
        return this.f13177a.equals(abstractC6200g.mo16814b()) && this.f13178b == abstractC6200g.mo16816d() && this.f13179c == abstractC6200g.mo16815c();
    }

    public int hashCode() {
        int hashCode = (this.f13177a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f13178b;
        long j11 = this.f13179c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f13177a + ", tokenExpirationTimestamp=" + this.f13178b + ", tokenCreationTimestamp=" + this.f13179c + "}";
    }
}
