package sh;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import kotlin.jvm.internal.C9322n;
import p361t6.C11010c2;
import p361t6.InterfaceC11053j3;
import p361t6.InterfaceC11126y;

/* renamed from: sh.a */
/* loaded from: classes3.dex */
public final class C10914a {

    /* renamed from: a */
    private Handler f27750a;

    /* renamed from: b */
    private Runnable f27751b;

    /* renamed from: c */
    private MethodChannel f27752c;

    /* renamed from: d */
    private Context f27753d;

    /* renamed from: e */
    private InterfaceC11126y f27754e;

    /* renamed from: f */
    private InterfaceC11053j3.d f27755f;

    /* renamed from: g */
    private boolean f27756g;

    /* renamed from: h */
    private EnumC10919f f27757h;

    /* renamed from: i */
    private String f27758i;

    /* renamed from: j */
    private EnumC10921h f27759j;

    /* renamed from: sh.a$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC11053j3.d {

        /* renamed from: b */
        final /* synthetic */ Float f27761b;

        /* renamed from: c */
        final /* synthetic */ MethodChannel.Result f27762c;

        /* renamed from: sh.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C13252a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f27763a;

            static {
                int[] iArr = new int[EnumC10919f.values().length];
                try {
                    iArr[EnumC10919f.Loop.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC10919f.Pause.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f27763a = iArr;
            }
        }

        a(Float f10, MethodChannel.Result result) {
            this.f27761b = f10;
            this.f27762c = result;
        }

        @Override // p361t6.InterfaceC11053j3.d
        public void onPlayerStateChanged(boolean z10, int i10) {
            int i11;
            if (!C10914a.this.f27756g && i10 == 3) {
                InterfaceC11126y interfaceC11126y = C10914a.this.f27754e;
                if (interfaceC11126y != null) {
                    Float f10 = this.f27761b;
                    interfaceC11126y.setVolume(f10 != null ? f10.floatValue() : 1.0f);
                }
                C10914a.this.f27756g = true;
                this.f27762c.success(Boolean.TRUE);
            }
            if (i10 == 4) {
                HashMap hashMap = new HashMap();
                int i12 = C13252a.f27763a[C10914a.this.f27757h.ordinal()];
                if (i12 == 1) {
                    InterfaceC11126y interfaceC11126y2 = C10914a.this.f27754e;
                    if (interfaceC11126y2 != null) {
                        interfaceC11126y2.mo34203z(0L);
                    }
                    InterfaceC11126y interfaceC11126y3 = C10914a.this.f27754e;
                    if (interfaceC11126y3 != null) {
                        interfaceC11126y3.mo34197d();
                    }
                    i11 = 0;
                } else if (i12 != 2) {
                    InterfaceC11126y interfaceC11126y4 = C10914a.this.f27754e;
                    if (interfaceC11126y4 != null) {
                        interfaceC11126y4.stop();
                    }
                    InterfaceC11126y interfaceC11126y5 = C10914a.this.f27754e;
                    if (interfaceC11126y5 != null) {
                        interfaceC11126y5.release();
                    }
                    C10914a.this.f27754e = null;
                    C10914a.this.m33336u();
                    i11 = 2;
                } else {
                    InterfaceC11126y interfaceC11126y6 = C10914a.this.f27754e;
                    if (interfaceC11126y6 != null) {
                        interfaceC11126y6.mo34203z(0L);
                    }
                    InterfaceC11126y interfaceC11126y7 = C10914a.this.f27754e;
                    if (interfaceC11126y7 != null) {
                        interfaceC11126y7.mo33935k(false);
                    }
                    C10914a.this.m33336u();
                    i11 = 1;
                }
                hashMap.put("finishType", i11);
                hashMap.put("playerKey", C10914a.this.f27758i);
                C10914a.this.f27752c.invokeMethod("onDidFinishPlayingAudio", hashMap);
            }
        }
    }

    /* renamed from: sh.a$b */
    /* loaded from: classes3.dex */
    public static final class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ MethodChannel.Result f27765b;

