package jm;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.net.Uri;
import ck.v;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    public static final a f20004h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final jm.h f20005i = new jm.h(0.0f, 0.0f, 3, null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f20006a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20007b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20008c;

    /* renamed from: d, reason: collision with root package name */
    private SoundPool f20009d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<Integer, MethodChannel.Result> f20010e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f20011f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, jm.h> f20012g;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f20013a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20014b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20015c;

        public b(int i10, MethodChannel.Result result, int i11) {
            this.f20013a = i10;
            this.f20014b = result;
            this.f20015c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20013a == 0) {
                this.f20014b.success(Integer.valueOf(this.f20015c));
                return;
            }
            this.f20014b.error("Loading failed", "Error code: " + this.f20013a, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20017b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ jm.h f20018c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f20019d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f20020e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20021f;

        public c(int i10, jm.h hVar, int i11, double d10, MethodChannel.Result result) {
            this.f20017b = i10;
            this.f20018c = hVar;
            this.f20019d = i11;
            this.f20020e = d10;
            this.f20021f = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            jm.c.b().post(new k(this.f20021f, g.this.f20009d.play(this.f20017b, this.f20018c.a(), this.f20018c.b(), 0, this.f20019d, (float) this.f20020e)));
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20024c;

        public d(int i10, MethodChannel.Result result) {
            this.f20023b = i10;
            this.f20024c = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f20009d.pause(this.f20023b);
            jm.c.b().post(new l(this.f20024c, this.f20023b));
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20026b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20027c;

        public e(int i10, MethodChannel.Result result) {
            this.f20026b = i10;
            this.f20027c = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f20009d.resume(this.f20026b);
            jm.c.b().post(new m(this.f20027c, this.f20026b));
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20029b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20030c;

        public f(int i10, MethodChannel.Result result) {
            this.f20029b = i10;
            this.f20030c = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f20009d.stop(this.f20029b);
            jm.c.b().post(new n(this.f20030c, this.f20029b));
        }
    }

    /* renamed from: jm.g$g, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0315g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f20031a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f20032b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f20033c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f20034d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f20035e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20036f;

        public RunnableC0315g(Integer num, Integer num2, g gVar, double d10, double d11, MethodChannel.Result result) {
            this.f20031a = num;
            this.f20032b = num2;
            this.f20033c = gVar;
            this.f20034d = d10;
            this.f20035e = d11;
            this.f20036f = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Integer num = this.f20031a;
            if (num != null) {
                this.f20033c.f20009d.setVolume(num.intValue(), (float) this.f20034d, (float) this.f20035e);
            }
            Integer num2 = this.f20032b;
            if (num2 != null) {
                this.f20033c.f20012g.put(Integer.valueOf(num2.intValue()), new jm.h((float) this.f20034d, (float) this.f20035e));
            }
            jm.c.b().post(new o(this.f20036f));
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f20039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20040d;

        public h(int i10, double d10, MethodChannel.Result result) {
            this.f20038b = i10;
            this.f20039c = d10;
            this.f20040d = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f20009d.setRate(this.f20038b, (float) this.f20039c);
            jm.c.b().post(new p(this.f20040d));
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20041a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20042b;

        public i(MethodChannel.Result result, int i10) {
            this.f20041a = result;
            this.f20042b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20041a.success(Integer.valueOf(this.f20042b));
        }
    }

    /* loaded from: classes3.dex */
    public static final class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20043a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f20044b;

        public j(MethodChannel.Result result, Throwable th2) {
            this.f20043a = result;
            this.f20044b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20043a.error("URI loading failure", this.f20044b.getMessage(), null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20045a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20046b;

        public k(MethodChannel.Result result, int i10) {
            this.f20045a = result;
            this.f20046b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20045a.success(Integer.valueOf(this.f20046b));
        }
    }

    /* loaded from: classes3.dex */
    public static final class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20047a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20048b;

        public l(MethodChannel.Result result, int i10) {
            this.f20047a = result;
            this.f20048b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20047a.success(Integer.valueOf(this.f20048b));
        }
    }

    /* loaded from: classes3.dex */
    public static final class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20049a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20050b;

        public m(MethodChannel.Result result, int i10) {
            this.f20049a = result;
            this.f20050b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20049a.success(Integer.valueOf(this.f20050b));
        }
    }

    /* loaded from: classes3.dex */
    public static final class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20051a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20052b;

        public n(MethodChannel.Result result, int i10) {
            this.f20051a = result;
            this.f20052b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20051a.success(Integer.valueOf(this.f20052b));
        }
    }

    /* loaded from: classes3.dex */
    public static final class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20053a;

        public o(MethodChannel.Result result) {
            this.f20053a = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20053a.success(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20054a;

        public p(MethodChannel.Result result) {
            this.f20054a = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20054a.success(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f20056b;

        public q(MethodChannel.Result result, Throwable th2) {
            this.f20055a = result;
            this.f20056b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20055a.error("Loading failure", this.f20056b.getMessage(), null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f20057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20058b;

        public r(MethodChannel.Result result, int i10) {
            this.f20057a = result;
            this.f20058b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20057a.success(Integer.valueOf(this.f20058b));
        }
    }

    public g(Context context, int i10, int i11) {
        kotlin.jvm.internal.n.e(context, "context");
        this.f20006a = context;
        this.f20007b = i10;
        this.f20008c = i11;
        this.f20009d = f();
        this.f20010e = new HashMap<>();
        this.f20011f = new ThreadPoolExecutor(1, i10, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f20012g = new LinkedHashMap();
    }

    private final SoundPool f() {
        int i10;
        int i11 = this.f20008c;
        if (i11 != 2) {
            i10 = 4;
            if (i11 != 4) {
                i10 = 5;
                if (i11 != 5) {
                    i10 = 14;
                }
            }
        } else {
            i10 = 6;
        }
        SoundPool build = new SoundPool.Builder().setMaxStreams(this.f20007b).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(this.f20008c).setUsage(i10).build()).build();
        build.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: jm.d
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i12, int i13) {
                g.g(g.this, soundPool, i12, i13);
            }
        });
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(g this$0, SoundPool soundPool, int i10, int i11) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        MethodChannel.Result result = this$0.f20010e.get(Integer.valueOf(i10));
        if (result != null) {
            jm.c.b().post(new b(i11, result, i10));
            this$0.f20010e.remove(Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(MethodCall call, g this$0, MethodChannel.Result result) {
        File d10;
        int load;
        kotlin.jvm.internal.n.e(call, "$call");
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(result, "$result");
        try {
            Object obj = call.arguments;
            kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map = (Map) obj;
            Object obj2 = map.get("uri");
            kotlin.jvm.internal.n.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = map.get("priority");
            kotlin.jvm.internal.n.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            URI create = URI.create(str);
            if (kotlin.jvm.internal.n.a(create.getScheme(), "content")) {
                load = this$0.f20009d.load(this$0.f20006a.getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r"), 1);
            } else {
                d10 = mk.k.d("sound", "pool", this$0.f20006a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(d10);
                try {
                    URL url = create.toURL();
                    kotlin.jvm.internal.n.d(url, "toURL(...)");
                    fileOutputStream.write(mk.m.c(url));
                    v vVar = v.f7137a;
                    mk.b.a(fileOutputStream, null);
                    d10.deleteOnExit();
                    load = this$0.f20009d.load(d10.getAbsolutePath(), intValue);
                } finally {
                }
            }
            if (load <= -1) {
                jm.c.b().post(new i(result, load));
            } else {
                this$0.f20010e.put(Integer.valueOf(load), result);
            }
        } catch (Throwable th2) {
            jm.c.b().post(new j(result, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MethodCall call, g this$0, MethodChannel.Result result) {
        File d10;
        kotlin.jvm.internal.n.e(call, "$call");
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(result, "$result");
        try {
            Object obj = call.arguments;
            kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map = (Map) obj;
            Object obj2 = map.get("rawSound");
            kotlin.jvm.internal.n.c(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj2;
            Object obj3 = map.get("priority");
            kotlin.jvm.internal.n.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            d10 = mk.k.d("sound", "pool", this$0.f20006a.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(d10);
            try {
                fileOutputStream.write(bArr);
                d10.deleteOnExit();
                int load = this$0.f20009d.load(d10.getAbsolutePath(), intValue);
                if (load > -1) {
                    this$0.f20010e.put(Integer.valueOf(load), result);
                } else {
                    jm.c.b().post(new r(result, load));
                }
                v vVar = v.f7137a;
                mk.b.a(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable th2) {
            jm.c.b().post(new q(result, th2));
        }
    }

    private final jm.h m(int i10) {
        jm.h hVar = this.f20012g.get(Integer.valueOf(i10));
        return hVar == null ? f20005i : hVar;
    }

    public final void h() {
        l();
        this.f20011f.shutdownNow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k(final MethodCall call, final MethodChannel.Result result) {
        Executor executor;
        Runnable eVar;
        kotlin.jvm.internal.n.e(call, "call");
        kotlin.jvm.internal.n.e(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -934426579:
                    if (str.equals("resume")) {
                        Object obj = call.arguments;
                        kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj2 = ((Map) obj).get("streamId");
                        kotlin.jvm.internal.n.b(obj2);
                        int intValue = ((Number) obj2).intValue();
                        executor = this.f20011f;
                        eVar = new e(intValue, result);
                        break;
                    }
                    break;
                case 3327206:
                    if (str.equals("load")) {
                        executor = jm.c.a();
                        eVar = new Runnable() { // from class: jm.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.j(MethodCall.this, this, result);
                            }
                        };
                        break;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        Object obj3 = call.arguments;
                        kotlin.jvm.internal.n.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        Map map = (Map) obj3;
                        Integer num = (Integer) map.get("soundId");
                        kotlin.jvm.internal.n.b(num);
                        int intValue2 = num.intValue();
                        Integer num2 = (Integer) map.get("repeat");
                        int intValue3 = num2 != null ? num2.intValue() : 0;
                        Double d10 = (Double) map.get("rate");
                        this.f20011f.execute(new c(intValue2, m(intValue2), intValue3, d10 != null ? d10.doubleValue() : 1.0d, result));
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        Object obj4 = call.arguments;
                        kotlin.jvm.internal.n.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj5 = ((Map) obj4).get("streamId");
                        kotlin.jvm.internal.n.b(obj5);
                        int intValue4 = ((Number) obj5).intValue();
                        executor = this.f20011f;
                        eVar = new f(intValue4, result);
                        break;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        Object obj6 = call.arguments;
                        kotlin.jvm.internal.n.c(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj7 = ((Map) obj6).get("streamId");
                        kotlin.jvm.internal.n.b(obj7);
                        int intValue5 = ((Number) obj7).intValue();
                        executor = this.f20011f;
                        eVar = new d(intValue5, result);
                        break;
                    }
                    break;
                case 336631462:
                    if (str.equals("loadUri")) {
                        executor = jm.c.a();
                        eVar = new Runnable() { // from class: jm.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.i(MethodCall.this, this, result);
                            }
                        };
                        break;
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        Object obj8 = call.arguments;
                        kotlin.jvm.internal.n.c(obj8, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                        Map map2 = (Map) obj8;
                        Integer num3 = (Integer) map2.get("streamId");
                        Integer num4 = (Integer) map2.get("soundId");
                        if (num3 == null && num4 == null) {
                            result.error("InvalidParameters", "Either 'streamId' or 'soundId' has to be passed", null);
                        }
                        Object obj9 = map2.get("volumeLeft");
                        kotlin.jvm.internal.n.b(obj9);
                        double doubleValue = ((Double) obj9).doubleValue();
                        Object obj10 = map2.get("volumeRight");
                        kotlin.jvm.internal.n.b(obj10);
                        this.f20011f.execute(new RunnableC0315g(num3, num4, this, doubleValue, ((Double) obj10).doubleValue(), result));
                        return;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        l();
                        this.f20009d = f();
                        result.success(null);
                        return;
                    }
                    break;
                case 1984920674:
                    if (str.equals("setRate")) {
                        Object obj11 = call.arguments;
                        kotlin.jvm.internal.n.c(obj11, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                        Map map3 = (Map) obj11;
                        Object obj12 = map3.get("streamId");
                        kotlin.jvm.internal.n.b(obj12);
                        int intValue6 = ((Integer) obj12).intValue();
                        Double d11 = (Double) map3.get("rate");
                        this.f20011f.execute(new h(intValue6, d11 != null ? d11.doubleValue() : 1.0d, result));
                        return;
                    }
                    break;
            }
            executor.execute(eVar);
            return;
        }
        result.notImplemented();
    }

    public final void l() {
        this.f20009d.release();
    }
}
