.class public final Lo6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Lo6/r;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Li6/e;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lp6/d;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lo6/x;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lq6/b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lr6/a;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lr6/a;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lp6/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/content/Context;",
            ">;",
            "Lbk/a<",
            "Li6/e;",
            ">;",
            "Lbk/a<",
            "Lp6/d;",
            ">;",
            "Lbk/a<",
            "Lo6/x;",
            ">;",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lbk/a<",
            "Lq6/b;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Lp6/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/s;->a:Lbk/a;

    iput-object p2, p0, Lo6/s;->b:Lbk/a;

    iput-object p3, p0, Lo6/s;->c:Lbk/a;

    iput-object p4, p0, Lo6/s;->d:Lbk/a;

    iput-object p5, p0, Lo6/s;->e:Lbk/a;

    iput-object p6, p0, Lo6/s;->f:Lbk/a;

    iput-object p7, p0, Lo6/s;->g:Lbk/a;

    iput-object p8, p0, Lo6/s;->h:Lbk/a;

    iput-object p9, p0, Lo6/s;->i:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Lo6/s;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/content/Context;",
            ">;",
            "Lbk/a<",
            "Li6/e;",
            ">;",
            "Lbk/a<",
            "Lp6/d;",
            ">;",
            "Lbk/a<",
            "Lo6/x;",
            ">;",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lbk/a<",
            "Lq6/b;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Lp6/c;",
            ">;)",
            "Lo6/s;"
        }
    .end annotation

    new-instance v10, Lo6/s;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lo6/s;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v10
.end method

.method public static c(Landroid/content/Context;Li6/e;Lp6/d;Lo6/x;Ljava/util/concurrent/Executor;Lq6/b;Lr6/a;Lr6/a;Lp6/c;)Lo6/r;
    .locals 11

    new-instance v10, Lo6/r;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lo6/r;-><init>(Landroid/content/Context;Li6/e;Lp6/d;Lo6/x;Ljava/util/concurrent/Executor;Lq6/b;Lr6/a;Lr6/a;Lp6/c;)V

    return-object v10
.end method


# virtual methods
.method public b()Lo6/r;
    .locals 10

    iget-object v0, p0, Lo6/s;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lo6/s;->b:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Li6/e;

    iget-object v0, p0, Lo6/s;->c:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lp6/d;

    iget-object v0, p0, Lo6/s;->d:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo6/x;

    iget-object v0, p0, Lo6/s;->e:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lo6/s;->f:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lq6/b;

    iget-object v0, p0, Lo6/s;->g:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lr6/a;

    iget-object v0, p0, Lo6/s;->h:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lr6/a;

    iget-object v0, p0, Lo6/s;->i:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lp6/c;

    invoke-static/range {v1 .. v9}, Lo6/s;->c(Landroid/content/Context;Li6/e;Lp6/d;Lo6/x;Ljava/util/concurrent/Executor;Lq6/b;Lr6/a;Lr6/a;Lp6/c;)Lo6/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo6/s;->b()Lo6/r;

    move-result-object v0

    return-object v0
.end method
