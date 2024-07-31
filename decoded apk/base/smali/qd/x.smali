.class public final Lqd/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lqd/q;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/i2;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/r2;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/n;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lfe/f;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/t;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/s;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
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
            "Lzd/i2;",
            ">;",
            "Lbk/a<",
            "Lzd/r2;",
            ">;",
            "Lbk/a<",
            "Lzd/n;",
            ">;",
            "Lbk/a<",
            "Lfe/f;",
            ">;",
            "Lbk/a<",
            "Lzd/t;",
            ">;",
            "Lbk/a<",
            "Lzd/s;",
            ">;",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqd/x;->a:Lbk/a;

    iput-object p2, p0, Lqd/x;->b:Lbk/a;

    iput-object p3, p0, Lqd/x;->c:Lbk/a;

    iput-object p4, p0, Lqd/x;->d:Lbk/a;

    iput-object p5, p0, Lqd/x;->e:Lbk/a;

    iput-object p6, p0, Lqd/x;->f:Lbk/a;

    iput-object p7, p0, Lqd/x;->g:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Lqd/x;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzd/i2;",
            ">;",
            "Lbk/a<",
            "Lzd/r2;",
            ">;",
            "Lbk/a<",
            "Lzd/n;",
            ">;",
            "Lbk/a<",
            "Lfe/f;",
            ">;",
            "Lbk/a<",
            "Lzd/t;",
            ">;",
            "Lbk/a<",
            "Lzd/s;",
            ">;",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;)",
            "Lqd/x;"
        }
    .end annotation

    new-instance v8, Lqd/x;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lqd/x;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v8
.end method

.method public static c(Lzd/i2;Lzd/r2;Lzd/n;Lfe/f;Lzd/t;Lzd/s;Ljava/util/concurrent/Executor;)Lqd/q;
    .locals 9

    new-instance v8, Lqd/q;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lqd/q;-><init>(Lzd/i2;Lzd/r2;Lzd/n;Lfe/f;Lzd/t;Lzd/s;Ljava/util/concurrent/Executor;)V

    return-object v8
.end method


# virtual methods
.method public b()Lqd/q;
    .locals 8

    iget-object v0, p0, Lqd/x;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lzd/i2;

    iget-object v0, p0, Lqd/x;->b:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lzd/r2;

    iget-object v0, p0, Lqd/x;->c:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lzd/n;

    iget-object v0, p0, Lqd/x;->d:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lfe/f;

    iget-object v0, p0, Lqd/x;->e:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lzd/t;

    iget-object v0, p0, Lqd/x;->f:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lzd/s;

    iget-object v0, p0, Lqd/x;->g:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/concurrent/Executor;

    invoke-static/range {v1 .. v7}, Lqd/x;->c(Lzd/i2;Lzd/r2;Lzd/n;Lfe/f;Lzd/t;Lzd/s;Ljava/util/concurrent/Executor;)Lqd/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqd/x;->b()Lqd/q;

    move-result-object v0

    return-object v0
.end method
