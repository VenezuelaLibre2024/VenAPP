package p246n3;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p129h3.C7624h;
import p246n3.InterfaceC9649o;

/* renamed from: n3.z */
/* loaded from: classes.dex */
public class C9660z<Data> implements InterfaceC9649o<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f23725b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    private final InterfaceC9649o<C9642h, Data> f23726a;

    /* renamed from: n3.z$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC9650p<Uri, InputStream> {
        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Uri, InputStream> mo28852d(C9653s c9653s) {
            return new C9660z(c9653s.m28930d(C9642h.class, InputStream.class));
        }
    }

    public C9660z(InterfaceC9649o<C9642h, Data> interfaceC9649o) {
        this.f23726a = interfaceC9649o;
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<Data> mo28848b(Uri uri, int i10, int i11, C7624h c7624h) {
        return this.f23726a.mo28848b(new C9642h(uri.toString()), i10, i11, c7624h);
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Uri uri) {
        return f23725b.contains(uri.getScheme());
    }
}
