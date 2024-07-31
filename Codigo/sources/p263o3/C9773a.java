package p263o3;

import com.bumptech.glide.load.data.C2139j;
import java.io.InputStream;
import p129h3.C7623g;
import p129h3.C7624h;
import p246n3.C9642h;
import p246n3.C9648n;
import p246n3.C9653s;
import p246n3.InterfaceC9649o;
import p246n3.InterfaceC9650p;

/* renamed from: o3.a */
/* loaded from: classes.dex */
public class C9773a implements InterfaceC9649o<C9642h, InputStream> {

    /* renamed from: b */
    public static final C7623g<Integer> f24087b = C7623g.m23142f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C9648n<C9642h, C9642h> f24088a;

    /* renamed from: o3.a$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC9650p<C9642h, InputStream> {

        /* renamed from: a */
        private final C9648n<C9642h, C9642h> f24089a = new C9648n<>(500);

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<C9642h, InputStream> mo28852d(C9653s c9653s) {
            return new C9773a(this.f24089a);
        }
    }

    public C9773a(C9648n<C9642h, C9642h> c9648n) {
        this.f24088a = c9648n;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<InputStream> mo28848b(C9642h c9642h, int i10, int i11, C7624h c7624h) {
        C9648n<C9642h, C9642h> c9648n = this.f24088a;
        if (c9648n != null) {
            C9642h m28910a = c9648n.m28910a(c9642h, 0, 0);
            if (m28910a == null) {
                this.f24088a.m28911b(c9642h, 0, 0, c9642h);
            } else {
                c9642h = m28910a;
            }
        }
        return new InterfaceC9649o.a<>(c9642h, new C2139j(c9642h, ((Integer) c7624h.m23147c(f24087b)).intValue()));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(C9642h c9642h) {
        return true;
    }
}
