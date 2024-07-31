.class public final Lbe/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/d;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/l0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/v2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/d;Lbk/a;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/d;",
            "Lbk/a<",
            "Lzd/l0;",
            ">;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;",
            "Lbk/a<",
            "Lzd/v2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/e;->a:Lbe/d;

    iput-object p2, p0, Lbe/e;->b:Lbk/a;

    iput-object p3, p0, Lbe/e;->c:Lbk/a;

    iput-object p4, p0, Lbe/e;->d:Lbk/a;

    return-void
.end method

.method public static a(Lbe/d;Lbk/a;Lbk/a;Lbk/a;)Lbe/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/d;",
            "Lbk/a<",
            "Lzd/l0;",
            ">;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;",
            "Lbk/a<",
            "Lzd/v2;",
            ">;)",
            "Lbe/e;"
        }
    .end annotation

    new-instance v0, Lbe/e;

    invoke-direct {v0, p0, p1, p2, p3}, Lbe/e;-><init>(Lbe/d;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lbe/d;Lbk/a;Landroid/app/Application;Lzd/v2;)Lzd/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/d;",
            "Lbk/a<",
            "Lzd/l0;",
            ">;",
            "Landroid/app/Application;",
            "Lzd/v2;",
            ")",
            "Lzd/d;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lbe/d;->a(Lbk/a;Landroid/app/Application;Lzd/v2;)Lzd/d;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzd/d;

    return-object p0
.end method


# virtual methods
.method public b()Lzd/d;
    .locals 4

    iget-object v0, p0, Lbe/e;->a:Lbe/d;

    iget-object v1, p0, Lbe/e;->b:Lbk/a;

    iget-object v2, p0, Lbe/e;->c:Lbk/a;

    invoke-interface {v2}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    iget-object v3, p0, Lbe/e;->d:Lbk/a;

    invoke-interface {v3}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzd/v2;

    invoke-static {v0, v1, v2, v3}, Lbe/e;->c(Lbe/d;Lbk/a;Landroid/app/Application;Lzd/v2;)Lzd/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/e;->b()Lzd/d;

    move-result-object v0

    return-object v0
.end method
