.class public final Lpe/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/a$b;
    }
.end annotation


# instance fields
.field private a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzb/g;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;>;"
        }
    .end annotation
.end field

.field private c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lfe/f;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lee/b<",
            "Lf6/g;",
            ">;>;"
        }
    .end annotation
.end field

.field private e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcom/google/firebase/perf/config/a;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Loe/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lqe/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lpe/a;->c(Lqe/a;)V

    return-void
.end method

.method synthetic constructor <init>(Lqe/a;Lpe/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lpe/a;-><init>(Lqe/a;)V

    return-void
.end method

.method public static b()Lpe/a$b;
    .locals 2

    new-instance v0, Lpe/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpe/a$b;-><init>(Lpe/a$a;)V

    return-object v0
.end method

.method private c(Lqe/a;)V
    .locals 8

    invoke-static {p1}, Lqe/c;->a(Lqe/a;)Lqe/c;

    move-result-object v0

    iput-object v0, p0, Lpe/a;->a:Lbk/a;

    invoke-static {p1}, Lqe/e;->a(Lqe/a;)Lqe/e;

    move-result-object v0

    iput-object v0, p0, Lpe/a;->b:Lbk/a;

    invoke-static {p1}, Lqe/d;->a(Lqe/a;)Lqe/d;

    move-result-object v0

    iput-object v0, p0, Lpe/a;->c:Lbk/a;

    invoke-static {p1}, Lqe/h;->a(Lqe/a;)Lqe/h;

    move-result-object v0

    iput-object v0, p0, Lpe/a;->d:Lbk/a;

    invoke-static {p1}, Lqe/f;->a(Lqe/a;)Lqe/f;

    move-result-object v0

    iput-object v0, p0, Lpe/a;->e:Lbk/a;

    invoke-static {p1}, Lqe/b;->a(Lqe/a;)Lqe/b;

    move-result-object v0

    iput-object v0, p0, Lpe/a;->f:Lbk/a;

    invoke-static {p1}, Lqe/g;->a(Lqe/a;)Lqe/g;

    move-result-object v7

    iput-object v7, p0, Lpe/a;->g:Lbk/a;

    iget-object v1, p0, Lpe/a;->a:Lbk/a;

    iget-object v2, p0, Lpe/a;->b:Lbk/a;

    iget-object v3, p0, Lpe/a;->c:Lbk/a;

    iget-object v4, p0, Lpe/a;->d:Lbk/a;

    iget-object v5, p0, Lpe/a;->e:Lbk/a;

    iget-object v6, p0, Lpe/a;->f:Lbk/a;

    invoke-static/range {v1 .. v7}, Loe/g;->a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Loe/g;

    move-result-object p1

    invoke-static {p1}, Lhi/a;->a(Lbk/a;)Lbk/a;

    move-result-object p1

    iput-object p1, p0, Lpe/a;->h:Lbk/a;

    return-void
.end method


# virtual methods
.method public a()Loe/e;
    .locals 1

    iget-object v0, p0, Lpe/a;->h:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loe/e;

    return-object v0
.end method
