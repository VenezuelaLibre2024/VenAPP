package bg;

import ag.C0113a;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C5249j;
import com.google.android.gms.common.internal.C5276s;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* renamed from: bg.a */
/* loaded from: classes2.dex */
public class C1777a {

    /* renamed from: c */
    private static final C5249j f7410c = new C5249j("StreamingFormatChecker", "");

    /* renamed from: a */
    private final LinkedList f7411a = new LinkedList();

    /* renamed from: b */
    private long f7412b = -1;

    /* renamed from: a */
    public void m9489a(C0113a c0113a) {
        if (c0113a.m538f() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f7411a.add(Long.valueOf(elapsedRealtime));
        if (this.f7411a.size() > 5) {
            this.f7411a.removeFirst();
        }
        if (this.f7411a.size() != 5 || elapsedRealtime - ((Long) C5276s.m13324j((Long) this.f7411a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j10 = this.f7412b;
        if (j10 == -1 || elapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f7412b = elapsedRealtime;
            f7410c.m13290g("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
