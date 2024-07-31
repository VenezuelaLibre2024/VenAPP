package l0;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private a f20779a;

    /* renamed from: b, reason: collision with root package name */
    private String f20780b;

    /* renamed from: c, reason: collision with root package name */
    private int f20781c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f20782d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f20783e = 0;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<b> f20784f = new ArrayList<>();

    /* loaded from: classes.dex */
    static class a {
        public double a(float f10) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        int f20785a;

        /* renamed from: b, reason: collision with root package name */
        float f20786b;
    }

    public float a(float f10) {
        return (float) this.f20779a.a(f10);
    }

    public String toString() {
        String str = this.f20780b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f20784f.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f20785a + " , " + decimalFormat.format(r3.f20786b) + "] ";
        }
        return str;
    }
}
