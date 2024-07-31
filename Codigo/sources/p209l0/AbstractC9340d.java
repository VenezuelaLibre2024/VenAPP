package p209l0;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: l0.d */
/* loaded from: classes.dex */
public abstract class AbstractC9340d {

    /* renamed from: a */
    private a f22601a;

    /* renamed from: b */
    private String f22602b;

    /* renamed from: c */
    private int f22603c = 0;

    /* renamed from: d */
    private String f22604d = null;

    /* renamed from: e */
    public int f22605e = 0;

    /* renamed from: f */
    ArrayList<b> f22606f = new ArrayList<>();

    /* renamed from: l0.d$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        public double m27831a(float f10) {
            throw null;
        }
    }

    /* renamed from: l0.d$b */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a */
        int f22607a;

        /* renamed from: b */
        float f22608b;
    }

    /* renamed from: a */
    public float m27830a(float f10) {
        return (float) this.f22601a.m27831a(f10);
    }

    public String toString() {
        String str = this.f22602b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f22606f.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f22607a + " , " + decimalFormat.format(r3.f22608b) + "] ";
        }
        return str;
    }
}
