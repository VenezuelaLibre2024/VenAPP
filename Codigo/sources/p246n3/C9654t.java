package p246n3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p129h3.C7624h;
import p246n3.InterfaceC9649o;

/* renamed from: n3.t */
/* loaded from: classes.dex */
public class C9654t<Data> implements InterfaceC9649o<Integer, Data> {

    /* renamed from: a */
    private final InterfaceC9649o<Uri, Data> f23706a;

    /* renamed from: b */
    private final Resources f23707b;

    /* renamed from: n3.t$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC9650p<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f23708a;

        public a(Resources resources) {
            this.f23708a = resources;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Integer, AssetFileDescriptor> mo28852d(C9653s c9653s) {
            return new C9654t(this.f23708a, c9653s.m28930d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: n3.t$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC9650p<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f23709a;

        public b(Resources resources) {
            this.f23709a = resources;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Integer, InputStream> mo28852d(C9653s c9653s) {
            return new C9654t(this.f23709a, c9653s.m28930d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: n3.t$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC9650p<Integer, Uri> {

        /* renamed from: a */
        private final Resources f23710a;

        public c(Resources resources) {
            this.f23710a = resources;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Integer, Uri> mo28852d(C9653s c9653s) {
            return new C9654t(this.f23710a, C9658x.m28949c());
        }
    }

    public C9654t(Resources resources, InterfaceC9649o<Uri, Data> interfaceC9649o) {
        this.f23707b = resources;
        this.f23706a = interfaceC9649o;
    }

    /* renamed from: d */
    private Uri m28935d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f23707b.getResourcePackageName(num.intValue()) + '/' + this.f23707b.getResourceTypeName(num.intValue()) + '/' + this.f23707b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<Data> mo28848b(Integer num, int i10, int i11, C7624h c7624h) {
        Uri m28935d = m28935d(num);
        if (m28935d == null) {
            return null;
        }
        return this.f23706a.mo28848b(m28935d, i10, i11, c7624h);
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Integer num) {
        return true;
    }
}
