package nm;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import ck.v;
import dk.z;
import gk.Continuation;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import zk.a1;
import zk.k0;
import zk.l0;

/* loaded from: classes3.dex */
public final class m implements FlutterPlugin, q {

    /* renamed from: b */
    private MethodChannel f22024b;

    /* renamed from: c */
    private MethodChannel f22025c;

    /* renamed from: d */
    private p f22026d;

    /* renamed from: e */
    private Context f22027e;

    /* renamed from: f */
    private BinaryMessenger f22028f;

    /* renamed from: r */
    private om.l f22029r;

    /* renamed from: u */
    private Runnable f22032u;

    /* renamed from: a */
    private final k0 f22023a = l0.a(a1.c());

    /* renamed from: s */
    private final ConcurrentHashMap<String, om.o> f22030s = new ConcurrentHashMap<>();

    /* renamed from: t */
    private final Handler f22031t = new Handler(Looper.getMainLooper());

    /* renamed from: v */
    private nm.a f22033v = new nm.a();

    /* loaded from: classes3.dex */
    private static final class a implements Runnable {

        /* renamed from: a */
        private final WeakReference<ConcurrentMap<String, om.o>> f22034a;

        /* renamed from: b */
        private final WeakReference<MethodChannel> f22035b;

        /* renamed from: c */
        private final WeakReference<Handler> f22036c;

        /* renamed from: d */
        private final WeakReference<q> f22037d;

