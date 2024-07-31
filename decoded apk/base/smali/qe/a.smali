.class public Lqe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lzb/g;

.field private final b:Lfe/f;

.field private final c:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Lf6/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzb/g;Lfe/f;Lee/b;Lee/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Lfe/f;",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;",
            "Lee/b<",
            "Lf6/g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqe/a;->a:Lzb/g;

    iput-object p2, p0, Lqe/a;->b:Lfe/f;

    iput-object p3, p0, Lqe/a;->c:Lee/b;

    iput-object p4, p0, Lqe/a;->d:Lee/b;

    return-void
.end method


# virtual methods
.method a()Lcom/google/firebase/perf/config/a;
    .locals 1

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object v0

    return-object v0
.end method

.method b()Lzb/g;
    .locals 1

    iget-object v0, p0, Lqe/a;->a:Lzb/g;

    return-object v0
.end method

.method c()Lfe/f;
    .locals 1

    iget-object v0, p0, Lqe/a;->b:Lfe/f;

    return-object v0
.end method

.method d()Lee/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqe/a;->c:Lee/b;

    return-object v0
.end method

.method e()Lcom/google/firebase/perf/config/RemoteConfigManager;
    .locals 1

    invoke-static {}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getInstance()Lcom/google/firebase/perf/config/RemoteConfigManager;

    move-result-object v0

    return-object v0
.end method

.method f()Lcom/google/firebase/perf/session/SessionManager;
    .locals 1

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    return-object v0
.end method

.method g()Lee/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lee/b<",
            "Lf6/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqe/a;->d:Lee/b;

    return-object v0
.end method
