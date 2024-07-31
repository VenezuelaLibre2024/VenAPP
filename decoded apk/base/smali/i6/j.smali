.class public final Li6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Li6/i;",
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
            "Lr6/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lr6/a;",
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
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/j;->a:Lbk/a;

    iput-object p2, p0, Li6/j;->b:Lbk/a;

    iput-object p3, p0, Li6/j;->c:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;)Li6/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/content/Context;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;)",
            "Li6/j;"
        }
    .end annotation

    new-instance v0, Li6/j;

    invoke-direct {v0, p0, p1, p2}, Li6/j;-><init>(Lbk/a;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lr6/a;Lr6/a;)Li6/i;
    .locals 1

    new-instance v0, Li6/i;

    invoke-direct {v0, p0, p1, p2}, Li6/i;-><init>(Landroid/content/Context;Lr6/a;Lr6/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Li6/i;
    .locals 3

    iget-object v0, p0, Li6/j;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Li6/j;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr6/a;

    iget-object v2, p0, Li6/j;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr6/a;

    invoke-static {v0, v1, v2}, Li6/j;->c(Landroid/content/Context;Lr6/a;Lr6/a;)Li6/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li6/j;->b()Li6/i;

    move-result-object v0

    return-object v0
.end method
