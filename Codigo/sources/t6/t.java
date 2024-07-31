package t6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import k7.l;
import v6.h0;

/* loaded from: classes.dex */
public class t implements t3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26464a;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26468e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26470g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26471h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26472i;

    /* renamed from: b, reason: collision with root package name */
    private final k7.j f26465b = new k7.j();

    /* renamed from: c, reason: collision with root package name */
    private int f26466c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f26467d = 5000;

    /* renamed from: f, reason: collision with root package name */
    private k7.t f26469f = k7.t.f20508a;

    public t(Context context) {
        this.f26464a = context;
    }

    @Override // t6.t3
    public q3[] a(Handler handler, u8.y yVar, v6.u uVar, g8.p pVar, l7.e eVar) {
        ArrayList<q3> arrayList = new ArrayList<>();
        h(this.f26464a, this.f26466c, this.f26469f, this.f26468e, handler, yVar, this.f26467d, arrayList);
        v6.v c10 = c(this.f26464a, this.f26470g, this.f26471h, this.f26472i);
        if (c10 != null) {
            b(this.f26464a, this.f26466c, this.f26469f, this.f26468e, c10, handler, uVar, arrayList);
        }
        g(this.f26464a, pVar, handler.getLooper(), this.f26466c, arrayList);
        e(this.f26464a, eVar, handler.getLooper(), this.f26466c, arrayList);
        d(this.f26464a, this.f26466c, arrayList);
        f(this.f26464a, handler, this.f26466c, arrayList);
        return (q3[]) arrayList.toArray(new q3[0]);
    }

    protected void b(Context context, int i10, k7.t tVar, boolean z10, v6.v vVar, Handler handler, v6.u uVar, ArrayList<q3> arrayList) {
        int i11;
        int i12;
        arrayList.add(new v6.r0(context, i(), tVar, z10, handler, uVar, vVar));
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
                arrayList.add(size, (q3) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(new Class[0]).newInstance(new Object[0]));
                t8.s.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i11;
                i11 = size;
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (q3) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, v6.u.class, v6.v.class).newInstance(handler, uVar, vVar));
                        t8.s.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                        try {
                            int i13 = i12 + 1;
                            arrayList.add(i12, (q3) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, v6.u.class, v6.v.class).newInstance(handler, uVar, vVar));
                            t8.s.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused4) {
                        }
                        try {
                            arrayList.add(i13, (q3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, v6.u.class, v6.v.class).newInstance(handler, uVar, vVar));
                            t8.s.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
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
                        arrayList.add(i12, (q3) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, v6.u.class, v6.v.class).newInstance(handler, uVar, vVar));
                        t8.s.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                        i12 = i132;
                        i132 = i12;
                        arrayList.add(i132, (q3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, v6.u.class, v6.v.class).newInstance(handler, uVar, vVar));
                        t8.s.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    }
                    arrayList.add(i132, (q3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, v6.u.class, v6.v.class).newInstance(handler, uVar, vVar));
                    t8.s.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating FLAC extension", e11);
                }
            }
            try {
                i12 = i11 + 1;
                arrayList.add(i11, (q3) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, v6.u.class, v6.v.class).newInstance(handler, uVar, vVar));
                t8.s.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                int i1322 = i12 + 1;
                arrayList.add(i12, (q3) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, v6.u.class, v6.v.class).newInstance(handler, uVar, vVar));
                t8.s.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                arrayList.add(i1322, (q3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, v6.u.class, v6.v.class).newInstance(handler, uVar, vVar));
                t8.s.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating Opus extension", e12);
            }
        } catch (Exception e13) {
            throw new RuntimeException("Error instantiating MIDI extension", e13);
        }
    }

    protected v6.v c(Context context, boolean z10, boolean z11, boolean z12) {
        return new h0.f().g(v6.h.c(context)).i(z10).h(z11).j(z12 ? 1 : 0).f();
    }

    protected void d(Context context, int i10, ArrayList<q3> arrayList) {
        arrayList.add(new v8.b());
    }

    protected void e(Context context, l7.e eVar, Looper looper, int i10, ArrayList<q3> arrayList) {
        arrayList.add(new l7.f(eVar, looper));
    }

    protected void f(Context context, Handler handler, int i10, ArrayList<q3> arrayList) {
    }

    protected void g(Context context, g8.p pVar, Looper looper, int i10, ArrayList<q3> arrayList) {
        arrayList.add(new g8.q(pVar, looper));
    }

    protected void h(Context context, int i10, k7.t tVar, boolean z10, Handler handler, u8.y yVar, long j10, ArrayList<q3> arrayList) {
        int i11;
        arrayList.add(new u8.i(context, i(), tVar, j10, z10, handler, yVar, 50));
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
                    arrayList.add(size, (q3) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, u8.y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, yVar, 50));
                    t8.s.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i11;
                    i11 = size;
                    arrayList.add(i11, (q3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, u8.y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, yVar, 50));
                    t8.s.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                }
                arrayList.add(i11, (q3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, u8.y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, yVar, 50));
                t8.s.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating AV1 extension", e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating VP9 extension", e11);
        }
    }

    protected l.b i() {
        return this.f26465b;
    }
}
