.class public final Lh6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Lh6/u;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lr6/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lr6/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ln6/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lo6/r;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lo6/v;",
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
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Ln6/e;",
            ">;",
            "Lbk/a<",
            "Lo6/r;",
            ">;",
            "Lbk/a<",
            "Lo6/v;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/w;->a:Lbk/a;

    iput-object p2, p0, Lh6/w;->b:Lbk/a;

    iput-object p3, p0, Lh6/w;->c:Lbk/a;

    iput-object p4, p0, Lh6/w;->d:Lbk/a;

    iput-object p5, p0, Lh6/w;->e:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Lh6/w;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Ln6/e;",
            ">;",
            "Lbk/a<",
            "Lo6/r;",
            ">;",
            "Lbk/a<",
            "Lo6/v;",
            ">;)",
            "Lh6/w;"
        }
    .end annotation

    new-instance v6, Lh6/w;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lh6/w;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v6
.end method

.method public static c(Lr6/a;Lr6/a;Ln6/e;Lo6/r;Lo6/v;)Lh6/u;
    .locals 7

    new-instance v6, Lh6/u;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lh6/u;-><init>(Lr6/a;Lr6/a;Ln6/e;Lo6/r;Lo6/v;)V

    return-object v6
.end method


# virtual methods
.method public b()Lh6/u;
    .locals 5

    iget-object v0, p0, Lh6/w;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr6/a;

    iget-object v1, p0, Lh6/w;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr6/a;

    iget-object v2, p0, Lh6/w;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln6/e;

    iget-object v3, p0, Lh6/w;->d:Lbk/a;

    invoke-interface {v3}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo6/r;

    iget-object v4, p0, Lh6/w;->e:Lbk/a;

    invoke-interface {v4}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo6/v;

    invoke-static {v0, v1, v2, v3, v4}, Lh6/w;->c(Lr6/a;Lr6/a;Ln6/e;Lo6/r;Lo6/v;)Lh6/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh6/w;->b()Lh6/u;

    move-result-object v0

    return-object v0
.end method