        public a(ConcurrentMap<String, om.o> mediaPlayers, MethodChannel methodChannel, Handler handler, q updateCallback) {
            kotlin.jvm.internal.n.e(mediaPlayers, "mediaPlayers");
            kotlin.jvm.internal.n.e(methodChannel, "methodChannel");
            kotlin.jvm.internal.n.e(handler, "handler");
            kotlin.jvm.internal.n.e(updateCallback, "updateCallback");
            this.f22034a = new WeakReference<>(mediaPlayers);
            this.f22035b = new WeakReference<>(methodChannel);
            this.f22036c = new WeakReference<>(handler);
            this.f22037d = new WeakReference<>(updateCallback);
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap j10;
            ConcurrentMap<String, om.o> concurrentMap = this.f22034a.get();
            MethodChannel methodChannel = this.f22035b.get();
            Handler handler = this.f22036c.get();
            q qVar = this.f22037d.get();
            if (concurrentMap == null || methodChannel == null || handler == null || qVar == null) {
                if (qVar != null) {
                    qVar.a();
                    return;
                }
                return;
            }
            boolean z10 = false;
            for (om.o oVar : concurrentMap.values()) {
                if (oVar.t()) {
                    Integer i10 = oVar.i();
                    p k10 = oVar.k();
                    ck.m[] mVarArr = new ck.m[1];
                    mVarArr[0] = ck.r.a("value", Integer.valueOf(i10 != null ? i10.intValue() : 0));
                    j10 = dk.k0.j(mVarArr);
                    k10.c("audio.onCurrentPosition", j10);
                    z10 = true;
                }
            }
            if (z10) {
                handler.postDelayed(this, 200L);
            } else {
                qVar.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.k implements ok.p<MethodCall, MethodChannel.Result, v> {
        b(Object obj) {
            super(2, obj, m.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        public final void a(MethodCall p02, MethodChannel.Result p12) {
            kotlin.jvm.internal.n.e(p02, "p0");
            kotlin.jvm.internal.n.e(p12, "p1");
            ((m) this.receiver).J(p02, p12);
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ v invoke(MethodCall methodCall, MethodChannel.Result result) {
            a(methodCall, result);
            return v.f7137a;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class c extends kotlin.jvm.internal.k implements ok.p<MethodCall, MethodChannel.Result, v> {
        c(Object obj) {
            super(2, obj, m.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        public final void a(MethodCall p02, MethodChannel.Result p12) {
            kotlin.jvm.internal.n.e(p02, "p0");
            kotlin.jvm.internal.n.e(p12, "p1");
            ((m) this.receiver).r(p02, p12);
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ v invoke(MethodCall methodCall, MethodChannel.Result result) {
            a(methodCall, result);
            return v.f7137a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "xyz.luan.audioplayers.AudioplayersPlugin$safeCall$1", f = "AudioplayersPlugin.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements ok.p<k0, Continuation<? super v>, Object> {

        /* renamed from: a */
        int f22038a;

        /* renamed from: b */
        final /* synthetic */ ok.p<MethodCall, MethodChannel.Result, v> f22039b;

        /* renamed from: c */
        final /* synthetic */ MethodCall f22040c;

        /* renamed from: d */
        final /* synthetic */ MethodChannel.Result f22041d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ok.p<? super MethodCall, ? super MethodChannel.Result, v> pVar, MethodCall methodCall, MethodChannel.Result result, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f22039b = pVar;
            this.f22040c = methodCall;
            this.f22041d = result;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            return new d(this.f22039b, this.f22040c, this.f22041d, continuation);
        }

        @Override // ok.p
        public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
            return ((d) create(k0Var, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            hk.d.c();
            if (this.f22038a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ck.o.b(obj);
            try {
                this.f22039b.invoke(this.f22040c, this.f22041d);
            } catch (Exception e10) {
                this.f22041d.error("Unexpected AndroidAudioError", e10.getMessage(), e10);
            }
            return v.f7137a;
        }
    }

    public static final void B(m this$0, String message) {
        HashMap j10;
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(message, "$message");
        p pVar = this$0.f22026d;
        if (pVar == null) {
            kotlin.jvm.internal.n.p("globalEvents");
            pVar = null;
        }
        j10 = dk.k0.j(ck.r.a("value", message));
        pVar.c("audio.onLog", j10);
    }

    public static final void E(om.o player, String message) {
        HashMap j10;
        kotlin.jvm.internal.n.e(player, "$player");
        kotlin.jvm.internal.n.e(message, "$message");
        p k10 = player.k();
        j10 = dk.k0.j(ck.r.a("value", message));
        k10.c("audio.onLog", j10);
    }

    public static final void G(om.o player, boolean z10) {
        HashMap j10;
        kotlin.jvm.internal.n.e(player, "$player");
        p k10 = player.k();
        j10 = dk.k0.j(ck.r.a("value", Boolean.valueOf(z10)));
        k10.c("audio.onPrepared", j10);
    }

    public static final void I(om.o player) {
        HashMap j10;
        kotlin.jvm.internal.n.e(player, "$player");
        p.d(player.k(), "audio.onSeekComplete", null, 2, null);
        p k10 = player.k();
        ck.m[] mVarArr = new ck.m[1];
        Integer i10 = player.i();
        mVarArr[0] = ck.r.a("value", Integer.valueOf(i10 != null ? i10.intValue() : 0));
        j10 = dk.k0.j(mVarArr);
        k10.c("audio.onCurrentPosition", j10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0084. Please report as an issue. */
    public final void J(MethodCall methodCall, MethodChannel.Result result) {
        List t02;
        Object O;
        nm.a b10;
        List t03;
        Object O2;
        String str = (String) methodCall.argument("playerId");
        if (str == null) {
            return;
        }
        r rVar = null;
        om.l lVar = null;
        s valueOf = null;
        if (kotlin.jvm.internal.n.a(methodCall.method, "create")) {
            BinaryMessenger binaryMessenger = this.f22028f;
            if (binaryMessenger == null) {
                kotlin.jvm.internal.n.p("binaryMessenger");
                binaryMessenger = null;
            }
            p pVar = new p(new EventChannel(binaryMessenger, "xyz.luan/audioplayers/events/" + str));
            ConcurrentHashMap<String, om.o> concurrentHashMap = this.f22030s;
            nm.a c10 = nm.a.c(this.f22033v, false, false, 0, 0, 0, 0, 63, null);
            om.l lVar2 = this.f22029r;
            if (lVar2 == null) {
                kotlin.jvm.internal.n.p("soundPoolManager");
            } else {
                lVar = lVar2;
            }
            concurrentHashMap.put(str, new om.o(this, pVar, c10, lVar));
            result.success(1);
            return;
        }
        om.o q10 = q(str);
        try {
            String str2 = methodCall.method;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1757019252:
                        if (!str2.equals("getCurrentPosition")) {
                            break;
                        } else {
                            result.success(q10.i());
                            return;
                        }
                    case -1722943962:
                        if (!str2.equals("setPlayerMode")) {
                            break;
                        } else {
                            String str3 = (String) methodCall.argument("playerMode");
                            if (str3 != null) {
                                kotlin.jvm.internal.n.b(str3);
                                t02 = xk.q.t0(str3, new char[]{'.'}, false, 0, 6, null);
                                O = z.O(t02);
                                rVar = r.valueOf(n.c((String) O));
                            }
                            if (rVar == null) {
                                throw new IllegalStateException("playerMode is required".toString());
                            }
                            q10.G(rVar);
                            result.success(1);
                            return;
                        }
                    case -1660487654:
                        if (!str2.equals("setBalance")) {
                            break;
                        } else {
                            Double d10 = (Double) methodCall.argument("balance");
                            if (d10 == null) {
                                throw new IllegalStateException("balance is required".toString());
                            }
                            q10.F((float) d10.doubleValue());
                            result.success(1);
                            return;
                        }
                    case -1630329231:
                        if (!str2.equals("emitLog")) {
                            break;
                        } else {
                            String str4 = (String) methodCall.argument(Constants.MESSAGE);
                            if (str4 == null) {
                                throw new IllegalStateException("message is required".toString());
                            }
                            q10.r(str4);
                            result.success(1);
                            return;
                        }
                    case -934426579:
                        if (!str2.equals("resume")) {
                            break;
                        } else {
                            q10.C();
                            result.success(1);
                            return;
                        }
                    case -402284771:
                        if (!str2.equals("setPlaybackRate")) {
                            break;
                        } else {
                            Double d11 = (Double) methodCall.argument("playbackRate");
                            if (d11 == null) {
                                throw new IllegalStateException("playbackRate is required".toString());
                            }
                            q10.I((float) d11.doubleValue());
                            result.success(1);
                            return;
                        }
                    case -159032046:
                        if (!str2.equals("setSourceUrl")) {
                            break;
                        } else {
                            String str5 = (String) methodCall.argument("url");
                            if (str5 == null) {
                                throw new IllegalStateException("url is required".toString());
                            }
                            Boolean bool = (Boolean) methodCall.argument("isLocal");
                            if (bool == null) {
                                bool = Boolean.FALSE;
                            }
                            try {
                                q10.K(new pm.c(str5, bool.booleanValue()));
                                result.success(1);
                                return;
                            } catch (FileNotFoundException e10) {
                                result.error("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", e10);
                                return;
                            }
                        }
                    case 3526264:
                        if (!str2.equals("seek")) {
                            break;
                        } else {
                            Integer num = (Integer) methodCall.argument("position");
                            if (num == null) {
                                throw new IllegalStateException("position is required".toString());
                            }
                            q10.E(num.intValue());
                            result.success(1);
                            return;
                        }
                    case 3540994:
                        if (!str2.equals("stop")) {
                            break;
                        } else {
                            q10.N();
                            result.success(1);
                            return;
                        }
                    case 85887754:
                        if (!str2.equals("getDuration")) {
                            break;
                        } else {
                            result.success(q10.j());
                            return;
                        }
                    case 106440182:
                        if (!str2.equals("pause")) {
                            break;
                        } else {
                            q10.B();
                            result.success(1);
                            return;
                        }
                    case 670514716:
                        if (!str2.equals("setVolume")) {
                            break;
                        } else {
                            Double d12 = (Double) methodCall.argument("volume");
                            if (d12 == null) {
                                throw new IllegalStateException("volume is required".toString());
                            }
                            q10.L((float) d12.doubleValue());
                            result.success(1);
                            return;
                        }
                    case 910310901:
                        if (!str2.equals("emitError")) {
                            break;
                        } else {
                            String str6 = (String) methodCall.argument("code");
                            if (str6 == null) {
                                throw new IllegalStateException("code is required".toString());
                            }
                            String str7 = (String) methodCall.argument(Constants.MESSAGE);
                            if (str7 == null) {
                                throw new IllegalStateException("message is required".toString());
                            }
                            q10.q(str6, str7, null);
                            result.success(1);
                            return;
                        }
                    case 1090594823:
                        if (!str2.equals("release")) {
                            break;
                        } else {
                            q10.D();
                            result.success(1);
                            return;
                        }
                    case 1671767583:
                        if (!str2.equals("dispose")) {
                            break;
                        } else {
                            this.f22031t.post(new Runnable() { // from class: nm.k

                                /* renamed from: b */
                                public final /* synthetic */ m f22020b;

                                /* renamed from: c */
                                public final /* synthetic */ String f22021c;

                                public /* synthetic */ k(m this, String str8) {
                                    r2 = this;
                                    r3 = str8;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    m.K(om.o.this, r2, r3);
                                }
                            });
                            result.success(1);
                            return;
                        }
                    case 1771699022:
                        if (!str2.equals("setSourceBytes")) {
                            break;
                        } else {
                            byte[] bArr = (byte[]) methodCall.argument("bytes");
                            if (bArr == null) {
                                throw new IllegalStateException("bytes are required".toString());
                            }
                            q10.K(new pm.a(bArr));
                            result.success(1);
                            return;
                        }
                    case 1902436987:
                        if (!str2.equals("setAudioContext")) {
                            break;
                        } else {
                            b10 = n.b(methodCall);
                            q10.O(b10);
                            result.success(1);
                            return;
                        }
                    case 2096116872:
                        if (!str2.equals("setReleaseMode")) {
                            break;
                        } else {
                            String str8 = (String) methodCall.argument("releaseMode");
                            if (str8 != null) {
                                kotlin.jvm.internal.n.b(str8);
                                t03 = xk.q.t0(str8, new char[]{'.'}, false, 0, 6, null);
                                O2 = z.O(t03);
                                valueOf = s.valueOf(n.c((String) O2));
                            }
                            if (valueOf == null) {
                                throw new IllegalStateException("releaseMode is required".toString());
                            }
                            q10.J(valueOf);
                            result.success(1);
                            return;
                        }
                }
            }
            result.notImplemented();
        } catch (Exception e11) {
            result.error("AndroidAudioError", e11.getMessage(), e11);
        }
    }

    public static final void K(om.o player, m this$0, String playerId) {
        kotlin.jvm.internal.n.e(player, "$player");
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(playerId, "$playerId");
        player.e();
        this$0.f22030s.remove(playerId);
    }

    public static final void L(m this$0, MethodCall call, MethodChannel.Result response) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(call, "call");
        kotlin.jvm.internal.n.e(response, "response");
        this$0.N(call, response, new b(this$0));
    }

    public static final void M(m this$0, MethodCall call, MethodChannel.Result response) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(call, "call");
        kotlin.jvm.internal.n.e(response, "response");
        this$0.N(call, response, new c(this$0));
    }

    private final void N(MethodCall methodCall, MethodChannel.Result result, ok.p<? super MethodCall, ? super MethodChannel.Result, v> pVar) {
        zk.j.d(this.f22023a, a1.b(), null, new d(pVar, methodCall, result, null), 2, null);
    }

    private final om.o q(String str) {
        om.o oVar = this.f22030s.get(str);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Player has not yet been created or has already been disposed.".toString());
    }

    public final void r(MethodCall methodCall, MethodChannel.Result result) {
        nm.a b10;
        String str = methodCall.method;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1630329231) {
                if (hashCode != 910310901) {
                    if (hashCode == 1902436987 && str.equals("setAudioContext")) {
                        AudioManager p10 = p();
                        p10.setMode(this.f22033v.e());
                        p10.setSpeakerphoneOn(this.f22033v.g());
                        b10 = n.b(methodCall);
                        this.f22033v = b10;
                        result.success(1);
                        return;
                    }
                } else if (str.equals("emitError")) {
                    String str2 = (String) methodCall.argument("code");
                    if (str2 == null) {
                        throw new IllegalStateException("code is required".toString());
                    }
                    String str3 = (String) methodCall.argument(Constants.MESSAGE);
                    if (str3 == null) {
                        throw new IllegalStateException("message is required".toString());
                    }
                    y(str2, str3, null);
                    result.success(1);
                    return;
                }
            } else if (str.equals("emitLog")) {
                String str4 = (String) methodCall.argument(Constants.MESSAGE);
                if (str4 == null) {
                    throw new IllegalStateException("message is required".toString());
                }
                A(str4);
                result.success(1);
                return;
            }
        }
        result.notImplemented();
    }

    public static final void t(om.o player) {
        kotlin.jvm.internal.n.e(player, "$player");
        p.d(player.k(), "audio.onComplete", null, 2, null);
    }

    public static final void v(om.o player) {
        HashMap j10;
        kotlin.jvm.internal.n.e(player, "$player");
        p k10 = player.k();
        ck.m[] mVarArr = new ck.m[1];
        Integer j11 = player.j();
        mVarArr[0] = ck.r.a("value", Integer.valueOf(j11 != null ? j11.intValue() : 0));
        j10 = dk.k0.j(mVarArr);
        k10.c("audio.onDuration", j10);
    }

    public static final void x(om.o player, String str, String str2, Object obj) {
        kotlin.jvm.internal.n.e(player, "$player");
        player.k().b(str, str2, obj);
    }

    public static final void z(m this$0, String str, String str2, Object obj) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        p pVar = this$0.f22026d;
        if (pVar == null) {
            kotlin.jvm.internal.n.p("globalEvents");
            pVar = null;
        }
        pVar.b(str, str2, obj);
    }

    public final void A(String message) {
        kotlin.jvm.internal.n.e(message, "message");
        this.f22031t.post(new Runnable() { // from class: nm.c

            /* renamed from: b */
            public final /* synthetic */ String f22003b;

            public /* synthetic */ c(String message2) {
                r2 = message2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.B(m.this, r2);
            }
        });
    }

    public final void C() {
        O();
    }

    public final void D(om.o player, String message) {
        kotlin.jvm.internal.n.e(player, "player");
        kotlin.jvm.internal.n.e(message, "message");
        this.f22031t.post(new Runnable() { // from class: nm.f

            /* renamed from: b */
            public final /* synthetic */ String f22008b;

            public /* synthetic */ f(String message2) {
                r2 = message2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.E(om.o.this, r2);
            }
        });
    }

    public final void F(om.o player, boolean z10) {
        kotlin.jvm.internal.n.e(player, "player");
        this.f22031t.post(new Runnable() { // from class: nm.e

            /* renamed from: b */
            public final /* synthetic */ boolean f22006b;

            public /* synthetic */ e(boolean z102) {
                r2 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.G(om.o.this, r2);
            }
        });
    }

    public final void H(om.o player) {
        kotlin.jvm.internal.n.e(player, "player");
        this.f22031t.post(new Runnable() { // from class: nm.j
            public /* synthetic */ j() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.I(om.o.this);
            }
        });
    }

    public void O() {
        Runnable runnable = this.f22032u;
        if (runnable != null) {
            this.f22031t.post(runnable);
        }
    }

    @Override // nm.q
    public void a() {
        Runnable runnable = this.f22032u;
        if (runnable != null) {
            this.f22031t.removeCallbacks(runnable);
        }
    }

    public final Context o() {
        Context context = this.f22027e;
        if (context == null) {
            kotlin.jvm.internal.n.p("context");
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.d(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.n.e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        kotlin.jvm.internal.n.d(applicationContext, "getApplicationContext(...)");
        this.f22027e = applicationContext;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.n.d(binaryMessenger, "getBinaryMessenger(...)");
        this.f22028f = binaryMessenger;
        this.f22029r = new om.l(this);
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers");
        this.f22024b = methodChannel;
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: nm.b
            public /* synthetic */ b() {
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                m.L(m.this, methodCall, result);
            }
        });
        MethodChannel methodChannel2 = new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global");
        this.f22025c = methodChannel2;
        methodChannel2.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: nm.d
            public /* synthetic */ d() {
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                m.M(m.this, methodCall, result);
            }
        });
        ConcurrentHashMap<String, om.o> concurrentHashMap = this.f22030s;
        MethodChannel methodChannel3 = this.f22024b;
        if (methodChannel3 == null) {
            kotlin.jvm.internal.n.p("methods");
            methodChannel3 = null;
        }
        this.f22032u = new a(concurrentHashMap, methodChannel3, this.f22031t, this);
        this.f22026d = new p(new EventChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global/events"));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.n.e(binding, "binding");
        a();
        p pVar = null;
        this.f22031t.removeCallbacksAndMessages(null);
        this.f22032u = null;
        Collection<om.o> values = this.f22030s.values();
        kotlin.jvm.internal.n.d(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((om.o) it.next()).e();
        }
        this.f22030s.clear();
        l0.d(this.f22023a, null, 1, null);
        om.l lVar = this.f22029r;
        if (lVar == null) {
            kotlin.jvm.internal.n.p("soundPoolManager");
            lVar = null;
        }
        lVar.d();
        p pVar2 = this.f22026d;
        if (pVar2 == null) {
            kotlin.jvm.internal.n.p("globalEvents");
        } else {
            pVar = pVar2;
        }
        pVar.a();
    }

    public final AudioManager p() {
        Context context = this.f22027e;
        if (context == null) {
            kotlin.jvm.internal.n.p("context");
            context = null;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        kotlin.jvm.internal.n.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public final void s(om.o player) {
        kotlin.jvm.internal.n.e(player, "player");
        this.f22031t.post(new Runnable() { // from class: nm.l
            public /* synthetic */ l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.t(om.o.this);
            }
        });
    }

    public final void u(om.o player) {
        kotlin.jvm.internal.n.e(player, "player");
        this.f22031t.post(new Runnable() { // from class: nm.g
            public /* synthetic */ g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.v(om.o.this);
            }
        });
    }

    public final void w(om.o player, String str, String str2, Object obj) {
        kotlin.jvm.internal.n.e(player, "player");
        this.f22031t.post(new Runnable() { // from class: nm.i

            /* renamed from: b */
            public final /* synthetic */ String f22015b;

            /* renamed from: c */
            public final /* synthetic */ String f22016c;

            /* renamed from: d */
            public final /* synthetic */ Object f22017d;

            public /* synthetic */ i(String str3, String str22, Object obj2) {
                r2 = str3;
                r3 = str22;
                r4 = obj2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.x(om.o.this, r2, r3, r4);
            }
        });
    }

    public final void y(String str, String str2, Object obj) {
        this.f22031t.post(new Runnable() { // from class: nm.h

            /* renamed from: b */
            public final /* synthetic */ String f22011b;

            /* renamed from: c */
            public final /* synthetic */ String f22012c;

            /* renamed from: d */
            public final /* synthetic */ Object f22013d;

            public /* synthetic */ h(String str3, String str22, Object obj2) {
                r2 = str3;
                r3 = str22;
                r4 = obj2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.z(m.this, r2, r3, r4);
            }
        });
    }
}
