.class public final Lo6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Lo6/v;",
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
            "Lp6/d;",
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
            "Lq6/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lbk/a<",
            "Lp6/d;",
            ">;",
            "Lbk/a<",
            "Lo6/x;",
            ">;",
            "Lbk/a<",
            "Lq6/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/w;->a:Lbk/a;

    iput-object p2, p0, Lo6/w;->b:Lbk/a;

    iput-object p3, p0, Lo6/w;->c:Lbk/a;

    iput-object p4, p0, Lo6/w;->d:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Lo6/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lbk/a<",
            "Lp6/d;",
            ">;",
            "Lbk/a<",
            "Lo6/x;",
            ">;",
            "Lbk/a<",
            "Lq6/b;",
            ">;)",
            "Lo6/w;"
        }
    .end annotation

    new-instance v0, Lo6/w;

    invoke-direct {v0, p0, p1, p2, p3}, Lo6/w;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lp6/d;Lo6/x;Lq6/b;)Lo6/v;
    .locals 1

    new-instance v0, Lo6/v;

    invoke-direct {v0, p0, p1, p2, p3}, Lo6/v;-><init>(Ljava/util/concurrent/Executor;Lp6/d;Lo6/x;Lq6/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Lo6/v;
    .locals 4

    iget-object v0, p0, Lo6/w;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lo6/w;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp6/d;

    iget-object v2, p0, Lo6/w;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo6/x;

    iget-object v3, p0, Lo6/w;->d:Lbk/a;

    invoke-interface {v3}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq6/b;

    invoke-static {v0, v1, v2, v3}, Lo6/w;->c(Ljava/util/concurrent/Executor;Lp6/d;Lo6/x;Lq6/b;)Lo6/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo6/w;->b()Lo6/v;

    move-result-object v0

    return-object v0
.end method
