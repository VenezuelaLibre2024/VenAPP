.class public final Lvd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/l;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/view/LayoutInflater;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lde/i;",
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
            "Lud/l;",
            ">;",
            "Lbk/a<",
            "Landroid/view/LayoutInflater;",
            ">;",
            "Lbk/a<",
            "Lde/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd/b;->a:Lbk/a;

    iput-object p2, p0, Lvd/b;->b:Lbk/a;

    iput-object p3, p0, Lvd/b;->c:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;)Lvd/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lud/l;",
            ">;",
            "Lbk/a<",
            "Landroid/view/LayoutInflater;",
            ">;",
            "Lbk/a<",
            "Lde/i;",
            ">;)",
            "Lvd/b;"
        }
    .end annotation

    new-instance v0, Lvd/b;

    invoke-direct {v0, p0, p1, p2}, Lvd/b;-><init>(Lbk/a;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lud/l;Landroid/view/LayoutInflater;Lde/i;)Lvd/a;
    .locals 1

    new-instance v0, Lvd/a;

    invoke-direct {v0, p0, p1, p2}, Lvd/a;-><init>(Lud/l;Landroid/view/LayoutInflater;Lde/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Lvd/a;
    .locals 3

    iget-object v0, p0, Lvd/b;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud/l;

    iget-object v1, p0, Lvd/b;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    iget-object v2, p0, Lvd/b;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lde/i;

    invoke-static {v0, v1, v2}, Lvd/b;->c(Lud/l;Landroid/view/LayoutInflater;Lde/i;)Lvd/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvd/b;->b()Lvd/a;

    move-result-object v0

    return-object v0
.end method
