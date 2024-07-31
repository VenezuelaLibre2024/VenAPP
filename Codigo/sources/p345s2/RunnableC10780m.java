package p345s2;

import com.arthenica.ffmpegkit.C2079k;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: s2.m */
/* loaded from: classes.dex */
public class RunnableC10780m implements Runnable {

    /* renamed from: a */
    private final C2079k f27227a;

    /* renamed from: b */
    private final C10772e f27228b;

    /* renamed from: c */
    private final MethodChannel.Result f27229c;

    public RunnableC10780m(C2079k c2079k, C10772e c10772e, MethodChannel.Result result) {
        this.f27227a = c2079k;
        this.f27228b = c10772e;
        this.f27229c = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m10455s(this.f27227a);
        this.f27228b.m32763m(this.f27229c, null);
    }
}
