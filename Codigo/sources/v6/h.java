package v6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import com.google.common.collect.h1;
import com.google.common.collect.w;
import com.google.common.collect.y;
import java.util.Arrays;
import t6.u1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f27985c = new h(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    private static final h f27986d = new h(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.common.collect.y<Integer, Integer> f27987e = new y.a().f(5, 6).f(17, 6).f(7, 6).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f27988a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27989b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final AudioAttributes f27990a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        public static int[] a() {
            boolean isDirectPlaybackSupported;
            w.a p10 = com.google.common.collect.w.p();
            h1 it = h.f27987e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f27990a);
                if (isDirectPlaybackSupported) {
                    p10.a(Integer.valueOf(intValue));
                }
            }
            p10.a(2);
            return hb.e.l(p10.k());
        }

        public static int b(int i10, int i11) {
            boolean isDirectPlaybackSupported;
            for (int i12 = 8; i12 > 0; i12--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(t8.r0.G(i12)).build(), f27990a);
                if (isDirectPlaybackSupported) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public h(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f27988a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f27988a = new int[0];
        }
        this.f27989b = i10;
    }

    private static boolean b() {
        if (t8.r0.f26744a >= 17) {
            String str = t8.r0.f26746c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static h c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static h d(Context context, Intent intent) {
        return (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f27986d : (t8.r0.f26744a < 29 || !(t8.r0.x0(context) || t8.r0.s0(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f27985c : new h(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new h(a.a(), 8);
    }

    private static int e(int i10) {
        int i11 = t8.r0.f26744a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(t8.r0.f26745b) && i10 == 1) {
            i10 = 2;
        }
        return t8.r0.G(i10);
    }

    private static int g(int i10, int i11) {
        return t8.r0.f26744a >= 29 ? a.b(i10, i11) : ((Integer) t8.a.e(f27987e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Arrays.equals(this.f27988a, hVar.f27988a) && this.f27989b == hVar.f27989b;
    }

    public Pair<Integer, Integer> f(u1 u1Var) {
        int f10 = t8.w.f((String) t8.a.e(u1Var.f26517w), u1Var.f26514t);
        if (!f27987e.containsKey(Integer.valueOf(f10))) {
            return null;
        }
        if (f10 == 18 && !i(18)) {
            f10 = 6;
        } else if (f10 == 8 && !i(8)) {
            f10 = 7;
        }
        if (!i(f10)) {
            return null;
        }
        int i10 = u1Var.J;
        if (i10 == -1 || f10 == 18) {
            int i11 = u1Var.K;
            if (i11 == -1) {
                i11 = 48000;
            }
            i10 = g(f10, i11);
        } else if (i10 > this.f27989b) {
            return null;
        }
        int e10 = e(i10);
        if (e10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f10), Integer.valueOf(e10));
    }

    public boolean h(u1 u1Var) {
        return f(u1Var) != null;
    }

    public int hashCode() {
        return this.f27989b + (Arrays.hashCode(this.f27988a) * 31);
    }

    public boolean i(int i10) {
        return Arrays.binarySearch(this.f27988a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f27989b + ", supportedEncodings=" + Arrays.toString(this.f27988a) + "]";
    }
}
