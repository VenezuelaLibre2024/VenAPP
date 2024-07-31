package p302q3;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import p036c4.C1863d;
import p036c4.C1868i;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9139b;
import p193k3.InterfaceC9141d;
import p302q3.C10251q;

/* renamed from: q3.b0 */
/* loaded from: classes.dex */
public class C10231b0 implements InterfaceC7626j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C10251q f25380a;

    /* renamed from: b */
    private final InterfaceC9139b f25381b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q3.b0$a */
    /* loaded from: classes.dex */
    public static class a implements C10251q.b {

        /* renamed from: a */
        private final C10260z f25382a;

        /* renamed from: b */
        private final C1863d f25383b;

        a(C10260z c10260z, C1863d c1863d) {
            this.f25382a = c10260z;
            this.f25383b = c1863d;
        }

        @Override // p302q3.C10251q.b
        /* renamed from: a */
        public void mo30590a(InterfaceC9141d interfaceC9141d, Bitmap bitmap) {
            IOException m9927a = this.f25383b.m9927a();
            if (m9927a != null) {
                if (bitmap == null) {
                    throw m9927a;
                }
                interfaceC9141d.mo26950c(bitmap);
                throw m9927a;
            }
        }

        @Override // p302q3.C10251q.b
        /* renamed from: b */
        public void mo30591b() {
            this.f25382a.m30717b();
        }
    }

    public C10231b0(C10251q c10251q, InterfaceC9139b interfaceC9139b) {
        this.f25380a = c10251q;
        this.f25381b = interfaceC9139b;
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8975v<Bitmap> mo23152b(InputStream inputStream, int i10, int i11, C7624h c7624h) {
        boolean z10;
        C10260z c10260z;
        if (inputStream instanceof C10260z) {
            c10260z = (C10260z) inputStream;
            z10 = false;
        } else {
            z10 = true;
            c10260z = new C10260z(inputStream, this.f25381b);
        }
        C1863d m9926b = C1863d.m9926b(c10260z);
        try {
            return this.f25380a.m30685e(new C1868i(m9926b), i10, i11, c7624h, new a(c10260z, m9926b));
        } finally {
            m9926b.m9928e();
            if (z10) {
                c10260z.m30718e();
            }
        }
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(InputStream inputStream, C7624h c7624h) {
        return this.f25380a.m30688p(inputStream);
    }
}
