package sh;

import android.app.Activity;
import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
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
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class c implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f25625a;

    /* renamed from: b, reason: collision with root package name */
    private MediaRecorder f25626b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f25627c;

    /* renamed from: d, reason: collision with root package name */
    private sh.b f25628d;

    /* renamed from: e, reason: collision with root package name */
    private String f25629e;

    /* renamed from: f, reason: collision with root package name */
    private int f25630f;

    /* renamed from: r, reason: collision with root package name */
    private int f25631r;

    /* renamed from: t, reason: collision with root package name */
    private Integer f25633t;

    /* renamed from: u, reason: collision with root package name */
    private Context f25634u;

    /* renamed from: x, reason: collision with root package name */
    private ActivityPluginBinding f25637x;

    /* renamed from: s, reason: collision with root package name */
    private int f25632s = 44100;

    /* renamed from: v, reason: collision with root package name */
    private Map<String, sh.a> f25635v = new LinkedHashMap();

    /* renamed from: w, reason: collision with root package name */
    private Map<String, i> f25636w = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f25638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f25639b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25640c;

        a(MethodChannel.Result result, c cVar, String str) {
            this.f25638a = result;
            this.f25639b = cVar;
            this.f25640c = str;
        }

        @Override // sh.e
        public void a(float f10) {
            if (f10 == 1.0f) {
                MethodChannel.Result result = this.f25638a;
                i iVar = (i) this.f25639b.f25636w.get(this.f25640c);
                result.success(iVar != null ? iVar.t() : null);
            }
        }
    }

    /* loaded from: classes3.dex */
    /* synthetic */ class b implements g, kotlin.jvm.internal.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f25641a;

        b(MethodChannel.Result result) {
            this.f25641a = result;
        }

        @Override // kotlin.jvm.internal.h
        public final ck.c<?> b() {
            return new k(1, this.f25641a, MethodChannel.Result.class, "success", "success(Ljava/lang/Object;)V", 0);
        }

        @Override // sh.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void a(Object obj) {
            this.f25641a.success(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof g) && (obj instanceof kotlin.jvm.internal.h)) {
                return n.a(b(), ((kotlin.jvm.internal.h) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    private final void b(MethodChannel.Result result, int i10, int i11, int i12, Integer num) {
        sh.b bVar;
        sh.b bVar2;
        try {
            this.f25626b = new MediaRecorder();
        } catch (Exception unused) {
            Log.e("AudioWaveforms", "Failed to initialise Recorder");
        }
        if (this.f25629e != null) {
            sh.b bVar3 = this.f25628d;
            if (bVar3 == null) {
                n.p("audioRecorder");
                bVar = null;
            } else {
                bVar = bVar3;
            }
            String str = this.f25629e;
            n.b(str);
            bVar.f(str, result, this.f25626b, i10, i11, i12, num);
            return;
        }
        Activity activity = this.f25627c;
        try {
            this.f25629e = File.createTempFile(new SimpleDateFormat("dd-MM-yy-hh-mm-ss", Locale.US).format(new Date()), ".m4a", activity != null ? activity.getCacheDir() : null).getPath();
            sh.b bVar4 = this.f25628d;
            if (bVar4 == null) {
                n.p("audioRecorder");
                bVar2 = null;
            } else {
                bVar2 = bVar4;
            }
            String str2 = this.f25629e;
            n.b(str2);
            bVar2.f(str2, result, this.f25626b, i10, i11, i12, num);
        } catch (IOException unused2) {
            Log.e("AudioWaveforms", "Failed to create file");
        }
    }

    private final void c(String str, int i10, String str2, MethodChannel.Result result) {
        Context context;
        MethodChannel methodChannel;
        if (str2 == null) {
            result.error("AudioWaveforms", "Path cant be null", "");
            return;
        }
        Map<String, i> map = this.f25636w;
        Context context2 = this.f25634u;
        if (context2 == null) {
            n.p("applicationContext");
            context = null;
        } else {
            context = context2;
        }
        MethodChannel methodChannel2 = this.f25625a;
        if (methodChannel2 == null) {
            n.p("channel");
            methodChannel = null;
        } else {
            methodChannel = methodChannel2;
        }
        map.put(str, new i(str2, i10, str, methodChannel, result, new a(result, this, str), context));
        i iVar = this.f25636w.get(str);
        if (iVar != null) {
            iVar.y();
        }
        i iVar2 = this.f25636w.get(str);
        if (iVar2 != null) {
            iVar2.z();
        }
    }

    private final h d(Integer num) {
        return (num != null && num.intValue() == 2) ? h.High : (num != null && num.intValue() == 1) ? h.Medium : h.Low;
    }

    private final void e(String str) {
        if (this.f25635v.get(str) == null) {
            Context context = this.f25634u;
            MethodChannel methodChannel = null;
            if (context == null) {
                n.p("applicationContext");
                context = null;
            }
            MethodChannel methodChannel2 = this.f25625a;
            if (methodChannel2 == null) {
                n.p("channel");
            } else {
                methodChannel = methodChannel2;
            }
            this.f25635v.put(str, new sh.a(context, methodChannel, str));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        this.f25627c = binding.getActivity();
        this.f25637x = binding;
        n.b(binding);
        sh.b bVar = this.f25628d;
        if (bVar == null) {
            n.p("audioRecorder");
            bVar = null;
        }
        binding.addRequestPermissionsResultListener(bVar);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        n.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "simform_audio_waveforms_plugin/methods");
        this.f25625a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f25628d = new sh.b();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        this.f25634u = applicationContext;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        MediaRecorder mediaRecorder = this.f25626b;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        sh.b bVar = null;
        this.f25626b = null;
        this.f25635v.clear();
        this.f25636w.clear();
        this.f25627c = null;
        ActivityPluginBinding activityPluginBinding = this.f25637x;
        if (activityPluginBinding != null) {
            n.b(activityPluginBinding);
            sh.b bVar2 = this.f25628d;
            if (bVar2 == null) {
                n.p("audioRecorder");
            } else {
                bVar = bVar2;
            }
            activityPluginBinding.removeRequestPermissionsResultListener(bVar);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f25627c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        MethodChannel methodChannel = this.f25625a;
        if (methodChannel == null) {
            n.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        n.e(call, "call");
        n.e(result, "result");
        String str = call.method;
        if (str != null) {
            sh.b bVar = null;
            sh.b bVar2 = null;
            sh.b bVar3 = null;
            sh.b bVar4 = null;
            sh.b bVar5 = null;
            switch (str.hashCode()) {
                case -1959921181:
                    if (str.equals("startPlayer")) {
                        Integer num = (Integer) call.argument("finishMode");
                        String str2 = (String) call.argument("playerKey");
                        if (str2 != null) {
                            sh.a aVar = this.f25635v.get(str2);
                            if (aVar != null) {
                                aVar.r(result, Integer.valueOf(num != null ? num.intValue() : 2));
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
                            sh.a aVar2 = this.f25635v.get(str3);
                            if (aVar2 != null) {
                                aVar2.l(result);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case -1715853748:
                    if (str.equals("getDecibel")) {
                        sh.b bVar6 = this.f25628d;
                        if (bVar6 == null) {
                            n.p("audioRecorder");
                        } else {
                            bVar = bVar6;
                        }
                        bVar.b(result, this.f25626b);
                        return;
                    }
                    break;
                case -1442839165:
                    if (str.equals("stopPlayer")) {
                        String str4 = (String) call.argument("playerKey");
                        if (str4 != null) {
                            sh.a aVar3 = this.f25635v.get(str4);
                            if (aVar3 != null) {
                                aVar3.t(result);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case -1421947749:
                    if (str.equals("pauseRecording")) {
                        sh.b bVar7 = this.f25628d;
                        if (bVar7 == null) {
                            n.p("audioRecorder");
                        } else {
                            bVar5 = bVar7;
                        }
                        bVar5.h(result, this.f25626b);
                        return;
                    }
                    break;
                case -1335475597:
                    if (str.equals("stopAllPlayers")) {
                        Iterator<Map.Entry<String, sh.a>> it = this.f25635v.entrySet().iterator();
                        while (it.hasNext()) {
                            String key = it.next().getKey();
                            sh.a aVar4 = this.f25635v.get(key);
                            if (aVar4 != null) {
                                aVar4.t(result);
                            }
                            this.f25635v.put(key, null);
                        }
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1234022968:
                    if (str.equals("releasePlayer")) {
                        sh.a aVar5 = this.f25635v.get((String) call.argument("playerKey"));
                        if (aVar5 != null) {
                            aVar5.n(result);
                            return;
                        }
                        return;
                    }
                    break;
                case -1018136561:
                    if (str.equals("stopRecording")) {
                        sh.b bVar8 = this.f25628d;
                        if (bVar8 == null) {
                            n.p("audioRecorder");
                            bVar8 = null;
                        }
                        MediaRecorder mediaRecorder = this.f25626b;
                        String str5 = this.f25629e;
                        n.b(str5);
                        bVar8.k(result, mediaRecorder, str5);
                        this.f25626b = null;
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
                            sh.a aVar6 = this.f25635v.get(str6);
                            if (aVar6 != null) {
                                aVar6.o(result, num2 != null ? Long.valueOf(num2.intValue()) : null);
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
                            c(str7, num3 != null ? num3.intValue() : 100, str8, result);
                            return;
                        }
                    }
                    break;
                case 85887754:
                    if (str.equals("getDuration")) {
                        Integer num4 = (Integer) call.argument("durationType");
                        d dVar = (num4 != null && num4.intValue() == 0) ? d.Current : d.Max;
                        String str9 = (String) call.argument("playerKey");
                        if (str9 != null) {
                            sh.a aVar7 = this.f25635v.get(str9);
                            if (aVar7 != null) {
                                aVar7.k(result, dVar);
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
                        sh.b bVar9 = this.f25628d;
                        if (bVar9 == null) {
                            n.p("audioRecorder");
                        } else {
                            bVar4 = bVar9;
                        }
                        bVar4.j(result, this.f25626b, booleanValue);
                        return;
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        Double d10 = (Double) call.argument("volume");
                        String str10 = (String) call.argument("playerKey");
                        if (str10 != null) {
                            sh.a aVar8 = this.f25635v.get(str10);
                            if (aVar8 != null) {
                                aVar8.q(d10 != null ? Float.valueOf((float) d10.doubleValue()) : null, result);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case 686218487:
                    if (str.equals("checkPermission")) {
                        sh.b bVar10 = this.f25628d;
                        if (bVar10 == null) {
                            n.p("audioRecorder");
                        } else {
                            bVar3 = bVar10;
                        }
                        bVar3.a(result, this.f25627c, new b(result));
                        return;
                    }
                    break;
                case 1111930948:
                    if (str.equals("resumeRecording")) {
                        sh.b bVar11 = this.f25628d;
                        if (bVar11 == null) {
                            n.p("audioRecorder");
                        } else {
                            bVar2 = bVar11;
                        }
                        bVar2.i(result, this.f25626b);
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
                            e(str12);
                            sh.a aVar9 = this.f25635v.get(str12);
                            if (aVar9 != null) {
                                aVar9.m(result, str11, d11 != null ? Float.valueOf((float) d11.doubleValue()) : null, d(num5));
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case 1467638254:
                    if (str.equals("initRecorder")) {
                        this.f25629e = (String) call.argument("path");
                        Integer num6 = (Integer) call.argument("encoder");
                        this.f25630f = num6 != null ? num6.intValue() : 0;
                        Integer num7 = (Integer) call.argument("outputFormat");
                        this.f25631r = num7 != null ? num7.intValue() : 0;
                        Integer num8 = (Integer) call.argument("sampleRate");
                        this.f25632s = num8 != null ? num8.intValue() : 44100;
                        Integer num9 = (Integer) call.argument("bitRate");
                        this.f25633t = num9;
                        b(result, this.f25630f, this.f25631r, this.f25632s, num9);
                        return;
                    }
                    break;
                case 1984920674:
                    if (str.equals("setRate")) {
                        Double d12 = (Double) call.argument("rate");
                        String str13 = (String) call.argument("playerKey");
                        if (str13 != null) {
                            sh.a aVar10 = this.f25635v.get(str13);
                            if (aVar10 != null) {
                                aVar10.p(d12 != null ? Float.valueOf((float) d12.doubleValue()) : null, result);
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
        n.e(binding, "binding");
        this.f25627c = binding.getActivity();
    }
}
