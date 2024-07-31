.class public final Lp6/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Lp6/m0;",
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
            "Lp6/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lp6/t0;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ljava/lang/String;",
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
            "Lp6/e;",
            ">;",
            "Lbk/a<",
            "Lp6/t0;",
            ">;",
            "Lbk/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/n0;->a:Lbk/a;

    iput-object p2, p0, Lp6/n0;->b:Lbk/a;

    iput-object p3, p0, Lp6/n0;->c:Lbk/a;

    iput-object p4, p0, Lp6/n0;->d:Lbk/a;

    iput-object p5, p0, Lp6/n0;->e:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Lp6/n0;
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
            "Lp6/e;",
            ">;",
            "Lbk/a<",
            "Lp6/t0;",
            ">;",
            "Lbk/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lp6/n0;"
        }
    .end annotation

    new-instance v6, Lp6/n0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lp6/n0;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v6
.end method

.method public static c(Lr6/a;Lr6/a;Ljava/lang/Object;Ljava/lang/Object;Lbk/a;)Lp6/m0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            "Lr6/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lbk/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lp6/m0;"
        }
    .end annotation

    new-instance v6, Lp6/m0;

    move-object v3, p2

    check-cast v3, Lp6/e;

    move-object v4, p3

    check-cast v4, Lp6/t0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lp6/m0;-><init>(Lr6/a;Lr6/a;Lp6/e;Lp6/t0;Lbk/a;)V

    return-object v6
.end method


# virtual methods
.method public b()Lp6/m0;
    .locals 5

    iget-object v0, p0, Lp6/n0;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr6/a;

    iget-object v1, p0, Lp6/n0;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr6/a;

    iget-object v2, p0, Lp6/n0;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lp6/n0;->d:Lbk/a;

    invoke-interface {v3}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lp6/n0;->e:Lbk/a;

    invoke-static {v0, v1, v2, v3, v4}, Lp6/n0;->c(Lr6/a;Lr6/a;Ljava/lang/Object;Ljava/lang/Object;Lbk/a;)Lp6/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp6/n0;->b()Lp6/m0;

    move-result-object v0

    return-object v0
.end method
