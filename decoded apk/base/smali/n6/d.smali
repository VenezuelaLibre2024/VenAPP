.class public final Ln6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Ln6/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
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
            "Lo6/x;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lp6/d;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lq6/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lbk/a<",
            "Li6/e;",
            ">;",
            "Lbk/a<",
            "Lo6/x;",
            ">;",
            "Lbk/a<",
            "Lp6/d;",
            ">;",
            "Lbk/a<",
            "Lq6/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/d;->a:Lbk/a;

    iput-object p2, p0, Ln6/d;->b:Lbk/a;

    iput-object p3, p0, Ln6/d;->c:Lbk/a;

    iput-object p4, p0, Ln6/d;->d:Lbk/a;

    iput-object p5, p0, Ln6/d;->e:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Ln6/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lbk/a<",
            "Li6/e;",
            ">;",
            "Lbk/a<",
            "Lo6/x;",
            ">;",
            "Lbk/a<",
            "Lp6/d;",
            ">;",
            "Lbk/a<",
            "Lq6/b;",
            ">;)",
            "Ln6/d;"
        }
    .end annotation

    new-instance v6, Ln6/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ln6/d;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v6
.end method

.method public static c(Ljava/util/concurrent/Executor;Li6/e;Lo6/x;Lp6/d;Lq6/b;)Ln6/c;
    .locals 7

    new-instance v6, Ln6/c;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ln6/c;-><init>(Ljava/util/concurrent/Executor;Li6/e;Lo6/x;Lp6/d;Lq6/b;)V

    return-object v6
.end method


# virtual methods
.method public b()Ln6/c;
    .locals 5

    iget-object v0, p0, Ln6/d;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Ln6/d;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li6/e;

    iget-object v2, p0, Ln6/d;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo6/x;

    iget-object v3, p0, Ln6/d;->d:Lbk/a;

    invoke-interface {v3}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp6/d;

    iget-object v4, p0, Ln6/d;->e:Lbk/a;

    invoke-interface {v4}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq6/b;

    invoke-static {v0, v1, v2, v3, v4}, Ln6/d;->c(Ljava/util/concurrent/Executor;Li6/e;Lo6/x;Lp6/d;Lq6/b;)Ln6/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln6/d;->b()Ln6/c;

    move-result-object v0

    return-object v0
.end method
