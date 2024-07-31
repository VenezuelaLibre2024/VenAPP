package a8;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f126a;

    /* loaded from: classes.dex */
    class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f127a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f127a = i11;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f127a;
        }
    }

    public e(int i10) {
        this.f126a = new a(this, i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f126a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.f126a.put((Uri) t8.a.e(uri), (byte[]) t8.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return this.f126a.remove(t8.a.e(uri));
    }
}
