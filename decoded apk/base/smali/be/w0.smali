.class public final Lbe/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/q2;",
        ">;"
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
            "Lf6/g;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcc/a;",
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
            "Lce/a;",
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
            "Lzb/g;",
            ">;",
            "Lbk/a<",
            "Lf6/g;",
            ">;",
            "Lbk/a<",
            "Lcc/a;",
            ">;",
            "Lbk/a<",
            "Lfe/f;",
            ">;",
            "Lbk/a<",
            "Lce/a;",
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

    iput-object p1, p0, Lbe/w0;->a:Lbk/a;

    iput-object p2, p0, Lbe/w0;->b:Lbk/a;

    iput-object p3, p0, Lbe/w0;->c:Lbk/a;

    iput-object p4, p0, Lbe/w0;->d:Lbk/a;

    iput-object p5, p0, Lbe/w0;->e:Lbk/a;

    iput-object p6, p0, Lbe/w0;->f:Lbk/a;

    iput-object p7, p0, Lbe/w0;->g:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Lbe/w0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzb/g;",
            ">;",
            "Lbk/a<",
            "Lf6/g;",
            ">;",
            "Lbk/a<",
            "Lcc/a;",
            ">;",
            "Lbk/a<",
            "Lfe/f;",
            ">;",
            "Lbk/a<",
            "Lce/a;",
            ">;",
            "Lbk/a<",
            "Lzd/s;",
            ">;",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;)",
            "Lbe/w0;"
        }
    .end annotation

    new-instance v8, Lbe/w0;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lbe/w0;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v8
.end method

.method public static c(Lzb/g;Lf6/g;Lcc/a;Lfe/f;Lce/a;Lzd/s;Ljava/util/concurrent/Executor;)Lzd/q2;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbe/v0;->e(Lzb/g;Lf6/g;Lcc/a;Lfe/f;Lce/a;Lzd/s;Ljava/util/concurrent/Executor;)Lzd/q2;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzd/q2;

    return-object p0
.end method


# virtual methods
.method public b()Lzd/q2;
    .locals 8

    iget-object v0, p0, Lbe/w0;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lzb/g;

    iget-object v0, p0, Lbe/w0;->b:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lf6/g;

    iget-object v0, p0, Lbe/w0;->c:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcc/a;

    iget-object v0, p0, Lbe/w0;->d:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lfe/f;

    iget-object v0, p0, Lbe/w0;->e:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lce/a;

    iget-object v0, p0, Lbe/w0;->f:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lzd/s;

    iget-object v0, p0, Lbe/w0;->g:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/concurrent/Executor;

    invoke-static/range {v1 .. v7}, Lbe/w0;->c(Lzb/g;Lf6/g;Lcc/a;Lfe/f;Lce/a;Lzd/s;Ljava/util/concurrent/Executor;)Lzd/q2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/w0;->b()Lzd/q2;

    move-result-object v0

    return-object v0
.end method
