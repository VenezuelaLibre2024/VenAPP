package p396v6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import com.google.common.collect.AbstractC5877h1;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.AbstractC5911y;
import java.util.Arrays;
import p137hb.C7690e;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11178w;

/* renamed from: v6.h */
/* loaded from: classes.dex */
public final class C11645h {

    /* renamed from: c */
    public static final C11645h f30309c = new C11645h(new int[]{2}, 8);

    /* renamed from: d */
    private static final C11645h f30310d = new C11645h(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    private static final AbstractC5911y<Integer, Integer> f30311e = new AbstractC5911y.a().m15122f(5, 6).m15122f(17, 6).m15122f(7, 6).m15122f(18, 6).m15122f(6, 8).m15122f(8, 8).m15122f(14, 8).m15121c();

    /* renamed from: a */
    private final int[] f30312a;

    /* renamed from: b */
    private final int f30313b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private static final AudioAttributes f30314a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static int[] m36512a() {
            boolean isDirectPlaybackSupported;
            AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
            AbstractC5877h1 it = C11645h.f30311e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f30314a);
                if (isDirectPlaybackSupported) {
                    m15077p.mo14724a(Integer.valueOf(intValue));
                }
            }
            m15077p.mo14724a(2);
            return C7690e.m23421l(m15077p.m15094k());
        }

        /* renamed from: b */
        public static int m36513b(int i10, int i11) {
            boolean isDirectPlaybackSupported;
            for (int i12 = 8; i12 > 0; i12--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(C11172r0.m34868G(i12)).build(), f30314a);
                if (isDirectPlaybackSupported) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public C11645h(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f30312a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f30312a = new int[0];
        }
        this.f30313b = i10;
    }

    /* renamed from: b */
    private static boolean m36504b() {
        if (C11172r0.f29040a >= 17) {
            String str = C11172r0.f29042c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static C11645h m36505c(Context context) {
        return m36506d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* renamed from: d */
    static C11645h m36506d(Context context, Intent intent) {
        return (m36504b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f30310d : (C11172r0.f29040a < 29 || !(C11172r0.m34957x0(context) || C11172r0.m34947s0(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f30309c : new C11645h(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new C11645h(a.m36512a(), 8);
    }

    /* renamed from: e */
    private static int m36507e(int i10) {
        int i11 = C11172r0.f29040a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(C11172r0.f29041b) && i10 == 1) {
            i10 = 2;
        }
        return C11172r0.m34868G(i10);
    }

    /* renamed from: g */
    private static int m36508g(int i10, int i11) {
        return C11172r0.f29040a >= 29 ? a.m36513b(i10, i11) : ((Integer) C11137a.m34603e(f30311e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11645h)) {
            return false;
        }
        C11645h c11645h = (C11645h) obj;
        return Arrays.equals(this.f30312a, c11645h.f30312a) && this.f30313b == c11645h.f30313b;
    }

    /* renamed from: f */
    public Pair<Integer, Integer> m36509f(C11108u1 c11108u1) {
        int m34998f = C11178w.m34998f((String) C11137a.m34603e(c11108u1.f28797w), c11108u1.f28794t);
        if (!f30311e.containsKey(Integer.valueOf(m34998f))) {
            return null;
        }
        if (m34998f == 18 && !m36511i(18)) {
            m34998f = 6;
        } else if (m34998f == 8 && !m36511i(8)) {
            m34998f = 7;
        }
        if (!m36511i(m34998f)) {
            return null;
        }
        int i10 = c11108u1.f28776J;
        if (i10 == -1 || m34998f == 18) {
            int i11 = c11108u1.f28777K;
            if (i11 == -1) {
                i11 = 48000;
            }
            i10 = m36508g(m34998f, i11);
        } else if (i10 > this.f30313b) {
            return null;
        }
        int m36507e = m36507e(i10);
        if (m36507e == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(m34998f), Integer.valueOf(m36507e));
    }

    /* renamed from: h */
    public boolean m36510h(C11108u1 c11108u1) {
        return m36509f(c11108u1) != null;
    }

    public int hashCode() {
        return this.f30313b + (Arrays.hashCode(this.f30312a) * 31);
    }

    /* renamed from: i */
    public boolean m36511i(int i10) {
        return Arrays.binarySearch(this.f30312a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f30313b + ", supportedEncodings=" + Arrays.toString(this.f30312a) + "]";
    }
}
