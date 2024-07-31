.class final Loi/u$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/u;-><init>(Landroid/app/Activity;Loi/d;Lio/flutter/plugin/common/BinaryMessenger;Loi/x;Lok/l;Lio/flutter/view/TextureRegistry;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Ljava/util/List<",
        "+",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Object;",
        ">;>;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Loi/u;


# direct methods
.method constructor <init>(Loi/u;)V
    .locals 0

    iput-object p1, p0, Loi/u$a;->a:Loi/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Loi/u;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Loi/u$a;->d(Loi/u;Ljava/util/List;)V

    return-void
.end method

.method private static final d(Loi/u;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Loi/u;->a(Loi/u;)Lio/flutter/plugin/common/MethodChannel$Result;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :cond_1
    const/4 p1, 0x0

    invoke-static {p0, p1}, Loi/u;->c(Loi/u;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Loi/u$a;->a:Loi/u;

    invoke-static {v0}, Loi/u;->b(Loi/u;)Loi/d;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lck/m;

    const-string v2, "name"

    const-string v3, "barcode"

    invoke-static {v2, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "data"

    invoke-static {v2, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Loi/d;->b(Ljava/util/Map;)V

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v1, p0, Loi/u$a;->a:Loi/u;

    new-instance v2, Loi/t;

    invoke-direct {v2, v1, p1}, Loi/t;-><init>(Loi/u;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Loi/u$a;->c(Ljava/util/List;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
