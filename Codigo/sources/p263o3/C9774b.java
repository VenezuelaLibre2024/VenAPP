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

/* renamed from: o3.b */
/* loaded from: classes.dex */
public class C9774b implements InterfaceC9649o<Uri, InputStream> {

    /* renamed from: a */
    private final Context f24090a;

    /* renamed from: o3.b$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC9650p<Uri, InputStream> {

        /* renamed from: a */
        private final Context f24091a;

        public a(Context context) {
            this.f24091a = context;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, InputStream> mo28852d(C9653s c9653s) {
            return new C9774b(this.f24091a);
        }
    }

    public C9774b(Context context) {
        this.f24090a = context.getApplicationContext();
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<InputStream> mo28848b(Uri uri, int i10, int i11, C7624h c7624h) {
        if (C7783b.m23746d(i10, i11)) {
            return new InterfaceC9649o.a<>(new C1656d(uri), C7784c.m23749f(this.f24090a, uri));
        }
        return null;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Uri uri) {
        return C7783b.m23743a(uri);
    }
}
