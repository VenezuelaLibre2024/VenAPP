package p258nm;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import ck.C2028m;
import ck.C2030o;
import ck.C2033r;
import ck.C2037v;
import dk.C7018k0;
import dk.C7042z;
import hk.C7752d;
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
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9319k;
import kotlin.jvm.internal.C9322n;
import om.C10023l;
import om.C10026o;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;
import p450xk.C12525q;
import p494zk.C13034a1;
import p494zk.C13071j;
import p494zk.C13080l0;
import p494zk.InterfaceC13076k0;
import pm.C10211a;
import pm.C10213c;

/* renamed from: nm.m */
/* loaded from: classes3.dex */
public final class C9743m implements FlutterPlugin, InterfaceC9747q {

    /* renamed from: b */
    private MethodChannel f23957b;

    /* renamed from: c */
    private MethodChannel f23958c;

    /* renamed from: d */
    private C9746p f23959d;

    /* renamed from: e */
    private Context f23960e;

    /* renamed from: f */
    private BinaryMessenger f23961f;

    /* renamed from: r */
    private C10023l f23962r;

    /* renamed from: u */
    private Runnable f23965u;

    /* renamed from: a */
    private final InterfaceC13076k0 f23956a = C13080l0.m43227a(C13034a1.m43041c());

    /* renamed from: s */
    private final ConcurrentHashMap<String, C10026o> f23963s = new ConcurrentHashMap<>();

    /* renamed from: t */
    private final Handler f23964t = new Handler(Looper.getMainLooper());

    /* renamed from: v */
    private C9731a f23966v = new C9731a();

    /* renamed from: nm.m$a */
    /* loaded from: classes3.dex */
    private static final class a implements Runnable {

        /* renamed from: a */
        private final WeakReference<ConcurrentMap<String, C10026o>> f23967a;

        /* renamed from: b */
        private final WeakReference<MethodChannel> f23968b;

        /* renamed from: c */
        private final WeakReference<Handler> f23969c;

        /* renamed from: d */
        private final WeakReference<InterfaceC9747q> f23970d;

