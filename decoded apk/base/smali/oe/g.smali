.class public final Loe/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzb/g;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lfe/f;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lee/b<",
            "Lf6/g;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzb/g;",
            ">;",
            "Lbk/a<",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;",
            "Lbk/a<",
            "Lfe/f;",
            ">;",
            "Lbk/a<",
            "Lee/b<",
            "Lf6/g;",
            ">;>;",
            "Lbk/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;",
            "Lbk/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;",
            "Lbk/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loe/g;->a:Lbk/a;

    iput-object p2, p0, Loe/g;->b:Lbk/a;

    iput-object p3, p0, Loe/g;->c:Lbk/a;

    iput-object p4, p0, Loe/g;->d:Lbk/a;

    iput-object p5, p0, Loe/g;->e:Lbk/a;

    iput-object p6, p0, Loe/g;->f:Lbk/a;

    iput-object p7, p0, Loe/g;->g:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Loe/g;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzb/g;",
            ">;",
            "Lbk/a<",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;",
            "Lbk/a<",
            "Lfe/f;",
            ">;",
            "Lbk/a<",
            "Lee/b<",
            "Lf6/g;",
            ">;>;",
            "Lbk/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;",
            "Lbk/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;",
            "Lbk/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;)",
            "Loe/g;"
        }
    .end annotation

    new-instance v8, Loe/g;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Loe/g;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v8
.end method

.method public static c(Lzb/g;Lee/b;Lfe/f;Lee/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)Loe/e;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;",
            "Lfe/f;",
            "Lee/b<",
            "Lf6/g;",
            ">;",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            "Lcom/google/firebase/perf/config/a;",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ")",
            "Loe/e;"
        }
    .end annotation

    new-instance v8, Loe/e;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Loe/e;-><init>(Lzb/g;Lee/b;Lfe/f;Lee/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)V

    return-object v8
.end method


# virtual methods
.method public b()Loe/e;
    .locals 8

    iget-object v0, p0, Loe/g;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lzb/g;

    iget-object v0, p0, Loe/g;->b:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lee/b;

    iget-object v0, p0, Loe/g;->c:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lfe/f;

    iget-object v0, p0, Loe/g;->d:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lee/b;

    iget-object v0, p0, Loe/g;->e:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/firebase/perf/config/RemoteConfigManager;

    iget-object v0, p0, Loe/g;->f:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/firebase/perf/config/a;

    iget-object v0, p0, Loe/g;->g:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/google/firebase/perf/session/SessionManager;

    invoke-static/range {v1 .. v7}, Loe/g;->c(Lzb/g;Lee/b;Lfe/f;Lee/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)Loe/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Loe/g;->b()Loe/e;

    move-result-object v0

    return-object v0
.end method
