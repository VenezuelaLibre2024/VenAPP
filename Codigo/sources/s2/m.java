package s2;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.arthenica.ffmpegkit.k f25108a;

    /* renamed from: b, reason: collision with root package name */
    private final e f25109b;

    /* renamed from: c, reason: collision with root package name */
    private final MethodChannel.Result f25110c;

    public m(com.arthenica.ffmpegkit.k kVar, e eVar, MethodChannel.Result result) {
        this.f25108a = kVar;
        this.f25109b = eVar;
        this.f25110c = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.s(this.f25108a);
        this.f25109b.m(this.f25110c, null);
    }
}
