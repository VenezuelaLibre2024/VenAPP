package m8;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import eb.e;
import g8.b;
import g8.h;
import g8.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t8.e0;
import t8.s;
import t8.t;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f21395q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f21396r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f21397o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<String> f21398p;

    public a() {
        super("SubripDecoder");
        this.f21397o = new StringBuilder();
        this.f21398p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private g8.b B(Spanned spanned, String str) {
        char c10;
        char c11;
        b.C0262b o10 = new b.C0262b().o(spanned);
        if (str == null) {
            return o10.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            o10.l(0);
        } else if (c10 == 3 || c10 == 4 || c10 == 5) {
            o10.l(2);
        } else {
            o10.l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            o10.i(2);
        } else if (c11 == 3 || c11 == 4 || c11 == 5) {
            o10.i(0);
        } else {
            o10.i(1);
        }
        return o10.k(D(o10.d())).h(D(o10.c()), 0).a();
    }

    private Charset C(e0 e0Var) {
        Charset P = e0Var.P();
        return P != null ? P : e.f14596c;
    }

    static float D(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long E(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) t8.a.e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) t8.a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f21396r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // g8.h
    protected i z(byte[] bArr, int i10, boolean z10) {
        StringBuilder sb2;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        t tVar = new t();
        e0 e0Var = new e0(bArr, i10);
        Charset C = C(e0Var);
        while (true) {
            String t10 = e0Var.t(C);
            int i11 = 0;
            if (t10 == null) {
                break;
            }
            if (t10.length() != 0) {
                try {
                    Integer.parseInt(t10);
                    t10 = e0Var.t(C);
                } catch (NumberFormatException unused) {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (t10 == null) {
                    s.i("SubripDecoder", "Unexpected end");
                    break;
                }
                Matcher matcher = f21395q.matcher(t10);
                if (matcher.matches()) {
                    tVar.a(E(matcher, 1));
                    tVar.a(E(matcher, 6));
                    this.f21397o.setLength(0);
                    this.f21398p.clear();
                    while (true) {
                        String t11 = e0Var.t(C);
                        if (TextUtils.isEmpty(t11)) {
                            break;
                        }
                        if (this.f21397o.length() > 0) {
                            this.f21397o.append("<br>");
                        }
                        this.f21397o.append(F(t11, this.f21398p));
                    }
                    Spanned fromHtml = Html.fromHtml(this.f21397o.toString());
                    while (true) {
                        if (i11 >= this.f21398p.size()) {
                            str2 = null;
                            break;
                        }
                        str2 = this.f21398p.get(i11);
                        if (str2.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        }
                        i11++;
                    }
                    arrayList.add(B(fromHtml, str2));
                    arrayList.add(g8.b.C);
                } else {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb2.append(str);
                    sb2.append(t10);
                    s.i("SubripDecoder", sb2.toString());
                }
            }
        }
        return new b((g8.b[]) arrayList.toArray(new g8.b[0]), tVar.d());
    }
}
