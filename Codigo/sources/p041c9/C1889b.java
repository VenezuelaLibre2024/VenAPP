package p041c9;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c9.b */
/* loaded from: classes.dex */
public final class C1889b extends Thread {

    /* renamed from: a */
    final /* synthetic */ Map f7881a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1889b(C1888a c1888a, Map map) {
        this.f7881a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f7881a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C1891d.m10044a(buildUpon.build().toString());
    }
}
