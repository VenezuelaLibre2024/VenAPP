.class public Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Lql/c0;Lse/h;JJ)V
    .locals 6

    invoke-virtual {p0}, Lql/c0;->O()Lql/a0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lql/a0;->i()Lql/u;

    move-result-object v1

    invoke-virtual {v1}, Lql/u;->s()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lse/h;->x(Ljava/lang/String;)Lse/h;

    invoke-virtual {v0}, Lql/a0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lse/h;->l(Ljava/lang/String;)Lse/h;

    invoke-virtual {v0}, Lql/a0;->a()Lql/b0;

    move-result-object v1

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lql/a0;->a()Lql/b0;

    move-result-object v0

    invoke-virtual {v0}, Lql/b0;->a()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    invoke-virtual {p1, v0, v1}, Lse/h;->p(J)Lse/h;

    :cond_1
    invoke-virtual {p0}, Lql/c0;->a()Lql/d0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lql/d0;->b()J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-eqz v1, :cond_2

    invoke-virtual {p1, v4, v5}, Lse/h;->t(J)Lse/h;

    :cond_2
    invoke-virtual {v0}, Lql/d0;->e()Lql/w;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lql/w;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lse/h;->s(Ljava/lang/String;)Lse/h;

    :cond_3
    invoke-virtual {p0}, Lql/c0;->g()I

    move-result p0

    invoke-virtual {p1, p0}, Lse/h;->m(I)Lse/h;

    invoke-virtual {p1, p2, p3}, Lse/h;->r(J)Lse/h;

    invoke-virtual {p1, p4, p5}, Lse/h;->v(J)Lse/h;

    invoke-virtual {p1}, Lse/h;->b()Lxe/h;

    return-void
.end method

.method public static enqueue(Lql/e;Lql/f;)V
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v3, Lcom/google/firebase/perf/util/l;

    invoke-direct {v3}, Lcom/google/firebase/perf/util/l;-><init>()V

    invoke-virtual {v3}, Lcom/google/firebase/perf/util/l;->e()J

    move-result-wide v4

    new-instance v6, Lcom/google/firebase/perf/network/d;

    invoke-static {}, Lwe/k;->k()Lwe/k;

    move-result-object v2

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/perf/network/d;-><init>(Lql/f;Lwe/k;Lcom/google/firebase/perf/util/l;J)V

    invoke-interface {p0, v6}, Lql/e;->Q(Lql/f;)V

    return-void
.end method

.method public static execute(Lql/e;)Lql/c0;
    .locals 11
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lwe/k;->k()Lwe/k;

    move-result-object v0

    invoke-static {v0}, Lse/h;->c(Lwe/k;)Lse/h;

    move-result-object v0

    new-instance v7, Lcom/google/firebase/perf/util/l;

    invoke-direct {v7}, Lcom/google/firebase/perf/util/l;-><init>()V

    invoke-virtual {v7}, Lcom/google/firebase/perf/util/l;->e()J

    move-result-wide v8

    :try_start_0
    invoke-interface {p0}, Lql/e;->n()Lql/c0;

    move-result-object v10

    invoke-virtual {v7}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v5

    move-object v1, v10

    move-object v2, v0

    move-wide v3, v8

    invoke-static/range {v1 .. v6}, Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;->a(Lql/c0;Lse/h;JJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v10

    :catch_0
    move-exception v1

    invoke-interface {p0}, Lql/e;->o()Lql/a0;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lql/a0;->i()Lql/u;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lql/u;->s()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lse/h;->x(Ljava/lang/String;)Lse/h;

    :cond_0
    invoke-virtual {p0}, Lql/a0;->g()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lql/a0;->g()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lse/h;->l(Ljava/lang/String;)Lse/h;

    :cond_1
    invoke-virtual {v0, v8, v9}, Lse/h;->r(J)Lse/h;

    invoke-virtual {v7}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lse/h;->v(J)Lse/h;

    invoke-static {v0}, Lue/d;->d(Lse/h;)V

    throw v1
.end method
