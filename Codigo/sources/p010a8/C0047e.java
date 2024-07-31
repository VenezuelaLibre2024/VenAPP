package p010a8;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import p363t8.C11137a;

/* renamed from: a8.e */
/* loaded from: classes.dex */
final class C0047e {

    /* renamed from: a */
    private final LinkedHashMap<Uri, byte[]> f126a;

    /* renamed from: a8.e$a */
    /* loaded from: classes.dex */
    class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: a */
        final /* synthetic */ int f127a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C0047e c0047e, int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f127a = i11;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f127a;
        }
    }

    public C0047e(int i10) {
        this.f126a = new a(this, i10 + 1, 1.0f, false, i10);
    }

    /* renamed from: a */
    public byte[] m178a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f126a.get(uri);
    }

    /* renamed from: b */
    public byte[] m179b(Uri uri, byte[] bArr) {
        return this.f126a.put((Uri) C11137a.m34603e(uri), (byte[]) C11137a.m34603e(bArr));
    }

    /* renamed from: c */
    public byte[] m180c(Uri uri) {
        return this.f126a.remove(C11137a.m34603e(uri));
    }
}
