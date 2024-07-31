.class public final Lp6/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Lp6/t0;",
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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/content/Context;",
            ">;",
            "Lbk/a<",
            "Ljava/lang/String;",
            ">;",
            "Lbk/a<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/u0;->a:Lbk/a;

    iput-object p2, p0, Lp6/u0;->b:Lbk/a;

    iput-object p3, p0, Lp6/u0;->c:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;)Lp6/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/content/Context;",
            ">;",
            "Lbk/a<",
            "Ljava/lang/String;",
            ">;",
            "Lbk/a<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lp6/u0;"
        }
    .end annotation

    new-instance v0, Lp6/u0;

    invoke-direct {v0, p0, p1, p2}, Lp6/u0;-><init>(Lbk/a;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)Lp6/t0;
    .locals 1

    new-instance v0, Lp6/t0;

    invoke-direct {v0, p0, p1, p2}, Lp6/t0;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public b()Lp6/t0;
    .locals 3

    iget-object v0, p0, Lp6/u0;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lp6/u0;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lp6/u0;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, Lp6/u0;->c(Landroid/content/Context;Ljava/lang/String;I)Lp6/t0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp6/u0;->b()Lp6/t0;

    move-result-object v0

    return-object v0
.end method
