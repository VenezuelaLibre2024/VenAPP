package com.google.firebase.installations;

import com.google.firebase.installations.g;

/* loaded from: classes.dex */
final class a extends g {

    /* renamed from: a */
    private final String f11962a;

    /* renamed from: b */
    private final long f11963b;

    /* renamed from: c */
    private final long f11964c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends g.a {

        /* renamed from: a */
        private String f11965a;

        /* renamed from: b */
        private Long f11966b;

        /* renamed from: c */
        private Long f11967c;

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f11965a == null) {
                str = " token";
            }
            if (this.f11966b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f11967c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f11965a, this.f11966b.longValue(), this.f11967c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f11965a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f11967c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f11966b = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, long j10, long j11) {
        this.f11962a = str;
        this.f11963b = j10;
        this.f11964c = j11;
    }

    /* synthetic */ a(String str, long j10, long j11, C0175a c0175a) {
        this(str, j10, j11);
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f11962a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f11964c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f11963b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f11962a.equals(gVar.b()) && this.f11963b == gVar.d() && this.f11964c == gVar.c();
    }

    public int hashCode() {
        int hashCode = (this.f11962a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f11963b;
        long j11 = this.f11964c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f11962a + ", tokenExpirationTimestamp=" + this.f11963b + ", tokenCreationTimestamp=" + this.f11964c + "}";
    }
}
