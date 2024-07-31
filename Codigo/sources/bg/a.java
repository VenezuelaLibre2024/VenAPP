package bg;

import android.os.SystemClock;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.s;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final j f6488c = new j("StreamingFormatChecker", "");

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f6489a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private long f6490b = -1;

    public void a(ag.a aVar) {
        if (aVar.f() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f6489a.add(Long.valueOf(elapsedRealtime));
        if (this.f6489a.size() > 5) {
            this.f6489a.removeFirst();
        }
        if (this.f6489a.size() != 5 || elapsedRealtime - ((Long) s.j((Long) this.f6489a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j10 = this.f6490b;
        if (j10 == -1 || elapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f6490b = elapsedRealtime;
            f6488c.g("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
