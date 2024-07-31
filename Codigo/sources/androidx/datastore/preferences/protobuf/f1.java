package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface f1 {
    int A();

    void B(List<String> list);

    void C(List<Float> list);

    boolean D();

    int E();

    void F(List<h> list);

    void G(List<Double> list);

    long H();

    String I();

    <T> T J(g1<T> g1Var, p pVar);

    <T> void K(List<T> list, g1<T> g1Var, p pVar);

    @Deprecated
    <T> T L(g1<T> g1Var, p pVar);

    <T> T M(Class<T> cls, p pVar);

    @Deprecated
    <T> T N(Class<T> cls, p pVar);

    <K, V> void O(Map<K, V> map, k0.a<K, V> aVar, p pVar);

    @Deprecated
    <T> void P(List<T> list, g1<T> g1Var, p pVar);

    int a();

    long b();

    void c(List<Integer> list);

    void d(List<Long> list);

    boolean e();

    long f();

    void g(List<Long> list);

    int h();

    void i(List<Long> list);

    void j(List<Integer> list);

    int k();

    int l();

    void m(List<Boolean> list);

    void n(List<String> list);

    h o();

    int p();

    void q(List<Long> list);

    void r(List<Integer> list);

    double readDouble();

    float readFloat();

    long s();

    void t(List<Integer> list);

    int u();

    void v(List<Long> list);

    void w(List<Integer> list);

    void x(List<Integer> list);

    long y();

    String z();
}
