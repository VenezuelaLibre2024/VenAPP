package com.google.firebase.remoteconfig.internal;

/* loaded from: classes2.dex */
public class v implements ze.k {

    /* renamed from: a, reason: collision with root package name */
    private final long f12550a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12551b;

    /* renamed from: c, reason: collision with root package name */
    private final ze.m f12552c;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f12553a;

        /* renamed from: b, reason: collision with root package name */
        private int f12554b;

        /* renamed from: c, reason: collision with root package name */
        private ze.m f12555c;

        private b() {
        }

        public v a() {
            return new v(this.f12553a, this.f12554b, this.f12555c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b b(ze.m mVar) {
            this.f12555c = mVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(int i10) {
            this.f12554b = i10;
            return this;
        }

        public b d(long j10) {
            this.f12553a = j10;
            return this;
        }
    }

    private v(long j10, int i10, ze.m mVar) {
        this.f12550a = j10;
        this.f12551b = i10;
        this.f12552c = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b b() {
        return new b();
    }

    @Override // ze.k
    public int a() {
        return this.f12551b;
    }
}
