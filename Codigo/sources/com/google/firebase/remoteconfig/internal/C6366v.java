package com.google.firebase.remoteconfig.internal;

import p488ze.C13016m;
import p488ze.InterfaceC13014k;

/* renamed from: com.google.firebase.remoteconfig.internal.v */
/* loaded from: classes2.dex */
public class C6366v implements InterfaceC13014k {

    /* renamed from: a */
    private final long f13782a;

    /* renamed from: b */
    private final int f13783b;

    /* renamed from: c */
    private final C13016m f13784c;

    /* renamed from: com.google.firebase.remoteconfig.internal.v$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private long f13785a;

        /* renamed from: b */
        private int f13786b;

        /* renamed from: c */
        private C13016m f13787c;

        private b() {
        }

        /* renamed from: a */
        public C6366v m17753a() {
            return new C6366v(this.f13785a, this.f13786b, this.f13787c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public b m17754b(C13016m c13016m) {
            this.f13787c = c13016m;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public b m17755c(int i10) {
            this.f13786b = i10;
            return this;
        }

        /* renamed from: d */
        public b m17756d(long j10) {
            this.f13785a = j10;
            return this;
        }
    }

    private C6366v(long j10, int i10, C13016m c13016m) {
        this.f13782a = j10;
        this.f13783b = i10;
        this.f13784c = c13016m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static b m17751b() {
        return new b();
    }

    @Override // p488ze.InterfaceC13014k
    /* renamed from: a */
    public int mo17752a() {
        return this.f13783b;
    }
}
