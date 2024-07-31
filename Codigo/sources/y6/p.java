package y6;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f31767a = new p() { // from class: y6.o
        @Override // y6.p
        public final k[] c() {
            k[] a10;
            a10 = p.a();
            return a10;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ k[] a() {
        return new k[0];
    }

    default k[] b(Uri uri, Map<String, List<String>> map) {
        return c();
    }

    k[] c();
}
