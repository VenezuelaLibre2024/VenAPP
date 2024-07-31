package sh;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import kotlin.jvm.internal.n;
import t6.c2;
import t6.j3;
import t6.y;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Handler f25606a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f25607b;

    /* renamed from: c, reason: collision with root package name */
    private MethodChannel f25608c;

    /* renamed from: d, reason: collision with root package name */
    private Context f25609d;

    /* renamed from: e, reason: collision with root package name */
    private y f25610e;

    /* renamed from: f, reason: collision with root package name */
    private j3.d f25611f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25612g;

    /* renamed from: h, reason: collision with root package name */
    private f f25613h;

    /* renamed from: i, reason: collision with root package name */
    private String f25614i;

    /* renamed from: j, reason: collision with root package name */
    private h f25615j;

    /* renamed from: sh.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0428a implements j3.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Float f25617b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f25618c;

        /* renamed from: sh.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0429a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25619a;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[f.Loop.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.Pause.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f25619a = iArr;
            }
        }

        C0428a(Float f10, MethodChannel.Result result) {
            this.f25617b = f10;
            this.f25618c = result;
        }

        @Override // t6.j3.d
        public void onPlayerStateChanged(boolean z10, int i10) {
            int i11;
            if (!a.this.f25612g && i10 == 3) {
                y yVar = a.this.f25610e;
                if (yVar != null) {
                    Float f10 = this.f25617b;
                    yVar.setVolume(f10 != null ? f10.floatValue() : 1.0f);
                }
                a.this.f25612g = true;
                this.f25618c.success(Boolean.TRUE);
            }
            if (i10 == 4) {
                HashMap hashMap = new HashMap();
                int i12 = C0429a.f25619a[a.this.f25613h.ordinal()];
                if (i12 == 1) {
                    y yVar2 = a.this.f25610e;
                    if (yVar2 != null) {
                        yVar2.z(0L);
                    }
                    y yVar3 = a.this.f25610e;
                    if (yVar3 != null) {
                        yVar3.d();
                    }
                    i11 = 0;
                } else if (i12 != 2) {
                    y yVar4 = a.this.f25610e;
                    if (yVar4 != null) {
                        yVar4.stop();
                    }
                    y yVar5 = a.this.f25610e;
                    if (yVar5 != null) {
                        yVar5.release();
                    }
                    a.this.f25610e = null;
                    a.this.u();
                    i11 = 2;
                } else {
                    y yVar6 = a.this.f25610e;
                    if (yVar6 != null) {
                        yVar6.z(0L);
                    }
                    y yVar7 = a.this.f25610e;
                    if (yVar7 != null) {
                        yVar7.k(false);
                    }
                    a.this.u();
                    i11 = 1;
                }
                hashMap.put("finishType", i11);
                hashMap.put("playerKey", a.this.f25614i);
                a.this.f25608c.invokeMethod("onDidFinishPlayingAudio", hashMap);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f25621b;

        b(MethodChannel.Result result) {
            this.f25621b = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar = a.this.f25610e;
            Long valueOf = yVar != null ? Long.valueOf(yVar.e()) : null;
            if (valueOf == null) {
                this.f25621b.error("AudioWaveforms", "Can't get current Position of player", "");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("current", valueOf);
            hashMap.put("playerKey", a.this.f25614i);
            a.this.f25608c.invokeMethod("onCurrentDuration", hashMap);
            a.this.f25606a.postDelayed(this, a.this.f25615j.h());
        }
    }

    public a(Context context, MethodChannel channel, String playerKey) {
        n.e(context, "context");
        n.e(channel, "channel");
        n.e(playerKey, "playerKey");
        this.f25606a = new Handler(Looper.getMainLooper());
        this.f25608c = channel;
        this.f25609d = context;
        this.f25613h = f.Stop;
        this.f25614i = playerKey;
        this.f25615j = h.Low;
    }

    private final void s(MethodChannel.Result result) {
        b bVar = new b(result);
        this.f25607b = bVar;
        Handler handler = this.f25606a;
        n.b(bVar);
        handler.post(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        Runnable runnable = this.f25607b;
        if (runnable != null) {
            this.f25606a.removeCallbacks(runnable);
        }
    }

    public final void k(MethodChannel.Result result, d durationType) {
        n.e(result, "result");
        n.e(durationType, "durationType");
        try {
            Long l10 = null;
            if (durationType == d.Current) {
                y yVar = this.f25610e;
                if (yVar != null) {
                    l10 = Long.valueOf(yVar.e());
                }
            } else {
                y yVar2 = this.f25610e;
                if (yVar2 != null) {
                    l10 = Long.valueOf(yVar2.getDuration());
                }
            }
            result.success(l10);
        } catch (Exception e10) {
            result.error("AudioWaveforms", "Can not get duration", e10.toString());
        }
    }

    public final void l(MethodChannel.Result result) {
        n.e(result, "result");
        try {
            u();
            y yVar = this.f25610e;
            if (yVar != null) {
                yVar.pause();
            }
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error("AudioWaveforms", "Failed to pause the player", e10.toString());
        }
    }

    public final void m(MethodChannel.Result result, String str, Float f10, h frequency) {
        n.e(result, "result");
        n.e(frequency, "frequency");
        if (str == null) {
            result.error("AudioWaveforms", "path to audio file or unique key can't be null", "");
            return;
        }
        this.f25615j = frequency;
        c2 e10 = c2.e(Uri.parse(str));
        n.d(e10, "fromUri(...)");
        y e11 = new y.b(this.f25609d).e();
        this.f25610e = e11;
        if (e11 != null) {
            e11.v(e10);
        }
        y yVar = this.f25610e;
        if (yVar != null) {
            yVar.a();
        }
        C0428a c0428a = new C0428a(f10, result);
        this.f25611f = c0428a;
        y yVar2 = this.f25610e;
        if (yVar2 != null) {
            n.b(c0428a);
            yVar2.s(c0428a);
        }
    }

    public final void n(MethodChannel.Result result) {
        n.e(result, "result");
        try {
            y yVar = this.f25610e;
            if (yVar != null) {
                yVar.release();
            }
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error("AudioWaveforms", "Failed to release player resource", e10.toString());
        }
    }

    public final void o(MethodChannel.Result result, Long l10) {
        Boolean bool;
        n.e(result, "result");
        if (l10 != null) {
            y yVar = this.f25610e;
            if (yVar != null) {
                yVar.z(l10.longValue());
            }
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        result.success(bool);
    }

    public final void p(Float f10, MethodChannel.Result result) {
        Boolean bool;
        n.e(result, "result");
        try {
            if (f10 != null) {
                y yVar = this.f25610e;
                if (yVar != null) {
                    yVar.A(f10.floatValue());
                }
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            result.success(bool);
        } catch (Exception unused) {
            result.success(Boolean.FALSE);
        }
    }

    public final void q(Float f10, MethodChannel.Result result) {
        Boolean bool;
        n.e(result, "result");
        try {
            if (f10 != null) {
                y yVar = this.f25610e;
                if (yVar != null) {
                    yVar.setVolume(f10.floatValue());
                }
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            result.success(bool);
        } catch (Exception unused) {
            result.success(Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:25:0x0008, B:27:0x000e, B:7:0x0010, B:8:0x0023, B:11:0x002b, B:13:0x002f, B:14:0x0032, B:22:0x0028, B:4:0x0017, B:6:0x001d, B:23:0x0020), top: B:24:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:25:0x0008, B:27:0x000e, B:7:0x0010, B:8:0x0023, B:11:0x002b, B:13:0x002f, B:14:0x0032, B:22:0x0028, B:4:0x0017, B:6:0x001d, B:23:0x0020), top: B:24:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(io.flutter.plugin.common.MethodChannel.Result r3, java.lang.Integer r4) {
        /*
            r2 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.n.e(r3, r0)
            r0 = 1
            if (r4 == 0) goto L15
            int r1 = r4.intValue()     // Catch: java.lang.Exception -> L13
            if (r1 != 0) goto L15
            sh.f r4 = sh.f.Loop     // Catch: java.lang.Exception -> L13
        L10:
            r2.f25613h = r4     // Catch: java.lang.Exception -> L13
            goto L23
        L13:
            r4 = move-exception
            goto L3b
        L15:
            if (r4 == 0) goto L20
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L13
            if (r4 != r0) goto L20
            sh.f r4 = sh.f.Pause     // Catch: java.lang.Exception -> L13
            goto L10
        L20:
            sh.f r4 = sh.f.Stop     // Catch: java.lang.Exception -> L13
            goto L10
        L23:
            t6.y r4 = r2.f25610e     // Catch: java.lang.Exception -> L13
            if (r4 != 0) goto L28
            goto L2b
        L28:
            r4.k(r0)     // Catch: java.lang.Exception -> L13
        L2b:
            t6.y r4 = r2.f25610e     // Catch: java.lang.Exception -> L13
            if (r4 == 0) goto L32
            r4.d()     // Catch: java.lang.Exception -> L13
        L32:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L13
            r3.success(r4)     // Catch: java.lang.Exception -> L13
            r2.s(r3)     // Catch: java.lang.Exception -> L13
            goto L46
        L3b:
            java.lang.String r0 = "Can not start the player"
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "AudioWaveforms"
            r3.error(r1, r0, r4)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.a.r(io.flutter.plugin.common.MethodChannel$Result, java.lang.Integer):void");
    }

    public final void t(MethodChannel.Result result) {
        y yVar;
        n.e(result, "result");
        u();
        j3.d dVar = this.f25611f;
        if (dVar != null && (yVar = this.f25610e) != null) {
            n.b(dVar);
            yVar.t(dVar);
        }
        this.f25612g = false;
        y yVar2 = this.f25610e;
        if (yVar2 != null) {
            yVar2.stop();
        }
        result.success(Boolean.TRUE);
    }
}
