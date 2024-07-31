package i9;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private String f17602a;

    /* renamed from: b, reason: collision with root package name */
    private List f17603b;

    /* renamed from: c, reason: collision with root package name */
    private String f17604c;

    /* renamed from: d, reason: collision with root package name */
    private a9.d f17605d;

    /* renamed from: e, reason: collision with root package name */
    private String f17606e;

    /* renamed from: f, reason: collision with root package name */
    private String f17607f;

    /* renamed from: g, reason: collision with root package name */
    private Double f17608g;

    /* renamed from: h, reason: collision with root package name */
    private String f17609h;

    /* renamed from: i, reason: collision with root package name */
    private String f17610i;

    /* renamed from: j, reason: collision with root package name */
    private x8.b0 f17611j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17612k;

    /* renamed from: l, reason: collision with root package name */
    private View f17613l;

    /* renamed from: m, reason: collision with root package name */
    private View f17614m;

    /* renamed from: n, reason: collision with root package name */
    private Object f17615n;

    /* renamed from: o, reason: collision with root package name */
    private Bundle f17616o = new Bundle();

    /* renamed from: p, reason: collision with root package name */
    private boolean f17617p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17618q;

    /* renamed from: r, reason: collision with root package name */
    private float f17619r;

    public final void A(a9.d dVar) {
        this.f17605d = dVar;
    }

    public final void B(List<a9.d> list) {
        this.f17603b = list;
    }

    public void C(View view) {
        this.f17614m = view;
    }

    public final void D(boolean z10) {
        this.f17618q = z10;
    }

    public final void E(boolean z10) {
        this.f17617p = z10;
    }

    public final void F(String str) {
        this.f17610i = str;
    }

    public final void G(Double d10) {
        this.f17608g = d10;
    }

    public final void H(String str) {
        this.f17609h = str;
    }

    public void I(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void J(View view) {
    }

    public final View K() {
        return this.f17614m;
    }

    public final x8.b0 L() {
        return this.f17611j;
    }

    public final Object M() {
        return this.f17615n;
    }

    public final void N(Object obj) {
        this.f17615n = obj;
    }

    public final void O(x8.b0 b0Var) {
        this.f17611j = b0Var;
    }

    public View a() {
        return this.f17613l;
    }

    public final String b() {
        return this.f17607f;
    }

    public final String c() {
        return this.f17604c;
    }

    public final String d() {
        return this.f17606e;
    }

    public float e() {
        return 0.0f;
    }

    public float f() {
        return 0.0f;
    }

    public final Bundle g() {
        return this.f17616o;
    }

    public final String h() {
        return this.f17602a;
    }

    public final a9.d i() {
        return this.f17605d;
    }

    public final List<a9.d> j() {
        return this.f17603b;
    }

    public float k() {
        return this.f17619r;
    }

    public final boolean l() {
        return this.f17618q;
    }

    public final boolean m() {
        return this.f17617p;
    }

    public final String n() {
        return this.f17610i;
    }

    public final Double o() {
        return this.f17608g;
    }

    public final String p() {
        return this.f17609h;
    }

    public void q(View view) {
    }

    public boolean r() {
        return this.f17612k;
    }

    public void s() {
    }

    public void t(View view) {
        this.f17613l = view;
    }

    public final void u(String str) {
        this.f17607f = str;
    }

    public final void v(String str) {
        this.f17604c = str;
    }

    public final void w(String str) {
        this.f17606e = str;
    }

    public final void x(Bundle bundle) {
        this.f17616o = bundle;
    }

    public void y(boolean z10) {
        this.f17612k = z10;
    }

    public final void z(String str) {
        this.f17602a = str;
    }
}
