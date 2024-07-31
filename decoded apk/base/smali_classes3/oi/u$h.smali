.class final Loi/u$h;
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
        "Ljava/lang/Double;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Loi/u;


# direct methods
.method constructor <init>(Loi/u;)V
    .locals 0

    iput-object p1, p0, Loi/u$h;->a:Loi/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(D)V
    .locals 4

    iget-object v0, p0, Loi/u$h;->a:Loi/u;

    invoke-static {v0}, Loi/u;->b(Loi/u;)Loi/d;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lck/m;

    const-string v2, "name"

    const-string v3, "zoomScaleState"

    invoke-static {v2, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "data"

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-static {v2, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-static {v1}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Loi/d;->b(Ljava/util/Map;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Loi/u$h;->a(D)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
