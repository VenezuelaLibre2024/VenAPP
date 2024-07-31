package sh;

import android.app.Activity;
import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import ck.InterfaceC2018c;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C9319k;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.InterfaceC9316h;

/* renamed from: sh.c */
/* loaded from: classes3.dex */
public final class C10916c implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* renamed from: a */
    private MethodChannel f27769a;

    /* renamed from: b */
    private MediaRecorder f27770b;

    /* renamed from: c */
    private Activity f27771c;

    /* renamed from: d */
    private C10915b f27772d;

    /* renamed from: e */
    private String f27773e;

    /* renamed from: f */
    private int f27774f;

    /* renamed from: r */
    private int f27775r;

    /* renamed from: t */
    private Integer f27777t;

    /* renamed from: u */
    private Context f27778u;

    /* renamed from: x */
    private ActivityPluginBinding f27781x;

    /* renamed from: s */
    private int f27776s = 44100;

    /* renamed from: v */
    private Map<String, C10914a> f27779v = new LinkedHashMap();

    /* renamed from: w */
    private Map<String, C10922i> f27780w = new LinkedHashMap();

    /* renamed from: sh.c$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC10918e {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f27782a;

        /* renamed from: b */
        final /* synthetic */ C10916c f27783b;

        /* renamed from: c */
        final /* synthetic */ String f27784c;

        a(MethodChannel.Result result, C10916c c10916c, String str) {
            this.f27782a = result;
            this.f27783b = c10916c;
            this.f27784c = str;
        }

        @Override // sh.InterfaceC10918e
        /* renamed from: a */
        public void mo33362a(float f10) {
            if (f10 == 1.0f) {
                MethodChannel.Result result = this.f27782a;
                C10922i c10922i = (C10922i) this.f27783b.f27780w.get(this.f27784c);
                result.success(c10922i != null ? c10922i.m33392t() : null);
            }
        }
    }

    /* renamed from: sh.c$b */
    /* loaded from: classes3.dex */
    /* synthetic */ class b implements InterfaceC10920g, InterfaceC9316h {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f27785a;

        b(MethodChannel.Result result) {
            this.f27785a = result;
        }

        @Override // kotlin.jvm.internal.InterfaceC9316h
        /* renamed from: b */
        public final InterfaceC2018c<?> mo27775b() {
            return new C9319k(1, this.f27785a, MethodChannel.Result.class, "success", "success(Ljava/lang/Object;)V", 0);
        }

        @Override // sh.InterfaceC10920g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void mo33363a(Object obj) {
            this.f27785a.success(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC10920g) && (obj instanceof InterfaceC9316h)) {
                return C9322n.m27777a(mo27775b(), ((InterfaceC9316h) obj).mo27775b());
            }
            return false;
        }

        public final int hashCode() {
            return mo27775b().hashCode();
        }
    }

    /* renamed from: b */
    private final void m33358b(MethodChannel.Result result, int i10, int i11, int i12, Integer num) {
        C10915b c10915b;
        C10915b c10915b2;
        try {
            this.f27770b = new MediaRecorder();
        } catch (Exception unused) {
            Log.e("AudioWaveforms", "Failed to initialise Recorder");
        }
        if (this.f27773e != null) {
            C10915b c10915b3 = this.f27772d;
            if (c10915b3 == null) {
                C9322n.m27792p("audioRecorder");
                c10915b = null;
            } else {
                c10915b = c10915b3;
            }
            String str = this.f27773e;
            C9322n.m27778b(str);
            c10915b.m33352f(str, result, this.f27770b, i10, i11, i12, num);
            return;
        }
        Activity activity = this.f27771c;
        try {
            this.f27773e = File.createTempFile(new SimpleDateFormat("dd-MM-yy-hh-mm-ss", Locale.US).format(new Date()), ".m4a", activity != null ? activity.getCacheDir() : null).getPath();
            C10915b c10915b4 = this.f27772d;
            if (c10915b4 == null) {
                C9322n.m27792p("audioRecorder");
                c10915b2 = null;
            } else {
                c10915b2 = c10915b4;
            }
            String str2 = this.f27773e;
            C9322n.m27778b(str2);
            c10915b2.m33352f(str2, result, this.f27770b, i10, i11, i12, num);
        } catch (IOException unused2) {
            Log.e("AudioWaveforms", "Failed to create file");
        }
    }

    /* renamed from: c */
    private final void m33359c(String str, int i10, String str2, MethodChannel.Result result) {
        Context context;
        MethodChannel methodChannel;
        if (str2 == null) {
            result.error("AudioWaveforms", "Path cant be null", "");
            return;
        }
        Map<String, C10922i> map = this.f27780w;
        Context context2 = this.f27778u;
        if (context2 == null) {
            C9322n.m27792p("applicationContext");
            context = null;
        } else {
            context = context2;
        }
        MethodChannel methodChannel2 = this.f27769a;
        if (methodChannel2 == null) {
            C9322n.m27792p("channel");
            methodChannel = null;
        } else {
            methodChannel = methodChannel2;
        }
        map.put(str, new C10922i(str2, i10, str, methodChannel, result, new a(result, this, str), context));
        C10922i c10922i = this.f27780w.get(str);
        if (c10922i != null) {
            c10922i.m33393y();
        }
        C10922i c10922i2 = this.f27780w.get(str);
        if (c10922i2 != null) {
            c10922i2.m33394z();
        }
    }

    /* renamed from: d */
    private final EnumC10921h m33360d(Integer num) {
        return (num != null && num.intValue() == 2) ? EnumC10921h.High : (num != null && num.intValue() == 1) ? EnumC10921h.Medium : EnumC10921h.Low;
    }

    /* renamed from: e */
    private final void m33361e(String str) {
        if (this.f27779v.get(str) == null) {
            Context context = this.f27778u;
            MethodChannel methodChannel = null;
            if (context == null) {
                C9322n.m27792p("applicationContext");
                context = null;
            }
            MethodChannel methodChannel2 = this.f27769a;
            if (methodChannel2 == null) {
                C9322n.m27792p("channel");
            } else {
                methodChannel = methodChannel2;
            }
            this.f27779v.put(str, new C10914a(context, methodChannel, str));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f27771c = binding.getActivity();
        this.f27781x = binding;
        C9322n.m27778b(binding);
        C10915b c10915b = this.f27772d;
        if (c10915b == null) {
            C9322n.m27792p("audioRecorder");
            c10915b = null;
        }
        binding.addRequestPermissionsResultListener(c10915b);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C9322n.m27781e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "simform_audio_waveforms_plugin/methods");
        this.f27769a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f27772d = new C10915b();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        this.f27778u = applicationContext;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        MediaRecorder mediaRecorder = this.f27770b;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        C10915b c10915b = null;
        this.f27770b = null;
        this.f27779v.clear();
        this.f27780w.clear();
        this.f27771c = null;
        ActivityPluginBinding activityPluginBinding = this.f27781x;
        if (activityPluginBinding != null) {
            C9322n.m27778b(activityPluginBinding);
            C10915b c10915b2 = this.f27772d;
            if (c10915b2 == null) {
                C9322n.m27792p("audioRecorder");
            } else {
                c10915b = c10915b2;
            }
            activityPluginBinding.removeRequestPermissionsResultListener(c10915b);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f27771c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        MethodChannel methodChannel = this.f27769a;
        if (methodChannel == null) {
            C9322n.m27792p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        String str = call.method;
        if (str != null) {
            C10915b c10915b = null;
            C10915b c10915b2 = null;
            C10915b c10915b3 = null;
            C10915b c10915b4 = null;
            C10915b c10915b5 = null;
            switch (str.hashCode()) {
                case -1959921181:
                    if (str.equals("startPlayer")) {
                        Integer num = (Integer) call.argument("finishMode");
                        String str2 = (String) call.argument("playerKey");
                        if (str2 != null) {
                            C10914a c10914a = this.f27779v.get(str2);
                            if (c10914a != null) {
                                c10914a.m33344r(result, Integer.valueOf(num != null ? num.intValue() : 2));
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case -1899438985:
                    if (str.equals("pausePlayer")) {
                        String str3 = (String) call.argument("playerKey");
                        if (str3 != null) {
                            C10914a c10914a2 = this.f27779v.get(str3);
                            if (c10914a2 != null) {
                                c10914a2.m33338l(result);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case -1715853748:
                    if (str.equals("getDecibel")) {
                        C10915b c10915b6 = this.f27772d;
                        if (c10915b6 == null) {
                            C9322n.m27792p("audioRecorder");
                        } else {
                            c10915b = c10915b6;
                        }
                        c10915b.m33351b(result, this.f27770b);
                        return;
                    }
                    break;
                case -1442839165:
                    if (str.equals("stopPlayer")) {
                        String str4 = (String) call.argument("playerKey");
                        if (str4 != null) {
                            C10914a c10914a3 = this.f27779v.get(str4);
                            if (c10914a3 != null) {
                                c10914a3.m33345t(result);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case -1421947749:
                    if (str.equals("pauseRecording")) {
                        C10915b c10915b7 = this.f27772d;
                        if (c10915b7 == null) {
                            C9322n.m27792p("audioRecorder");
                        } else {
                            c10915b5 = c10915b7;
                        }
                        c10915b5.m33353h(result, this.f27770b);
                        return;
                    }
                    break;
                case -1335475597:
                    if (str.equals("stopAllPlayers")) {
                        Iterator<Map.Entry<String, C10914a>> it = this.f27779v.entrySet().iterator();
                        while (it.hasNext()) {
                            String key = it.next().getKey();
                            C10914a c10914a4 = this.f27779v.get(key);
                            if (c10914a4 != null) {
                                c10914a4.m33345t(result);
                            }
                            this.f27779v.put(key, null);
                        }
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1234022968:
                    if (str.equals("releasePlayer")) {
                        C10914a c10914a5 = this.f27779v.get((String) call.argument("playerKey"));
                        if (c10914a5 != null) {
                            c10914a5.m33340n(result);
                            return;
                        }
                        return;
                    }
                    break;
                case -1018136561:
                    if (str.equals("stopRecording")) {
                        C10915b c10915b8 = this.f27772d;
                        if (c10915b8 == null) {
                            C9322n.m27792p("audioRecorder");
                            c10915b8 = null;
                        }
                        MediaRecorder mediaRecorder = this.f27770b;
                        String str5 = this.f27773e;
                        C9322n.m27778b(str5);
                        c10915b8.m33356k(result, mediaRecorder, str5);
                        this.f27770b = null;
                        return;
                    }
                    break;
                case -906224877:
                    if (str.equals("seekTo")) {
                        if (Build.VERSION.SDK_INT < 26) {
                            Log.e("AudioWaveforms", "Minimum android O is required for seekTo function to works");
                            return;
                        }
                        Integer num2 = (Integer) call.argument("progress");
                        String str6 = (String) call.argument("playerKey");
                        if (str6 != null) {
                            C10914a c10914a6 = this.f27779v.get(str6);
                            if (c10914a6 != null) {
                                c10914a6.m33341o(result, num2 != null ? Long.valueOf(num2.intValue()) : null);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case -35360856:
                    if (str.equals("extractWaveformData")) {
                        String str7 = (String) call.argument("playerKey");
                        String str8 = (String) call.argument("path");
                        Integer num3 = (Integer) call.argument("noOfSamples");
                        if (str7 != null) {
                            m33359c(str7, num3 != null ? num3.intValue() : 100, str8, result);
                            return;
                        }
                    }
                    break;
                case 85887754:
                    if (str.equals("getDuration")) {
                        Integer num4 = (Integer) call.argument("durationType");
                        EnumC10917d enumC10917d = (num4 != null && num4.intValue() == 0) ? EnumC10917d.Current : EnumC10917d.Max;
                        String str9 = (String) call.argument("playerKey");
                        if (str9 != null) {
                            C10914a c10914a7 = this.f27779v.get(str9);
                            if (c10914a7 != null) {
                                c10914a7.m33337k(result, enumC10917d);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case 639215535:
                    if (str.equals("startRecording")) {
                        Boolean bool = (Boolean) call.argument("useLegacyNormalization");
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        C10915b c10915b9 = this.f27772d;
                        if (c10915b9 == null) {
                            C9322n.m27792p("audioRecorder");
                        } else {
                            c10915b4 = c10915b9;
                        }
                        c10915b4.m33355j(result, this.f27770b, booleanValue);
                        return;
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        Double d10 = (Double) call.argument("volume");
                        String str10 = (String) call.argument("playerKey");
                        if (str10 != null) {
                            C10914a c10914a8 = this.f27779v.get(str10);
                            if (c10914a8 != null) {
                                c10914a8.m33343q(d10 != null ? Float.valueOf((float) d10.doubleValue()) : null, result);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case 686218487:
                    if (str.equals("checkPermission")) {
                        C10915b c10915b10 = this.f27772d;
                        if (c10915b10 == null) {
                            C9322n.m27792p("audioRecorder");
                        } else {
                            c10915b3 = c10915b10;
                        }
                        c10915b3.m33350a(result, this.f27771c, new b(result));
                        return;
                    }
                    break;
                case 1111930948:
                    if (str.equals("resumeRecording")) {
                        C10915b c10915b11 = this.f27772d;
                        if (c10915b11 == null) {
                            C9322n.m27792p("audioRecorder");
                        } else {
                            c10915b2 = c10915b11;
                        }
                        c10915b2.m33354i(result, this.f27770b);
                        return;
                    }
                    break;
                case 1115124424:
                    if (str.equals("preparePlayer")) {
                        String str11 = (String) call.argument("path");
                        Double d11 = (Double) call.argument("volume");
                        String str12 = (String) call.argument("playerKey");
                        Integer num5 = (Integer) call.argument("updateFrequency");
                        if (str12 != null) {
                            m33361e(str12);
                            C10914a c10914a9 = this.f27779v.get(str12);
                            if (c10914a9 != null) {
                                c10914a9.m33339m(result, str11, d11 != null ? Float.valueOf((float) d11.doubleValue()) : null, m33360d(num5));
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case 1467638254:
                    if (str.equals("initRecorder")) {
                        this.f27773e = (String) call.argument("path");
                        Integer num6 = (Integer) call.argument("encoder");
                        this.f27774f = num6 != null ? num6.intValue() : 0;
                        Integer num7 = (Integer) call.argument("outputFormat");
                        this.f27775r = num7 != null ? num7.intValue() : 0;
                        Integer num8 = (Integer) call.argument("sampleRate");
                        this.f27776s = num8 != null ? num8.intValue() : 44100;
                        Integer num9 = (Integer) call.argument("bitRate");
                        this.f27777t = num9;
                        m33358b(result, this.f27774f, this.f27775r, this.f27776s, num9);
                        return;
                    }
                    break;
                case 1984920674:
                    if (str.equals("setRate")) {
                        Double d12 = (Double) call.argument("rate");
                        String str13 = (String) call.argument("playerKey");
                        if (str13 != null) {
                            C10914a c10914a10 = this.f27779v.get(str13);
                            if (c10914a10 != null) {
                                c10914a10.m33342p(d12 != null ? Float.valueOf((float) d12.doubleValue()) : null, result);
                                return;
                            }
                            return;
                        }
                    }
                    break;
            }
            result.error("AudioWaveforms", "Player key can't be null", "");
            return;
        }
        result.notImplemented();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f27771c = binding.getActivity();
    }
}
