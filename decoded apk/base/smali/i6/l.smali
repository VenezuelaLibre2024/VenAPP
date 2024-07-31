.class public final Li6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Li6/k;",
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
            "Li6/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/content/Context;",
            ">;",
            "Lbk/a<",
            "Li6/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/l;->a:Lbk/a;

    iput-object p2, p0, Li6/l;->b:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;)Li6/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/content/Context;",
            ">;",
            "Lbk/a<",
            "Li6/i;",
            ">;)",
            "Li6/l;"
        }
    .end annotation

    new-instance v0, Li6/l;

    invoke-direct {v0, p0, p1}, Li6/l;-><init>(Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Li6/k;
    .locals 1

    new-instance v0, Li6/k;

    check-cast p1, Li6/i;

    invoke-direct {v0, p0, p1}, Li6/k;-><init>(Landroid/content/Context;Li6/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Li6/k;
    .locals 2

    iget-object v0, p0, Li6/l;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Li6/l;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Li6/l;->c(Landroid/content/Context;Ljava/lang/Object;)Li6/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li6/l;->b()Li6/k;

    move-result-object v0

    return-object v0
.end method
