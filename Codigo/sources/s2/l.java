package s2;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.arthenica.ffmpegkit.h f25105a;

    /* renamed from: b, reason: collision with root package name */
    private final e f25106b;

    /* renamed from: c, reason: collision with root package name */
    private final MethodChannel.Result f25107c;

    public l(com.arthenica.ffmpegkit.h hVar, e eVar, MethodChannel.Result result) {
        this.f25105a = hVar;
        this.f25106b = eVar;
        this.f25107c = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.r(this.f25105a);
        this.f25106b.m(this.f25107c, null);
    }
}
