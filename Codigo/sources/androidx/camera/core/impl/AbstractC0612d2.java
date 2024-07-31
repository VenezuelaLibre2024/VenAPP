package androidx.camera.core.impl;

import android.util.Size;
import p092f0.C7264d;

/* renamed from: androidx.camera.core.impl.d2 */
/* loaded from: classes.dex */
public abstract class AbstractC0612d2 {

    /* renamed from: androidx.camera.core.impl.d2$a */
    /* loaded from: classes.dex */
    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        a(int i10) {
            this.mId = i10;
        }

        /* renamed from: h */
        int m3035h() {
            return this.mId;
        }
    }

    /* renamed from: androidx.camera.core.impl.d2$b */
    /* loaded from: classes.dex */
    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    /* renamed from: a */
    public static AbstractC0612d2 m3026a(b bVar, a aVar) {
        return new C0629i(bVar, aVar, 0L);
    }

    /* renamed from: b */
    public static AbstractC0612d2 m3027b(b bVar, a aVar, long j10) {
        return new C0629i(bVar, aVar, j10);
    }

    /* renamed from: e */
    public static b m3028e(int i10) {
        return i10 == 35 ? b.YUV : i10 == 256 ? b.JPEG : i10 == 32 ? b.RAW : b.PRIV;
    }

    /* renamed from: h */
    public static AbstractC0612d2 m3029h(int i10, int i11, Size size, AbstractC0616e2 abstractC0616e2) {
        b m3028e = m3028e(i11);
        a aVar = a.NOT_SUPPORT;
        int m21736a = C7264d.m21736a(size);
        if (i10 == 1) {
            if (m21736a <= C7264d.m21736a(abstractC0616e2.m3048i(i11))) {
                aVar = a.s720p;
            } else if (m21736a <= C7264d.m21736a(abstractC0616e2.m3046g(i11))) {
                aVar = a.s1440p;
            }
        } else if (m21736a <= C7264d.m21736a(abstractC0616e2.mo3041b())) {
            aVar = a.VGA;
        } else if (m21736a <= C7264d.m21736a(abstractC0616e2.mo3044e())) {
            aVar = a.PREVIEW;
        } else if (m21736a <= C7264d.m21736a(abstractC0616e2.mo3045f())) {
            aVar = a.RECORD;
        } else if (m21736a <= C7264d.m21736a(abstractC0616e2.m3042c(i11))) {
            aVar = a.MAXIMUM;
        } else {
            Size m3050k = abstractC0616e2.m3050k(i11);
            if (m3050k != null && m21736a <= C7264d.m21736a(m3050k)) {
                aVar = a.ULTRA_MAXIMUM;
            }
        }
        return m3026a(m3028e, aVar);
    }

    /* renamed from: c */
    public abstract a mo3030c();

    /* renamed from: d */
    public abstract b mo3031d();

    /* renamed from: f */
    public abstract long mo3032f();

    /* renamed from: g */
    public final boolean m3033g(AbstractC0612d2 abstractC0612d2) {
        return abstractC0612d2.mo3030c().m3035h() <= mo3030c().m3035h() && abstractC0612d2.mo3031d() == mo3031d();
    }
}
