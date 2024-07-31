package p345s2;

import com.arthenica.ffmpegkit.C2076h;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: s2.l */
/* loaded from: classes.dex */
public class RunnableC10779l implements Runnable {

    /* renamed from: a */
    private final C2076h f27224a;

    /* renamed from: b */
    private final C10772e f27225b;

    /* renamed from: c */
    private final MethodChannel.Result f27226c;

    public RunnableC10779l(C2076h c2076h, C10772e c10772e, MethodChannel.Result result) {
        this.f27224a = c2076h;
        this.f27225b = c10772e;
        this.f27226c = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m10454r(this.f27224a);
        this.f27225b.m32763m(this.f27226c, null);
    }
}
