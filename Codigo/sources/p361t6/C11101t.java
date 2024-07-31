package p361t6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p120g8.C7499q;
import p120g8.InterfaceC7498p;
import p197k7.C9189j;
import p197k7.InterfaceC9191l;
import p197k7.InterfaceC9199t;
import p216l7.C9405f;
import p216l7.InterfaceC9404e;
import p363t8.C11173s;
import p378u8.C11456i;
import p378u8.InterfaceC11472y;
import p396v6.C11645h;
import p396v6.C11646h0;
import p396v6.C11666r0;
import p396v6.InterfaceC11671u;
import p396v6.InterfaceC11673v;
import p398v8.C11744b;

/* renamed from: t6.t */
/* loaded from: classes.dex */
public class C11101t implements InterfaceC11105t3 {

    /* renamed from: a */
    private final Context f28717a;

    /* renamed from: e */
    private boolean f28721e;

    /* renamed from: g */
    private boolean f28723g;

    /* renamed from: h */
    private boolean f28724h;

    /* renamed from: i */
    private boolean f28725i;

    /* renamed from: b */
    private final C9189j f28718b = new C9189j();

    /* renamed from: c */
    private int f28719c = 0;

    /* renamed from: d */
    private long f28720d = 5000;

    /* renamed from: f */
    private InterfaceC9199t f28722f = InterfaceC9199t.f22330a;

    public C11101t(Context context) {
        this.f28717a = context;
    }

    @Override // p361t6.InterfaceC11105t3
    /* renamed from: a */
    public InterfaceC11090q3[] mo34474a(Handler handler, InterfaceC11472y interfaceC11472y, InterfaceC11671u interfaceC11671u, InterfaceC7498p interfaceC7498p, InterfaceC9404e interfaceC9404e) {
        ArrayList<InterfaceC11090q3> arrayList = new ArrayList<>();
        m34481h(this.f28717a, this.f28719c, this.f28722f, this.f28721e, handler, interfaceC11472y, this.f28720d, arrayList);
        InterfaceC11673v m34476c = m34476c(this.f28717a, this.f28723g, this.f28724h, this.f28725i);
        if (m34476c != null) {
            m34475b(this.f28717a, this.f28719c, this.f28722f, this.f28721e, m34476c, handler, interfaceC11671u, arrayList);
        }
        m34480g(this.f28717a, interfaceC7498p, handler.getLooper(), this.f28719c, arrayList);
        m34478e(this.f28717a, interfaceC9404e, handler.getLooper(), this.f28719c, arrayList);
        m34477d(this.f28717a, this.f28719c, arrayList);
        m34479f(this.f28717a, handler, this.f28719c, arrayList);
        return (InterfaceC11090q3[]) arrayList.toArray(new InterfaceC11090q3[0]);
    }

