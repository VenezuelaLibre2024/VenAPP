.class public final Lxd/d;
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
.field private final a:Lxd/c;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxd/c;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd/c;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;",
            "Lbk/a<",
            "Lud/j;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/d;->a:Lxd/c;

    iput-object p2, p0, Lxd/d;->b:Lbk/a;

    iput-object p3, p0, Lxd/d;->c:Lbk/a;

    return-void
.end method

.method public static a(Lxd/c;Lbk/a;Lbk/a;)Lxd/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd/c;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;",
            "Lbk/a<",
            "Lud/j;",
            ">;)",
            "Lxd/d;"
        }
    .end annotation

    new-instance v0, Lxd/d;

    invoke-direct {v0, p0, p1, p2}, Lxd/d;-><init>(Lxd/c;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lxd/c;Landroid/app/Application;Lud/j;)Lcom/bumptech/glide/k;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxd/c;->a(Landroid/app/Application;Lud/j;)Lcom/bumptech/glide/k;

    move-result-object p0

    invoke-static {p0}, Ltd/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/bumptech/glide/k;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/bumptech/glide/k;
    .locals 3

    iget-object v0, p0, Lxd/d;->a:Lxd/c;

    iget-object v1, p0, Lxd/d;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, p0, Lxd/d;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lud/j;

    invoke-static {v0, v1, v2}, Lxd/d;->c(Lxd/c;Landroid/app/Application;Lud/j;)Lcom/bumptech/glide/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxd/d;->b()Lcom/bumptech/glide/k;

    move-result-object v0

    return-object v0
.end method
