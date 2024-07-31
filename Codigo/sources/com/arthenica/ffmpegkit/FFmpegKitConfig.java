package com.arthenica.ffmpegkit;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class FFmpegKitConfig {

    /* renamed from: a */
    private static final AtomicInteger f7209a;

    /* renamed from: b */
    private static m f7210b;

    /* renamed from: c */
    private static int f7211c;

    /* renamed from: d */
    private static final Map<Long, x> f7212d;

    /* renamed from: e */
    private static final List<x> f7213e;

    /* renamed from: f */
    private static final Object f7214f;

    /* renamed from: g */
    private static int f7215g;

    /* renamed from: h */
    private static ExecutorService f7216h;

    /* renamed from: i */
    private static o f7217i;

    /* renamed from: j */
    private static b0 f7218j;

    /* renamed from: k */
    private static i f7219k;

    /* renamed from: l */
    private static l f7220l;

    /* renamed from: m */
    private static t f7221m;

    /* renamed from: n */
    private static final SparseArray<c> f7222n;

    /* renamed from: o */
    private static final SparseArray<c> f7223o;

    /* renamed from: p */
    private static p f7224p;

    /* loaded from: classes.dex */
    class a extends LinkedHashMap<Long, x> {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Long, x> entry) {
            return size() > FFmpegKitConfig.f7211c;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f7225a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7226b;

        static {
            int[] iArr = new int[m.values().length];
            f7226b = iArr;
            try {
                iArr[m.AV_LOG_QUIET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7226b[m.AV_LOG_TRACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7226b[m.AV_LOG_DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7226b[m.AV_LOG_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7226b[m.AV_LOG_WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7226b[m.AV_LOG_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7226b[m.AV_LOG_FATAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7226b[m.AV_LOG_PANIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7226b[m.AV_LOG_STDERR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7226b[m.AV_LOG_VERBOSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[p.values().length];
            f7225a = iArr2;
            try {
                iArr2[p.NEVER_PRINT_LOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7225a[p.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7225a[p.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7225a[p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7225a[p.ALWAYS_PRINT_LOGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final Integer f7227a;

        /* renamed from: b */
        private final Uri f7228b;

        /* renamed from: c */
        private final String f7229c;

        /* renamed from: d */
        private final ContentResolver f7230d;

        /* renamed from: e */
        private ParcelFileDescriptor f7231e;

        public c(Integer num, Uri uri, String str, ContentResolver contentResolver) {
            this.f7227a = num;
            this.f7228b = uri;
            this.f7229c = str;
            this.f7230d = contentResolver;
        }

        public ContentResolver a() {
            return this.f7230d;
        }

        public String b() {
            return this.f7229c;
        }

        public ParcelFileDescriptor c() {
            return this.f7231e;
        }

        public Integer d() {
            return this.f7227a;
        }

        public Uri e() {
            return this.f7228b;
        }

        public void f(ParcelFileDescriptor parcelFileDescriptor) {
            this.f7231e = parcelFileDescriptor;
        }
    }

    static {
        u2.a.b("com.arthenica");
        Log.i("ffmpeg-kit", "Loading ffmpeg-kit.");
        u.f(u.e());
        f7209a = new AtomicInteger(1);
        f7210b = m.h(u.j());
        f7215g = 10;
        f7216h = Executors.newFixedThreadPool(10);
        f7211c = 10;
        f7212d = new a();
        f7213e = new LinkedList();
        f7214f = new Object();
        f7217i = null;
        f7218j = null;
        f7219k = null;
        f7220l = null;
        f7221m = null;
        f7222n = new SparseArray<>();
        f7223o = new SparseArray<>();
        f7224p = p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED;
        Log.i("ffmpeg-kit", String.format("Loaded ffmpeg-kit-%s-%s-%s-%s.", u.l(), u.c(), u.m(), u.d()));
    }

    private FFmpegKitConfig() {
    }

    public static x A() {
        synchronized (f7214f) {
            List<x> list = f7213e;
            if (list.size() <= 0) {
                return null;
            }
            return list.get(list.size() - 1);
        }
    }

    public static m B() {
        return f7210b;
    }

    public static p C() {
        return f7224p;
    }

    public static void D(s sVar, int i10) {
        sVar.w();
        try {
            w wVar = new w(nativeFFprobeExecute(sVar.f(), sVar.t()));
            sVar.r(wVar);
            if (wVar.b()) {
                List<n> c10 = sVar.c(i10);
                StringBuilder sb2 = new StringBuilder();
                int size = c10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    n nVar = c10.get(i11);
                    if (nVar.a() == m.AV_LOG_STDERR) {
                        sb2.append(nVar.b());
                    }
                }
                sVar.B(r.a(sb2.toString()));
            }
        } catch (Exception e10) {
            sVar.s(e10);
            Log.w("ffmpeg-kit", String.format("Get media information execute failed: %s.%s", c(sVar.t()), u2.a.a(e10)));
        }
    }

    public static t E() {
        return f7221m;
    }

    public static List<s> F() {
        LinkedList linkedList = new LinkedList();
        synchronized (f7214f) {
            for (x xVar : f7213e) {
                if (xVar.p()) {
                    linkedList.add((s) xVar);
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e A[Catch: all -> 0x0067, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0067, blocks: (B:3:0x0002, B:7:0x002e, B:19:0x0029, B:22:0x0026, B:12:0x0011, B:14:0x0017, B:18:0x0021), top: B:2:0x0002, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String G(android.content.Context r7, android.net.Uri r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "_display_name"
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L67
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r8
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L2a
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L2a
            int r2 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L20
            goto L2c
        L20:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r9 = move-exception
            r7.addSuppressed(r9)     // Catch: java.lang.Throwable -> L67
        L29:
            throw r7     // Catch: java.lang.Throwable -> L67
        L2a:
            java.lang.String r2 = "unknown"
        L2c:
            if (r1 == 0) goto L31
            r1.close()     // Catch: java.lang.Throwable -> L67
        L31:
            java.util.concurrent.atomic.AtomicInteger r0 = com.arthenica.ffmpegkit.FFmpegKitConfig.f7209a
            int r0 = r0.getAndIncrement()
            android.util.SparseArray<com.arthenica.ffmpegkit.FFmpegKitConfig$c> r1 = com.arthenica.ffmpegkit.FFmpegKitConfig.f7222n
            com.arthenica.ffmpegkit.FFmpegKitConfig$c r3 = new com.arthenica.ffmpegkit.FFmpegKitConfig$c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            android.content.ContentResolver r7 = r7.getContentResolver()
            r3.<init>(r4, r8, r9, r7)
            r1.put(r0, r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "saf:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = "."
            r7.append(r8)
            java.lang.String r8 = q(r2)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
        L67:
            r7 = move-exception
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r1 = 0
            r9[r1] = r0
            r0 = 1
            java.lang.String r8 = r8.toString()
            r9[r0] = r8
            r8 = 2
            java.lang.String r0 = u2.a.a(r7)
            r9[r8] = r0
            java.lang.String r8 = "Failed to get %s column for %s.%s"
            java.lang.String r8 = java.lang.String.format(r8, r9)
            java.lang.String r9 = "ffmpeg-kit"
            android.util.Log.e(r9, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.FFmpegKitConfig.G(android.content.Context, android.net.Uri, java.lang.String):java.lang.String");
    }

    public static x H(long j10) {
        x xVar;
        synchronized (f7214f) {
            xVar = f7212d.get(Long.valueOf(j10));
        }
        return xVar;
    }

    public static int I() {
        return f7211c;
    }

    public static List<x> J() {
        LinkedList linkedList;
        synchronized (f7214f) {
            linkedList = new LinkedList(f7213e);
        }
        return linkedList;
    }

    public static List<x> K(y yVar) {
        LinkedList linkedList = new LinkedList();
        synchronized (f7214f) {
            for (x xVar : f7213e) {
                if (xVar.getState() == yVar) {
                    linkedList.add(xVar);
                }
            }
        }
        return linkedList;
    }

    public static String L() {
        return N() ? String.format("%s-lts", getNativeVersion()) : getNativeVersion();
    }

    public static void M(z zVar) {
        ignoreNativeSignal(zVar.h());
    }

    public static boolean N() {
        return AbiDetect.isNativeLTSBuild();
    }

    public static String O(Context context) {
        String format;
        File file = new File(context.getCacheDir(), "pipes");
        if (file.exists() || file.mkdirs()) {
            String format2 = MessageFormat.format("{0}{1}{2}{3}", file, File.separator, "fk_pipe_", Integer.valueOf(f7209a.getAndIncrement()));
            h(format2);
            int registerNewNativeFFmpegPipe = registerNewNativeFFmpegPipe(format2);
            if (registerNewNativeFFmpegPipe == 0) {
                return format2;
            }
            format = String.format("Failed to register new FFmpeg pipe %s. Operation failed with rc=%d.", format2, Integer.valueOf(registerNewNativeFFmpegPipe));
        } else {
            format = String.format("Failed to create pipes directory: %s.", file.getAbsolutePath());
        }
        Log.e("ffmpeg-kit", format);
        return null;
    }

    public static int P(String str, String str2) {
        return setNativeEnvironmentVariable(str, str2);
    }

    public static void Q(Context context, String str, Map<String, String> map) {
        R(context, Collections.singletonList(str), map);
    }

    public static void R(Context context, List<String> list, Map<String, String> map) {
        int i10;
        Object obj;
        File file = new File(context.getCacheDir(), "fontconfig");
        if (!file.exists()) {
            Log.d("ffmpeg-kit", String.format("Created temporary font conf directory: %s.", Boolean.valueOf(file.mkdirs())));
        }
        File file2 = new File(file, "fonts.conf");
        if (file2.exists()) {
            Log.d("ffmpeg-kit", String.format("Deleted old temporary font configuration: %s.", Boolean.valueOf(file2.delete())));
        }
        StringBuilder sb2 = new StringBuilder("");
        if (map == null || map.size() <= 0) {
            i10 = 0;
        } else {
            map.entrySet();
            i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null && key.trim().length() > 0 && value.trim().length() > 0) {
                    sb2.append("    <match target=\"pattern\">\n");
                    sb2.append("        <test qual=\"any\" name=\"family\">\n");
                    sb2.append(String.format("            <string>%s</string>\n", key));
                    sb2.append("        </test>\n");
                    sb2.append("        <edit name=\"family\" mode=\"assign\" binding=\"same\">\n");
                    sb2.append(String.format("            <string>%s</string>\n", value));
                    sb2.append("        </edit>\n");
                    sb2.append("    </match>\n");
                    i10++;
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<?xml version=\"1.0\"?>\n");
        sb3.append("<!DOCTYPE fontconfig SYSTEM \"fonts.dtd\">\n");
        sb3.append("<fontconfig>\n");
        sb3.append("    <dir prefix=\"cwd\">.</dir>\n");
        for (String str : list) {
            sb3.append("    <dir>");
            sb3.append(str);
            sb3.append("</dir>\n");
        }
        sb3.append((CharSequence) sb2);
        sb3.append("</fontconfig>\n");
        AtomicReference atomicReference = new AtomicReference();
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    atomicReference.set(fileOutputStream);
                    fileOutputStream.write(sb3.toString().getBytes());
                    fileOutputStream.flush();
                    Log.d("ffmpeg-kit", String.format("Saved new temporary font configuration with %d font name mappings.", Integer.valueOf(i10)));
                    S(file.getAbsolutePath());
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        Log.d("ffmpeg-kit", String.format("Font directory %s registered successfully.", it.next()));
                    }
                } catch (IOException e10) {
                    Log.e("ffmpeg-kit", String.format("Failed to set font directory: %s.%s", Arrays.toString(list.toArray()), u2.a.a(e10)));
                    if (atomicReference.get() == null) {
                        return;
                    } else {
                        obj = atomicReference.get();
                    }
                }
                if (atomicReference.get() == null) {
                    return;
                }
                obj = atomicReference.get();
                ((FileOutputStream) obj).close();
            } catch (Throwable th2) {
                if (atomicReference.get() != null) {
                    try {
                        ((FileOutputStream) atomicReference.get()).close();
                    } catch (IOException unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused2) {
        }
    }

    public static int S(String str) {
        return setNativeEnvironmentVariable("FONTCONFIG_PATH", str);
    }

    public static void T(m mVar) {
        if (mVar != null) {
            f7210b = mVar;
            setNativeLogLevel(mVar.i());
        }
    }

    public static void U(p pVar) {
        f7224p = pVar;
    }

    public static void V(int i10) {
        if (i10 >= 1000) {
            throw new IllegalArgumentException("Session history size must not exceed the hard limit!");
        }
        if (i10 > 0) {
            f7211c = i10;
            i();
        }
    }

    public static void b(x xVar) {
        synchronized (f7214f) {
            Map<Long, x> map = f7212d;
            if (!map.containsKey(Long.valueOf(xVar.f()))) {
                map.put(Long.valueOf(xVar.f()), xVar);
                f7213e.add(xVar);
                i();
            }
        }
    }

    public static String c(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(" ");
            }
            sb2.append(strArr[i10]);
        }
        return sb2.toString();
    }

    public static void d(h hVar) {
        hVar.v(f7216h.submit(new com.arthenica.ffmpegkit.c(hVar)));
    }

    private static native void disableNativeRedirection();

    public static void e(k kVar) {
        kVar.v(f7216h.submit(new d(kVar)));
    }

    private static native void enableNativeRedirection();

    public static void f(s sVar, int i10) {
        sVar.v(f7216h.submit(new e(sVar, Integer.valueOf(i10))));
    }

    public static void g() {
        synchronized (f7214f) {
            f7213e.clear();
            f7212d.clear();
        }
    }

    private static native String getNativeBuildDate();

    private static native String getNativeFFmpegVersion();

    public static native int getNativeLogLevel();

    private static native String getNativeVersion();

    public static void h(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    private static void i() {
        while (true) {
            List<x> list = f7213e;
            if (list.size() <= f7211c) {
                return;
            }
            try {
                x remove = list.remove(0);
                if (remove != null) {
                    f7212d.remove(Long.valueOf(remove.f()));
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    private static native void ignoreNativeSignal(int i10);

    public static void j() {
        disableNativeRedirection();
    }

    public static void k(i iVar) {
        f7219k = iVar;
    }

    public static void l(l lVar) {
        f7220l = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void log(long r5, int r7, byte[] r8) {
        /*
            com.arthenica.ffmpegkit.m r0 = com.arthenica.ffmpegkit.m.h(r7)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r8)
            com.arthenica.ffmpegkit.n r8 = new com.arthenica.ffmpegkit.n
            r8.<init>(r5, r0, r1)
            com.arthenica.ffmpegkit.p r2 = com.arthenica.ffmpegkit.FFmpegKitConfig.f7224p
            com.arthenica.ffmpegkit.m r3 = com.arthenica.ffmpegkit.FFmpegKitConfig.f7210b
            com.arthenica.ffmpegkit.m r4 = com.arthenica.ffmpegkit.m.AV_LOG_QUIET
            if (r3 != r4) goto L1e
            com.arthenica.ffmpegkit.m r3 = com.arthenica.ffmpegkit.m.AV_LOG_STDERR
            int r3 = r3.i()
            if (r7 != r3) goto L26
        L1e:
            com.arthenica.ffmpegkit.m r3 = com.arthenica.ffmpegkit.FFmpegKitConfig.f7210b
            int r3 = r3.i()
            if (r7 <= r3) goto L27
        L26:
            return
        L27:
            com.arthenica.ffmpegkit.x r5 = H(r5)
            r6 = 1
            java.lang.String r7 = "ffmpeg-kit"
            r3 = 0
            if (r5 == 0) goto L5a
            com.arthenica.ffmpegkit.p r2 = r5.d()
            r5.o(r8)
            com.arthenica.ffmpegkit.o r4 = r5.e()
            if (r4 == 0) goto L5a
            com.arthenica.ffmpegkit.o r5 = r5.e()     // Catch: java.lang.Exception -> L46
            r5.a(r8)     // Catch: java.lang.Exception -> L46
            goto L58
        L46:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r5 = u2.a.a(r5)
            r4[r3] = r5
            java.lang.String r5 = "Exception thrown inside session log callback.%s"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            android.util.Log.e(r7, r5)
        L58:
            r5 = r6
            goto L5b
        L5a:
            r5 = r3
        L5b:
            com.arthenica.ffmpegkit.o r4 = com.arthenica.ffmpegkit.FFmpegKitConfig.f7217i
            if (r4 == 0) goto L76
            r4.a(r8)     // Catch: java.lang.Exception -> L63
            goto L75
        L63:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r8 = u2.a.a(r8)
            r4[r3] = r8
            java.lang.String r8 = "Exception thrown inside global log callback.%s"
            java.lang.String r8 = java.lang.String.format(r8, r4)
            android.util.Log.e(r7, r8)
        L75:
            r3 = r6
        L76:
            int[] r8 = com.arthenica.ffmpegkit.FFmpegKitConfig.b.f7225a
            int r2 = r2.ordinal()
            r8 = r8[r2]
            if (r8 == r6) goto Lb3
            r6 = 2
            if (r8 == r6) goto L92
            r6 = 3
            if (r8 == r6) goto L8f
            r6 = 4
            if (r8 == r6) goto L8a
            goto L95
        L8a:
            if (r3 != 0) goto L8e
            if (r5 == 0) goto L95
        L8e:
            return
        L8f:
            if (r5 == 0) goto L95
            return
        L92:
            if (r3 == 0) goto L95
            return
        L95:
            int[] r5 = com.arthenica.ffmpegkit.FFmpegKitConfig.b.f7226b
            int r6 = r0.ordinal()
            r5 = r5[r6]
            switch(r5) {
                case 1: goto Lb3;
                case 2: goto Lb0;
                case 3: goto Lb0;
                case 4: goto Lac;
                case 5: goto La8;
                case 6: goto La4;
                case 7: goto La4;
                case 8: goto La4;
                default: goto La0;
            }
        La0:
            android.util.Log.v(r7, r1)
            goto Lb3
        La4:
            android.util.Log.e(r7, r1)
            goto Lb3
        La8:
            android.util.Log.w(r7, r1)
            goto Lb3
        Lac:
            android.util.Log.i(r7, r1)
            goto Lb3
        Lb0:
            android.util.Log.d(r7, r1)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.FFmpegKitConfig.log(long, int, byte[]):void");
    }

    public static void m(o oVar) {
        f7217i = oVar;
    }

    public static native int messagesInTransmit(long j10);

    public static void n(t tVar) {
        f7221m = tVar;
    }

    public static native void nativeFFmpegCancel(long j10);

    private static native int nativeFFmpegExecute(long j10, String[] strArr);

    static native int nativeFFprobeExecute(long j10, String[] strArr);

    public static void o() {
        enableNativeRedirection();
    }

    public static void p(b0 b0Var) {
        f7218j = b0Var;
    }

    static String q(String str) {
        try {
            return new StringTokenizer(str.lastIndexOf(".") >= 0 ? str.substring(str.lastIndexOf(".")) : str, " .").nextToken();
        } catch (Exception e10) {
            Log.w("ffmpeg-kit", String.format("Failed to extract extension from saf display name: %s.%s", str, u2.a.a(e10)));
            return "raw";
        }
    }

    public static void r(h hVar) {
        hVar.w();
        try {
            hVar.r(new w(nativeFFmpegExecute(hVar.f(), hVar.t())));
        } catch (Exception e10) {
            hVar.s(e10);
            Log.w("ffmpeg-kit", String.format("FFmpeg execute failed: %s.%s", c(hVar.t()), u2.a.a(e10)));
        }
    }

    private static native int registerNewNativeFFmpegPipe(String str);

    public static void s(k kVar) {
        kVar.w();
        try {
            kVar.r(new w(nativeFFprobeExecute(kVar.f(), kVar.t())));
        } catch (Exception e10) {
            kVar.s(e10);
            Log.w("ffmpeg-kit", String.format("FFprobe execute failed: %s.%s", c(kVar.t()), u2.a.a(e10)));
        }
    }

    private static int safClose(int i10) {
        String format;
        try {
            SparseArray<c> sparseArray = f7223o;
            c cVar = sparseArray.get(i10);
            if (cVar != null) {
                ParcelFileDescriptor c10 = cVar.c();
                if (c10 != null) {
                    sparseArray.delete(i10);
                    f7222n.delete(cVar.d().intValue());
                    c10.close();
                    return 1;
                }
                format = String.format("ParcelFileDescriptor for SAF fd %d not found.", Integer.valueOf(i10));
            } else {
                format = String.format("SAF fd %d not found.", Integer.valueOf(i10));
            }
            Log.e("ffmpeg-kit", format);
        } catch (Throwable th2) {
            Log.e("ffmpeg-kit", String.format("Failed to close SAF fd: %d.%s", Integer.valueOf(i10), u2.a.a(th2)));
        }
        return 0;
    }

    private static int safOpen(int i10) {
        c cVar;
        try {
            cVar = f7222n.get(i10);
        } catch (Throwable th2) {
            Log.e("ffmpeg-kit", String.format("Failed to open SAF id: %d.%s", Integer.valueOf(i10), u2.a.a(th2)));
        }
        if (cVar == null) {
            Log.e("ffmpeg-kit", String.format("SAF id %d not found.", Integer.valueOf(i10)));
            return 0;
        }
        ParcelFileDescriptor openFileDescriptor = cVar.a().openFileDescriptor(cVar.e(), cVar.b());
        cVar.f(openFileDescriptor);
        int fd2 = openFileDescriptor.getFd();
        f7223o.put(fd2, cVar);
        return fd2;
    }

    private static native int setNativeEnvironmentVariable(String str, String str2);

    private static native void setNativeLogLevel(int i10);

    private static void statistics(long j10, int i10, float f10, float f11, long j11, double d10, double d11, double d12) {
        a0 a0Var = new a0(j10, i10, f10, f11, j11, d10, d11, d12);
        x H = H(j10);
        if (H != null && H.g()) {
            h hVar = (h) H;
            hVar.y(a0Var);
            if (hVar.D() != null) {
                try {
                    hVar.D().a(a0Var);
                } catch (Exception e10) {
                    Log.e("ffmpeg-kit", String.format("Exception thrown inside session statistics callback.%s", u2.a.a(e10)));
                }
            }
        }
        b0 b0Var = f7218j;
        if (b0Var != null) {
            try {
                b0Var.a(a0Var);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global statistics callback.%s", u2.a.a(e11)));
            }
        }
    }

    public static String t() {
        return getNativeBuildDate();
    }

    public static i u() {
        return f7219k;
    }

    public static List<h> v() {
        LinkedList linkedList = new LinkedList();
        synchronized (f7214f) {
            for (x xVar : f7213e) {
                if (xVar.g()) {
                    linkedList.add((h) xVar);
                }
            }
        }
        return linkedList;
    }

    public static String w() {
        return getNativeFFmpegVersion();
    }

    public static l x() {
        return f7220l;
    }

    public static List<k> y() {
        LinkedList linkedList = new LinkedList();
        synchronized (f7214f) {
            for (x xVar : f7213e) {
                if (xVar.n()) {
                    linkedList.add((k) xVar);
                }
            }
        }
        return linkedList;
    }

    public static x z() {
        synchronized (f7214f) {
            for (int size = f7213e.size() - 1; size >= 0; size--) {
                x xVar = f7213e.get(size);
                if (xVar.getState() == y.COMPLETED) {
                    return xVar;
                }
            }
            return null;
        }
    }
}
