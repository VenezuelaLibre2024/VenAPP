.class final Loi/u$g;
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

    iput-object p1, p0, Loi/u$g;->a:Loi/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    iget-object v0, p0, Loi/u$g;->a:Loi/u;

    invoke-static {v0}, Loi/u;->b(Loi/u;)Loi/d;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lck/m;

    const-string v2, "name"

    const-string v3, "torchState"

    invoke-static {v2, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "data"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v1}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Loi/d;->b(Ljava/util/Map;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Loi/u$g;->a(I)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
