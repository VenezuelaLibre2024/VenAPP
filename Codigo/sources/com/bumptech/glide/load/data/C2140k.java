package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC2134e;
import java.io.InputStream;
import p193k3.InterfaceC9139b;
import p302q3.C10260z;

/* renamed from: com.bumptech.glide.load.data.k */
/* loaded from: classes.dex */
public final class C2140k implements InterfaceC2134e<InputStream> {

    /* renamed from: a */
    private final C10260z f8436a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2134e.a<InputStream> {

        /* renamed from: a */
        private final InterfaceC9139b f8437a;

        public a(InterfaceC9139b interfaceC9139b) {
            this.f8437a = interfaceC9139b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2134e.a
        /* renamed from: a */
        public Class<InputStream> mo10757a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2134e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC2134e<InputStream> mo10758b(InputStream inputStream) {
            return new C2140k(inputStream, this.f8437a);
        }
    }

    public C2140k(InputStream inputStream, InterfaceC9139b interfaceC9139b) {
        C10260z c10260z = new C10260z(inputStream, interfaceC9139b);
        this.f8436a = c10260z;
        c10260z.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2134e
    /* renamed from: b */
    public void mo10755b() {
        this.f8436a.m30718e();
    }

    /* renamed from: c */
    public void m10788c() {
        this.f8436a.m30717b();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2134e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo10754a() {
        this.f8436a.reset();
        return this.f8436a;
    }
}
