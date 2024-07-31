.class final Loi/u$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/r;


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
        "Lok/r<",
        "Ljava/util/List<",
        "+",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Object;",
        ">;>;[B",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Loi/u;


# direct methods
.method constructor <init>(Loi/u;)V
    .locals 0

    iput-object p1, p0, Loi/u$b;->a:Loi/u;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;[BLjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;[B",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    const-string v0, "barcodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    const/4 v1, 0x1

    const-string v2, "barcode"

    const-string v3, "name"

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz p2, :cond_0

    iget-object v6, p0, Loi/u$b;->a:Loi/u;

    invoke-static {v6}, Loi/u;->b(Loi/u;)Loi/d;

    move-result-object v6

    const/4 v7, 0x5

    new-array v7, v7, [Lck/m;

    invoke-static {v3, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    aput-object v2, v7, v4

    invoke-static {v0, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    aput-object p1, v7, v1

    const-string p1, "image"

    invoke-static {p1, p2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    aput-object p1, v7, v5

    invoke-static {p3}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "width"

    invoke-static {p2, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v7, p2

    invoke-static {p4}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "height"

    invoke-static {p2, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v7, p2

    invoke-static {v7}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v6, p1}, Loi/d;->b(Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Loi/u$b;->a:Loi/u;

    invoke-static {p2}, Loi/u;->b(Loi/u;)Loi/d;

    move-result-object p2

    new-array p3, v5, [Lck/m;

    invoke-static {v3, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p4

    aput-object p4, p3, v4

    invoke-static {v0, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    aput-object p1, p3, v1

    invoke-static {p3}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2, p1}, Loi/d;->b(Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, [B

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3, p4}, Loi/u$b;->a(Ljava/util/List;[BLjava/lang/Integer;Ljava/lang/Integer;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
