.class final Loi/u$c;
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
        "Ljava/lang/String;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Loi/u;


# direct methods
.method constructor <init>(Loi/u;)V
    .locals 0

    iput-object p1, p0, Loi/u$c;->a:Loi/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Loi/u$c;->a:Loi/u;

    invoke-static {v1}, Loi/u;->b(Loi/u;)Loi/d;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lck/m;

    const-string v3, "name"

    invoke-static {v3, v0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v0

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v0, "data"

    invoke-static {v0, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 v0, 0x1

    aput-object p1, v2, v0

    invoke-static {v2}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v1, p1}, Loi/d;->b(Ljava/util/Map;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Loi/u$c;->a(Ljava/lang/String;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