        public a(ConcurrentMap<String, C10026o> mediaPlayers, MethodChannel methodChannel, Handler handler, InterfaceC9747q updateCallback) {
            C9322n.m27781e(mediaPlayers, "mediaPlayers");
            C9322n.m27781e(methodChannel, "methodChannel");
            C9322n.m27781e(handler, "handler");
            C9322n.m27781e(updateCallback, "updateCallback");
            this.f23967a = new WeakReference<>(mediaPlayers);
            this.f23968b = new WeakReference<>(methodChannel);
            this.f23969c = new WeakReference<>(handler);
            this.f23970d = new WeakReference<>(updateCallback);
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap m20423j;
            ConcurrentMap<String, C10026o> concurrentMap = this.f23967a.get();
            MethodChannel methodChannel = this.f23968b.get();
            Handler handler = this.f23969c.get();
            InterfaceC9747q interfaceC9747q = this.f23970d.get();
            if (concurrentMap == null || methodChannel == null || handler == null || interfaceC9747q == null) {
                if (interfaceC9747q != null) {
                    interfaceC9747q.mo29207a();
                    return;
                }
                return;
            }
            boolean z10 = false;
            for (C10026o c10026o : concurrentMap.values()) {
                if (c10026o.m29930t()) {
                    Integer m29921i = c10026o.m29921i();
                    C9746p m29923k = c10026o.m29923k();
                    C2028m[] c2028mArr = new C2028m[1];
                    c2028mArr[0] = C2033r.m10353a("value", Integer.valueOf(m29921i != null ? m29921i.intValue() : 0));
                    m20423j = C7018k0.m20423j(c2028mArr);
                    m29923k.m29223c("audio.onCurrentPosition", m20423j);
                    z10 = true;
                }
            }
            if (z10) {
                handler.postDelayed(this, 200L);
            } else {
                interfaceC9747q.mo29207a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nm.m$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b extends C9319k implements InterfaceC10002p<MethodCall, MethodChannel.Result, C2037v> {
        b(Object obj) {
            super(2, obj, C9743m.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        /* renamed from: a */
        public final void m29214a(MethodCall p02, MethodChannel.Result p12) {
            C9322n.m27781e(p02, "p0");
            C9322n.m27781e(p12, "p1");
            ((C9743m) this.receiver).m29177J(p02, p12);
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ C2037v invoke(MethodCall methodCall, MethodChannel.Result result) {
            m29214a(methodCall, result);
            return C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nm.m$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c extends C9319k implements InterfaceC10002p<MethodCall, MethodChannel.Result, C2037v> {
        c(Object obj) {
            super(2, obj, C9743m.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
        }

        /* renamed from: a */
        public final void m29215a(MethodCall p02, MethodChannel.Result p12) {
            C9322n.m27781e(p02, "p0");
            C9322n.m27781e(p12, "p1");
            ((C9743m) this.receiver).m29196r(p02, p12);
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ C2037v invoke(MethodCall methodCall, MethodChannel.Result result) {
            m29215a(methodCall, result);
            return C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "xyz.luan.audioplayers.AudioplayersPlugin$safeCall$1", m27743f = "AudioplayersPlugin.kt", m27744l = {}, m27745m = "invokeSuspend")
    /* renamed from: nm.m$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f23971a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC10002p<MethodCall, MethodChannel.Result, C2037v> f23972b;

        /* renamed from: c */
        final /* synthetic */ MethodCall f23973c;

        /* renamed from: d */
        final /* synthetic */ MethodChannel.Result f23974d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(InterfaceC10002p<? super MethodCall, ? super MethodChannel.Result, C2037v> interfaceC10002p, MethodCall methodCall, MethodChannel.Result result, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f23972b = interfaceC10002p;
            this.f23973c = methodCall;
            this.f23974d = result;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new d(this.f23972b, this.f23973c, this.f23974d, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
            return ((d) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            C7752d.m23655c();
            if (this.f23971a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2030o.m10349b(obj);
            try {
                this.f23972b.invoke(this.f23973c, this.f23974d);
            } catch (Exception e10) {
                this.f23974d.error("Unexpected AndroidAudioError", e10.getMessage(), e10);
            }
            return C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m29173B(C9743m this$0, String message) {
        HashMap m20423j;
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(message, "$message");
        C9746p c9746p = this$0.f23959d;
        if (c9746p == null) {
            C9322n.m27792p("globalEvents");
            c9746p = null;
        }
        m20423j = C7018k0.m20423j(C2033r.m10353a("value", message));
        c9746p.m29223c("audio.onLog", m20423j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m29174E(C10026o player, String message) {
        HashMap m20423j;
        C9322n.m27781e(player, "$player");
        C9322n.m27781e(message, "$message");
        C9746p m29923k = player.m29923k();
        m20423j = C7018k0.m20423j(C2033r.m10353a("value", message));
        m29923k.m29223c("audio.onLog", m20423j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final void m29175G(C10026o player, boolean z10) {
        HashMap m20423j;
        C9322n.m27781e(player, "$player");
        C9746p m29923k = player.m29923k();
        m20423j = C7018k0.m20423j(C2033r.m10353a("value", Boolean.valueOf(z10)));
        m29923k.m29223c("audio.onPrepared", m20423j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m29176I(C10026o player) {
        HashMap m20423j;
        C9322n.m27781e(player, "$player");
        C9746p.m29220d(player.m29923k(), "audio.onSeekComplete", null, 2, null);
        C9746p m29923k = player.m29923k();
        C2028m[] c2028mArr = new C2028m[1];
        Integer m29921i = player.m29921i();
        c2028mArr[0] = C2033r.m10353a("value", Integer.valueOf(m29921i != null ? m29921i.intValue() : 0));
        m20423j = C7018k0.m20423j(c2028mArr);
        m29923k.m29223c("audio.onCurrentPosition", m20423j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0084. Please report as an issue. */
    /* renamed from: J */
    public final void m29177J(MethodCall methodCall, MethodChannel.Result result) {
        List m41097t0;
        Object m20613O;
        C9731a m29217b;
        List m41097t02;
        Object m20613O2;
        final String str = (String) methodCall.argument("playerId");
        if (str == null) {
            return;
        }
        EnumC9748r enumC9748r = null;
        C10023l c10023l = null;
        EnumC9749s valueOf = null;
        if (C9322n.m27777a(methodCall.method, "create")) {
            BinaryMessenger binaryMessenger = this.f23961f;
            if (binaryMessenger == null) {
                C9322n.m27792p("binaryMessenger");
                binaryMessenger = null;
            }
            C9746p c9746p = new C9746p(new EventChannel(binaryMessenger, "xyz.luan/audioplayers/events/" + str));
            ConcurrentHashMap<String, C10026o> concurrentHashMap = this.f23963s;
            C9731a m29165c = C9731a.m29165c(this.f23966v, false, false, 0, 0, 0, 0, 63, null);
            C10023l c10023l2 = this.f23962r;
            if (c10023l2 == null) {
                C9322n.m27792p("soundPoolManager");
            } else {
                c10023l = c10023l2;
            }
            concurrentHashMap.put(str, new C10026o(this, c9746p, m29165c, c10023l));
            result.success(1);
            return;
        }
        final C10026o m29195q = m29195q(str);
        try {
            String str2 = methodCall.method;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1757019252:
                        if (!str2.equals("getCurrentPosition")) {
                            break;
                        } else {
                            result.success(m29195q.m29921i());
                            return;
                        }
                    case -1722943962:
                        if (!str2.equals("setPlayerMode")) {
                            break;
                        } else {
                            String str3 = (String) methodCall.argument("playerMode");
                            if (str3 != null) {
                                C9322n.m27778b(str3);
                                m41097t0 = C12525q.m41097t0(str3, new char[]{'.'}, false, 0, 6, null);
                                m20613O = C7042z.m20613O(m41097t0);
                                enumC9748r = EnumC9748r.valueOf(C9744n.m29218c((String) m20613O));
                            }
                            if (enumC9748r == null) {
                                throw new IllegalStateException("playerMode is required".toString());
                            }
                            m29195q.m29909G(enumC9748r);
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
                            m29195q.m29908F((float) d10.doubleValue());
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
                            m29195q.m29929r(str4);
                            result.success(1);
                            return;
                        }
                    case -934426579:
                        if (!str2.equals("resume")) {
                            break;
                        } else {
                            m29195q.m29905C();
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
                            m29195q.m29911I((float) d11.doubleValue());
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
                                m29195q.m29913K(new C10213c(str5, bool.booleanValue()));
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
                            m29195q.m29907E(num.intValue());
                            result.success(1);
                            return;
                        }
                    case 3540994:
                        if (!str2.equals("stop")) {
                            break;
                        } else {
                            m29195q.m29915N();
                            result.success(1);
                            return;
                        }
                    case 85887754:
                        if (!str2.equals("getDuration")) {
                            break;
                        } else {
                            result.success(m29195q.m29922j());
                            return;
                        }
                    case 106440182:
                        if (!str2.equals("pause")) {
                            break;
                        } else {
                            m29195q.m29904B();
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
                            m29195q.m29914L((float) d12.doubleValue());
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
                            m29195q.m29928q(str6, str7, null);
                            result.success(1);
                            return;
                        }
                    case 1090594823:
                        if (!str2.equals("release")) {
                            break;
                        } else {
                            m29195q.m29906D();
                            result.success(1);
                            return;
                        }
                    case 1671767583:
                        if (!str2.equals("dispose")) {
                            break;
                        } else {
                            this.f23964t.post(new Runnable() { // from class: nm.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9743m.m29178K(C10026o.this, this, str);
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
                            m29195q.m29913K(new C10211a(bArr));
                            result.success(1);
                            return;
                        }
                    case 1902436987:
                        if (!str2.equals("setAudioContext")) {
                            break;
                        } else {
                            m29217b = C9744n.m29217b(methodCall);
                            m29195q.m29916O(m29217b);
                            result.success(1);
                            return;
                        }
                    case 2096116872:
                        if (!str2.equals("setReleaseMode")) {
                            break;
                        } else {
                            String str8 = (String) methodCall.argument("releaseMode");
                            if (str8 != null) {
                                C9322n.m27778b(str8);
                                m41097t02 = C12525q.m41097t0(str8, new char[]{'.'}, false, 0, 6, null);
                                m20613O2 = C7042z.m20613O(m41097t02);
                                valueOf = EnumC9749s.valueOf(C9744n.m29218c((String) m20613O2));
                            }
                            if (valueOf == null) {
                                throw new IllegalStateException("releaseMode is required".toString());
                            }
                            m29195q.m29912J(valueOf);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m29178K(C10026o player, C9743m this$0, String playerId) {
        C9322n.m27781e(player, "$player");
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(playerId, "$playerId");
        player.m29917e();
        this$0.f23963s.remove(playerId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m29179L(C9743m this$0, MethodCall call, MethodChannel.Result response) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(call, "call");
        C9322n.m27781e(response, "response");
        this$0.m29181N(call, response, new b(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m29180M(C9743m this$0, MethodCall call, MethodChannel.Result response) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(call, "call");
        C9322n.m27781e(response, "response");
        this$0.m29181N(call, response, new c(this$0));
    }

    /* renamed from: N */
    private final void m29181N(MethodCall methodCall, MethodChannel.Result result, InterfaceC10002p<? super MethodCall, ? super MethodChannel.Result, C2037v> interfaceC10002p) {
        C13071j.m43218d(this.f23956a, C13034a1.m43040b(), null, new d(interfaceC10002p, methodCall, result, null), 2, null);
    }

    /* renamed from: q */
    private final C10026o m29195q(String str) {
        C10026o c10026o = this.f23963s.get(str);
        if (c10026o != null) {
            return c10026o;
        }
        throw new IllegalStateException("Player has not yet been created or has already been disposed.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m29196r(MethodCall methodCall, MethodChannel.Result result) {
        C9731a m29217b;
        String str = methodCall.method;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1630329231) {
                if (hashCode != 910310901) {
                    if (hashCode == 1902436987 && str.equals("setAudioContext")) {
                        AudioManager m29209p = m29209p();
                        m29209p.setMode(this.f23966v.m29169e());
                        m29209p.setSpeakerphoneOn(this.f23966v.m29171g());
                        m29217b = C9744n.m29217b(methodCall);
                        this.f23966v = m29217b;
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
                    m29213y(str2, str3, null);
                    result.success(1);
                    return;
                }
            } else if (str.equals("emitLog")) {
                String str4 = (String) methodCall.argument(Constants.MESSAGE);
                if (str4 == null) {
                    throw new IllegalStateException("message is required".toString());
                }
                m29201A(str4);
                result.success(1);
                return;
            }
        }
        result.notImplemented();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m29197t(C10026o player) {
        C9322n.m27781e(player, "$player");
        C9746p.m29220d(player.m29923k(), "audio.onComplete", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m29198v(C10026o player) {
        HashMap m20423j;
        C9322n.m27781e(player, "$player");
        C9746p m29923k = player.m29923k();
        C2028m[] c2028mArr = new C2028m[1];
        Integer m29922j = player.m29922j();
        c2028mArr[0] = C2033r.m10353a("value", Integer.valueOf(m29922j != null ? m29922j.intValue() : 0));
        m20423j = C7018k0.m20423j(c2028mArr);
        m29923k.m29223c("audio.onDuration", m20423j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m29199x(C10026o player, String str, String str2, Object obj) {
        C9322n.m27781e(player, "$player");
        player.m29923k().m29222b(str, str2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m29200z(C9743m this$0, String str, String str2, Object obj) {
        C9322n.m27781e(this$0, "this$0");
        C9746p c9746p = this$0.f23959d;
        if (c9746p == null) {
            C9322n.m27792p("globalEvents");
            c9746p = null;
        }
        c9746p.m29222b(str, str2, obj);
    }

    /* renamed from: A */
    public final void m29201A(final String message) {
        C9322n.m27781e(message, "message");
        this.f23964t.post(new Runnable() { // from class: nm.c
            @Override // java.lang.Runnable
            public final void run() {
                C9743m.m29173B(C9743m.this, message);
            }
        });
    }

    /* renamed from: C */
    public final void m29202C() {
        m29206O();
    }

    /* renamed from: D */
    public final void m29203D(final C10026o player, final String message) {
        C9322n.m27781e(player, "player");
        C9322n.m27781e(message, "message");
        this.f23964t.post(new Runnable() { // from class: nm.f
            @Override // java.lang.Runnable
            public final void run() {
                C9743m.m29174E(C10026o.this, message);
            }
        });
    }

    /* renamed from: F */
    public final void m29204F(final C10026o player, final boolean z10) {
        C9322n.m27781e(player, "player");
        this.f23964t.post(new Runnable() { // from class: nm.e
            @Override // java.lang.Runnable
            public final void run() {
                C9743m.m29175G(C10026o.this, z10);
            }
        });
    }

    /* renamed from: H */
    public final void m29205H(final C10026o player) {
        C9322n.m27781e(player, "player");
        this.f23964t.post(new Runnable() { // from class: nm.j
            @Override // java.lang.Runnable
            public final void run() {
                C9743m.m29176I(C10026o.this);
            }
        });
    }

    /* renamed from: O */
    public void m29206O() {
        Runnable runnable = this.f23965u;
        if (runnable != null) {
            this.f23964t.post(runnable);
        }
    }

    @Override // p258nm.InterfaceC9747q
    /* renamed from: a */
    public void mo29207a() {
        Runnable runnable = this.f23965u;
        if (runnable != null) {
            this.f23964t.removeCallbacks(runnable);
        }
    }

    /* renamed from: o */
    public final Context m29208o() {
        Context context = this.f23960e;
        if (context == null) {
            C9322n.m27792p("context");
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        this.f23960e = applicationContext;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        this.f23961f = binaryMessenger;
        this.f23962r = new C10023l(this);
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers");
        this.f23957b = methodChannel;
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: nm.b
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                C9743m.m29179L(C9743m.this, methodCall, result);
            }
        });
        MethodChannel methodChannel2 = new MethodChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global");
        this.f23958c = methodChannel2;
        methodChannel2.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: nm.d
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                C9743m.m29180M(C9743m.this, methodCall, result);
            }
        });
        ConcurrentHashMap<String, C10026o> concurrentHashMap = this.f23963s;
        MethodChannel methodChannel3 = this.f23957b;
        if (methodChannel3 == null) {
            C9322n.m27792p("methods");
            methodChannel3 = null;
        }
        this.f23965u = new a(concurrentHashMap, methodChannel3, this.f23964t, this);
        this.f23959d = new C9746p(new EventChannel(binding.getBinaryMessenger(), "xyz.luan/audioplayers.global/events"));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        mo29207a();
        C9746p c9746p = null;
        this.f23964t.removeCallbacksAndMessages(null);
        this.f23965u = null;
        Collection<C10026o> values = this.f23963s.values();
        C9322n.m27780d(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((C10026o) it.next()).m29917e();
        }
        this.f23963s.clear();
        C13080l0.m43230d(this.f23956a, null, 1, null);
        C10023l c10023l = this.f23962r;
        if (c10023l == null) {
            C9322n.m27792p("soundPoolManager");
            c10023l = null;
        }
        c10023l.m29879d();
        C9746p c9746p2 = this.f23959d;
        if (c9746p2 == null) {
            C9322n.m27792p("globalEvents");
        } else {
            c9746p = c9746p2;
        }
        c9746p.m29221a();
    }

    /* renamed from: p */
    public final AudioManager m29209p() {
        Context context = this.f23960e;
        if (context == null) {
            C9322n.m27792p("context");
            context = null;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        C9322n.m27779c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    /* renamed from: s */
    public final void m29210s(final C10026o player) {
        C9322n.m27781e(player, "player");
        this.f23964t.post(new Runnable() { // from class: nm.l
            @Override // java.lang.Runnable
            public final void run() {
                C9743m.m29197t(C10026o.this);
            }
        });
    }

    /* renamed from: u */
    public final void m29211u(final C10026o player) {
        C9322n.m27781e(player, "player");
        this.f23964t.post(new Runnable() { // from class: nm.g
            @Override // java.lang.Runnable
            public final void run() {
                C9743m.m29198v(C10026o.this);
            }
        });
    }

    /* renamed from: w */
    public final void m29212w(final C10026o player, final String str, final String str2, final Object obj) {
        C9322n.m27781e(player, "player");
        this.f23964t.post(new Runnable() { // from class: nm.i
            @Override // java.lang.Runnable
            public final void run() {
                C9743m.m29199x(C10026o.this, str, str2, obj);
            }
        });
    }

    /* renamed from: y */
    public final void m29213y(final String str, final String str2, final Object obj) {
        this.f23964t.post(new Runnable() { // from class: nm.h
            @Override // java.lang.Runnable
            public final void run() {
                C9743m.m29200z(C9743m.this, str, str2, obj);
            }
        });
    }
}