    /* renamed from: b */
    protected void m34475b(Context context, int i10, InterfaceC9199t interfaceC9199t, boolean z10, InterfaceC11673v interfaceC11673v, Handler handler, InterfaceC11671u interfaceC11671u, ArrayList<InterfaceC11090q3> arrayList) {
        int i11;
        int i12;
        arrayList.add(new C11666r0(context, m34482i(), interfaceC9199t, z10, handler, interfaceC11671u, interfaceC11673v));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(new Class[0]).newInstance(new Object[0]));
                C11173s.m34967f("DefaultRenderersFactory", "Loaded MidiRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i11;
                i11 = size;
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC11671u.class, InterfaceC11673v.class).newInstance(handler, interfaceC11671u, interfaceC11673v));
                        C11173s.m34967f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                        try {
                            int i13 = i12 + 1;
                            arrayList.add(i12, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC11671u.class, InterfaceC11673v.class).newInstance(handler, interfaceC11671u, interfaceC11673v));
                            C11173s.m34967f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused4) {
                        }
                        try {
                            arrayList.add(i13, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC11671u.class, InterfaceC11673v.class).newInstance(handler, interfaceC11671u, interfaceC11673v));
                            C11173s.m34967f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused5) {
                            return;
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating FFmpeg extension", e10);
                        }
                    }
                } catch (ClassNotFoundException unused6) {
                }
                try {
                    int i132 = i12 + 1;
                    try {
                        arrayList.add(i12, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC11671u.class, InterfaceC11673v.class).newInstance(handler, interfaceC11671u, interfaceC11673v));
                        C11173s.m34967f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                        i12 = i132;
                        i132 = i12;
                        arrayList.add(i132, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC11671u.class, InterfaceC11673v.class).newInstance(handler, interfaceC11671u, interfaceC11673v));
                        C11173s.m34967f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    }
                    arrayList.add(i132, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC11671u.class, InterfaceC11673v.class).newInstance(handler, interfaceC11671u, interfaceC11673v));
                    C11173s.m34967f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating FLAC extension", e11);
                }
            }
            try {
                i12 = i11 + 1;
                arrayList.add(i11, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC11671u.class, InterfaceC11673v.class).newInstance(handler, interfaceC11671u, interfaceC11673v));
                C11173s.m34967f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                int i1322 = i12 + 1;
                arrayList.add(i12, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC11671u.class, InterfaceC11673v.class).newInstance(handler, interfaceC11671u, interfaceC11673v));
                C11173s.m34967f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                arrayList.add(i1322, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC11671u.class, InterfaceC11673v.class).newInstance(handler, interfaceC11671u, interfaceC11673v));
                C11173s.m34967f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating Opus extension", e12);
            }
        } catch (Exception e13) {
            throw new RuntimeException("Error instantiating MIDI extension", e13);
        }
    }

    /* renamed from: c */
    protected InterfaceC11673v m34476c(Context context, boolean z10, boolean z11, boolean z12) {
        return new C11646h0.f().m36591g(C11645h.m36505c(context)).m36593i(z10).m36592h(z11).m36594j(z12 ? 1 : 0).m36590f();
    }

    /* renamed from: d */
    protected void m34477d(Context context, int i10, ArrayList<InterfaceC11090q3> arrayList) {
        arrayList.add(new C11744b());
    }

    /* renamed from: e */
    protected void m34478e(Context context, InterfaceC9404e interfaceC9404e, Looper looper, int i10, ArrayList<InterfaceC11090q3> arrayList) {
        arrayList.add(new C9405f(interfaceC9404e, looper));
    }

    /* renamed from: f */
    protected void m34479f(Context context, Handler handler, int i10, ArrayList<InterfaceC11090q3> arrayList) {
    }

    /* renamed from: g */
    protected void m34480g(Context context, InterfaceC7498p interfaceC7498p, Looper looper, int i10, ArrayList<InterfaceC11090q3> arrayList) {
        arrayList.add(new C7499q(interfaceC7498p, looper));
    }

    /* renamed from: h */
    protected void m34481h(Context context, int i10, InterfaceC9199t interfaceC9199t, boolean z10, Handler handler, InterfaceC11472y interfaceC11472y, long j10, ArrayList<InterfaceC11090q3> arrayList) {
        int i11;
        arrayList.add(new C11456i(context, m34482i(), interfaceC9199t, j10, z10, handler, interfaceC11472y, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                try {
                    arrayList.add(size, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC11472y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, interfaceC11472y, 50));
                    C11173s.m34967f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i11;
                    i11 = size;
                    arrayList.add(i11, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC11472y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, interfaceC11472y, 50));
                    C11173s.m34967f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                }
                arrayList.add(i11, (InterfaceC11090q3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC11472y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, interfaceC11472y, 50));
                C11173s.m34967f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating AV1 extension", e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating VP9 extension", e11);
        }
    }

    /* renamed from: i */
    protected InterfaceC9191l.b m34482i() {
        return this.f28718b;
    }
}
