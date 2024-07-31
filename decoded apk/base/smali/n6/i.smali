.class public final Ln6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Lo6/x;",
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
            "Lp6/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lo6/f;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lr6/a;",
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
            "Landroid/content/Context;",
            ">;",
            "Lbk/a<",
            "Lp6/d;",
            ">;",
            "Lbk/a<",
            "Lo6/f;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/i;->a:Lbk/a;

    iput-object p2, p0, Ln6/i;->b:Lbk/a;

    iput-object p3, p0, Ln6/i;->c:Lbk/a;

    iput-object p4, p0, Ln6/i;->d:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Ln6/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/content/Context;",
            ">;",
            "Lbk/a<",
            "Lp6/d;",
            ">;",
            "Lbk/a<",
            "Lo6/f;",
            ">;",
            "Lbk/a<",
            "Lr6/a;",
            ">;)",
            "Ln6/i;"
        }
    .end annotation

    new-instance v0, Ln6/i;

    invoke-direct {v0, p0, p1, p2, p3}, Ln6/i;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lp6/d;Lo6/f;Lr6/a;)Lo6/x;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln6/h;->a(Landroid/content/Context;Lp6/d;Lo6/f;Lr6/a;)Lo6/x;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Lj6/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo6/x;

    return-object p0
.end method


# virtual methods
.method public b()Lo6/x;
    .locals 4

    iget-object v0, p0, Ln6/i;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ln6/i;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp6/d;

    iget-object v2, p0, Ln6/i;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo6/f;

    iget-object v3, p0, Ln6/i;->d:Lbk/a;

    invoke-interface {v3}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr6/a;

    invoke-static {v0, v1, v2, v3}, Ln6/i;->c(Landroid/content/Context;Lp6/d;Lo6/f;Lr6/a;)Lo6/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln6/i;->b()Lo6/x;

    move-result-object v0

    return-object v0
.end method
