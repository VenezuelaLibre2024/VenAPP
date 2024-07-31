.class final Lr1/d0$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr1/d0;-><init>(Lr1/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/a<",
        "Lv1/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lr1/d0;


# direct methods
.method constructor <init>(Lr1/d0;)V
    .locals 0

    iput-object p1, p0, Lr1/d0$a;->a:Lr1/d0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lv1/m;
    .locals 1

    iget-object v0, p0, Lr1/d0$a;->a:Lr1/d0;

    invoke-static {v0}, Lr1/d0;->a(Lr1/d0;)Lv1/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr1/d0$a;->a()Lv1/m;

    move-result-object v0

    return-object v0
.end method
