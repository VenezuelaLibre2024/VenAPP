package p246n3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p129h3.C7624h;
import p246n3.InterfaceC9649o;

/* renamed from: n3.w */
/* loaded from: classes.dex */
public class C9657w<Data> implements InterfaceC9649o<String, Data> {

    /* renamed from: a */
    private final InterfaceC9649o<Uri, Data> f23716a;

    /* renamed from: n3.w$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC9650p<String, AssetFileDescriptor> {
        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<String, AssetFileDescriptor> mo28852d(C9653s c9653s) {
            return new C9657w(c9653s.m28930d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: n3.w$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC9650p<String, ParcelFileDescriptor> {
        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<String, ParcelFileDescriptor> mo28852d(C9653s c9653s) {
            return new C9657w(c9653s.m28930d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: n3.w$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC9650p<String, InputStream> {
        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<String, InputStream> mo28852d(C9653s c9653s) {
            return new C9657w(c9653s.m28930d(Uri.class, InputStream.class));
        }
    }

    public C9657w(InterfaceC9649o<Uri, Data> interfaceC9649o) {
        this.f23716a = interfaceC9649o;
    }

    /* renamed from: e */
    private static Uri m28945e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return m28946f(str);
    }

    /* renamed from: f */
    private static Uri m28946f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<Data> mo28848b(String str, int i10, int i11, C7624h c7624h) {
        Uri m28945e = m28945e(str);
        if (m28945e == null || !this.f23716a.mo28847a(m28945e)) {
            return null;
        }
        return this.f23716a.mo28848b(m28945e, i10, i11, c7624h);
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(String str) {
        return true;
    }
}
