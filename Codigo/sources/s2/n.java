package s2;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.arthenica.ffmpegkit.s;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final s f25111a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25112b;

    /* renamed from: c, reason: collision with root package name */
    private final e f25113c;

    /* renamed from: d, reason: collision with root package name */
    private final MethodChannel.Result f25114d;

    public n(s sVar, int i10, e eVar, MethodChannel.Result result) {
        this.f25111a = sVar;
        this.f25112b = i10;
        this.f25113c = eVar;
        this.f25114d = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.D(this.f25111a, this.f25112b);
        this.f25113c.m(this.f25114d, null);
    }
}
