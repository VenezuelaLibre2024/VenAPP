package jm;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.net.Uri;
import ck.C2037v;
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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import mk.C9611k;
import mk.C9613m;

/* renamed from: jm.g */
/* loaded from: classes3.dex */
public final class C9091g {

    /* renamed from: h */
    public static final a f21783h = new a(null);

    /* renamed from: i */
    private static final C9092h f21784i = new C9092h(0.0f, 0.0f, 3, null);

    /* renamed from: a */
    private final Context f21785a;

    /* renamed from: b */
    private final int f21786b;

    /* renamed from: c */
    private final int f21787c;

    /* renamed from: d */
    private SoundPool f21788d;

    /* renamed from: e */
    private final HashMap<Integer, MethodChannel.Result> f21789e;

    /* renamed from: f */
    private ExecutorService f21790f;

    /* renamed from: g */
    private final Map<Integer, C9092h> f21791g;

    /* renamed from: jm.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: jm.g$b */
    /* loaded from: classes3.dex */
    public static final class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f21792a;

        /* renamed from: b */
        final /* synthetic */ MethodChannel.Result f21793b;

        /* renamed from: c */
        final /* synthetic */ int f21794c;

        public b(int i10, MethodChannel.Result result, int i11) {
            this.f21792a = i10;
            this.f21793b = result;
            this.f21794c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f21792a == 0) {
                this.f21793b.success(Integer.valueOf(this.f21794c));
                return;
            }
            this.f21793b.error("Loading failed", "Error code: " + this.f21792a, null);
        }
    }

    /* renamed from: jm.g$c */
    /* loaded from: classes3.dex */
    public static final class c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f21796b;

        /* renamed from: c */
        final /* synthetic */ C9092h f21797c;

        /* renamed from: d */
        final /* synthetic */ int f21798d;

        /* renamed from: e */
        final /* synthetic */ double f21799e;

        /* renamed from: f */
        final /* synthetic */ MethodChannel.Result f21800f;

        public c(int i10, C9092h c9092h, int i11, double d10, MethodChannel.Result result) {
            this.f21796b = i10;
            this.f21797c = c9092h;
            this.f21798d = i11;
            this.f21799e = d10;
            this.f21800f = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9087c.m26698b().post(new k(this.f21800f, C9091g.this.f21788d.play(this.f21796b, this.f21797c.m26712a(), this.f21797c.m26713b(), 0, this.f21798d, (float) this.f21799e)));
        }
    }

    /* renamed from: jm.g$d */
    /* loaded from: classes3.dex */
    public static final class d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f21802b;

        /* renamed from: c */
        final /* synthetic */ MethodChannel.Result f21803c;

        public d(int i10, MethodChannel.Result result) {
            this.f21802b = i10;
            this.f21803c = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9091g.this.f21788d.pause(this.f21802b);
            C9087c.m26698b().post(new l(this.f21803c, this.f21802b));
        }
    }

    /* renamed from: jm.g$e */
    /* loaded from: classes3.dex */
    public static final class e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f21805b;

        /* renamed from: c */
        final /* synthetic */ MethodChannel.Result f21806c;

        public e(int i10, MethodChannel.Result result) {
            this.f21805b = i10;
            this.f21806c = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9091g.this.f21788d.resume(this.f21805b);
            C9087c.m26698b().post(new m(this.f21806c, this.f21805b));
        }
    }

    /* renamed from: jm.g$f */
    /* loaded from: classes3.dex */
    public static final class f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f21808b;

        /* renamed from: c */
        final /* synthetic */ MethodChannel.Result f21809c;

        public f(int i10, MethodChannel.Result result) {
            this.f21808b = i10;
            this.f21809c = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9091g.this.f21788d.stop(this.f21808b);
            C9087c.m26698b().post(new n(this.f21809c, this.f21808b));
        }
    }

    /* renamed from: jm.g$g */
    /* loaded from: classes3.dex */
    public static final class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f21810a;

        /* renamed from: b */
        final /* synthetic */ Integer f21811b;

        /* renamed from: c */
        final /* synthetic */ C9091g f21812c;

        /* renamed from: d */
        final /* synthetic */ double f21813d;

        /* renamed from: e */
        final /* synthetic */ double f21814e;

        /* renamed from: f */
        final /* synthetic */ MethodChannel.Result f21815f;

        public g(Integer num, Integer num2, C9091g c9091g, double d10, double d11, MethodChannel.Result result) {
            this.f21810a = num;
            this.f21811b = num2;
            this.f21812c = c9091g;
            this.f21813d = d10;
            this.f21814e = d11;
            this.f21815f = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Integer num = this.f21810a;
            if (num != null) {
                this.f21812c.f21788d.setVolume(num.intValue(), (float) this.f21813d, (float) this.f21814e);
            }
            Integer num2 = this.f21811b;
            if (num2 != null) {
                this.f21812c.f21791g.put(Integer.valueOf(num2.intValue()), new C9092h((float) this.f21813d, (float) this.f21814e));
            }
            C9087c.m26698b().post(new o(this.f21815f));
        }
    }

    /* renamed from: jm.g$h */
    /* loaded from: classes3.dex */
    public static final class h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f21817b;

        /* renamed from: c */
        final /* synthetic */ double f21818c;

        /* renamed from: d */
        final /* synthetic */ MethodChannel.Result f21819d;

        public h(int i10, double d10, MethodChannel.Result result) {
            this.f21817b = i10;
            this.f21818c = d10;
            this.f21819d = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9091g.this.f21788d.setRate(this.f21817b, (float) this.f21818c);
            C9087c.m26698b().post(new p(this.f21819d));
        }
    }

    /* renamed from: jm.g$i */
    /* loaded from: classes3.dex */
    public static final class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21820a;

        /* renamed from: b */
        final /* synthetic */ int f21821b;

        public i(MethodChannel.Result result, int i10) {
            this.f21820a = result;
            this.f21821b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21820a.success(Integer.valueOf(this.f21821b));
        }
    }

    /* renamed from: jm.g$j */
    /* loaded from: classes3.dex */
    public static final class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21822a;

        /* renamed from: b */
        final /* synthetic */ Throwable f21823b;

        public j(MethodChannel.Result result, Throwable th2) {
            this.f21822a = result;
            this.f21823b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21822a.error("URI loading failure", this.f21823b.getMessage(), null);
        }
    }

    /* renamed from: jm.g$k */
    /* loaded from: classes3.dex */
    public static final class k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21824a;

        /* renamed from: b */
        final /* synthetic */ int f21825b;

        public k(MethodChannel.Result result, int i10) {
            this.f21824a = result;
            this.f21825b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21824a.success(Integer.valueOf(this.f21825b));
        }
    }

    /* renamed from: jm.g$l */
    /* loaded from: classes3.dex */
    public static final class l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21826a;

        /* renamed from: b */
        final /* synthetic */ int f21827b;

        public l(MethodChannel.Result result, int i10) {
            this.f21826a = result;
            this.f21827b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21826a.success(Integer.valueOf(this.f21827b));
        }
    }

    /* renamed from: jm.g$m */
    /* loaded from: classes3.dex */
    public static final class m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21828a;

        /* renamed from: b */
        final /* synthetic */ int f21829b;

        public m(MethodChannel.Result result, int i10) {
            this.f21828a = result;
            this.f21829b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21828a.success(Integer.valueOf(this.f21829b));
        }
    }

    /* renamed from: jm.g$n */
    /* loaded from: classes3.dex */
    public static final class n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21830a;

        /* renamed from: b */
        final /* synthetic */ int f21831b;

        public n(MethodChannel.Result result, int i10) {
            this.f21830a = result;
            this.f21831b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21830a.success(Integer.valueOf(this.f21831b));
        }
    }

    /* renamed from: jm.g$o */
    /* loaded from: classes3.dex */
    public static final class o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21832a;

        public o(MethodChannel.Result result) {
            this.f21832a = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21832a.success(null);
        }
    }

    /* renamed from: jm.g$p */
    /* loaded from: classes3.dex */
    public static final class p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21833a;

        public p(MethodChannel.Result result) {
            this.f21833a = result;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21833a.success(null);
        }
    }

    /* renamed from: jm.g$q */
    /* loaded from: classes3.dex */
    public static final class q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21834a;

        /* renamed from: b */
        final /* synthetic */ Throwable f21835b;

        public q(MethodChannel.Result result, Throwable th2) {
            this.f21834a = result;
            this.f21835b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21834a.error("Loading failure", this.f21835b.getMessage(), null);
        }
    }

    /* renamed from: jm.g$r */
    /* loaded from: classes3.dex */
    public static final class r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f21836a;

        /* renamed from: b */
        final /* synthetic */ int f21837b;

        public r(MethodChannel.Result result, int i10) {
            this.f21836a = result;
            this.f21837b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21836a.success(Integer.valueOf(this.f21837b));
        }
    }

    public C9091g(Context context, int i10, int i11) {
        C9322n.m27781e(context, "context");
        this.f21785a = context;
        this.f21786b = i10;
        this.f21787c = i11;
        this.f21788d = m26704f();
        this.f21789e = new HashMap<>();
        this.f21790f = new ThreadPoolExecutor(1, i10, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f21791g = new LinkedHashMap();
    }

    /* renamed from: f */
    private final SoundPool m26704f() {
        int i10;
        int i11 = this.f21787c;
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
        SoundPool build = new SoundPool.Builder().setMaxStreams(this.f21786b).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(this.f21787c).setUsage(i10).build()).build();
        build.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: jm.d
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i12, int i13) {
                C9091g.m26705g(C9091g.this, soundPool, i12, i13);
            }
        });
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m26705g(C9091g this$0, SoundPool soundPool, int i10, int i11) {
        C9322n.m27781e(this$0, "this$0");
        MethodChannel.Result result = this$0.f21789e.get(Integer.valueOf(i10));
        if (result != null) {
            C9087c.m26698b().post(new b(i11, result, i10));
            this$0.f21789e.remove(Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m26706i(MethodCall call, C9091g this$0, MethodChannel.Result result) {
        File m28604d;
        int load;
        C9322n.m27781e(call, "$call");
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(result, "$result");
        try {
            Object obj = call.arguments;
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map = (Map) obj;
            Object obj2 = map.get("uri");
            C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = map.get("priority");
            C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            URI create = URI.create(str);
            if (C9322n.m27777a(create.getScheme(), "content")) {
                load = this$0.f21788d.load(this$0.f21785a.getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r"), 1);
            } else {
                m28604d = C9611k.m28604d("sound", "pool", this$0.f21785a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(m28604d);
                try {
                    URL url = create.toURL();
                    C9322n.m27780d(url, "toURL(...)");
                    fileOutputStream.write(C9613m.m28608c(url));
                    C2037v c2037v = C2037v.f8089a;
                    C9602b.m28593a(fileOutputStream, null);
                    m28604d.deleteOnExit();
                    load = this$0.f21788d.load(m28604d.getAbsolutePath(), intValue);
                } finally {
                }
            }
            if (load <= -1) {
                C9087c.m26698b().post(new i(result, load));
            } else {
                this$0.f21789e.put(Integer.valueOf(load), result);
            }
        } catch (Throwable th2) {
            C9087c.m26698b().post(new j(result, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m26707j(MethodCall call, C9091g this$0, MethodChannel.Result result) {
        File m28604d;
        C9322n.m27781e(call, "$call");
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(result, "$result");
        try {
            Object obj = call.arguments;
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map = (Map) obj;
            Object obj2 = map.get("rawSound");
            C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj2;
            Object obj3 = map.get("priority");
            C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            m28604d = C9611k.m28604d("sound", "pool", this$0.f21785a.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(m28604d);
            try {
                fileOutputStream.write(bArr);
                m28604d.deleteOnExit();
                int load = this$0.f21788d.load(m28604d.getAbsolutePath(), intValue);
                if (load > -1) {
                    this$0.f21789e.put(Integer.valueOf(load), result);
                } else {
                    C9087c.m26698b().post(new r(result, load));
                }
                C2037v c2037v = C2037v.f8089a;
                C9602b.m28593a(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable th2) {
            C9087c.m26698b().post(new q(result, th2));
        }
    }

    /* renamed from: m */
    private final C9092h m26708m(int i10) {
        C9092h c9092h = this.f21791g.get(Integer.valueOf(i10));
        return c9092h == null ? f21784i : c9092h;
    }

    /* renamed from: h */
    public final void m26709h() {
        m26711l();
        this.f21790f.shutdownNow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: k */
    public final void m26710k(final MethodCall call, final MethodChannel.Result result) {
        Executor executor;
        Runnable eVar;
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -934426579:
                    if (str.equals("resume")) {
                        Object obj = call.arguments;
                        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj2 = ((Map) obj).get("streamId");
                        C9322n.m27778b(obj2);
                        int intValue = ((Number) obj2).intValue();
                        executor = this.f21790f;
                        eVar = new e(intValue, result);
                        break;
                    }
                    break;
                case 3327206:
                    if (str.equals("load")) {
                        executor = C9087c.m26697a();
                        eVar = new Runnable() { // from class: jm.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                C9091g.m26707j(MethodCall.this, this, result);
                            }
                        };
                        break;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        Object obj3 = call.arguments;
                        C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        Map map = (Map) obj3;
                        Integer num = (Integer) map.get("soundId");
                        C9322n.m27778b(num);
                        int intValue2 = num.intValue();
                        Integer num2 = (Integer) map.get("repeat");
                        int intValue3 = num2 != null ? num2.intValue() : 0;
                        Double d10 = (Double) map.get("rate");
                        this.f21790f.execute(new c(intValue2, m26708m(intValue2), intValue3, d10 != null ? d10.doubleValue() : 1.0d, result));
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        Object obj4 = call.arguments;
                        C9322n.m27779c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj5 = ((Map) obj4).get("streamId");
                        C9322n.m27778b(obj5);
                        int intValue4 = ((Number) obj5).intValue();
                        executor = this.f21790f;
                        eVar = new f(intValue4, result);
                        break;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        Object obj6 = call.arguments;
                        C9322n.m27779c(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj7 = ((Map) obj6).get("streamId");
                        C9322n.m27778b(obj7);
                        int intValue5 = ((Number) obj7).intValue();
                        executor = this.f21790f;
                        eVar = new d(intValue5, result);
                        break;
                    }
                    break;
                case 336631462:
                    if (str.equals("loadUri")) {
                        executor = C9087c.m26697a();
                        eVar = new Runnable() { // from class: jm.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                C9091g.m26706i(MethodCall.this, this, result);
                            }
                        };
                        break;
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        Object obj8 = call.arguments;
                        C9322n.m27779c(obj8, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                        Map map2 = (Map) obj8;
                        Integer num3 = (Integer) map2.get("streamId");
                        Integer num4 = (Integer) map2.get("soundId");
                        if (num3 == null && num4 == null) {
                            result.error("InvalidParameters", "Either 'streamId' or 'soundId' has to be passed", null);
                        }
                        Object obj9 = map2.get("volumeLeft");
                        C9322n.m27778b(obj9);
                        double doubleValue = ((Double) obj9).doubleValue();
                        Object obj10 = map2.get("volumeRight");
                        C9322n.m27778b(obj10);
                        this.f21790f.execute(new g(num3, num4, this, doubleValue, ((Double) obj10).doubleValue(), result));
                        return;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        m26711l();
                        this.f21788d = m26704f();
                        result.success(null);
                        return;
                    }
                    break;
                case 1984920674:
                    if (str.equals("setRate")) {
                        Object obj11 = call.arguments;
                        C9322n.m27779c(obj11, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                        Map map3 = (Map) obj11;
                        Object obj12 = map3.get("streamId");
                        C9322n.m27778b(obj12);
                        int intValue6 = ((Integer) obj12).intValue();
                        Double d11 = (Double) map3.get("rate");
                        this.f21790f.execute(new h(intValue6, d11 != null ? d11.doubleValue() : 1.0d, result));
                        return;
                    }
                    break;
            }
            executor.execute(eVar);
            return;
        }
        result.notImplemented();
    }

    /* renamed from: l */
    public final void m26711l() {
        this.f21788d.release();
    }
}