        b(MethodChannel.Result result) {
            this.f27765b = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC11126y interfaceC11126y = C10914a.this.f27754e;
            Long valueOf = interfaceC11126y != null ? Long.valueOf(interfaceC11126y.mo33927e()) : null;
            if (valueOf == null) {
                this.f27765b.error("AudioWaveforms", "Can't get current Position of player", "");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("current", valueOf);
            hashMap.put("playerKey", C10914a.this.f27758i);
            C10914a.this.f27752c.invokeMethod("onCurrentDuration", hashMap);
            C10914a.this.f27750a.postDelayed(this, C10914a.this.f27759j.m33368h());
        }
    }

    public C10914a(Context context, MethodChannel channel, String playerKey) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(channel, "channel");
        C9322n.m27781e(playerKey, "playerKey");
        this.f27750a = new Handler(Looper.getMainLooper());
        this.f27752c = channel;
        this.f27753d = context;
        this.f27757h = EnumC10919f.Stop;
        this.f27758i = playerKey;
        this.f27759j = EnumC10921h.Low;
    }

    /* renamed from: s */
    private final void m33335s(MethodChannel.Result result) {
        b bVar = new b(result);
        this.f27751b = bVar;
        Handler handler = this.f27750a;
        C9322n.m27778b(bVar);
        handler.post(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m33336u() {
        Runnable runnable = this.f27751b;
        if (runnable != null) {
            this.f27750a.removeCallbacks(runnable);
        }
    }

    /* renamed from: k */
    public final void m33337k(MethodChannel.Result result, EnumC10917d durationType) {
        C9322n.m27781e(result, "result");
        C9322n.m27781e(durationType, "durationType");
        try {
            Long l10 = null;
            if (durationType == EnumC10917d.Current) {
                InterfaceC11126y interfaceC11126y = this.f27754e;
                if (interfaceC11126y != null) {
                    l10 = Long.valueOf(interfaceC11126y.mo33927e());
                }
            } else {
                InterfaceC11126y interfaceC11126y2 = this.f27754e;
                if (interfaceC11126y2 != null) {
                    l10 = Long.valueOf(interfaceC11126y2.getDuration());
                }
            }
            result.success(l10);
        } catch (Exception e10) {
            result.error("AudioWaveforms", "Can not get duration", e10.toString());
        }
    }

    /* renamed from: l */
    public final void m33338l(MethodChannel.Result result) {
        C9322n.m27781e(result, "result");
        try {
            m33336u();
            InterfaceC11126y interfaceC11126y = this.f27754e;
            if (interfaceC11126y != null) {
                interfaceC11126y.pause();
            }
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error("AudioWaveforms", "Failed to pause the player", e10.toString());
        }
    }

    /* renamed from: m */
    public final void m33339m(MethodChannel.Result result, String str, Float f10, EnumC10921h frequency) {
        C9322n.m27781e(result, "result");
        C9322n.m27781e(frequency, "frequency");
        if (str == null) {
            result.error("AudioWaveforms", "path to audio file or unique key can't be null", "");
            return;
        }
        this.f27759j = frequency;
        C11010c2 m33725e = C11010c2.m33725e(Uri.parse(str));
        C9322n.m27780d(m33725e, "fromUri(...)");
        InterfaceC11126y m34585e = new InterfaceC11126y.b(this.f27753d).m34585e();
        this.f27754e = m34585e;
        if (m34585e != null) {
            m34585e.mo34201v(m33725e);
        }
        InterfaceC11126y interfaceC11126y = this.f27754e;
        if (interfaceC11126y != null) {
            interfaceC11126y.mo33923a();
        }
        a aVar = new a(f10, result);
        this.f27755f = aVar;
        InterfaceC11126y interfaceC11126y2 = this.f27754e;
        if (interfaceC11126y2 != null) {
            C9322n.m27778b(aVar);
            interfaceC11126y2.mo33942s(aVar);
        }
    }

    /* renamed from: n */
    public final void m33340n(MethodChannel.Result result) {
        C9322n.m27781e(result, "result");
        try {
            InterfaceC11126y interfaceC11126y = this.f27754e;
            if (interfaceC11126y != null) {
                interfaceC11126y.release();
            }
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error("AudioWaveforms", "Failed to release player resource", e10.toString());
        }
    }

    /* renamed from: o */
    public final void m33341o(MethodChannel.Result result, Long l10) {
        Boolean bool;
        C9322n.m27781e(result, "result");
        if (l10 != null) {
            InterfaceC11126y interfaceC11126y = this.f27754e;
            if (interfaceC11126y != null) {
                interfaceC11126y.mo34203z(l10.longValue());
            }
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        result.success(bool);
    }

    /* renamed from: p */
    public final void m33342p(Float f10, MethodChannel.Result result) {
        Boolean bool;
        C9322n.m27781e(result, "result");
        try {
            if (f10 != null) {
                InterfaceC11126y interfaceC11126y = this.f27754e;
                if (interfaceC11126y != null) {
                    interfaceC11126y.mo34194A(f10.floatValue());
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

    /* renamed from: q */
    public final void m33343q(Float f10, MethodChannel.Result result) {
        Boolean bool;
        C9322n.m27781e(result, "result");
        try {
            if (f10 != null) {
                InterfaceC11126y interfaceC11126y = this.f27754e;
                if (interfaceC11126y != null) {
                    interfaceC11126y.setVolume(f10.floatValue());
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
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m33344r(io.flutter.plugin.common.MethodChannel.Result r3, java.lang.Integer r4) {
        /*
            r2 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.C9322n.m27781e(r3, r0)
            r0 = 1
            if (r4 == 0) goto L15
            int r1 = r4.intValue()     // Catch: java.lang.Exception -> L13
            if (r1 != 0) goto L15
            sh.f r4 = sh.EnumC10919f.Loop     // Catch: java.lang.Exception -> L13
        L10:
            r2.f27757h = r4     // Catch: java.lang.Exception -> L13
            goto L23
        L13:
            r4 = move-exception
            goto L3b
        L15:
            if (r4 == 0) goto L20
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L13
            if (r4 != r0) goto L20
            sh.f r4 = sh.EnumC10919f.Pause     // Catch: java.lang.Exception -> L13
            goto L10
        L20:
            sh.f r4 = sh.EnumC10919f.Stop     // Catch: java.lang.Exception -> L13
            goto L10
        L23:
            t6.y r4 = r2.f27754e     // Catch: java.lang.Exception -> L13
            if (r4 != 0) goto L28
            goto L2b
        L28:
            r4.mo33935k(r0)     // Catch: java.lang.Exception -> L13
        L2b:
            t6.y r4 = r2.f27754e     // Catch: java.lang.Exception -> L13
            if (r4 == 0) goto L32
            r4.mo34197d()     // Catch: java.lang.Exception -> L13
        L32:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L13
            r3.success(r4)     // Catch: java.lang.Exception -> L13
            r2.m33335s(r3)     // Catch: java.lang.Exception -> L13
            goto L46
        L3b:
            java.lang.String r0 = "Can not start the player"
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "AudioWaveforms"
            r3.error(r1, r0, r4)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.C10914a.m33344r(io.flutter.plugin.common.MethodChannel$Result, java.lang.Integer):void");
    }

    /* renamed from: t */
    public final void m33345t(MethodChannel.Result result) {
        InterfaceC11126y interfaceC11126y;
        C9322n.m27781e(result, "result");
        m33336u();
        InterfaceC11053j3.d dVar = this.f27755f;
        if (dVar != null && (interfaceC11126y = this.f27754e) != null) {
            C9322n.m27778b(dVar);
            interfaceC11126y.mo33943t(dVar);
        }
        this.f27756g = false;
        InterfaceC11126y interfaceC11126y2 = this.f27754e;
        if (interfaceC11126y2 != null) {
            interfaceC11126y2.stop();
        }
        result.success(Boolean.TRUE);
    }
}
