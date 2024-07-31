package p263o3;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p022b4.C1656d;
import p129h3.C7624h;
import p151i3.C7783b;
import p151i3.C7784c;
import p246n3.C9653s;
import p246n3.InterfaceC9649o;
import p246n3.InterfaceC9650p;
import p302q3.C10241g0;

/* renamed from: o3.c */
/* loaded from: classes.dex */
public class C9775c implements InterfaceC9649o<Uri, InputStream> {

    /* renamed from: a */
    private final Context f24092a;

    /* renamed from: o3.c$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC9650p<Uri, InputStream> {

        /* renamed from: a */
        private final Context f24093a;

        public a(Context context) {
            this.f24093a = context;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, InputStream> mo28852d(C9653s c9653s) {
            return new C9775c(this.f24093a);
        }
    }

    public C9775c(Context context) {
        this.f24092a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m29327e(C7624h c7624h) {
        Long l10 = (Long) c7624h.m23147c(C10241g0.f25397d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<InputStream> mo28848b(Uri uri, int i10, int i11, C7624h c7624h) {
        if (C7783b.m23746d(i10, i11) && m29327e(c7624h)) {
            return new InterfaceC9649o.a<>(new C1656d(uri), C7784c.m23750g(this.f24092a, uri));
        }
        return null;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Uri uri) {
        return C7783b.m23745c(uri);
    }
}
