.class public Lcom/google/firebase/perf/network/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/f;


# instance fields
.field private final a:Lql/f;

.field private final b:Lse/h;

.field private final c:Lcom/google/firebase/perf/util/l;

.field private final d:J


# direct methods
.method public constructor <init>(Lql/f;Lwe/k;Lcom/google/firebase/perf/util/l;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/perf/network/d;->a:Lql/f;

    invoke-static {p2}, Lse/h;->c(Lwe/k;)Lse/h;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/network/d;->b:Lse/h;

    iput-wide p4, p0, Lcom/google/firebase/perf/network/d;->d:J

    iput-object p3, p0, Lcom/google/firebase/perf/network/d;->c:Lcom/google/firebase/perf/util/l;

    return-void
.end method


# virtual methods
.method public a(Lql/e;Lql/c0;)V
    .locals 7

    iget-object v0, p0, Lcom/google/firebase/perf/network/d;->c:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v0}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v5

    iget-object v2, p0, Lcom/google/firebase/perf/network/d;->b:Lse/h;

    iget-wide v3, p0, Lcom/google/firebase/perf/network/d;->d:J

    move-object v1, p2

    invoke-static/range {v1 .. v6}, Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;->a(Lql/c0;Lse/h;JJ)V

    iget-object v0, p0, Lcom/google/firebase/perf/network/d;->a:Lql/f;

    invoke-interface {v0, p1, p2}, Lql/f;->a(Lql/e;Lql/c0;)V

    return-void
.end method

.method public b(Lql/e;Ljava/io/IOException;)V
    .locals 3

    invoke-interface {p1}, Lql/e;->o()Lql/a0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lql/a0;->i()Lql/u;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/firebase/perf/network/d;->b:Lse/h;

    invoke-virtual {v1}, Lql/u;->s()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lse/h;->x(Ljava/lang/String;)Lse/h;

    :cond_0
    invoke-virtual {v0}, Lql/a0;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/firebase/perf/network/d;->b:Lse/h;

    invoke-virtual {v0}, Lql/a0;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lse/h;->l(Ljava/lang/String;)Lse/h;

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/perf/network/d;->b:Lse/h;

    iget-wide v1, p0, Lcom/google/firebase/perf/network/d;->d:J

    invoke-virtual {v0, v1, v2}, Lse/h;->r(J)Lse/h;

    iget-object v0, p0, Lcom/google/firebase/perf/network/d;->b:Lse/h;

    iget-object v1, p0, Lcom/google/firebase/perf/network/d;->c:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v1}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lse/h;->v(J)Lse/h;

    iget-object v0, p0, Lcom/google/firebase/perf/network/d;->b:Lse/h;

    invoke-static {v0}, Lue/d;->d(Lse/h;)V

    iget-object v0, p0, Lcom/google/firebase/perf/network/d;->a:Lql/f;

    invoke-interface {v0, p1, p2}, Lql/f;->b(Lql/e;Ljava/io/IOException;)V

    return-void
.end method
