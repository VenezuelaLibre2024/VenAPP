.class public final Lzd/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/k;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/u2;",
            ">;"
        }
    .end annotation
.end field

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
            "Lce/a;",
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
            "Lzd/u2;",
            ">;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;",
            "Lbk/a<",
            "Lce/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/l;->a:Lbk/a;

    iput-object p2, p0, Lzd/l;->b:Lbk/a;

    iput-object p3, p0, Lzd/l;->c:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;)Lzd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzd/u2;",
            ">;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;",
            "Lbk/a<",
            "Lce/a;",
            ">;)",
            "Lzd/l;"
        }
    .end annotation

    new-instance v0, Lzd/l;

    invoke-direct {v0, p0, p1, p2}, Lzd/l;-><init>(Lbk/a;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lzd/u2;Landroid/app/Application;Lce/a;)Lzd/k;
    .locals 1

    new-instance v0, Lzd/k;

    invoke-direct {v0, p0, p1, p2}, Lzd/k;-><init>(Lzd/u2;Landroid/app/Application;Lce/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzd/k;
    .locals 3

    iget-object v0, p0, Lzd/l;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzd/u2;

    iget-object v1, p0, Lzd/l;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, p0, Lzd/l;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lce/a;

    invoke-static {v0, v1, v2}, Lzd/l;->c(Lzd/u2;Landroid/app/Application;Lce/a;)Lzd/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzd/l;->b()Lzd/k;

    move-result-object v0

    return-object v0
.end method
